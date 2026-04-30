package com.zk.store.services;

import com.zk.store.entities.User;
import com.zk.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class UserService
{
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    public void showEntityStates()
    {
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@gmail.com")
                .password("password")
                .build();

        if (entityManager.contains(user))
        {
            System.out.println("Persistent");
        }
        else
        {
            System.out.println("Transient/detached");
        }

        userRepository.save(user);

        if (entityManager.contains(user))
        {
            System.out.println("Persistent");
        }
        else
        {
            System.out.println("Transient/detached");
        }
    }
}
