//38 If Statements compareTo() Challenge 35 Jocelyn Ho
public class CompareTo
{
    public static void main (String[] args)
    {
        String[] s = {"tea", "fog", "dog", "pop", "cat", "eye", "bee", "mad"};
       
        for (int i=0; i < s.length; i++)
        {
            for (int j=i+1; j < s.length; j++){
                System.out.print("Comparing " + s[i] + " with " + s[j] + " will produce ");
                System.out.println(s[i].compareTo(s[j]));
            }
        }
        System.out.print("Comparing tree with tree will produce ");
        System.out.println("cat".compareTo("cat"));
        
        System.out.print("Comparing frog with frog will produce ");
        System.out.println("frog".compareTo("frog"));
    }
}
