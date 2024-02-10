package com.alihan.javarush.task.service;

import com.alihan.javarush.task.dto.TaskDto;

public interface TaskService {
    void create(TaskDto dto);
    String read(Integer id);

    String update(Integer id, TaskDto model);

    String delete(Integer id);

}
