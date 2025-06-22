package model.dao;

import java.util.List;

import entities.Departamento;

public interface DepartamentoDao {
	
	// operação que vai inserir no banco de dados o objeto recebido como parâmetro de entrada
	void inserir(Departamento dep);
	
	// operação que vai atualizar no banco de dados o objeto recebido como parâmetro de entrada
		void atualizar(Departamento dep);
		
	// operação que vai deletar no banco de dados os dados referentes ao ID recebido como parâmetro de entrada
	void deletarPorId(Integer id);
	
	// operação que vai atualizar no banco de dados o objeto recebido como parâmetro de entrada
	Departamento encontrarPorId(Integer id);
	
	List<Departamento> listarTodos();
}
