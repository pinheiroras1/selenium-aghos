package br.com.gsh.aghos.test.selenium.consulta;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class ConsultaSolicitaEspecificaTest extends SeleniumTest {
	
	@Ignore
	@Test
	public void consultaPesquisaEspecificaTest() throws Exception {
/*		if (SeleniumConfig.isFirefox()) {
			testConsultaPesquisaEspecifica();
		} else {
			testConsultaPesquisaEspecificaChrome();
		}
*/		
		testConsultaPesquisaEspecifica();
	}


	public void testConsultaPesquisaEspecifica() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/atendimento/solicitar");
		driver.findElement(By.cssSelector("#consultarUnidade > span.add-on > span.icon-white.icon-search")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
	    driver.findElement(By.id("nome")).clear();
	    //driver.findElement(By.id("nome")).sendKeys("centro municipal de saude de agua boa");
	    driver.findElement(By.id("nome")).sendKeys("HPS");
	    driver.findElement(By.id("btnPesquisarUnidade")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP + 800);
	    driver.findElement(By.xpath("//tbody[@id='resultadosUnidadeDeSaude']/tr/td[1]")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP);
	    driver.findElement(By.cssSelector("#consultarProntuario > span.add-on > span.icon-white.icon-search")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP);
	    driver.findElement(By.id("pessoaNome")).clear();
	    //driver.findElement(By.id("pessoaNome")).sendKeys("romeu dendena");
	    driver.findElement(By.id("pessoaNome")).sendKeys("romeu");
	    driver.findElement(By.id("btnPesquisarProntuario")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP + 800);
	    driver.findElement(By.xpath("//tbody[@id='resultadosProntuario']/tr/td[2]")).click();
	    new Select(driver.findElement(By.id("tipoConsulta"))).selectByVisibleText("INICIAL");
	    new Select(driver.findElement(By.id("atendimento.origemDaDemanda.id"))).selectByVisibleText("MINISTERIO PUBLICO");
	    // refazer esse testes e colocar o descritivo do que precisa no teste.
	}

}
