package br.com.gsh.aghos.test.selenium.consulta;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class ConsultaPesquisaEspecificaTest extends SeleniumTest {

	@Test
	public void consultaPesquisaEspecificaTest() throws Exception {
//		if (SeleniumConfig.isFirefox()) {
//			testConsultaPesquisaEspecifica();
//		} else {
//			testConsultaPesquisaEspecificaChrome();
//		}
		testConsultaPesquisaEspecifica();
	}

	public void testConsultaPesquisaEspecifica() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/atendimento/");
		driver.findElement(By.cssSelector("#consultarUnidade > span.add-on > span.icon-white.icon-search")).click();
		driver.findElement(By.id("nome")).clear();
		//driver.findElement(By.id("nome")).sendKeys("santa casa de misericordia de cuiaba teste");
		driver.findElement(By.id("nome")).sendKeys("hps");
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarUnidade")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+600);
		driver.findElement(By.xpath("//tbody[@id='resultadosUnidadeDeSaude']/tr/td[3]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		//driver.findElement(By.name("filtro.atendimento.id")).clear();
		//driver.findElement(By.name("filtro.atendimento.id")).sendKeys("130");
		new Select(driver.findElement(By.id("prioridades"))).selectByVisibleText("Normal");
		new Select(driver.findElement(By.id("tipoConsulta"))).selectByVisibleText("RETORNO");
		new Select(driver.findElement(By.id("estados"))).selectByVisibleText("CANCELADO");
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+200);
		driver.findElement(By.linkText("Ações")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Visualizar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		//driver.findElement(By.linkText("Voltar")).click();
	}

}
