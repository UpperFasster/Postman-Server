package com.UpperFasster.Postman.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    @Email
    @NotBlank(message = "Email via login can't be null")
    private String email;
    @NotBlank(message = "Password can't be null")
    private String password;
}
