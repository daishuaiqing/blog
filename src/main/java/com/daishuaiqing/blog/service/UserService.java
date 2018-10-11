package com.daishuaiqing.blog.service;

import com.daishuaiqing.blog.cache.LocalCache;
import com.daishuaiqing.blog.entity.User;
import com.daishuaiqing.blog.mapper.UserDao;
import com.daishuaiqing.blog.model.ExceptionResult;
import com.daishuaiqing.blog.model.MyResult;
import com.daishuaiqing.blog.model.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LocalCache localCache;
    private Integer expireTime = 60*60*24;

    public MyResult login(User user) {
        User result = userDao.findByUserNameAndPassword(user.getUserName(),user.getPassword());
        if(result != null){
            String token = UUID.randomUUID().toString();
            localCache.putValue(token,result,expireTime);
            return new SuccessResult(token);
        }else{
            return new ExceptionResult("账号或密码错误");
        }
    }

    public User getToken(String token) {
        return (User) localCache.getValue(token);
    }
}
