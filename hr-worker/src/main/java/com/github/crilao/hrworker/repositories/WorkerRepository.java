package com.github.crilao.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.crilao.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
