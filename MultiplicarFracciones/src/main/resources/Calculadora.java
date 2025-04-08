
public class Calculadora {
	 private double Operando1;
	    private double Operando2;

	    public double getOperando1() {
	        return Operando1;
	    }

	    public void setOperando1(double Operando1) {
	        this.Operando1 = Operando1;
	    }

	    public double getOperando2() {
	        return Operando2;
	    }

	    public void setOperando2(double Operando2) {
	        this.Operando2 = Operando2;
	    }

	    public Calculadora() {
	    }

	    public Calculadora(double Operando1, double Operando2) {
	        this.Operando1 = Operando1;
	        this.Operando2 = Operando2;
	    }

	    @Override
	    public String toString() {
	        return "Calculadora{" + "Operando1=" + Operando1 + ", Operando2=" + Operando2 + '}';
	    }

	     
	    public static double multiplicacion(double Operando1, double Operando2){
	        return Operando1 * Operando2;
	    } 
	    
	   
}
