package com.seabank.multidbdemo.repository.oracle;

import com.seabank.multidbdemo.entity.oracle.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, String> {
}
