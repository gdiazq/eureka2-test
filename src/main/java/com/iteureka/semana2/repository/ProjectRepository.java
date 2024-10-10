package com.iteureka.semana2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iteureka.semana2.model.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

}
