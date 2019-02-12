package br.ce.beblue.tests;

import org.junit.Assert;

import org.junit.Test;
import br.ce.beblue.core.BaseTest;
import br.ce.beblue.pages.MagazineLuizaPage;

public class MagazileLuizaTest extends BaseTest {

	MagazineLuizaPage magazine = new MagazineLuizaPage();
	
	

	String produto = "celular android";

	@Test
	public void validaFluxoPrincipalProduto() {

		magazine.acessarTelaInicial();

		magazine.inserirBusca(produto);

		magazine.clicaSearch();

		Assert.assertEquals(magazine.obterTextoDaBusca(), produto);

		magazine.clicaProduto("product_220848200");

		magazine.adicionaProdutoAoCarrinhod();

		Assert.assertEquals(magazine.validaCarrinho(), "continuar");

	}

}
