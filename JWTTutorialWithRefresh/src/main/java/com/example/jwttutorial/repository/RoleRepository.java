package com.example.jwttutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jwttutorial.models.ERole;
import com.example.jwttutorial.models.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
