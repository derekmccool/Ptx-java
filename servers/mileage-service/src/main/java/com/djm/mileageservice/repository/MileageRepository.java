package com.djm.mileageservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djm.mileageservice.document.Mileage;

public interface MileageRepository extends MongoRepository<Mileage, Integer>{
    
}
