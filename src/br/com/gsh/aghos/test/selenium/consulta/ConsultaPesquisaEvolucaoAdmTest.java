package br.com.gsh.aghos.test.selenium.consulta;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class ConsultaPesquisaEvolucaoAdmTest extends SeleniumTest {
	
	@Ignore
	@Test
	public void consultaPesquisaEvolucaoAdmTest() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/atendimento/");
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP + 600);
		driver.findElement(By.linkText("Ações")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Evolução Administrativa")).click();
		driver.get(SeleniumConfig.SERVER + "/atendimento/431461/evolucaoAdministrativa/");
		driver.findElement(By.linkText("Ações")).click();
		driver.findElement(By.linkText("Marcar como lida")).click();
		assertTrue(isElementPresent(By.className("success")));
		Thread.sleep(SeleniumConfig.TIMER_SLEEP + 600);
		//driver.findElement(By.linkText("Ações")).click();
		//driver.findElement(By.linkText("Remover")).click();
	}

	// volta o banco id="431461" para "marca como lida"
    // update GSH_CONSULTA_EVOL_ADMI set FLAG_LIDA = 0 where  ID_ATENDIMENTO = 431461
}
