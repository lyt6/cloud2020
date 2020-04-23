package com.helloworld.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseFund {
    private Long id;

    private String businessTime;

    private String companyNo;

    private String companyName;

    private String typeName;

    private String businessYearMonth;

    private Long add;

    private Long sub;

    private Long money;

    private String payCompanyName;

    private String operatePlatformName;
}