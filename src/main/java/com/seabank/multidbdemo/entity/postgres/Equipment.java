package com.seabank.multidbdemo.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "equipment", schema = "bmw")
public class Equipment {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "equip_name")
    private String equipName;

    @Column(name = "usage")
    private String usage;

}