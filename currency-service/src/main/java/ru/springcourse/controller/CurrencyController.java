package ru.springcourse.controller;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import ru.springcourse.model.AllCurrencyExchange;
import ru.springcourse.model.ConvertResult;
import ru.springcourse.model.ConverterRequest;
import ru.springcourse.service.ExchangeApi;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CurrencyController {

    private final ExchangeApi exchangeApi;

    @PostMapping("/convert")
    public ConvertResult convertAmount(@RequestBody ConverterRequest converterRequest,
                                       @RequestHeader Map<String, String> headers) {
        log.info("Request with headers: {}", headers);
        return exchangeApi.convert(converterRequest);
    }

    @GetMapping("/all-exchange")
    public AllCurrencyExchange getAllExchange(@RequestHeader Map<String, String> headers) {
        log.info("Request with headers: {}", headers);
        return exchangeApi.getAllCurrencyExchange();
    }

}
