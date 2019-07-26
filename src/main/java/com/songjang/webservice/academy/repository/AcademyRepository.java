package com.songjang.webservice.academy.repository;

import com.songjang.webservice.academy.domain.Academy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademyRepository extends JpaRepository<Academy, Long> {
}
