public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		System.out.println("\nHotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store);
		System.out.println("\nMost Frequent Toy: " + store.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + store.getMostFrequentType());
	}
}
