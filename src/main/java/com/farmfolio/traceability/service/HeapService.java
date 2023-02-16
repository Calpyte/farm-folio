package com.farmfolio.traceability.service;

import com.farmfolio.traceability.Exception.CustomException;
import com.farmfolio.traceability.dto.HeapDTO;

import java.text.ParseException;

public interface HeapService {

    HeapDTO saveFarmer(HeapDTO heapDTO) throws ParseException, CustomException;

}
