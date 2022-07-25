package net.adminPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.adminPortal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
