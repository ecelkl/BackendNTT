package com.ntt.NttProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntt.NttProject.entities.concretes.User;

public interface UsersDao extends JpaRepository<User, Integer> {

}
