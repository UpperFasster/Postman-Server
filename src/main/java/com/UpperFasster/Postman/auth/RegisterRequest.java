package com.UpperFasster.Postman.auth;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotBlank(message = "Name can't be null")
    @Min(value = 2, message = "Name cant start at 2 symbols")
    @Max(value = 255, message = "Out of max symbols in name")
    private String firstName;
    @NotBlank(message = "Last name can't be null")
    @Min(value = 1, message = "Lastname cant be less then 1 symbols")
    @Max(value = 255, message = "Out of max symbols in name")
    private String lastName;
    @Email
    private String email;
    @Min(value = 8, message = "Password start at 8 symbols")
    private String password;
}
