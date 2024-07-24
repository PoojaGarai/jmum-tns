package framework;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;
    private static final float deliveryCharges = 0.0f;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float charges) {
        // Implementation for PrimeAcc
    }

    @Override
    public void items(float charges) {
        // Placeholder implementation
    }

    @Override
    public String toString() {
        return super.toString() + ", isPrime: " + isPrime + ", Delivery Charges: " + deliveryCharges;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }
}
