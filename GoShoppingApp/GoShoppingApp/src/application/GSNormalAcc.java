package application;

import framework.*;

public class GSNormalAcc extends NormalAcc {

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    @Override
    public void bookProduct(float charges) {
        super.bookProduct(charges);
        System.out.println("Charges for normal account product booking: " + charges + ", delivery charges: " + this.getDeliveryCharges());
    }

    @Override
    public void items(float charges) {
        System.out.println("Items method in GSNormalAcc called with charges: " + charges);
    }

    @Override
    public String toString() {
        return "GSNormalAcc [" + super.toString() + "]";
    }
}
