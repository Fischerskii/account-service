package ru.springcourse.service;

import ru.springcourse.model.AllCurrencyExchange;
import ru.springcourse.model.ConvertResult;
import ru.springcourse.model.ConverterRequest;

public interface ExchangeApi {

     ConvertResult convert(ConverterRequest request);

     AllCurrencyExchange getAllCurrencyExchange();

}
