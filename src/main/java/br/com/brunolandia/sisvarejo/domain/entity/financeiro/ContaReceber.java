package br.com.brunolandia.sisvarejo.domain.entity.financeiro;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.directwebremoting.annotations.DataTransferObject;

import br.com.brunolandia.sisvarejo.domain.entity.loja.venda.Venda;
import br.com.eits.common.domain.entity.AbstractEntity;

/**
 * @author Henrique
 *
 */
@Entity
@DataTransferObject(javascript = "ContaReceber")
public class ContaReceber extends AbstractEntity
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3255623871917282285L;

	/**
	 * 
	 */
	@Column
	private String descricao;

	/**
	 * 
	 */
	@Column
	private BigDecimal valor;

	/**
	 * 
	 */
	@Column
	private String observacoes;

	/**
	 * 
	 */
	@Column
	private Date emissao;

	/**
	 * 
	 */
	@Column
	private Date vencimento;

	/**
	 * 
	 */
	@ManyToOne
	private Venda venda;

	/**
	 * 
	 */
	public ContaReceber()
	{

	}

	/**
	 * 
	 * @param descricao
	 * @param valor
	 * @param observacoes
	 * @param emissao
	 * @param vencimento
	 */
	public ContaReceber( String descricao, BigDecimal valor, String observacoes, Date emissao, Date vencimento, Venda venda )
	{
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.observacoes = observacoes;
		this.emissao = emissao;
		this.vencimento = vencimento;
		this.venda = venda;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ( ( descricao == null ) ? 0 : descricao.hashCode() );
		result = prime * result + ( ( emissao == null ) ? 0 : emissao.hashCode() );
		result = prime * result + ( ( observacoes == null ) ? 0 : observacoes.hashCode() );
		result = prime * result + ( ( valor == null ) ? 0 : valor.hashCode() );
		result = prime * result + ( ( vencimento == null ) ? 0 : vencimento.hashCode() );
		return result;
	}

	@Override
	public boolean equals( Object obj )
	{
		if ( this == obj ) return true;
		if ( !super.equals( obj ) ) return false;
		if ( getClass() != obj.getClass() ) return false;
		ContaReceber other = ( ContaReceber ) obj;
		if ( descricao == null )
		{
			if ( other.descricao != null ) return false;
		}
		else if ( !descricao.equals( other.descricao ) ) return false;
		if ( emissao == null )
		{
			if ( other.emissao != null ) return false;
		}
		else if ( !emissao.equals( other.emissao ) ) return false;
		if ( observacoes == null )
		{
			if ( other.observacoes != null ) return false;
		}
		else if ( !observacoes.equals( other.observacoes ) ) return false;
		if ( valor == null )
		{
			if ( other.valor != null ) return false;
		}
		else if ( !valor.equals( other.valor ) ) return false;
		if ( vencimento == null )
		{
			if ( other.vencimento != null ) return false;
		}
		else if ( !vencimento.equals( other.vencimento ) ) return false;
		return true;
	}

	public String getObservacoes()
	{
		return observacoes;
	}

	public void setObservacoes( String observacoes )
	{
		this.observacoes = observacoes;
	}

	public Date getEmissao()
	{
		return emissao;
	}

	public void setEmissao( Date emissao )
	{
		this.emissao = emissao;
	}

	public Date getVencimento()
	{
		return vencimento;
	}

	public void setVencimento( Date vencimento )
	{
		this.vencimento = vencimento;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao( String descricao )
	{
		this.descricao = descricao;
	}

	public BigDecimal getValor()
	{
		return valor;
	}

	public void setValor( BigDecimal valor )
	{
		this.valor = valor;
	}

	public Venda getVenda()
	{
		return venda;
	}

	public void setVenda( Venda venda )
	{
		this.venda = venda;
	}

}