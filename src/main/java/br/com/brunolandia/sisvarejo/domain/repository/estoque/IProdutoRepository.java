package br.com.brunolandia.sisvarejo.domain.repository.estoque;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.brunolandia.sisvarejo.domain.entity.estoque.Produto;

/**
 * @author Henrique
 *
 */
public interface IProdutoRepository extends JpaRepository<Produto, Long>
{

	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public Produto findByCodigo(String codigo);
	
	/**
	 * 
	 * @param codigo
	 * @param descricao
	 * @param pageable
	 * @return
	 */
	@Query("SELECT new Produto (produto.id, produto.descricao, produto.codigo, produto.precoCusto, produto.precoVenda, produto.codigoBarra, produto.quantidade) "
			+ "FROM Produto produto "
			+ "WHERE ( FILTER(produto.codigo, :codigo) = TRUE "
				+ "AND FILTER(produto.descricao, :descricao) = TRUE )")
	public Page<Produto> listByFilters(@Param("codigo") String codigo, @Param("descricao") String descricao, Pageable pageable);
}