package br.com.renato.lessa.repository;

/**
 * 
 * @author r.lessa.da.silva
 *
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.renato.lessa.entity.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
	public Endereco findById(Long id);
}
