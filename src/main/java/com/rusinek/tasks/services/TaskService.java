package com.rusinek.tasks.services;

import com.rusinek.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> list();
}
