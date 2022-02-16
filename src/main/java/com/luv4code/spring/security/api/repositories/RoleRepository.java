package com.luv4code.spring.security.api.repositories;

import com.luv4code.spring.security.api.ui.model.ERole;
import com.luv4code.spring.security.api.ui.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
