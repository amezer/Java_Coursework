//70 For Loops Noticing Even Numbers 30 Jocelyn Ho
public class NoticingEvenNumbers
{
    public static void main (String[]args)
    {
        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                System.out.println(i+ " <<< even#");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
