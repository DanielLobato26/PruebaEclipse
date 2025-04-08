
public class Aplicacion {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INtroduce el primer operando");
        double num1 = sc.nextDouble();
        
        System.out.println("INtroduce el primer operando");
        double num2 = sc.nextDouble();
        
        System.out.println(Calculadora.multiplicar(num1,num2));
        System.out.println("Hola mundo");
}
