package com.openclassrooms.SpringSecurityAuth.repository;

import com.openclassrooms.SpringSecurityAuth.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {

    public DBUser findByUsername(String username);
}
