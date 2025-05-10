public interface Jugador{
	/**
		Devuelve el movimiento elegido por el jugador según su estrategia.
		@param partida Estado de la partida.
		@param dado Valor del dado para el movimiento.
		@return Número (0-3) de la ficha elegida para mover. Null indica que ninguna ficha se mueve.
	**/
	public Integer mover(Partida partida, Integer dado);
}
