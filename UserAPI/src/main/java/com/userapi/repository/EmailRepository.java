package com.userapi.repository;

import com.userapi.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {

    Email findByMailAndUserId(String mail, int userId);

    Email findByMail(String mail);

}