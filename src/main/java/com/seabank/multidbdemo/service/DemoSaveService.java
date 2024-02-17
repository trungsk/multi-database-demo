package com.seabank.multidbdemo.service;

import com.seabank.multidbdemo.entity.oracle.School;
import com.seabank.multidbdemo.entity.postgres.Worker;
import com.seabank.multidbdemo.repository.oracle.SchoolRepository;
import com.seabank.multidbdemo.repository.postgres.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoSaveService {
    private final SchoolRepository schoolRepository;
    private final EquipmentRepository equipmentRepository;

    @Autowired
    public DemoSaveService(SchoolRepository schoolRepository, EquipmentRepository equipmentRepository) {
        this.schoolRepository = schoolRepository;
        this.equipmentRepository = equipmentRepository;
    }

    @Transactional
    public void init(School school, Worker worker) {
        schoolRepository.save(school);
        equipmentRepository.save(worker);
    }
}
