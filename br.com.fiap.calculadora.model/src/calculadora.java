
public class calculadora {
	
	private integer numero;
	private integer numero2;
	
	public integer somar(integer numero1, integer numero2) {
		return numero1 + numero2;
	}
	
	public integer subtrair(integer numero1, integer numero2) {
		return numero1 - numero2;
	}
	
	public integer multiplicar(integer numero1, integer numero2) {
		return numero1 * numero2;
	}
	
	public integer dividir(integer numero1, integer numero2) {
		return numero1 / numero2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(system.in);
		
		System.out.println("CALCULADORA");
		System.out.println("Insira dois números:");
		System.out.println("Numero 1");
		int numero1 = scan.nextInt();
		System.out.println("Número 2");
		int numero2 = scan.nextInt();
		
		System.out.println("Qual operação deseja realizar?\n"
				+"1 para somar\n"
				+"2 para subtrair\n"
				+"3 para multiplicar\n"
				+"4 para dividir");
	int escolha = scan.nextInt();
	
	calculadora calcu = new Calculadora();
	
	if(escolha == 1) {
		int resultado = calcu.somar(numero1,numero2);
		System.out.println(" A soma resulta em" + resultado);
	}else if (escolha == 2) {
		int resultado = calcu.subtrair(numero1,numero2);
		System.out.println(" A subtração resulta em" + resultado);
	}else if (escolha == 3) {
		int resultado = calcu.multiplicar(numero1,numero2);
		System.out.println(" A multiplicação resulta em" + resultado);
	}else if (escolha == 4) {
		int resultado = calcu.dividir(numero1,numero2);
		System.out.println(" A divisão resulta em" + resultado);
	}

			
	}
	
}
