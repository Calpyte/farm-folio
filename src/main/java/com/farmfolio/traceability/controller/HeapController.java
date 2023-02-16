package com.farmfolio.traceability.controller;


import com.farmfolio.traceability.Exception.CustomException;
import com.farmfolio.traceability.domain.Heap;
import com.farmfolio.traceability.dto.HeapDTO;
import com.farmfolio.traceability.service.HeapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/heap")
public class HeapController {


    @Autowired
    private HeapService heapService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Heap> saveFarmer(@RequestBody Heap heap) throws CustomException, ParseException {
        return new ResponseEntity<Heap>(heapService.saveFarmer(heap), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/by-ids", method = RequestMethod.GET)
    public ResponseEntity<List<Heap>> findAllById(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(heapService.findAllById(ids), HttpStatus.OK);
    }
}
