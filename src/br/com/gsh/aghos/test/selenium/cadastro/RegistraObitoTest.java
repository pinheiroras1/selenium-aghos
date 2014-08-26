package br.com.gsh.aghos.test.selenium.cadastro;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class RegistraObitoTest extends SeleniumTest {

	// provavel voltar a confirmacao do obito.

	@Test
	public void registraObitoTest() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/infoObito/obito/");
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarPessoa > span.add-on > span.icon-white.icon-search")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarPessoa")).click();
		if (SeleniumConfig.isFirefox()) {
			Thread.sleep(SeleniumConfig.TIMER_SLEEP + 7000);
		} else {
			Thread.sleep(SeleniumConfig.TIMER_SLEEP + 1000);
		}
		driver.findElement(By.xpath("(//input[@name='selectPessoa'])[8]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarUnidade > span.add-on > span.icon-white.icon-search")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarUnidade")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP + 1000);
		driver.findElement(By.xpath("(//input[@name='selectUnidadeDeSaude'])[14]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarCid > span.add-on > span.icon-white.icon-search")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarCid")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP + 1000);
		driver.findElement(By.xpath("(//input[@name='selectCid'])[11]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("dataFalecimento")).clear();
		driver.findElement(By.id("dataFalecimento")).sendKeys("260520141310");
		// driver.findElement(By.className("ui-datepicker-close")).click();
		driver.findElement(By.id("btConfirmarObito")).click();
	}
}
