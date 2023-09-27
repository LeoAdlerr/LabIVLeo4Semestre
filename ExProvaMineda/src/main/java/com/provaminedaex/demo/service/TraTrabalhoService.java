package com.provaminedaex.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.provaminedaex.demo.entity.TraTrabalho;
import com.provaminedaex.demo.repository.TraTrabalhoRepository;

public class TraTrabalhoService implements ITraTrabalhoService{
	
	@Autowired
    private TraTrabalhoRepository repositoryTraTrabalho;
	
	  public TraTrabalho novoTrabalho(TraTrabalho traTrabalho) {
		return traTrabalho;
	  
	  }
	 

    public List<TraTrabalho> buscarTudo(){
		return repositoryTraTrabalho.findAll();
    }

    public TraTrabalho buscarPorId(Long id) {
		return null;
    	
    }

}
