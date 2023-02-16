package com.farmfolio.traceability.domain;


import com.farmfolio.traceability.dto.HeapDTO;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Data
@Entity
@Table(name ="heap_generation")
@Where(clause = "is_deleted = false")
public class Heap extends AuditableBase{

    private String name;
    private Double inputWeight;
    private Double amountPaid;
    private String farmer;
}
