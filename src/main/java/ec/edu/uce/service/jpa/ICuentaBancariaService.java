package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertar(CuentaBancaria p);

	void actualizar(CuentaBancaria p);

	CuentaBancaria buscar(String cuenta);

	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer);

	void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer);

	void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer);

	void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer);

	void actualizar2(CuentaBancaria p);

	void propagacionSupport();

	void propagacionMandatory();


	void enviarMail();

	void enviarMailNoT();

	
}
