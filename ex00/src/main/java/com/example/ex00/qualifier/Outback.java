package com.example.ex00.qualifier;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outback") @Primary
@Getter
@ToString
public class Outback implements Resturant{
    private int price = Resturant.price - 10000;

    @Override
    public boolean checkSalad() {
        return false;
    }


}
