package framework;

public abstract class NormalAcc extends ShopAcc {
    private final float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    @Override
    public void bookProduct(float charges) {
        // Implementation for NormalAcc
    }

    @Override
    public void items(float charges) {
        // Placeholder implementation
    }

    @Override
    public String toString() {
        return super.toString() + ", Delivery Charges: " + deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }
}
