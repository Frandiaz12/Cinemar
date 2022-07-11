
public class Sala {
	private Butacas butacas;
	private Peliculas peliculas;
	private String hora;
	public Sala(Peliculas pelicula,String hora) {
		this.butacas= new Butacas();
		this.peliculas=pelicula;
		this.hora=hora;
	}
	public void ReservarAsiento (int fil,int col){/**reservas asiento en la asiento 3.fila 4**/
		int pos,b,m,n;
		m=0;
		n=0;
		b=0;
		pos=ret_asiento(fil,col);
		if(pos==0){
			if(b==0){
			butacas.getMatriz()[fil][col]=1;
			 m=fil;
			 n=col;
			 System.out.println("\nFila %d Asiento %d: Reservado\n" +fil +col);
			 b=1;
			}
			if(fil != m && col != n){
			 butacas.getMatriz()[fil][col]=1;
			  System.out.println("\nFila %d Asiento %d: Reservado\n" +fil +col);
			}
		}
	
	}
public void MostrarOcupados(){
	int i,j;
	for(i=1;i<=10;i++){/**fila**/
		for(j=1;j<=20;j++){/**columna**/
			if(butacas.getMatriz()[i][j]==1)
				System.out.println("%2d"+ butacas.getMatriz()[i][j]);
			else 
				System.out.println("  ");
			}
		System.out.println("\n");
		}
	}

public int ret_asiento(int fil,int col){
	int op;
	op=butacas.getMatriz()[fil][col];
	return op;
	}
public void MostrarButacas() {
	System.out.print("\t\t----Sala----\n");
	for(int i=0;i<butacas.getFila();i++){
		for(int j=0;j<butacas.getColumna();j++){
			System.out.print("%2d"+butacas.getMatriz()[i][j]);
		}
		System.out.print("\n");
	}
}
@Override
public String toString() {
	return "Sala [peliculas=" + peliculas + "]";
}
}
