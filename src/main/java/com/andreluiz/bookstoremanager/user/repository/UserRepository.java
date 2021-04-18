package com.andreluiz.bookstoremanager.user.repository;

import com.andreluiz.bookstoremanager.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
