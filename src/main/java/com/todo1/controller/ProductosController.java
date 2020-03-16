package com.todo1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.todo1.modelo.Productos;
import com.todo1.service.IProductosService;

@Controller	
public class ProductosController {
	
	@Autowired
	private IProductosService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("productos", service.listar());
		return "index";
		
	}
	
	@GetMapping("/nuevo")
	public String nuevo() {
		return "agregar";
	}
	@PostMapping("/agregar")
	public String agregar(@Valid Productos p) {
		service.agregar(p);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Productos productos =service.listProductosId(id);
		model.addAttribute("productos",productos);
		return "editar";
	}
	@PostMapping("/actualizar")
	public String actualizar(@Valid Productos p) {
		service.editar(p);
		return "redirect:/listar";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}

}
