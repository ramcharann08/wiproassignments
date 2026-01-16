
package com.javatechsoft.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class PropertyReader {

    @Value("${app.example.integer-value}")
    private Integer integerValue;

    @Value("${app.example.decimal-value}")
    private Double decimalValue;

    @Value("${app.example.boolean-value}")
    private Boolean booleanValue;

    @PostConstruct
    public void printValues() {
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Decimal Value: " + decimalValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}
