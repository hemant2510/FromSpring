package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.UserEntity;

@Component
public interface UserRepository extends JpaRepository<UserEntity, Long>{

    public List<UserEntity> findByUserName(String username);
    public List<UserEntity> findBySessionID(String SessionID);
}
