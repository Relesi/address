package br.com.renato.lessa.service;

/**
 * 
 * @author r.lessa.da.silva
 *
 */

import br.com.renato.lessa.entity.Endereco;
import br.com.renato.lessa.exceptions.CampoObrigatorioException;
import br.com.renato.lessa.exceptions.EnderecoException;

public interface EnderecoServiceInterface {
	
	Endereco consultar(Long id) throws CampoObrigatorioException;
	void incluir(Endereco endereco) throws CampoObrigatorioException, EnderecoException;
	void atualizar(Endereco endereco) throws CampoObrigatorioException, EnderecoException;
	void deletar(Long id) throws CampoObrigatorioException;
	Endereco buscarCep(String cep) throws EnderecoException;
}
