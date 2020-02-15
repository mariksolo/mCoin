package com.marksolomonik.demo;

import com.marksolomonik.demo.domain.Block;
import com.marksolomonik.demo.domain.BlockRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// PROJECT PLANNING

// IMMEDIATE STEPS
// 1. Figure out how to represent blocks in H2 database
//     - Use constructor to make one based on previous block
//     - add find with ID method to BlockRepository
// 2. Design transaction data
// 3. Add REST to add blocks
// 4. Test with multiple computers
//
// FUTURE PLANS
// 1. Represent data as merkle tree
// 2. Smart contracts for untrusted transactions
// 3. Create distributable .jar with UI
//
@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello Mark";
    }


}
