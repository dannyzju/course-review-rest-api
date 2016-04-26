package com.dannyzhg.courses.dao;

import com.dannyzhg.courses.model.Course;
import com.sun.tools.javah.Util;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

/**
 * Created by Dannyzju on 4/19/16.
 */
public class Sql2oCourseDaoTest {
    private Sql2oCourseDao dao;
    private Connection conn;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/init.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        dao = new Sql2oCourseDao(sql2o);
        // Keep connection open through entire test so that it isn't wiped out.
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingCourseSetsId() throws Exception {
        Course course = newTestCourse();
        int originalCourseId = course.getId();
        dao.add(course);
        assertNotEquals(originalCourseId, course.getId());
    }

    @Test
    public void existingCoursesCanBeFoundById() throws Exception {

        Course course = newTestCourse();
        dao.add(course);
        Course foundCourse = dao.findById(course.getId());
        assertEquals(course, foundCourse);

    }

    private Course newTestCourse() {
        return new Course("Test", "http://test.com");
    }

}