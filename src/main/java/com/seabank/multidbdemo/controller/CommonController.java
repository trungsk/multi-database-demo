package com.seabank.multidbdemo.controller;

import com.seabank.multidbdemo.entity.Transaction;
import com.seabank.multidbdemo.entity.oracle.School;
import com.seabank.multidbdemo.entity.postgres.Worker;
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
        School school = School.builder().id(transaction.getSchoolId()).name(transaction.getSchoolName()).type(transaction.getType()).enrollment(transaction.getEnrollment()).build();
        Worker worker = Worker.builder().id(transaction.getWorkerId()).name(transaction.getWorkerName()).yob(transaction.getYob()).salary(transaction.getSalary()).build();
        demoSaveService.init(school, worker);
        return ResponseEntity.ok("saved successfully");
    }
}
