package com.example.hanghae_market.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class InterestResponseDto {
    private String msg;
    private HttpStatus code;
}
