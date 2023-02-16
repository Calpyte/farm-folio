package com.farmfolio.traceability.dto;


import lombok.Data;

@Data
public class HeapDTO {

    private String id;
    private Double latitude;
    private Double longitude;
    private Double inputWeight;
    private Double amountPaid;
    private String farmerId;
    private String farmerName;
}
