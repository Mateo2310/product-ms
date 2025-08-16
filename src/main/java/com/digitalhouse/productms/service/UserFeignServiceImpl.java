package com.digitalhouse.productms.service;

import com.digitalhouse.productms.dto.UserResponseDTO;
import com.digitalhouse.productms.repository.IUserRepository;
import com.digitalhouse.productms.repository.feign.IUserFeignRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFeignServiceImpl implements IUserRepository {

    private final IUserFeignRepository userFeignRepository;

    public UserFeignServiceImpl(IUserFeignRepository userFeignRepository) {
        super();
        this.userFeignRepository = userFeignRepository;
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return this.userFeignRepository.getAllUsers();
    }
}
