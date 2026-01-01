package com.zk.store;

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
        var user = User.builder()
                .name("")
                .password("")
                .email("")
                .build();
    }
}
