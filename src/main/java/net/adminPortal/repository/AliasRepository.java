package net.adminPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.adminPortal.model.Alias;

public interface AliasRepository extends JpaRepository<Alias, Long> {

}
