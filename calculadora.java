import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class calculadora {

	public static void main(String[] args) {
		int salir =0;
		while(salir ==0) {
		int seleccion = JOptionPane.showOptionDialog(
				   null,
				   "Bienvenido a la calculadora", 
				   "Que operación desea hacer",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { "Suma", "Resta", "Multiplicación", "División" , "Módulo" , "Logaritmo base 2" , "Logaritmo base 10", "Logaritmo neperiano", "Salir" },   // null para YES, NO y CANCEL
				   "Suma");
				
			switch(seleccion) {
			
				case 0: float suma = suma();
					JOptionPane.showMessageDialog(null,"El resultado es "+suma);
					break;
				case 1:float resta = resta();
				JOptionPane.showMessageDialog(null,"El resultado es "+resta);
					break;
				case 2:float multiplicacion = multiplicacion();
				JOptionPane.showMessageDialog(null,"El resultado es "+multiplicacion);
					
					break;
				case 3:float division = division();
				JOptionPane.showMessageDialog(null,"El resultado es "+division);
					
					break;
				case 4:float modulo = modulo();
				JOptionPane.showMessageDialog(null,"El resultado es "+modulo);
					
					break;
				case 5:float log2 = log2();
				JOptionPane.showMessageDialog(null,"El resultado es "+log2);
					
					break;
				case 6:float log10 = log10();
				JOptionPane.showMessageDialog(null,"El resultado es "+log10);
					
					break;
				case 7:float logn = logn();
				JOptionPane.showMessageDialog(null,"El resultado es "+logn);
					
					break;
				default:
					salir =1;
					break;
			
			}
		
		}
	
	}

	private static float suma() {
		float primero = JOptionPane.showOptionDialog(
				   null,
				   "Selecione el primer operando", 
				   "Suma",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { 0, 1, 2, 3, 4 , 5 ,6 ,7 ,8 ,9 },   // null para YES, NO y CANCEL
				   "Suma");
		float segundo = JOptionPane.showOptionDialog(
				   null,
				   "Selecione el segundo operando",
				   "Suma", 
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { 0, 1, 2, 3, 4 , 5 ,6 ,7 ,8 ,9 },   // null para YES, NO y CANCEL
				   "Suma");
		
		
		
		return (float)primero+segundo;
	}
	
	private static float resta() {
		float primero = JOptionPane.showOptionDialog(
				   null,
				   "Selecione el primer operando", 
				   "Resta",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { 0, 1, 2, 3, 4 , 5 ,6 ,7 ,8 ,9 },   // null para YES, NO y CANCEL
				   "Resta");
		float segundo = JOptionPane.showOptionDialog(
				   null,
				   "Selecione el segundo operando",
				   "Resta", 
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { 0, 1, 2, 3, 4 , 5 ,6 ,7 ,8 ,9 },   // null para YES, NO y CANCEL
				   "Resta");
		
		
		
		return (float)primero-segundo;
	}