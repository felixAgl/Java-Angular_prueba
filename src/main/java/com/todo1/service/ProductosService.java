package com.todo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo1.modelo.Productos;
import com.todo1.modeloDAO.IProductos;

@Service
public class ProductosService implements IProductosService {
	
	@Autowired
	private IProductos dao;
	
	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Productos listProductosId(int id) {
		// TODO Auto-generated method stub
		return dao.listProductosId(id);
	}

	@Override
	public int agregar(Productos p) {
		dao.agregar(p);
		return 0;
	}

	@Override
	public int editar(Productos p) {
		dao.editar(p);
		
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

}
