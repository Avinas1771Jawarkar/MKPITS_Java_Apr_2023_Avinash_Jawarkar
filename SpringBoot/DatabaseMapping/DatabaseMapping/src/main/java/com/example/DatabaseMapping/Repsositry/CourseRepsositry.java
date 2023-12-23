package com.example.DatabaseMapping.Repsositry;

import com.example.DatabaseMapping.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepsositry extends JpaRepository<Course,Integer> {
}
