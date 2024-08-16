package com.semicolon.africa.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {

    private boolean isSuccessful;
    private Object data;
}
