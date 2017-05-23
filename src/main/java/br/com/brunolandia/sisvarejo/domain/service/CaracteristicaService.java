package br.com.brunolandia.sisvarejo.domain.service;

import java.util.List;

import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import br.com.brunolandia.sisvarejo.domain.entity.caracteristicas.Cor;
import br.com.brunolandia.sisvarejo.domain.entity.caracteristicas.Genero;
import br.com.brunolandia.sisvarejo.domain.entity.caracteristicas.Tamanho;
import br.com.brunolandia.sisvarejo.domain.repository.caracteristicas.ICorRepository;
import br.com.brunolandia.sisvarejo.domain.repository.caracteristicas.IGeneroRepository;
import br.com.brunolandia.sisvarejo.domain.repository.caracteristicas.ITamanhoRepository;

@Service
@Transactional
@RemoteProxy(name = "caracteristicaService")
public class CaracteristicaService
{

	/**
	 * 
	 */
	@Autowired
	private ICorRepository corRepository;

	/**
	 * 
	 */
	@Autowired
	private ITamanhoRepository tamanhoRepository;

	/**
	 * 
	 */
	@Autowired
	private IGeneroRepository generoRepository;

	/**
	 * 
	 * @param cor
	 * @return
	 */
	public Cor insertCor( Cor cor )
	{
		return this.corRepository.save( cor );
	}

	/**
	 * 
	 * @param cor
	 * @return
	 */
	public Cor updateCor( Cor cor )
	{
		return this.corRepository.save( cor );
	}

	/**
	 * 
	 * @return
	 */
	@Transactional(readOnly = true)
	public Iterable<Cor> listCores()
	{
		return this.corRepository.findAll();
	}

	/**
	 * 
	 * @return
	 */
	@Transactional(readOnly = true)
	public List<Cor> listCoresByFilters( String codigo, String cor )
	{
		return this.corRepository.listByFilters( codigo, cor );
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 */
	@Transactional(readOnly = true)
	public Cor findCorByCodigo( String codigo )
	{
		return this.corRepository.findByCodigo( codigo );
	}

	/**
	 * 
	 * @param cor
	 */
	public void removeCores( List<Cor> cor )
	{
		this.corRepository.delete( cor );
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Cor findCorById( Long id )
	{
		final Cor cor = this.corRepository.findOne( id );
		Assert.notNull( cor, "Não foi possível achar a cor com o ID " + id );
		return cor;
	}

	/**
	 * 
	 * @param tamanho
	 * @return
	 */
	public Tamanho insertTamanho( Tamanho tamanho )
	{
		return this.tamanhoRepository.save( tamanho );
	}

	/**
	 * 
	 * @param tamanho
	 * @return
	 */
	public Tamanho updateTamanho( Tamanho tamanho )
	{
		return this.tamanhoRepository.save( tamanho );
	}

	/**
	 * 
	 * @return
	 */
	@Transactional(readOnly = true)
	public Iterable<Tamanho> listTamanhos()
	{
		return this.tamanhoRepository.findAll();
	}
	
	/**
	 * 
	 * @param codigo
	 * @param tamanho
	 * @param sigla
	 * @return
	 */
	@Transactional(readOnly = true)
	public List<Tamanho> listTamanhosByFilters(String codigo, String tamanho, String sigla)
	{
		return this.tamanhoRepository.listByFilters( codigo, tamanho, sigla );
	}

	/**
	 * 
	 * @param tamanho
	 */
	public void removeTamanhos( List<Tamanho> tamanho )
	{
		this.tamanhoRepository.delete( tamanho );
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Tamanho findTamanhoById( Long id )
	{
		final Tamanho tamanho = this.tamanhoRepository.findOne( id );
		Assert.notNull( tamanho, "Não foi possível achar o tamanho com o ID " + id );
		return tamanho;
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 */
	@Transactional(readOnly = true)
	public Tamanho findTamanhoByCodigo( String codigo )
	{
		return this.tamanhoRepository.findByCodigo( codigo );
	}

	/**
	 * 
	 * @param genero
	 * @return
	 */
	public Genero insertGenero( Genero genero )
	{
		return this.generoRepository.save( genero );
	}

	/**
	 * 
	 * @param genero
	 * @return
	 */
	public Genero updateGenero( Genero genero )
	{
		return this.generoRepository.save( genero );
	}

	/**
	 * 
	 * @param genero
	 */
	public void removeGenero( Genero genero )
	{
		this.generoRepository.delete( genero );
	}

	/**
	 * 
	 * @param genero
	 * @return
	 */
	public List<Genero> listGeneroByFilters( String genero, String codigo )
	{
		return this.generoRepository.listByFilters( genero, codigo );
	}
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public Genero findGeneroByCodigo(String codigo)
	{
		return this.generoRepository.findByCodigo( codigo );
	}
}
