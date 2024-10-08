package com.vinimanfrin.toys_fiap.repositories;

import com.vinimanfrin.toys_fiap.models.UserST;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserST,Long> {

    Optional<UserST> findByUsername(String username);
}
