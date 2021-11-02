package Item;

public class ItemMain {

	public static void main(String[] args) {
	
		//Item
		Item item = new Item(6528, "Livro");
		System.out.println(item);
		
		//Livro
		Livro L = new Livro(6528, "Livro", "J.R.R Tolkien");
		System.out.println(L);
		
		//Midia
		Midia M = new Midia(7895, "Midia", "Song's", 25);
		System.out.println(M);
		
		//CD
		CD cd = new CD(7895, "CD", "Song's", 25, 3, "Lil Nas X", "MONTERO");
		System.out.println(cd);
		
		//VHS
		VHS v = new VHS(9268, "VHS", "Song's", 189, "TOY-STORY");
		System.out.println(v);
	}
}