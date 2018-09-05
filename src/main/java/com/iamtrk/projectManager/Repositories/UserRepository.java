package com.iamtrk.projectManager.Repositories;

import com.iamtrk.projectManager.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
