package com.daishuaiqing.blog.mapper;

import com.daishuaiqing.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

    User findByUserNameAndPassword(String userName, String password);
}
