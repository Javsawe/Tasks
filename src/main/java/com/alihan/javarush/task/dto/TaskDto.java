package com.alihan.javarush.task.dto;

import lombok.Data;

import java.util.Date;
@Data
public class TaskDto {
    private Integer id;
    private String name;
    private Date date;
    private String description;
    private Boolean isDone;
}
