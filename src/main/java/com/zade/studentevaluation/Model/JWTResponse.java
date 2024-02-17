package com.zade.studentevaluation.Model;

import lombok.*;

@Data
@Builder
public class JWTResponse {
    private String jwtToken;
    private String username;
}
