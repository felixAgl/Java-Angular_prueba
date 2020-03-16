package com.todo1.modeloDAO;

import java.util.List;

import com.todo1.modelo.Productos;

public interface IProductos {
	
	public List<Productos>listar();
	
	public Productos listProductosId(int id);
	
	public int agregar(Productos p);
	
	public int editar(Productos p);
	
	public void delete(int id);
		
}
