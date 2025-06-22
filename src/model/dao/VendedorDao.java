package model.dao;

import java.util.List;

import entities.Vendedor;

public interface VendedorDao {
	
		void inserir(Vendedor vend);
		
		void atualizar(Vendedor vend);
			
		void deletarPorId(Integer id);
		
		Vendedor encontrarPorId(Integer id);
		
		List<Vendedor> listarTodos();
}
