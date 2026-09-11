package com.practical27.customercrud.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CustomerDTO {
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String mobile;
    private String address;
    private String gender;
}
