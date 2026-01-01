package com.zk.store;

import com.zk.store.entities.Address;
import com.zk.store.entities.Profile;
import com.zk.store.entities.Tag;
import com.zk.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication
{
    public static void main(String[] args)
    {
        //ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = new User();
        user.setName("Test");
        var profile = Profile.builder()
                .bio("bio")
                .build();
        user.setProfile(profile);
        profile.setUser(user);
        System.out.println(user);
    }
}
