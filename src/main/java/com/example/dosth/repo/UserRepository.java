package com.example.dosth.repo;

import com.example.dosth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author lei
 * @create 2018/08/30 19:28.
 */
public interface UserRepository extends JpaRepository<User,Integer> {


}
