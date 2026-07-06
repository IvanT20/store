package com.zk.store.repositories;

import com.zk.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;


public interface ProfileRepository extends CrudRepository<Profile, Long>
{

}