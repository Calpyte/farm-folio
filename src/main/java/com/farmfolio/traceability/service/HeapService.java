package com.farmfolio.traceability.service;

import com.farmfolio.traceability.Exception.CustomException;
import com.farmfolio.traceability.domain.Heap;
import com.farmfolio.traceability.dto.HeapDTO;

import java.text.ParseException;
import java.util.List;

public interface HeapService {

    Heap saveFarmer(Heap heap) throws ParseException, CustomException;

    List<Heap> findAllById(List<String> ids);


}
