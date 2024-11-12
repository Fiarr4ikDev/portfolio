package ru.fiarr4ikdev.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Dto пользователя")
public class UserDTO {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

}
