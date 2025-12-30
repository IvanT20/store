package com.zk.store;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserRepository implements  UserRepository
{
    Map<String, User> db = new HashMap<>();

    @Override
    public void save(User user)
    {
        if (!db.containsKey(user.email))
        {
            db.put(user.email, user);
        }
    }
}
