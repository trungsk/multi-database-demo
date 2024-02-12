package com.seabank.multidbdemo.repository.mysql;

import com.seabank.multidbdemo.entity.mysql.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Integer> {
}