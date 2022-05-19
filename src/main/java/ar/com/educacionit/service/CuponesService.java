package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.domain.Cupones;

public interface CuponesService {

	public List<Cupones> findAll();

	public void save(Cupones cupon);
}
