package com.codegym.model;

public class User {
    private String account;
    private String password;
    private String email;
    private String name;
    private int age;

    public User(){

    }

    public User(String account, String password, String email, String name, int age) {
        this.account = account;
        this.password = password;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAcount(String acount) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
