package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	@Autowired
	private ICuentaBancariaRepo cuenta;

	@Override
	public void insertar(CuentaBancaria p) {
		this.cuenta.insertarCuentaBancaria(p);
		
	}

	@Override
	public void actualizar(CuentaBancaria p) {
		this.cuenta.insertarCuentaBancaria(p);
		
	}
}
