package com.zk.store;

public class User
{
    public long id;
    public String email;
    public String password;
    public String name;

    public User(long id, String email, String password, String name)
    {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
