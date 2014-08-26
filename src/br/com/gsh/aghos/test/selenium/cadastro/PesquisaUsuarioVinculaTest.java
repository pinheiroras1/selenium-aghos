package br.com.gsh.aghos.test.selenium.cadastro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class PesquisaUsuarioVinculaTest extends SeleniumTest {

	@Test
	public void cadastroPesquisaUsuarioTest() throws Exception {
		testCadastroPesquisaUsuario();
	}

	public void testCadastroPesquisaUsuario() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/usuario/");
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("//div[@id='resultados']/table/tbody/tr[5]/td[5]/div/a/span")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("(//a[contains(text(),'Vincular')])[5]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.name("usuario.grupoUsuarios[].id")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("(//input[@name='usuario.grupoUsuarios[].id'])[3]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("botaoSalvar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		assertTrue(isElementPresent(By.className("success")));
	}

}
