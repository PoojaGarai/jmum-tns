package framework;

public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public abstract void bookProduct(float charges);

    public abstract void items(float charges);

    @Override
    public String toString() {
        return "Account Number: " + accNo + ", Account Name: " + accNm + ", Charges: " + charges;
    }

    // Getters
    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getCharges() {
        return charges;
    }
}
