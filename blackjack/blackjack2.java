//76 Projects Project:Blackjack 80-200 Jocelyn Ho
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class blackjack2
{
    static Scanner kb = new Scanner(System.in);
    static Random r = new Random();
    
    static int player, npc, p1, p2, p3, n1, n2, n3, d1, d2, d3, td, max, maxidx, nmax, nmaxidx, win, winidx, nwin, nwinidx;
    static String a, h, s;
    static int[] tp={0,0,0,0}, tn={0,0,0,0};
    
    
    private static void f_opening(){
        System.out.println(" ");
        System.out.println("Welcome to the MeOwBlAcKjAcK!");
        System.out.println(" ");
        
        System.out.println("How many players do you want?");
        player = kb.nextInt();
        System.out.println(" ");
        
        System.out.println("How many npc do you want?");
        npc = kb.nextInt();
        System.out.println(" ");
        
        System.out.println("Let's start the GaMe!");
        System.out.println(" ");
        
        if (player > 4)
        {
            tp = Arrays.copyOf(tp, tp.length + (player - 4));
        }
        if (npc > 4)
        {
            tn = Arrays.copyOf(tn, tn.length + (npc - 4));
        }
    }
    
    private static void f_drawcards()
    {
        for (int i = 0; i < player; i++){
            p1 = 2 + r.nextInt(9);
            p2 = 2 + r.nextInt(9);
            System.out.println("Player#" + (i+1) + " gets a " + p1+ " and a "+ p2);
            tp[i] = (p1+p2);
            System.out.println("The total is " + tp[i]);
            System.out.println(" ");
        }
        
        for (int j = 0; j < npc; j++){
            System.out.println("NPC#"+ (j+1) + "gets two cards");
            System.out.println(" ");
            n1 = 2 + r.nextInt(9);
            n2 = 2 + r.nextInt(9);
            tn[j] = n1+n2;
        }
        
        d1 = 2 + r.nextInt(9);
        d2 = 2 + r.nextInt(9);
        System.out.println(" ");
        System.out.println("The dealer has a " + d1+ " showing, and a hidden card.");
        System.out.println("The total is hidden.");
        td = (d1+d2);
        
    }
    
    private static void f_playeraction(){
       
        h = "hit";
        s = "stay";
        
        for (int i = 0; i < player; i++){
            while (true) {
                System.out.println(" ");
                System.out.println("Would player#" + (i+1) + " like to hit or stay?");
                a = kb.next();
                if (a.equals(s))
                    break;
                // hit
                p3 = 2 + r.nextInt(9);
                tp[i] += p3;
                System.out.println(" ");
                System.out.println("Player#" + (i+1)+ " drew a "+ p3);
                System.out.println("The total is "+ tp[i]);
                if (tp[i] > 21){
                    System.out.println(" ");
                    System.out.println("Player#"+ (i+1) + " busts.");
                    break;
                }
                if (tp[i] == 21){
                    System.out.println(" ");
                    System.out.println("BlAcKjAcK! Player#"+ (i+1) + " wins.");
                    System.exit(0);
                }//end of if
            } //end of while
        } // end of for
    } // end of f_playerhit()
    
    private static void f_dealeraction(){
        
        System.out.println(" ");
        System.out.println("It's now the dealer's turn. The dealer's hidden card is "+ d2);
        System.out.println("The total is "+ (td));
        
        while (td < 16){
            System.out.println(" ");
            System.out.println("The dealer choose to hit.");
            d3 = 2 + r.nextInt(9);
            td += d3;
            System.out.println(" ");
            System.out.println("The dealer draws a "+ d3);
            System.out.println("The total is "+ td);
            if (td > 21){
                System.out.println(" ");
                System.out.println("The dealer busts. The rest players and NPCs win!");
                System.exit(0);
            }
            else if (td == 21){
                System.out.println(" ");
                System.out.println("BlAcKjAcK! The dealer wins!");
                System.exit(0);
            }
        }
        System.out.println(" ");
        System.out.println("The dealer choose to stay.");
        
        System.out.println(" ");
        System.out.println("Dealer's total is "+ td);
        System.out.println(" ");
    }
    
    private static void f_npcaction(){
        for (int j = 0; j < npc; j++){
            while (tn[j] < 17){
                System.out.println(" ");
                System.out.println("NPC#"+ (j+1) + " choose to hit.");
                n3 = 2 + r.nextInt(9);
                tn[j] += n3;
                System.out.println(" ");
                System.out.println("NPC#"+ (j+1) +" draws a "+ n3);
                System.out.println("The total is "+ tn[j]);
                if (tn[j] > 21){
                    System.out.println(" ");
                    System.out.println("NPC#"+ (j+1) +" busts. NPC#"+ (j+1) +" is out of the game.");
                    break;
                }
                else if (tn[j] == 21){
                    System.out.println(" ");
                    System.out.println("BlAcKjAcK! NPC#"+ (j+1) +" wins!");
                    System.exit(0);
                }
            }
            System.out.println(" ");
            System.out.println("NPC#"+ (j+1) + " choose to stay.");
        }
    }
    
    private static void f_sum(){
        for (int i = 0; i < player; i++){
            if (tp[i] <= 21){
                System.out.println("Player#"+ (i+1) +"'s total is "+ tp[i]);
                System.out.println(" ");
            }
            if (tp[i] > 21){
                System.out.println("Player#"+ (i+1) +"busts.");
                System.out.println(" ");
            }
        }
        for (int j = 0; j < npc; j++){
            if (tn[j] <= 21){
                System.out.println("NPC#"+ (j+1) +"'s total is "+ tn[j]);
                System.out.println(" ");
            }
            if (tn[j] > 21){
                System.out.println("NPC#"+ (j+1) +"busts.");
                System.out.println(" ");
            }
        }
    }
    
    private static void f_getmax(){
        max = 0;
        maxidx = 0;
        win = 0;
        winidx = 0;
        
        for (int i = 0; i < player; i++){
            if ((tp[i] > max)&&(tp[i] <= 21)){
                max = tp[i];
                maxidx = i;
            }
        }
        
        nmax = 0;
        nmaxidx = 0;
        nwin = 0;
        nwinidx = 0;
        
        for (int j = 0; j < npc; j++){
            if ((tn[j] > nmax)&&(tn[j] <= 21)){
                nmax = tn[j];
                nmaxidx = j;
            }
        }
        
        if (max > nmax){
            win = max;
            winidx = maxidx;
        }
        
        if (max < nmax){
            nwin = nmax;
            nwinidx = nmaxidx;
        }
    }
    
    private static void f_getwin(){
        if (max != td){
            if (max == nmax){
                if (max > td){
                    System.out.println(" ");
                    System.out.println("Player#" + (maxidx+1) + " & NPC#" + (nmaxidx+1) + " win! Congratulation!");
                    System.exit(0);
                }
                if (max < td){
                    System.out.println(" ");
                    System.out.println("The dealer wins.");
                    System.exit(0);
                }
            }
        }
        else if ((max == td)&&(nmax == td)){
            System.out.println(" ");
            System.out.println("It's a tie! The dealer wins.");
            System.exit(0);
        }
        
        if(win > td){
            System.out.println(" ");
            System.out.println("Player#" + (winidx+1) +" wins! Congratulation!");
            System.exit(0);
        }
        
        if(nwin > td){
            System.out.println(" ");
            System.out.println("NPC#" + (nwinidx+1) +" wins! Congratulation!");
            System.exit(0);
        }
        
        if((win < td)||(nwin < td)){
            System.out.println(" ");
            System.out.println("The dealer wins.");
            System.exit(0);
        }
        
        if ((win == td)||(nwin == td)){
            System.out.println(" ");
            System.out.println("It's a tie! The dealer wins.");
            System.exit(0);
        }
    }
    
    public static void main (String[]args)
    {
        f_opening(); // Game starts + resize array (by #players & #NPCs)
        
        f_drawcards(); // everyone draw cards
        
        f_playeraction(); // players chose to hit or stay
        
        f_npcaction(); // npc chose to hit or stay
        
        f_dealeraction(); // dealer chose to hit or stay
        
        f_sum(); // shows the total points of everyone
        
        f_getmax(); // compares the highest point in both arrays
        
        f_getwin(); // decide the winner
    }
}
        
