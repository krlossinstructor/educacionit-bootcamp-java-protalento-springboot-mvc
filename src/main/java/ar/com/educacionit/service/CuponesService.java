package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.domain.Cupones;

public interface CuponesService {

	public List<Cupones> findAll();

	public void save(Cupones cupon);

	public void delete(Long id);

	public Cupones getById(Long id);

	public void update(Cupones cupon);
}
