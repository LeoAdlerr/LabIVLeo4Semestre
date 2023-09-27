package com.provaminedaex.demo.entity;
import java.time.LocalDateTime;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "tra_trabalho")
public class TraTrabalho {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tra_id")
	private Long tra_id;
	
	@Column(name = "tra_data_hora_entrega")
	private LocalDateTime tra_data_hora_entrega;
	
	@Column(name = "tra_descricao")
	private String tra_descricao;
	
	@Column(name = "tra_grupo")
	private String tra_grupo;
	
	@Column(name = "tra_nota")
	private int tra_nota;
	
	@Column(name = "tra_justificativa")
	private String tra_justificativa;
	
	public TraTrabalho(Long tra_id,
	LocalDateTime tra_data_hora_entrega,
	String tra_descricao,
	String tra_grupo,
	int tra_nota,
	String tra_justificativa) {
		this.tra_id=tra_id;
		this.tra_data_hora_entrega=tra_data_hora_entrega;
		this.tra_descricao=tra_descricao;
		this.tra_nota=tra_nota;
		this.tra_justificativa=tra_justificativa;
	}

	public Long getTra_id() {
		return tra_id;
	}

	public void setTra_id(Long tra_id) {
		this.tra_id = tra_id;
	}

	public LocalDateTime getTra_data_hora_entrega() {
		return tra_data_hora_entrega;
	}

	public void setTra_data_hora_entrega(LocalDateTime tra_data_hora_entrega) {
		this.tra_data_hora_entrega = tra_data_hora_entrega;
	}

	public String getTra_descricao() {
		return tra_descricao;
	}

	public void setTra_descricao(String tra_descricao) {
		this.tra_descricao = tra_descricao;
	}

	public String getTra_grupo() {
		return tra_grupo;
	}

	public void setTra_grupo(String tra_grupo) {
		this.tra_grupo = tra_grupo;
	}

	public int getTra_nota() {
		return tra_nota;
	}

	public void setTra_nota(int tra_nota) {
		this.tra_nota = tra_nota;
	}

	public String getTra_justificativa() {
		return tra_justificativa;
	}

	public void setTra_justificativa(String tra_justificativa) {
		this.tra_justificativa = tra_justificativa;
	}
	
	
	
	
	
	
	
	

}

