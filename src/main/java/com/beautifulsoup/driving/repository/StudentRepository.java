package com.beautifulsoup.driving.repository;

import com.beautifulsoup.driving.pojo.Student;
import com.google.common.collect.ImmutableList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByStudentName(String studentName);
    Page<Student> findAllByOperatorIn(List<String> operator, Pageable pageable);
    List<Student> findAllByOperatorIn(List<String> operator,Sort sort);
    List<Student> findAllByStatus(Integer status);
    List<Student> findAllByOperator(String operator);

}
