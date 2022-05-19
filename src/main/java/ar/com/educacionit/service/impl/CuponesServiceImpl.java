package ar.com.educacionit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.educacionit.domain.Cupones;
import ar.com.educacionit.repository.CuponesRepository;
import ar.com.educacionit.service.CuponesService;

@Service
public class CuponesServiceImpl implements CuponesService{

	//spring por medio de la inyeccion de dependencias
	@Autowired
	private CuponesRepository repository;
	
	/*
	public CuponesServiceImpl() {
		this.reposiroty = new CuponesServiceImpl();
	}*/
	
	@Override
	public List<Cupones> findAll() {
		return this.repository.findAll();
	}
	
	@Override
	public void save(Cupones cupon) {
		this.repository.save(cupon);		
	}
}
