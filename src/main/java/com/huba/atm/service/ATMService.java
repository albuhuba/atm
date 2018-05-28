package com.huba.atm.service;

import com.huba.atm.response.Cash;
import org.springframework.stereotype.Service;

@Service
public class ATMService {

    public Cash retrieveMoney(Integer amount) {
        Cash cash = new Cash();
        calculateCash(cash, amount);
        return cash;
    }

    private void calculateCash(Cash returnCash, Integer amount) {
        if (amount >= 1000) {
            returnCash.setNote_1000(amount / 1000);
            calculateCash(returnCash, amount % 1000);
        } else if (amount >= 500) {
            returnCash.setNote_500(amount / 500);
            calculateCash(returnCash, amount % 500);
        } else if (amount >= 200) {
            returnCash.setNote_200(amount / 200);
            calculateCash(returnCash, amount % 200);
        } else if (amount >= 100) {
            returnCash.setNote_100(amount / 100);
            calculateCash(returnCash, amount % 100);
        } else if (amount >= 50) {
            returnCash.setNote_50(amount / 50);
            calculateCash(returnCash, amount % 50);
        }// coins
        else if (amount >= 20) {
            returnCash.setCoin_20(amount / 20);
            calculateCash(returnCash, amount % 20);
        } else if (amount >= 10) {
            returnCash.setCoin_10(amount / 10);
            calculateCash(returnCash, amount % 10);
        } else if (amount >= 5) {
            returnCash.setCoin_5(amount / 5);
            calculateCash(returnCash, amount % 5);
        } else if (amount >= 2) {
            returnCash.setCoin_2(amount / 2);
            calculateCash(returnCash, amount % 2);
        } else if (amount >= 1) {
            returnCash.setCoin_1(amount / 1);
            calculateCash(returnCash, amount % 1);
        }
    }
}
