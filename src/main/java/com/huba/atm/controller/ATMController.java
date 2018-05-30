package com.huba.atm.controller;

import com.huba.atm.response.Cash;
import com.huba.atm.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.*;

@RestController
@RequestMapping("/atm")
public class ATMController {

    @Autowired
    private ATMService service;

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/", produces = APPLICATION_JSON_VALUE)
    public Cash retrieveMoney(@RequestParam Integer amount){
        if (amount == null || amount<1){
            throw new IllegalArgumentException("amount parameter is incorrect");
        }
        return service.retrieveMoney(amount);
    }

}
