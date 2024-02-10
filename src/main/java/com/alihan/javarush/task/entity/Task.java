package com.alihan.javarush.task.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Date date;
    private String description;
    private Boolean isDone;

    @Override
    public String toString() {
        return "task{" +
                "id: " + id +
                ", name: " + name +
                ", date: " + date +
                ", description: " + description +
                ", isDone: " + isDone +
                '}';
    }
}
