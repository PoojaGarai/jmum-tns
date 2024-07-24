package application;

import framework.*;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float charges) {
        super.bookProduct(charges);
        System.out.println("Charges for prime account product booking: " + charges);
    }

    @Override
    public void items(float charges) {
        System.out.println("Items method in GSPrimeAcc called with charges: " + charges);
    }

    @Override
    public String toString() {
        return "GSPrimeAcc [" + super.toString() + "]";
    }
}
