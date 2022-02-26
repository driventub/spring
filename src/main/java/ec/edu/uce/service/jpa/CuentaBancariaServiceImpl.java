package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaServiceImpl.class);
	
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
	
	public void actualizar2(CuentaBancaria p) {
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
		
		
		LOG.info("AA1");
		
		try {
		this.cuenta.actualizarCuentaBancariaPorId(cuentaOri);
		} catch(ArrayIndexOutOfBoundsException e) {
			LOG.error("LLego el ERROR");
		}
		
		LOG.info("DA!");
		
		LOG.info("AA2");
		
		try {
		this.cuenta.actualizar2(cuentaDest);
		}catch (ArrayIndexOutOfBoundsException e) {
			LOG.error("LLego el ERROR");
		}
		LOG.info("DA2");
		
		
	}
	
	
	
	

}
