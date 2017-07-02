package com.taskmanager.Workers;
import com.taskmanager.Repositorys.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.taskmanager.DTO.TaskRequestDTO;
import com.taskmanager.Entitys.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.transaction.Transactional;

/**
 * Created by carel on 2017/06/11.
 */
@Controller
public class TaskWorker {
    @Autowired
    private TaskRepository taskRepository;
    @Transactional
    public String addTask(TaskRequestDTO taskRequestDTO){

        Tasks tasks = new Tasks();
        final Logger logger = LoggerFactory.getLogger(this.getClass());
        try {

            tasks.setUserID(taskRequestDTO.getUserID());
            tasks.setDescription(taskRequestDTO.getDescription());
            tasks.setProgress(1);
            tasks.setTaskName(taskRequestDTO.getTaskName());

            taskRepository.save(tasks);
        }
        catch (Exception e){
            logger.error(e.getStackTrace().toString());
            e.printStackTrace();
        }
        return "Taks Added"  + tasks.getTaskName();
    }


}
