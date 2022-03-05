package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

/**
 * @author aldaz
 *
 */
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
		
		
		this.cuenta.actualizarCuentaBancariaPorId(cuentaOri);
		
//			LOG.error("LLego el ERROR");
		
		
		LOG.info("DA!");
		
		LOG.info("AA2");
		
		
		this.cuenta.actualizar2(cuentaDest);
		
//			LOG.error("LLego el ERROR");
		
		LOG.info("DA2");
		
		
	}
	
	
	
	

	@Override
	@Transactional()
	public void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer) {
		this.realizarTransferenciaExpress(cuentaOrigen,cuentaDestino,valorTransfer);	
		
	}
	

	@Override
//	@Transactional()
	public void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer) {
		this.realizarTransferenciaExpress(cuentaOrigen,cuentaDestino,valorTransfer);	
		
	}
	
	@Override
//	@Transactional(value = TxType.SUPPORTS)
	@Transactional(value = TxType.REQUIRES_NEW)
	public void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer) {
		
		LOG.info("Ejecucion SUPPORTS");
		CuentaBancaria cuentaOri = this.buscar(cuentaOrigen);
		CuentaBancaria cuentaDest = this.buscar(cuentaDestino);
		
		BigDecimal nuevoSaldoOri = cuentaOri.getSaldo().subtract(valorTransfer);
		cuentaOri.setSaldo(nuevoSaldoOri);
		
		BigDecimal nuevoSaldoDes= cuentaDest.getSaldo().add(valorTransfer);
		cuentaDest.setSaldo(nuevoSaldoDes);
		
		LOG.info("Ejecucion SUPPORTS ANTES");
		this.cuenta.actualizarCuentaBancariaPorId(cuentaOri);
		this.cuenta.actualizar2(cuentaDest);
		
	}
	
	
	@Override
	@Transactional
	public void enviarMail() {
		this.cuenta.enviarMail("Correo de clases");
	}
	
	@Override
	public void enviarMailNoT() {
		this.cuenta.enviarMail("Correo de clases NoT");
	}
	
	@Override
	@Transactional(value = TxType.SUPPORTS)
	public void propagacionSupport() {
		LOG.info("Ejecucion supports");
	}
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void propagacionMandatory() {
		LOG.info("Ejecucion Mandatory");
	}
	
	
	
	

}
