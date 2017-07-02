package com.taskmanager.Repositorys;

import com.taskmanager.Entitys.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by carel on 2017/06/11.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
