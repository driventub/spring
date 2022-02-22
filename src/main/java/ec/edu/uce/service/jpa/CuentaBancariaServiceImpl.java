package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	@Autowired
	private ICuentaBancariaRepo cuenta;

	@Override
	public void insertar(CuentaBancaria p) {
		this.cuenta.insertarCuentaBancaria(p);

	}

	@Override
	public void actualizar(CuentaBancaria p) {
		this.cuenta.actualizarCuentaBancariaPorId(p);

	}

	@Override
	public CuentaBancaria buscar(String cuenta) {
		return this.cuenta.buscarPorNumero(cuenta);
		
		
	}

	@Override
	@Transactional
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer) {
		CuentaBancaria cuentaOri = this.buscar(cuentaOrigen);
		CuentaBancaria cuentaDest = this.buscar(cuentaDestino);
		
		BigDecimal nuevoSaldoOri = cuentaOri.getSaldo().subtract(valorTransfer);
		cuentaOri.setSaldo(nuevoSaldoOri);
		
		BigDecimal nuevoSaldoDes= cuentaDest.getSaldo().add(valorTransfer);
		cuentaDest.setSaldo(nuevoSaldoDes);
		cuentaDest.setSaldo(null);
		
		this.cuenta.actualizarCuentaBancariaPorId(cuentaOri);
		this.cuenta.actualizarCuentaBancariaPorId(cuentaDest);
		
		
		
	}
	
	
	
	

}
