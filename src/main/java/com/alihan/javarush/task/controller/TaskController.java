package com.alihan.javarush.task.controller;

import com.alihan.javarush.task.dto.TaskDto;
import com.alihan.javarush.task.service.impl.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
    private final TaskServiceImpl service;


    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody TaskDto dto) {
        service.create(dto);
        return ResponseEntity.ok("Task successfully saved");
    }
    @GetMapping("/{id}")
    public String read(@PathVariable Integer id) {
        return service.read(id);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam Integer id) {
        service.delete(id);
        return ResponseEntity.ok("Task successfully deleted");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestParam Integer id, @RequestBody TaskDto model) {
        service.update(id, model);
        return ResponseEntity.ok("Task successfully updated");
    }
}
