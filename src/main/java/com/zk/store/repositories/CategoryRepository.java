package com.zk.store.repositories;

import com.zk.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte>
{
}