package com.djm.mileageservice.controller;

import java.util.List;

import com.djm.mileageservice.document.Mileage;
import com.djm.mileageservice.repository.MileageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MileageController {
    

    @Autowired
    MileageRepository mileageRepo;

    @GetMapping
    public List<Mileage> getAll() {
        return mileageRepo.findAll();
    }

    @PostMapping
    public Mileage addMileage(@RequestBody Mileage mileage){
        mileageRepo.save(mileage);
        return mileage;
    }
}
