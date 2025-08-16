package com.digitalhouse.productms.repository.feign;

import com.digitalhouse.productms.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "admin-expenses")
public interface IUserFeignRepository {
    @GetMapping(value = "/user")
    List<UserResponseDTO> getAllUsers();
}
