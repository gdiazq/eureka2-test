package com.iteureka.semana2.service;

import org.springframework.stereotype.Service;

import com.iteureka.semana2.model.ProjectEntity;
import com.iteureka.semana2.repository.ProjectRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Iterable<ProjectEntity> findAll() {
        return projectRepository.findAll();
    }

}
