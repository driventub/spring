package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class CuentaFachadaServiceImpl {
	
	private static final Logger LOG = LoggerFactory.getLogger(CuentaFachadaServiceImpl.class);
	
	@Autowired
	private ICuentaBancariaService c;
	
	public void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransfer) {
//		LOG.info("Prueba 1: " +TransactionSynchronizationManager.isActualTransactionActive());
		this.c.realizarTransferenciaExpress(cuentaOrigen,cuentaDestino,valorTransfer);	
		
	}
}
