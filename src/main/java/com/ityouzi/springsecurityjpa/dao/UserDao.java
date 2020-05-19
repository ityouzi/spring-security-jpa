package com.ityouzi.springsecurityjpa.dao;

import com.ityouzi.springsecurityjpa.eintiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    /**
     * 根据 username 查询 user
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
