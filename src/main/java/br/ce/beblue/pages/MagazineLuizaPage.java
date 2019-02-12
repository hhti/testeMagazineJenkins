package br.ce.beblue.pages;

import org.openqa.selenium.By;

import br.ce.beblue.core.BasePage;
import br.ce.beblue.core.DriverFactory;

public class MagazineLuizaPage extends BasePage {

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://www.magazineluiza.com.br");
	}

	public void inserirBusca(String produto) {
		escrever("inpHeaderSearch", produto);
	}

	public void clicaSearch() {
		clicarBotao(By.xpath("//span[@id='btnHeaderSearch']"));
	}

	public void clicaProduto(String id) {
		clicarBotao(By.id(id));
	}

	public String validaCarrinho() {

		return obterTexto(
				By.xpath("//a[@class='price-warranty__btn--continue btn-buy-warranty'][contains(.,'continuar')]"));

	}

	public void adicionaProdutoAoCarrinhod() {
		clicarBotao(By.xpath(
				"//button[@class='button__buy button__buy-product-detail js-add-cart-button js-main-add-cart-button js-add-box-prime']"));
	}

	public String obterTextoDaBusca() {

		return obterTexto(By.xpath("//h1[@id='main-title']//strong[contains(text(),'celular android')]"));
	}

}
