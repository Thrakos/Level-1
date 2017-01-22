
public class ChocolateFactory {

	public static void main(String[] args) {
		System.out.println(ChocolateFactory.Chocolates(8, 8));
		System.out.println(ChocolateFactory.truffles(7, 9));
		System.out.println(ChocolateFactory.mms(10, 6));
	}

	public static int Chocolates(int i, int n) {
		System.out.println("Chocolates: " + n + i);
		return (n + i);
	}

	public static int truffles(int i, int n) {
		System.out.println("truffles: " + n + i);
		return (n + i);
	}

	public static int mms(int i, int n) {
		System.out.println("M&Ms: " + n + i);
		return (n + i);
	}
}
