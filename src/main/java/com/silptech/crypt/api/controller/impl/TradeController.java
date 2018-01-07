package com.silptech.crypt.api.controller.impl;

import com.silptech.crypt.api.controller.BaseController;
import com.silptech.crypt.api.models.impl.Trade;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adarshbhattarai on 12/21/17.
 */
@RestController
public class TradeController implements BaseController<Trade> {

    @GetMapping(value = "/auth/me", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> getUser(){

        return new ResponseEntity<>("Hello CyrptoTrade", HttpStatus.OK);
    }


}
