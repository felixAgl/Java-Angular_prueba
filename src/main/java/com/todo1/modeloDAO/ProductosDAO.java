package com.todo1.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.todo1.modelo.Productos;

@Repository
public class ProductosDAO implements IProductos {
	
	@Autowired	
	private JdbcTemplate template;
	
	@Override
	public List<Productos> listar() {
		String sql="select * from productos";
		List<Productos>productos1=template.query(sql, new BeanPropertyRowMapper<Productos>(Productos.class));
		return productos1;
	}

	@Override
	public Productos listProductosId(int id) {
		String sql="select * from productos where id=?";
		Productos pro=template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Productos>(Productos.class));
		return pro;
	}

	@Override
	public int agregar(Productos p) {
		String sql="insert into productos(camisas)values(?)";
		int res=template.update(sql,p.getCamisas());
		return res;
	}

	@Override
	public int editar(Productos p) {
		String sql="update productos set camisas=? where id=?";
		int res=template.update(sql,p.getCamisas(),p.getId());
		return res;
	}

	@Override
	public void delete(int id) {
		String sql="delete from productos where id=?";
		template.update(sql,id);


		
	}

}
