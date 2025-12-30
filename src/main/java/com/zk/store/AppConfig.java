package com.zk.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Value("${payment-gateway:stripe}")
    private String paymentGateway;

    @Value("${database-type:in-memory}")
    private String databaseType;

    @Value("${notification-type:email}")
    private String notificationType;

    @Bean
    public PaymentService stripe()
    {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal()
    {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService()
    {
        if (paymentGateway.equals("stripe"))
        {
            return new OrderService(stripe());
        }
        else
        {
            return new OrderService(paypal());
        }
    }

    @Bean
    public EmailNotificationService emailNotificationService()
    {
        return new EmailNotificationService();
    }

    @Bean
    public InMemoryUserRepository inMemoryUserRepository()
    {
        return new InMemoryUserRepository();
    }

    @Bean
    public UserService userService()
    {
        UserRepository userRepository = null;
        NotificationService notificationService = null;

        if (databaseType.equals("in-memory"))
        {
            userRepository = inMemoryUserRepository();
        }

        if (notificationType.equals("email"))
        {
            notificationService = emailNotificationService();
        }

        return new UserService(userRepository, notificationService);
    }
}
