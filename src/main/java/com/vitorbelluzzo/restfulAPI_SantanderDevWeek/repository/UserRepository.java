package com.vitorbelluzzo.restfulAPI_SantanderDevWeek.repository;

import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}