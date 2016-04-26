package com.dannyzhg.courses.dao;

import com.dannyzhg.courses.exc.DaoException;
import com.dannyzhg.courses.model.Course;

import java.util.List;

/**
 * Created by Dannyzju on 4/18/16.
 */
public interface CourseDao {
    void add(Course course) throws DaoException;
    List<Course> findAll();

    Course findById(int id);
}
