package com.example.mongoJAVA.calculator.repository;

import com.example.mongoJAVA.calculator.entity.Calculator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalRepository extends MongoRepository<Calculator, Long> {
}
