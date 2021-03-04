import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FindSquares
{

    private static void print2D(boolean[][] arr, int size, int size2){
        for (int i = 0; i < size2; i++){
            for (int j = 0; j < size; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void print2D(String[][] arr, int size, int size2){
        for (int i = 0; i < size2; i++){
            for (int j = 0; j < size; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static String[][]  drawLine(String[][] board, Coordinates p, Coordinates q){
        if (p.getX() == q.getX()){
            if (p.getY() > q.getY()){
                for (int i = q.getY(); i < p.getY()+1; i++){
                    board[i][p.getX()] = "*";
                }
            }else{
                for (int i = p.getY(); i < q.getY()+1; i++){
                    board[i][p.getX()] = "*";
                }
            }
        }else if(p.getY() == q.getY()){
            if (p.getX() > q.getX()){
                for (int i = q.getX(); i < p.getX()+1; i++){
                    board[p.getY()][i] = "*";
                }
            }else{
                for (int i = p.getX(); i < q.getX()+1; i++){
                    board[p.getY()][i] = "*";
                }
            }
        }else{
            double slope = (p.getY()-q.getY())/(p.getX()-q.getX());

            int plotX = p.getX();
            int plotY = p.getY();
            int i = 1;
            if (p.getX() > q.getX() && p.getY() > q.getY()){
                while (plotX <= q.getX() && plotY <= q.getY()) {
                    board[plotY][plotX] = "*";
                    plotX = (int)Math.round(plotX + i*slope);
                    plotY = (int)Math.round(plotY + i/slope);
                    i++;
                }
            }else if (p.getX() > q.getX() && p.getY() < q.getY()){
                while (plotX <= q.getX() && plotY >= q.getY()) {
                    board[plotY][plotX] = "*";
                    plotX = (int)Math.round(plotX + i*slope);
                    plotY = (int)Math.round(plotY - i/slope);
                    i++;
                }
            }else if (p.getX() < q.getX() && p.getY() < q.getY()){
                while (plotX >= q.getX() && plotY >= q.getY()) {
                    board[plotY][plotX] = "*";
                    plotX = (int)Math.round(plotX - i*slope);
                    plotY = (int)Math.round(plotY - i/slope);
                    i++;
                }
            }else if (p.getX() < q.getX() && p.getY() > q.getY()){
                while (plotX >= q.getX() && plotY <= q.getY()) {
                    board[plotY][plotX] = "*";
                    plotX = (int)Math.round(plotX - i*slope);
                    plotY = (int)Math.round(plotY + i/slope);
                    i++;
                }
            }

        }

        return board;
    }

    private static int distSq(Coordinates p, Coordinates q)
    {
        return (int) Math.sqrt((p.getX() - q.getX()) * (p.getX() - q.getX()) + (p.getY() - q.getY()) * (p.getY() - q.getY()));
    }

    private static double findMidPointX(Coordinates p1, Coordinates p2){
        return (p1.getX()+p2.getX())/2;
    }

    private static double findMidPointY(Coordinates p1, Coordinates p2){
        return (p1.getY()+p2.getY())/2;
    }

    private static void printPoints(int[] comb, ArrayList<Coordinates> point){
        for (int i = 0; i < comb.length; i++){
            System.out.print("p" + (i+1) + "\nx:" + point.get(comb[i]).getX() + "\ty:" + point.get(comb[i]).getY());
            System.out.println();
        }
    }

    private static boolean isParallelogram(int[] comb, ArrayList<Coordinates> point){
        int x1 = point.get(comb[0]).getX();
        int x2 = point.get(comb[1]).getX();
        int x3 = point.get(comb[2]).getX();
        int x4 = point.get(comb[3]).getX();

        int y1 = point.get(comb[0]).getY();
        int y2 = point.get(comb[1]).getY();
        int y3 = point.get(comb[2]).getY();
        int y4 = point.get(comb[3]).getY();

        int d13 = x1 - x3;
        int h13 = y1 - y3;

        int d24 = x2 - x4;
        int h24 = y2 - y4;

        if (d13 == d24 && h13 == h24){
            return true;
        }
        return false;
    }

    private static boolean isInArray(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] sortPoints(int[] comb, ArrayList<Coordinates> point){
        for (int i = 0; i < 4; i++){
            for (int j = i+1; j < 4; j++){
                if (point.get(comb[i]).getX() > point.get(comb[j]).getX()){
                    int temp = comb[i];
                    comb[i] = comb[j];
                    comb[j] = temp;
                }
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = i+1; j < 4; j++){
                if (point.get(comb[i]).getY() > point.get(comb[j]).getY() && point.get(comb[i]).getX() == point.get(comb[j]).getX()){
                    int temp = comb[i];
                    comb[i] = comb[j];
                    comb[j] = temp;
                }
            }
        }

        return comb;
    }

    private static boolean isRepeated(int x, int y, ArrayList<Coordinates> points){
        for (int i = 0; i < points.size(); i++){
            if (x == points.get(i).getX() && y == points.get(i).getY()){
                return true;
            }
        }
        return false;
    }

    private static void helper(ArrayList<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }

    public static ArrayList<int[]> generate(int n, int r) {
        ArrayList<int[]> combinations = new ArrayList<>();
        helper(combinations, new int[r], 0, n-1, 0);
        return combinations;
    }

    public static void main (String args[]){
        Scanner kb = new Scanner(System.in);
        ArrayList<Coordinates> points = new ArrayList<>();

        System.out.print("Size of the 2d boolean array: ");
        int size = kb.nextInt();
        System.out.print("Size of the 2d boolean array: ");
        int size2 = kb.nextInt();

        boolean input[][] = new boolean[size2][size];

        for (int i = 0; i < size2; i++){
            System.out.println("Row " + (i+1) + ": ");
            for (int j = 0; j < size; j++){
                int temp = kb.nextInt();
                if (temp == 1){
                    input[i][j] = true;
                }else{
                    input[i][j] = false;
                }
            }
        }

        String[][] board = new String [size2][size];
        for (int i = 0; i < size2; i++){ // initialize board
            for (int j = 0; j < size; j++){
                board[i][j] = ".";
            }
        }

        int tempx, tempy, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        boolean error = false;

        /*do{
            try{
                System.out.print("Please enter x(enter a non-number to exit): ");
                tempx = kb.nextInt();
                if (tempx > maxX){
                    maxX = tempx;
                }
                System.out.println();
                System.out.print("Please enter y (enter a non-number to exit): ");
                tempy = kb.nextInt();
                if (tempy > maxY){
                    maxY = tempy;
                }
                System.out.println();

                if (!isRepeated(tempx, tempy, points)) {
                    points.add(new Coordinates(tempx, tempy));
                    System.out.println(points.size() + " point(s) on the grid.");
                    System.out.println();
                }else{
                    System.out.println("The point is repeated. Please try again.");
                    System.out.println();
                }
            }catch (Exception e){
                System.out.println("Exit");
                error = true;
            }
        }while (!error);*/

        boolean reversed[][] = new boolean[size2][size];
//reversing the array
        for (int i = 0; i < size2; i++){
            for (int j = 0; j < size; j++){
                reversed[i][j] = input[size2 - i - 1][j];
            }
        }

        for (int i = 0; i < size2; i++){
            for (int j = 0; j < size; j++){
                if (reversed[i][j]){
                    points.add(new Coordinates(j, i));
                }
            }
        }

        int N = points.size();
        int R = 4;
        ArrayList<int[]> combinations = generate(N, R);
        int count = 0;
        /*for (int[] combination : combinations) {
            System.out.println(count + ": " + Arrays.toString(combination));
            count++;
        }*/


        System.out.printf("generated %d combinations of %d items from %d ", combinations.size(), R, N);
        System.out.println();

        print2D(reversed, size, size2);

        int num = 0;
        for (int i = 0; i < combinations.size(); i++){
            combinations.set(i, sortPoints(combinations.get(i), points));

            boolean isParallelogram = isParallelogram(combinations.get(i), points);
            System.out.println(Arrays.toString(combinations.get(i)) + "\n");
            if (isParallelogram){
                printPoints(combinations.get(i), points);
                num ++;
                for (int j = 0; j < 3; j++){
                    board = drawLine(board, points.get(combinations.get(i)[j]), points.get(combinations.get(i)[j+1]));
                }
            }

        }

        System.out.println(num);

        String reverse[][] = new String[size2][size];
        for (int i = 0; i < size2; i++){
            for (int j = 0; j < size; j++){
                reverse[i][j] = board[size2 - i - 1][j];
            }
        }
        print2D(reverse, size, size2);

    }
}
