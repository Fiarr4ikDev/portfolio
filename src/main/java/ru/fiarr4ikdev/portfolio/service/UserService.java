package ru.fiarr4ikdev.portfolio.service;

import org.springframework.stereotype.Service;
import ru.fiarr4ikdev.portfolio.dto.UserDTO;
import ru.fiarr4ikdev.portfolio.model.User;
import ru.fiarr4ikdev.portfolio.repo.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final MappingService mappingService;
    public UserService(UserRepository userRepository, MappingService mappingService) {
        this.userRepository = userRepository;
        this.mappingService = mappingService;
    }

    public void saveUser(UserDTO userDTO) {
        User user = mappingService.convertToEntity(userDTO);
        User savedUser = userRepository.save(user);
        mappingService.convertToDto(savedUser);
    }

}
