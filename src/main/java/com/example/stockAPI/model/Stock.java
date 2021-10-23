package com.example.stockAPI.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Stock {
    String ticker;
    String name;
    String type;

    @JsonCreator
    public Stock(@JsonProperty("ticker") String ticker,
                        @JsonProperty("name") String name,
                        @JsonProperty("type") String type) {
        this.ticker = ticker;
        this.name = name;
        this.type = type;
    }
}
