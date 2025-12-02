package W07;

public class W07E01 {
    public static void main(String[] args) {
        int[] stock = new int[11];
        for (int i = 6; i < 11; i++) {
            stock[i] = (int)(Math.random() * 10);
            if (stock[i] == 0) {
                System.out.println("Size " + i + ": Out of Stock");
            } else if (stock[i] < 3) {
                System.out.println("Size " + i + ": Low Stock");
            } else {
                System.out.println("Size " + i + ": Available");
            }
        }
    }
}
