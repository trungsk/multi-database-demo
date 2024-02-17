package com.seabank.multidbdemo.repository.postgres;

import com.seabank.multidbdemo.entity.postgres.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EquipmentRepository extends JpaRepository<Worker, String> {
}