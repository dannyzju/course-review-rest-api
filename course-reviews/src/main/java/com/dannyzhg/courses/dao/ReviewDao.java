package com.dannyzhg.courses.dao;

import com.dannyzhg.courses.exc.DaoException;
import com.dannyzhg.courses.model.Review;

import java.util.List;

/**
 * Created by Dannyzju on 4/18/16.
 */
public interface ReviewDao {
    void add(Review review) throws DaoException;
    List<Review> findAll();
    List<Review> findByCourseId(int courseId);


}
