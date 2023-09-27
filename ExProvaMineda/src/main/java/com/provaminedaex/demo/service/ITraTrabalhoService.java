package com.provaminedaex.demo.service;

import java.util.List;

import com.provaminedaex.demo.entity.TraTrabalho;

public interface ITraTrabalhoService {
	
	public TraTrabalho novoTrabalho(TraTrabalho traTrabalho);

    public List<TraTrabalho> buscarTudo();

    public TraTrabalho buscarPorId(Long id);

}
