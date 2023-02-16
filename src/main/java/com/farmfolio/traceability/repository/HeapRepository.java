package com.farmfolio.traceability.repository;

import com.farmfolio.traceability.domain.Heap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface HeapRepository extends JpaRepository<Heap, String> , JpaSpecificationExecutor<Heap> {

}
