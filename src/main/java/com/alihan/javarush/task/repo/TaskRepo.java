package com.alihan.javarush.task.repo;

import com.alihan.javarush.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> {
}
