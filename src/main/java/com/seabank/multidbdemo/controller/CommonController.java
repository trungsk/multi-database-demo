package com.seabank.multidbdemo.controller;

import com.seabank.multidbdemo.entity.Transaction;
import com.seabank.multidbdemo.entity.mysql.Family;
import com.seabank.multidbdemo.entity.postgres.Equipment;
import com.seabank.multidbdemo.service.DemoSaveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CommonController {
    private final DemoSaveService demoSaveService;

    public CommonController(DemoSaveService demoSaveService) {
        this.demoSaveService = demoSaveService;
    }

    @PostMapping("/init")
    public ResponseEntity<String> init(@RequestBody Transaction transaction) {
        Family family = Family.builder().id(transaction.getFamilyId()).name(transaction.getName()).yob(transaction.getYob()).build();
        Equipment equipment = Equipment.builder().id(transaction.getEquipmentId()).equipName(transaction.getEquipName()).usage(transaction.getUsage()).build();
        demoSaveService.init(family, equipment);
        return ResponseEntity.ok("saved successfully");
    }
}
