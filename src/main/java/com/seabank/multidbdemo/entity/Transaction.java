package com.seabank.multidbdemo.entity;


import lombok.Data;

@Data
public class Transaction {
    private String schoolId;
    private String schoolName;
    private String type;
    private Integer enrollment;
    private String workerId;
    private String workerName;
    private long yob;
    private long salary;
}
