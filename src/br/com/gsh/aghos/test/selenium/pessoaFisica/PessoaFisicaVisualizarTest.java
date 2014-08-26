package br.com.gsh.aghos.test.selenium.pessoaFisica;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class PessoaFisicaVisualizarTest extends SeleniumTest {

	@Test
	public void pessoaFisicaTest() throws Exception {
		visualizarPessoaFisica();
	}

	private void visualizarPessoaFisica() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/pessoa/visualizar/2");
		assertTrue(isElementPresent(By.id("visualizacaoPessoaFisica")));
	}

}
