package com.cursudemy.currencyconversionservice.classes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")
@FeignClient(name = "currency-exchange") //load balancing by Eureka
public interface CurrencyExchangeProxy {

    //foloseste headerul metodei din CurrencyExchangeService, valoarea returnata e mapata direct pentru ca are acelasi format
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
