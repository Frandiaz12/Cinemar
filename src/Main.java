import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peliculas p1 = new Peliculas("Siniestro","Terror",130);
		Sala s1= new Sala(p1,"6pm");
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 1.- Reservar butacas \n 2.- Ver peliculas \n 3.- Mostrar butacas 4.- Pagar \n 0.- Salir");
		int opc= sc.nextInt();
		do {
			switch(opc) {
			case 1: 
				System.out.println("Ingrese Fila y asiento");
				int fila= sc.nextInt();
				int columna= sc.nextInt();
				s1.ReservarAsiento(fila,columna);
			break;
			case 2:
				s1.toString();
			break;
			case 3:
				s1.MostrarButacas();
			break;
				
			}
		}while(opc!=0);

	}

}
