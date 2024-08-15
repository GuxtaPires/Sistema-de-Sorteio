import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class App {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		int resposta = 1;

		while (resposta == 1) {
			System.out.print("Informe o nome para sorteio: ");

			String aux = sc.nextLine();
			lista.add(aux);

			System.out.println("Digite 1 se quer adicionar mais itens, caso queira encerrar e sortear, digite outra tecla");
			resposta = sc.nextInt();

			//para consumir o newLine residual
			sc.nextLine();
		}

		int sorteado = (int) (Math.random() * lista.size());

		System.out.println("O sorteado foi: " + lista.get(sorteado) + " Parabéns!");
		
		sc.close();
	}
}
