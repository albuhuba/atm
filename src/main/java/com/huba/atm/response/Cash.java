package com.huba.atm.response;

import lombok.Data;

@Data
public class Cash {

    private Integer note_1000;
    private Integer note_500;
    private Integer note_200;
    private Integer note_100;
    private Integer note_50;

    private Integer coin_20;
    private Integer coin_10;
    private Integer coin_5;
    private Integer coin_2;
    private Integer coin_1;


}
