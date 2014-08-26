package br.com.gsh.aghos.test.selenium.prontuarioEletronico;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class ProntuarioEletronicoCadastroJaExistenteTest extends SeleniumTest {

	@Test
	public void prontuarioEletronicoJaExistenteTest() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/prontuario/cadastro");
		driver.findElement(By.cssSelector("#consultarUnidade > span.add-on > span.icon-white.icon-search")).click();
		driver.findElement(By.id("btnPesquisarUnidade")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("(//input[@name='selectUnidadeDeSaude'])[12]")).click();
		driver.findElement(By.id("prontuario_codigo")).clear();
		driver.findElement(By.id("prontuario_codigo")).sendKeys("0000122");
		driver.findElement(By.cssSelector("span.icon-white.icon-calendar")).click();
		driver.findElement(By.linkText("14")).click();
		//driver.findElement(By.id("prontuario_abertura")).sendKeys("15102014");
		driver.findElement(By.id("prontuario_anterior")).clear();
		driver.findElement(By.id("prontuario_anterior")).sendKeys("0000121");
		driver.findElement(By.cssSelector("#consultarPessoa > span.add-on > span.icon-white.icon-search")).click();
		driver.findElement(By.id("btnPesquisarPessoa")).click();
		if (SeleniumConfig.isFirefox()) {
			Thread.sleep(SeleniumConfig.TIMER_SLEEP + 7000);
		} else {
			Thread.sleep(SeleniumConfig.TIMER_SLEEP + 1000);
		}
		driver.findElement(By.xpath("(//input[@name='selectPessoa'])[24]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertTrue(isElementPresent(By.className("error")));
	}

}
