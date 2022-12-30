package com.vyatsu.task14.entities;

import java.math.BigDecimal;

public class Filter {
    private String title;
    private BigDecimal maxPrice;
    private BigDecimal minPrice;

    public String getSearch() {
        return title;
    }
    public void setSearch(String search) {
        this.title = search;
    }
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }
    public BigDecimal getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public Filter(String title, BigDecimal minPrice, BigDecimal maxPrice) {
        this.title = title;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }
}
