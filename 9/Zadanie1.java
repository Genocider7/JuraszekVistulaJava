class Zadanie1
{
    public static void main(String[] args) {
        String word = null;
        try
        {
            System.out.println(word.length());
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}