package ru.springcourse.gatewayapi.service;

import java.util.List;

public interface StockApiService {

    String getStockQuotes(List<String> tickets);
}
