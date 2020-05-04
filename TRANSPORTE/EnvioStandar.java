
public class EnvioStandar extends TipoDeEnvio {

	public Envio envio;

	public int costoDeEnvio(){
		if(envio.esLargaDistancia()){
			return this.costoLargaDistancia();
		}
		else{
			return this.costoCortaDistancia();
		}
	}
}//end EnvioStandar