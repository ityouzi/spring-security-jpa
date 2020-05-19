package com.ityouzi.springsecurityjpa.Service;

import com.ityouzi.springsecurityjpa.dao.UserDao;
import com.ityouzi.springsecurityjpa.eintiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Auther: Liberal-World
 * @Date: 2020-05-19 15:17
 * @Description:
 * @Version 1.0
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    /**
     * 用户在登录的时候传入的用户名，根据用户名去查询用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
