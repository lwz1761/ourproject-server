package com.example.ServiceImp;



import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.Service.loginService;
import com.example.dao.loginMapper;
import com.example.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImp implements loginService {
    @Autowired(required = false)
    loginMapper loginMapper;

    @Override
    public int Login(String username, String password) {
        user user = loginMapper.login(username);
        System.out.println("user.getPassword()"+user.getPassword());
        if (password.equals(user.getPassword()))
            return 1;

        return 0;
    }
    public int rigster(user user){
        int result =loginMapper.rigster(user);
        return result;
    }
}
