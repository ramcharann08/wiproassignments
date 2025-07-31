package wipro2;

public class Wipro8 {
	public static void main(String[] args) {
        // Sample input: {productNumber, quantitySold}
        int[][] salesData = {
            {1, 3},
            {2, 2},
            {3, 5},
            {2, 1},
            {1, 4}
        };

        double totalRetailValue = 0.0;

        for (int i = 0; i < salesData.length; i++) {
            int productNumber = salesData[i][0];
            int quantitySold = salesData[i][1];
            double price = 0.0;

            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number: " + productNumber);
                    continue;
            }

            double subtotal = price * quantitySold;
            System.out.println("Product " + productNumber + ": " + quantitySold + " x " + price + " = " + subtotal);
            totalRetailValue += subtotal;
        }

        System.out.println("Total retail value of all products sold: " + totalRetailValue);
    }
}

