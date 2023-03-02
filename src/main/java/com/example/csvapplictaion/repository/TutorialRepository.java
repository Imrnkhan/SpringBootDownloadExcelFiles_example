package com.example.csvapplictaion.repository;

import com.example.csvapplictaion.Model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}
