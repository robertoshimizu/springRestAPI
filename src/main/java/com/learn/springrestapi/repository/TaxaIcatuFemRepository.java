package com.learn.springrestapi.repository;

import com.learn.springrestapi.model.IcatuFem;
import com.learn.springrestapi.model.IcatuMasc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaIcatuFemRepository extends JpaRepository<IcatuFem,Integer> {
}
