package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaRepo {
	void insertarCuentaBancaria(CuentaBancaria p);

	void actualizarCuentaBancariaPorId(CuentaBancaria p);
}
