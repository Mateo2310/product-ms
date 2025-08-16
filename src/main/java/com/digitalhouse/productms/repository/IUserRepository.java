package com.digitalhouse.productms.repository;

import com.digitalhouse.productms.dto.UserResponseDTO;

import java.util.List;

public interface IUserRepository {
    List<UserResponseDTO> getAllUsers();
}
