package com.rusinek.tasks.repositories;

import com.rusinek.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {


}
