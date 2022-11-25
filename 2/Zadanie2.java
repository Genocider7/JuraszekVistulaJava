public class Zadanie2 {
    static float earthWeightJuraszek = 93.f;
    static double marsWeightJuraszek = 0.;
    static float marsConversionRateJuraszek = 0.38f;
    static int marsWeightIntJuraszek = 0;
    static char marsWeightCharJuraszek = (char)0;
    static int newMarsWeightIntJuraszek = 0;
    public static double getMarsWeight(float earthWeight, float marsConversionRate)
    {
        return earthWeight * marsConversionRate;
    }
    public static void main(String[] args)
    {
        System.out.println("My weight on Earth: " + earthWeightJuraszek);
        marsWeightJuraszek = getMarsWeight(earthWeightJuraszek, marsConversionRateJuraszek);
        System.out.printf("My weight on Mars: %.4f", marsWeightJuraszek);
        marsWeightIntJuraszek = (int)marsWeightJuraszek;
        System.out.println("My weight on Mars if it were an integer: " + marsWeightIntJuraszek);
        marsWeightCharJuraszek = (char)marsWeightIntJuraszek;
        System.out.println("My weight on Mars if it were a symbol: " + marsWeightCharJuraszek);
        newMarsWeightIntJuraszek = (int)(marsWeightCharJuraszek - 'a');
        System.out.println("My weight on Mars if it were reduced by the ASCII value of character 'a' as an integer: " + newMarsWeightIntJuraszek);
    }
}