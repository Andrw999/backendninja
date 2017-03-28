package com.udemy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.entity.Course;

@Repository( "courseJpaRepository" )
public interface CourseJpaRepository extends JpaRepository<Course, Serializable>{

	public abstract Course findByName( String name );
	
	public abstract Course findByPrice( double price );
	
	public abstract Course findByPriceAndName( double price, String name );
	
	public abstract List<Course> findByNameOrderById( String name);
	
	public abstract Course findByNameOrPrice( String name, int price );
}
