package com.learn.springrestapi.repository;

import com.learn.springrestapi.model.IcatuMasc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaIcatuMascRepository extends JpaRepository<IcatuMasc,Integer> {
}
