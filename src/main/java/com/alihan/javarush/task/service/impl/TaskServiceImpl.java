package com.alihan.javarush.task.service.impl;

import com.alihan.javarush.task.dto.TaskDto;
import com.alihan.javarush.task.entity.Task;
import com.alihan.javarush.task.repo.TaskRepo;
import com.alihan.javarush.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepo repo;

    @Override
    public void create(TaskDto model) {
        Task task = new Task();
        task.setName(model.getName());
        task.setDate(new Date());
        task.setDescription(model.getDescription());
        task.setIsDone(model.getIsDone());
        repo.save(task);
    }

    @Override
    public String read(Integer id) {
        try {
            return "Here is information about this task:\n" + repo.findById(id);
        } catch (NullPointerException e) {
            return "Sorry! Task is not found";
        }

    }

    @Override
    public String update(Integer id, TaskDto model) {
        try {
            Task task = repo.findById(id).get();
            task.setName(model.getName());
            task.setDate(model.getDate());
            task.setDescription(model.getDescription());
            task.setIsDone(model.getIsDone());
            repo.save(task);
            return "Successful update! Here is updated task: " + task;
        } catch (NullPointerException e) {
            return "Sorry! Task is not found";
        }

    }

    @Override
    public String delete(Integer id) {
        try {
            repo.deleteById(id);
            return "Successful delete!";
        } catch (NullPointerException e) {
            return "Sorry! Task is not found";
        }
    }
}
