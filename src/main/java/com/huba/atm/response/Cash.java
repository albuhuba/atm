package com.huba.atm.response;

import lombok.Data;

@Data
public class Cash {

    private int note_1000;
    private int note_500;
    private int note_200;
    private int note_100;
    private int note_50;

    private int coin_20;
    private int coin_10;
    private int coin_5;
    private int coin_2;
    private int coin_1;

}
