package com.dannyzhg.courses.dao;

import com.dannyzhg.courses.exc.DaoException;
import com.dannyzhg.courses.model.Course;
import com.dannyzhg.courses.model.Review;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Dannyzju on 4/24/16.
 */
public class Sql2oReviewDaoTest {
    private Sql2oReviewDao reviewDao;
    private Connection conn;
    private Sql2oCourseDao courseDao;
    private Course course;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/init.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        // Keep connection open through entire test so that it isn't wiped out.
        conn = sql2o.open();

        courseDao = new Sql2oCourseDao(sql2o);
        reviewDao = new Sql2oReviewDao(sql2o);
        course = new Course("Test", "http://test.com");
        courseDao.add(course);

    }

    @Test
    public void addingReviewSetsNewId() throws Exception {
        Review review = new Review(course.getId(), 5, "Test comment");
        int originalId = review.getId();
        reviewDao.add(review);
        assertNotEquals(originalId, review.getId());
    }


    @Test
    public void multipleReviewsAreFoundWhenTheyExistForACourse() throws Exception {

        reviewDao.add(new Review(course.getId(), 5, "Test comment 1"));
        reviewDao.add(new Review(course.getId(), 1, "Test comment 2"));
        List<Review> reviews = reviewDao.findByCourseId(course.getId());
        assertEquals(2, reviews.size());
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test(expected = DaoException.class)
    public void addingAReviewToANonExistingCourseFails() throws Exception {
        Review review = new Review(42, 5, "Test comment");
        reviewDao.add(review);
    }
}