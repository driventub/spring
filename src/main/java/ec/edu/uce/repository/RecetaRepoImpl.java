package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Receta;
import ec.edu.uce.modelo.Receta;


@Repository
public class RecetaRepoImpl implements IRecetaRepo{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	
	@Override
	public void insertarReceta(Receta p) {
		Object[] datosInsertar = new Object[] {
			p.getId(),p.getIndicaciones(),p.getMedicamentos()	
		};
		this.jdbc.update("INSERT INTO receta (id,indicaciones,medicamentos) values(?,?,?) ",datosInsertar);
	}

	@Override
	public Receta buscarReceta(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM paciente WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Receta>(Receta.class)) ;
		return null;
	}

	@Override
	public void actualizarReceta(Receta p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
//		Object[] datoActualizar = new Object[] {p.getId(), p.getNombre(), p.getApellido(),p.getEdad(), i};
//		this.jdbc.update("UPDATE paciente SET id=?, nombre=?,apellido=?,edad =? where id=?;",datoActualizar);
	}

	@Override
	public void borrarReceta(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM paciente WHERE id=?",datoBorrar);
	}

}
