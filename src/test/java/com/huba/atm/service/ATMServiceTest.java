package com.huba.atm.service;

import com.huba.atm.response.Cash;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ATMServiceTest {

    private static final ATMService service = new ATMService();

    @Test
    public void cash_2000() {
        Cash cash = service.retrieveMoney(2000);

        assertEquals(2, cash.getNote_1000());
    }

    @Test
    public void cash_1001() {
        Cash cash = service.retrieveMoney(1001);

        assertEquals(1, cash.getNote_1000());
        assertEquals(1, cash.getCoin_1());

        assertNull(cash.getNote_500());
        assertNull(cash.getNote_100());
        assertNull(cash.getNote_50());
        assertNull(cash.getCoin_20());
        assertNull(cash.getCoin_10());
        assertNull(cash.getCoin_5());
        assertNull(cash.getCoin_2());
    }

    @Test
    public void cash_578() {
        Cash cash = service.retrieveMoney(578);

        assertEquals(1, cash.getNote_500());
        assertEquals(1, cash.getNote_50());
        assertEquals(1, cash.getCoin_20());
        assertEquals(1, cash.getCoin_5());
        assertEquals(1, cash.getCoin_2());
        assertEquals(1, cash.getCoin_1());

        assertNull(cash.getNote_1000());
        assertNull(cash.getNote_100());
        assertNull(cash.getCoin_10());
    }

    @Test
    public void cash_15() {
        Cash cash = service.retrieveMoney(15);

        assertEquals(1, cash.getCoin_10());
        assertEquals(1, cash.getCoin_5());

        assertNull(cash.getNote_1000());
        assertNull(cash.getNote_500());
        assertNull(cash.getNote_100());
        assertNull(cash.getNote_50());
        assertNull(cash.getCoin_20());
        assertNull(cash.getCoin_2());
        assertNull(cash.getCoin_1());
    }

}
