package com.digital.crud.saladereuniao.saladereuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;

//    public ErrorDetails(Date date, String message, String description) {
//    }
}
