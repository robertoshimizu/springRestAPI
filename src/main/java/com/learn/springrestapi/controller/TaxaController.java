package com.learn.springrestapi.controller;

import com.learn.springrestapi.model.IcatuFem;
import com.learn.springrestapi.model.IcatuMasc;
import com.learn.springrestapi.repository.TaxaIcatuFemRepository;
import com.learn.springrestapi.repository.TaxaIcatuMascRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TaxaController {
    @Autowired
    private TaxaIcatuMascRepository taxaIcatuMascRepository;

    @Autowired
    private TaxaIcatuFemRepository taxaIcatuFemRepository;

    @GetMapping("/taxas")
    public String listAll(){
        Optional<IcatuMasc> icatu_homem= taxaIcatuMascRepository.findById(35);
        Optional<IcatuFem> icatu_mulher= taxaIcatuFemRepository.findById(35);
        return icatu_homem.toString() + icatu_mulher.toString();
    }
}
