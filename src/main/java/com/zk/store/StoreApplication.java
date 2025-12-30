package com.zk.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        var userService = context.getBean(UserService.class);
        User user = new User(1, "test@gmail.com", "123", "test");
        userService.registerUser(user);
    }
}
