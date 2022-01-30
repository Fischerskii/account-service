package com.example.stockservice.controller;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.stockservice.model.HistoricalQuotesRequest;
import com.example.stockservice.model.HistoricalQuotesResponse;
import com.example.stockservice.model.StockQuotes;
import com.example.stockservice.service.StockServiceApi;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StockController {

    private final StockServiceApi stockServiceApi;

    @PostMapping("/get-stock-quotes")
    public StockQuotes getStockQuotes(@RequestBody List<String> tickets,
                                      @RequestHeader Map<String, String> headers) {
        log.info("headers: {}", headers);
        return stockServiceApi.getStockQuotesByTicket(tickets);
    }

    @PostMapping("/get-historical-quotes")
    public HistoricalQuotesResponse getStockQuotes(@RequestBody HistoricalQuotesRequest request) {
        return stockServiceApi.getHistoricalQuotes(request);
    }

}