public interface Partida{
	/**
		Devuelve las casillas de todas las fichas de los jugadores.
		@return Matriz con una línea por jugador y cada ficha en una columna.
	**/
	public Integer[][] verPosiciones();
	/**
		Devuelve las casillas de las fichas de un jugador.
		@param Número (0-3) de identificación del jugador.
		@return Vector con la casilla que ocupa cada ficha del jugador.
	**/
	public Integer[] verPosicionesJugador(Integer jugador);
	/**
		Indica si una casilla es segura.
		@param Número de la casilla a verificar.
		@return Verdadero si la casilla es segura y falso en caso contrario.
	**/
	public Boolean esSeguro(Integer casilla);
}
