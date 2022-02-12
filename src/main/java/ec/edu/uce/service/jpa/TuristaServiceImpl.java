package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ec.edu.uce.modelo.jpa.Turista;

import ec.edu.uce.repository.jpa.ITuristaRepo;

@Service
public class TuristaServiceImpl implements ITuristaService{
	
	private static final Logger LOG = LoggerFactory.getLogger(TuristaServiceImpl.class); 
	
	@Autowired
	private ITuristaRepo turistaRepo;
	
	@Override
	public List<Turista> obtenerTodosTuristas() {
		// TODO Auto-generated method stub

		List<Turista> lista=this.turistaRepo.obtenerTodosTuristas();

		List<Turista> listaCalculada=this.calcularSaldo(lista);
		
		
		
		for(Turista f : listaCalculada) {
			LOG.info(f.toString());
		}
			
			
		return listaCalculada;
	}

	private List<Turista> calcularSaldo(List<Turista> listaTurista){
		for(Turista turista:listaTurista) {
			BigDecimal saldo= turista.getValor().subtract(turista.getAbono());
			turista.setSaldo(saldo);
		}

		return listaTurista;
	}

	@Override
	public void guardar(Turista t) {
		this.turistaRepo.insertarTurista(t);
		
	}
}
