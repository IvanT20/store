package com.zk.store;

public class UserService
{
    private UserRepository userRepository;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService)
    {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user)
    {
        userRepository.save(user);
        notificationService.send("User has been registered", user.email);
    }
}
