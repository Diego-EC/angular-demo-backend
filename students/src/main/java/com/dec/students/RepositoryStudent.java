package com.dec.students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryStudent extends JpaRepository<Student, String> {
}
