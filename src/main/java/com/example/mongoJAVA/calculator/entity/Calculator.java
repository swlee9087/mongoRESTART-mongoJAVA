package com.example.mongoJAVA.calculator.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public final class Calculator {
    @Id
    private long calId;
    private int num1;
    private int num2;
    private int result;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.result = num1*num2;  //running multiplication only

    }

    @Override
    public String toString() {
        return String.format("%d * %d = %d", num1, num2, result);
    }
}
