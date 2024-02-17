package com.seabank.multidbdemo.entity.postgres;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "worker", schema = "mouseloverice")
public class Worker {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "yob")
    private long yob;

    @Column(name = "salary")
    private long salary;
}