package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		//Pessoa
		Pessoa p = new Pessoa("Gabriel", "Padre Pompéu de Almeida");
		System.out.println(p);
		
		//Pessoafisica
		Pessoafisica pf = new Pessoafisica("Marcelo", "Al. Aristiliano Ramos", "8262364", "Solteiro");
		System.out.println(pf);
		
		
		//Pessoajuridica
		Pessoajuridica pj = new Pessoajuridica("Communicate", "Pres. Kennedy", "993482", "Telemarketing");
		System.out.println(pj);
	}
}
