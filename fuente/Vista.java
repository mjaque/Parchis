public interface Vista{
	/**
		Modos de funcionamiento de la vista.
		En modo MANUAL, el usuario debe pulsar una tecla entre movimientos. Esto permite seguir la partida.
		En modo AUTOMATICO, los movimientos de cada jugador se realizan sin pausa.
	**/
	public enum Modo {AUTOMATICO, MANUAL};
	/**
		Actualiza la vista con el estado actual de la partida.	
		@param partida Estado de la partida.
		@param dado Valor del dado para el movimiento.
	**/
	public void mostrar(Partida partida, Integer dado);
}
