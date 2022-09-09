package com.lyssa.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyssa.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi","mario"));
		lista.add(new Contatto("Gary", "Rossi","gary"));
		lista.add(new Contatto("Freya", "Rossi","freya"));
		lista.add(new Contatto("Rebeca", "Rossi","beca"));
		return lista;
	}
	
	
}
