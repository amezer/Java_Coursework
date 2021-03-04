//if there is a negative vertex/weight, then almost everytime when you find the cheapeast path it will result in a negative cycle (-infinity).
//To find the cheapest path, you will have to transform the mat into an adjacency matrix and perform the Bellman Ford algorithm to find the shortest path with negative weights.
//However, due to the structure of the 2D array, it is almost certain that everytime when you run the program it will result in a negative cycle.
//if all directions is allowed to access, it will result in an undirected graph. As an result, it will again, cause the negative cycle.

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
public class Path
{
    public static void main (String[] args){
        Scanner kb = new Scanner (System.in);
        System.out.println("BABU BY BABU?");
        int size = kb.nextInt();

        Points mat[][] = new Points[size][size];


        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                mat[i][j] = new Points();
            }
        }

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                mat[i][j].value = (int)(Math.random()*101);
            }
        }

        //mat[(int)Math.random()*size+1][(int)Math.random()*size+1].value = (int)(Math.random()*-27);



        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(mat[i][j].value + "\t");
            }
            System.out.println();
        }

        int x, y;

        double adjacencyMatrix[][] = new double[size * size][size * size];

        for (int i = 0; i < size*size; i++){
            for (int j = 0; j < size*size; j++){
                if(Math.abs(i-j) == 3 || Math.abs(i-j) == 1 ){
                    x = j / size;
                    y = j % size;
                    adjacencyMatrix[i][j] = mat[x][y].value;
                }else if (Math.abs(i-j) == 0){
                    adjacencyMatrix[i][j] = 0;
                }else{
                    adjacencyMatrix[i][j] = Double.POSITIVE_INFINITY;
                }
            }
        }

        System.out.println("Adjacency:");
        for (int i = 0; i < size*size; i++){
            for (int j = 0; j < size*size; j++){
                System.out.print(adjacencyMatrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        int n = size*size;
        int start = 0;
        BellmanFordAdjacencyMatrix solver;
        solver = new BellmanFordAdjacencyMatrix(start, adjacencyMatrix);
        double[] d = solver.getShortestPaths();

        for (int i = 0; i < n; i++)
            System.out.printf("The cost to get from node %d to %d is %.2f\n", start, i, d[i]);

        System.out.println();

        for (int i = 0; i < n; i++) {
            String strPath;
            List<Integer> path = solver.reconstructShortestPath(i);
            if (path == null) {
                strPath = "Infinite number of shortest paths.";
            } else {
                List<String> nodes = path.stream().map(Object::toString).collect(Collectors.toList());
                strPath = String.join(" -> ", nodes);
            }
            System.out.printf("The shortest path from %d to %d is: [%s]\n", start, i, strPath);
        }




    }

}
