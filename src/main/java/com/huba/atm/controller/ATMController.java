package com.huba.atm.controller;

import com.huba.atm.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/atm")
public class ATMController {

    @Autowired
    private ATMService service;

    @PostMapping("/")
    public void retrieveMoney(@Valid @Size(min = 1) @RequestParam Integer amount){
        service.retrieveMoney(amount);
    }

}
