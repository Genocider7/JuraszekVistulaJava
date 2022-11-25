public class Zadanie5
{
    static float productPriceNettoJuraszek = 9.99f;
    static float productPriceBruttoJuraszek = 0f;
    static float VATJuraszek = .23f;
    public static void main(String[] args)
    {
        productPriceBruttoJuraszek = productPriceNettoJuraszek * (1 + VATJuraszek);
        System.out.println("Brutto price: " + productPriceBruttoJuraszek);
        System.out.println("Brutto price for 1000 producets: " + productPriceBruttoJuraszek * 1000);
        System.out.println("Netto after all: " + (productPriceBruttoJuraszek * 1000) / (1 + VATJuraszek));
    }
}