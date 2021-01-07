package com.djm.mileageservice.service;

import java.util.List;

import com.djm.mileageservice.document.Mileage;
import com.djm.mileageservice.repository.MileageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MileageService {
    
    @Autowired
    MileageRepository mileageRepo;

    public List<Mileage> getAllMileages(){
        return mileageRepo.findAll();
    }

    public Mileage addMileage(Mileage mileage){
        return mileageRepo.save(mileage);
    }
}
