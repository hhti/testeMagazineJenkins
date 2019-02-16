package br.ce.beblue.tests;

import org.junit.Assert;

import org.junit.Test;
import br.ce.beblue.core.BaseTest;
import br.ce.beblue.pages.MagazineLuizaPage;

public class MagazileLuizaTest extends BaseTest {

	MagazineLuizaPage magazine = new MagazineLuizaPage();
	
	

	String produtoString = "celular android";
	String nomeProduto = "product_220848200";

	@Test
	public void validaFluxoPrincipalProdutoTest() {

		magazine.acessarTelaInicial();

		magazine.inserirBusca(produtoString);

		magazine.clicaSearch();

		Assert.assertEquals(magazine.obterTextoDaBusca(), produtoString);

		magazine.clicaProduto(nomeProduto);

		magazine.adicionaProdutoAoCarrinhod();

		Assert.assertEquals(magazine.validaCarrinho(), "continuar");

	}

}
