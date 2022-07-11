
public class Butacas {
	private int[][] matriz;
	private final int fila = 10;
	private final int columna = 20;

	public Butacas() {
		this.matriz = new int[fila][columna];
	}

	public void cargaMatriz() {
		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 20; j++) {
				this.matriz[i][j] = 0;
			}
		}
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public final int getFila() {
		return fila;
	}

	public final void setFila(int fila) {
		Butacas.fila = fila;
	}

	public final int getColumna() {
		return columna;
	}

	public final void setColumna(int columna) {
		Butacas.columna = columna;
	}
	
	}
	
