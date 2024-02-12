package com.seabank.multidbdemo.service;

import com.seabank.multidbdemo.entity.mysql.Family;
import com.seabank.multidbdemo.entity.postgres.Equipment;
import com.seabank.multidbdemo.repository.mysql.FamilyRepository;
import com.seabank.multidbdemo.repository.postgres.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoSaveService {
    private final FamilyRepository familyRepository;
    private final EquipmentRepository equipmentRepository;

    @Autowired
    public DemoSaveService(FamilyRepository familyRepository, EquipmentRepository equipmentRepository) {
        this.familyRepository = familyRepository;
        this.equipmentRepository = equipmentRepository;
    }

    @Transactional
    public void init(Family family, Equipment equipment) {
        familyRepository.save(family);
        equipmentRepository.save(equipment);
    }
}
