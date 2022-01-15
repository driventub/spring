package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void insertarPaciente(Paciente p) {
		Object[] datosInsertar = new Object[] {
			p.getId(),p.getNombre(),p.getApellido(),p.getEdad()	
		};
		this.jdbc.update("INSERT INTO paciente (id,nombre,apellido,edad) values(?,?,?,?) ",datosInsertar);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM paciente WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Paciente>(Paciente.class)) ;
		return null;
	}

	@Override
	public void actualizarPaciente(Paciente p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] {p.getId(), p.getNombre(), p.getApellido(),p.getEdad(), i};
		this.jdbc.update("UPDATE paciente SET id=?, nombre=?,apellido=?,edad =? where id=?;",datoActualizar);
	}

	@Override
	public void borrarPaciente(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM paciente WHERE id=?",datoBorrar);
	}

}
