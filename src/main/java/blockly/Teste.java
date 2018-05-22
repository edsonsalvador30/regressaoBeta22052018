package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// teste
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.chart.Operations.createChartSerie(Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
			}
		}.call();
	}

}
