package com.ch5;

public class MyUser {
    private Integer id;
    private String username;
    private String password;
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setEmial(String email) {
        this.email = email;
    }

    public String toString(){
        return "MyUser [id="+id+",uname="+username+",password="+password+",email]";
    }

}
