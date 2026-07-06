package com.zk.store.mappers;

import com.zk.store.dtos.RegisterUserRequest;
import com.zk.store.dtos.UpdateUserRequest;
import com.zk.store.dtos.UserDto;
import com.zk.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper
{
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
