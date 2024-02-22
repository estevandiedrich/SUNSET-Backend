package com.api.rest.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.AccessType;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prospect extends RepresentationModel<Prospect>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome; 
	private String numeroDocumento; 
	private Date dataNascimento; 
	private String cidadeResidencia;
	private Boolean excluido;
	private Boolean cliente;
	private Date dataConversao;
	
	@AccessType(AccessType.Type.PROPERTY)
	public void setLinks(List<Link> links) {
	    super.removeLinks();
	    super.add(links);
	}
}
