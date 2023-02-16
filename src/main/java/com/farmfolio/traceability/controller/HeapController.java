package com.farmfolio.traceability.controller;


import com.farmfolio.traceability.Exception.CustomException;
import com.farmfolio.traceability.dto.HeapDTO;
import com.farmfolio.traceability.service.HeapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/heap")
public class HeapController {


    @Autowired
    private HeapService heapService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<HeapDTO> saveFarmer(@RequestBody HeapDTO heapDTO) throws CustomException, ParseException {
        return new ResponseEntity<HeapDTO>(heapService.saveFarmer(heapDTO), HttpStatus.CREATED);
    }
}
