package com.taskmanager.Repositorys;

import com.taskmanager.Entitys.Tasks;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by carel on 2017/06/26.
 */
public interface TaskRepository extends CrudRepository<Tasks, Long> {
}
