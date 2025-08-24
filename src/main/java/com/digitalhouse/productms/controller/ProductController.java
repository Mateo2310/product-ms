package com.digitalhouse.productms.controller;

import com.digitalhouse.productms.dto.UserResponseDTO;
import com.digitalhouse.productms.service.UserFeignServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final UserFeignServiceImpl userFeignService;

    public ProductController(UserFeignServiceImpl userFeignService) {
        this.userFeignService = userFeignService;
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers(@RequestHeader("X-Request-from") String requestFrom) {
        System.out.println("Request from: " + requestFrom);
        if (requestFrom == null || !requestFrom.equals("gateway")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        List<UserResponseDTO> users = this.userFeignService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
