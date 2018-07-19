package com.sp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.entity.User; 

/**
Prathap
**/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}