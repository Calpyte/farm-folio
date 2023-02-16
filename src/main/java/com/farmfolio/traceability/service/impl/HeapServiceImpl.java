package com.farmfolio.traceability.service.impl;


import com.farmfolio.traceability.Exception.CustomException;
import com.farmfolio.traceability.domain.Heap;
import com.farmfolio.traceability.dto.HeapDTO;
import com.farmfolio.traceability.repository.HeapRepository;
import com.farmfolio.traceability.service.HeapService;
import com.farmfolio.traceability.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class HeapServiceImpl  implements HeapService {

    @Autowired
    private HeapRepository heapRepository;


    @Override
    public Heap saveFarmer(Heap heap) throws ParseException, CustomException {
      //  validate(heap);
        Mapper.setAuditable(heap);
        heapRepository.save(heap);
        return heap;
    }

    @Override
    public List<Heap> findAllById(List<String> ids) {
        return heapRepository.findAllById(ids);
    }

//    private void validate(Heap heap) throws CustomException {
//        Heap eFarmer = heapRepository.findByName(heap.getName());
//        if (eFarmer != null && (!eFarmer.getId().equals(heap.getId()))) {
//            throw new CustomException("Duplicate Farmer name");
//        }
//    }
}
