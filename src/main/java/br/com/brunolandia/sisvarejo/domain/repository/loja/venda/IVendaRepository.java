/**
 * 
 */
package br.com.brunolandia.sisvarejo.domain.repository.loja.venda;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunolandia.sisvarejo.domain.entity.loja.venda.Venda;

/**
 * @author Henrique
 *
 */
public interface IVendaRepository extends JpaRepository<Venda, Long>
{

}