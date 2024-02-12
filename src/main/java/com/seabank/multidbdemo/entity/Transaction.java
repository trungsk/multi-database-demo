package com.seabank.multidbdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Transaction {
    private Integer familyId;
    private String name;
    private Integer yob;
    private String equipmentId;
    private String equipName;
    private String usage;
}
