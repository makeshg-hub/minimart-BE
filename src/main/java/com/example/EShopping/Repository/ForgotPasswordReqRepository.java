package com.example.EShopping.Repository;


import com.example.EShopping.Exception.*;
import com.example.EShopping.Model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ForgotPasswordReqRepository  extends MongoRepository<ForgotPasswordRequest, String> {

    ForgotPasswordRequest findByToken(String token);
    void deleteByToken(String token);

    void deleteByCreatedAtBefore(LocalDateTime now);
}
