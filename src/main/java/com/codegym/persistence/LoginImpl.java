package com.codegym.persistence;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class LoginImpl implements  GeneralPersistence<Login> {

    ArrayList<User> listUsers = new ArrayList<>();
    {
        listUsers.add(new User("tiendung","dung", "tiendung0899@gmail.com","dung", 19));
        listUsers.add(new User("trongha","ha", "ha@gmail.com","ha", 20));
        listUsers.add(new User("hao","hao", "hao@gmail.com","hao", 18));

    }

    public User checkLogin(Login login){
        for (User user: listUsers) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
