import java. util.Scanner;
public class anoNasc_ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	int anoatual,anoNasc,idade;
	System.out.println("Digite o ano atual");
	anoatual = leia.nextint (); 
	System.out.println("Digite seu ano de nascimento");
	anoNasc = leia.nextint (); 
	idade = anoatual-anoNasc;
if(idade>=18) {
	System.out.println("Maior de idade");
}else {
	System.out.println("Menor de iadde");
}
	
	
	
	}

}
