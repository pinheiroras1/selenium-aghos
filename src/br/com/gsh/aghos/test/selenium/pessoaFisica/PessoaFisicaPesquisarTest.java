package br.com.gsh.aghos.test.selenium.pessoaFisica;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class PessoaFisicaPesquisarTest extends SeleniumTest {

	@Test
	public void pessoaFisicaTest() throws Exception {
		pesquisaPessoaFisica();
	}

	@Test
	public void pessoaFisicaNaoEncontradoTest() throws Exception {
		pesquisaPessoaFisicaInexistente();
	}

	private void pesquisaPessoaFisicaInexistente() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/pessoa/");
		driver.findElement(By.id("nome_pessoa")).clear();
		driver.findElement(By.id("nome_pessoa")).sendKeys("thuthuram");
		driver.findElement(By.id("buscar")).click();
		// Thread.sleep(5000);
		assertTrue(isElementPresent(By.id("mensagens")));
		assertTrue(isElementPresent(By.className("alert-message")));
	}

	private void pesquisaPessoaFisica() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/pessoa/");
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP + 500);
		assertTrue(isElementPresent(By.id("pessoasEncontrados")));
	}

}
