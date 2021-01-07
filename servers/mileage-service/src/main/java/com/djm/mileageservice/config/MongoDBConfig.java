package com.djm.mileageservice.config;

import com.djm.mileageservice.repository.MileageRepository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = MileageRepository.class)
@Configuration
public class MongoDBConfig {
    
}
