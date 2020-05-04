
public class Envio {

	private int origen;
	private int destino;
	private Paquete Paquete;
	private TipoDeEnvio tipoDeEnvio;
	public Transportista transportista;


	private int CalcularDistancia(){
		return math.abs(destino - origen); // Calculas el modulo de la distancia
	}

	public boolean esLargaDistancia(){
		return this.CalcularDistancia() > 100;
	}
}