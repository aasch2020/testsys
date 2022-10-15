package com.alasch.testsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alasch.testsys.model.student;
@Repository
public interface StudentRepository extends JpaRepository<student, Integer> {
}
