package ru.fiarr4ikdev.portfolio.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fiarr4ikdev.portfolio.dto.UserDTO;
import ru.fiarr4ikdev.portfolio.model.User;

@Service
public class MappingService {

    private final ModelMapper modelMapper;

    @Autowired
    public MappingService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public User convertToEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }

    public void convertToDto(User user) {
        modelMapper.map(user, UserDTO.class);
    }

}
