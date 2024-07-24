package application;

import framework.*;

public class Main {
    public static void main(String[] args) {
        ShopFactory shopFactory = new GSShopFactory();

        PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(1, "John Doe", 1000, true);
        NormalAcc normalAcc = shopFactory.getNewNormalAccount(2, "Jane Doe", 500, 50);

        primeAcc.bookProduct(100);
        primeAcc.items(100);
        System.out.println(primeAcc.toString());

        normalAcc.bookProduct(100);
        normalAcc.items(100);
        System.out.println(normalAcc.toString());
    }
}
