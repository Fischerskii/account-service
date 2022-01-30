package ru.springcourse.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ConvertResult {

    private ConverterRequest query;
    private BigDecimal result;

}