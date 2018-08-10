package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Informa ao JUnit que o cucumber se incumbir� a executar os testes
@RunWith(Cucumber.class)
/*
 * CucumberOptions: Par�metros de execu��o de testes
 * Features: Localizar as features
 * Tags: Informar quais tags executar, pois podem ser executadas conjuntos de arquivos
 * Glue: Localizar os testes de aceita��o
 * Monochrome: Formata��o dos resultados no console
 * DryRun: TRUE: Verifica se cada etapa possui c�digo correspondente. Caso n�o encontrado, criar
 * 		   FALSE: N�o verifica
 */
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTeste", 
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)
public class ContaTeste {

}
