package com.seabank.multidbdemo.repository.postgres;

import com.seabank.multidbdemo.entity.postgres.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, String> {
}