public interface Validador{
	/**
		Comprueba si un movimiento es válido.
		@param partida Estado de la partida.
		@param jugador Número (0-3) de identificación del jugador que realiza el movimiento.
		@param ficha Número (0-3) de identificación de la ficha del jugador que realiza el movimiento.
		@param dado Valor del dado para el movimiento.
		@return Devuelve verdadero si el movimiento es válido y falso en caso contrario.
	**/
	public Boolean esValido(Partida partida, Integer jugador, Integer ficha, Integer dado);
}
