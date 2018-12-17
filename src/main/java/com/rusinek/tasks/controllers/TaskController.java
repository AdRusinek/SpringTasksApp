package com.rusinek.tasks.controllers;

import com.rusinek.tasks.domain.Task;
import com.rusinek.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list() {
        return this.taskService.list() ;
    }

    // It will be "/api/tasks/save"
    // RequestBody it is what I posting from the Angular to the Spring app
    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }
}
