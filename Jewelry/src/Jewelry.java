import java.util.Scanner;
import java.util.ArrayList;

public class Jewelry
{
    public static void main (String args[]){
        Scanner kb = new Scanner (System.in);
        ArrayList <Integer> ringID = new ArrayList<Integer>();
        ArrayList <Ring> rings = new ArrayList<Ring>();
        ArrayList <Integer> materialID = new ArrayList<Integer>();
        ArrayList <Material> materials = new ArrayList<Material>();
        ArrayList <Integer> stoneID = new ArrayList<Integer>();
        ArrayList <Stones> stones = new ArrayList<Stones>();

        System.out.println("WELCOME TO THE LAST DAY JEWELRY SHOP! You will have to set up the shop before you can make any orders!");
        System.out.println("How many kinds of material do you want to add to the shop?");
        int ans = kb.nextInt();

        for (int i = 0; i < ans; i++){
            int id;
            String type;
            double density;
            int costPerMG;
            boolean added;

            do{
                added = true;
                System.out.print("Please enter the material's ID: ");
                id = kb.nextInt();
                if (materialID.indexOf(id) == -1){
                    materialID.add(id);
                }else{
                    System.out.println("This ID is been used!");
                    added = false;
                }
            }while(!added);

            System.out.print("Please enter the material's type: ");
            type = kb.next();

            System.out.print("Please enter the material's density: ");
            density = kb.nextDouble();

            System.out.print("Please enter the material's cost per MG: ");
            costPerMG = kb.nextInt();

            materials.add(new Material(id, type, density, costPerMG));
            System.out.println("Material added.");
        }//add materials

        System.out.println("How many kinds of stones do you want to add to the shop?");
        ans = kb.nextInt();

        for (int i = 0; i < ans; i++){
            int id;
            String type;
            String grade;
            int cost;
            double weight;
            boolean added;

            do{
                added = true;
                System.out.print("Please enter the stone's ID: ");
                id = kb.nextInt();
                if (stoneID.indexOf(id) == -1){
                    stoneID.add(id);
                }else{
                    System.out.println("This ID is been used!");
                    added = false;
                }
            }while(!added);

            System.out.print("Please enter the stone's type: ");
            type = kb.next();

            System.out.print("Please enter the stone's grade: ");
            grade = kb.next();

            System.out.print("Please enter the stone's cost: ");
            cost = kb.nextInt();

            System.out.print("Please enter the stone's weight: ");
            weight = kb.nextDouble();

            stones.add(new Stones(id, type, grade, cost, weight));
            System.out.println("Stone added.");
        }//add stones

        int order;


        do{
            System.out.print("Please give an order to BABU:\n1. add new ring\n2. add new material\n3. add new stone\n4. cost of all rings\n5. average cost of all rings\n6. cost of specific ring ID\n7. cost of rings of specified Material\n8. list out all the rings by price\n9. exit\n> ");
            order = kb.nextInt();
            switch (order){
                case 1: // add new ring [int id, Material material, int weight, int size, ArrayList<Stones> stones, int productionCost]
                    int id;
                    int matID;
                    Material material = materials.get(0);
                    int weight;
                    int size;
                    ArrayList<Stones> usedStones = new ArrayList<Stones>();
                    int productionCost;
                    boolean added;

                    do{
                        added = true;
                        System.out.print("Please enter the ring's ID: ");
                        id = kb.nextInt();
                        if (ringID.indexOf(id) == -1){
                            ringID.add(id);
                        }else{
                            System.out.println("This ID is been used!");
                            added = false;
                        }
                    }while(!added);

                    int temp = Integer.MAX_VALUE;
                    do {
                        System.out.print("Please enter the material's ID: ");
                        matID = kb.nextInt();
                        for (int i = 0; i < materialID.size(); i++) {
                            if (matID == materialID.get(i)) {
                                temp = materialID.get(i);
                                material = materials.get(i);
                                System.out.println(material.getType() + " is added.");
                            }
                        }
                        if (temp == Integer.MAX_VALUE) {
                            System.out.println("This material is not avaliable in this shop!");
                        }
                    }while(temp == Integer.MAX_VALUE);

                    System.out.print("Please enter the ring's weight: ");
                    weight = kb.nextInt();

                    System.out.print("Please enter the ring's size: ");
                    size = kb.nextInt();


                    int stoneIN;
                    int idx = Integer.MAX_VALUE;
                    do{
                        do {
                            temp = Integer.MIN_VALUE;
                            System.out.print("Please enter the stone's ID one by one [0 for exit]: ");
                            stoneIN = kb.nextInt();
                            if (stoneIN == 0){
                                break;
                            }
                            for (int i = 0; i < stoneID.size(); i++) {
                                if (stoneIN == stoneID.get(i)) {
                                    temp = stoneID.get(i);
                                    idx = i;
                                }
                            }
                            if (temp == Integer.MIN_VALUE) {
                                System.out.println("This stone is not avaliable in this shop!");
                            }
                        }while(temp == Integer.MIN_VALUE);
                        if (stoneIN != 0){
                            usedStones.add(stones.get(idx));
                        }
                    }while (stoneIN != 0);

                    System.out.print("Please enter the ring's production cost: ");
                    productionCost = kb.nextInt();

                    rings.add(new Ring(id, material, weight, size, usedStones, productionCost));
                    System.out.println("New ring added");
                    break;

                case 2: // add new materials
                    int mID;
                    String type;
                    double density;
                    int costPerMG;
                    boolean add;

                    do{
                        add = true;
                        System.out.print("Please enter the material's ID: ");
                        mID = kb.nextInt();
                        if (materialID.indexOf(mID) == -1){
                            materialID.add(mID);
                        }else{
                            System.out.println("This ID is been used!");
                            add = false;
                        }
                    }while(!add);

                    System.out.print("Please enter the material's type: ");
                    type = kb.next();

                    System.out.print("Please enter the material's density: ");
                    density = kb.nextDouble();

                    System.out.print("Please enter the material's cost per MG: ");
                    costPerMG = kb.nextInt();

                    materials.add(new Material(mID, type, density, costPerMG));
                    System.out.println("Material added.");
                    break;

                case 3: //add new stones
                    int sID;
                    String sType;
                    String grade;
                    int cost;
                    double sWeight;
                    boolean sAdded;

                    do{
                        sAdded = true;
                        System.out.print("Please enter the stone's ID: ");
                        sID = kb.nextInt();
                        if (stoneID.indexOf(sID) == -1){
                            stoneID.add(sID);
                        }else{
                            System.out.println("This ID is been used!");
                            sAdded = false;
                        }
                    }while(!sAdded);

                    System.out.print("Please enter the stone's type: ");
                    sType = kb.next();

                    System.out.print("Please enter the stone's grade: ");
                    grade = kb.next();

                    System.out.print("Please enter the stone's cost: ");
                    cost = kb.nextInt();

                    System.out.print("Please enter the stone's weight: ");
                    sWeight = kb.nextDouble();

                    stones.add(new Stones(sID, sType, grade, cost, sWeight));
                    System.out.println("Stone added.");
                    break;

                case 4: //cost of all rings
                    double total = 0;
                    for (int i = 0; i < rings.size(); i++){
                        total += rings.get(i).getCost();
                    }
                    System.out.println("The total cost of all rings is " + total);
                    break;
                case 5: // average cost of all rings
                    double sum = 0;
                    for (int i = 0; i < rings.size(); i++){
                        sum += rings.get(i).getCost();
                    }
                    double averageCost = sum / rings.size();
                    System.out.println("The average cost of all the rings is " + averageCost);
                    break;
                case 6: // cost of specific ring ID
                    if (rings.size() == 0){
                        System.out.println("There are no rings in the shop!");
                    }
                    int index;
                    do{
                        System.out.print ("Please enter the ring's ID: ");
                        int babu = kb.nextInt();
                        index = ringID.indexOf(babu);
                        if (index == -1){
                            System.out.println("This ID is not avaliable!");
                        }
                    }while(index == -1);
                    System.out.println("The cost of the ring is " + rings.get(index).getCost());
                    break;
                case 7: //cost of specific ring material
                    if (rings.size() == 0){
                        System.out.println("There are no rings in the shop!");
                    }
                    int idIdx;
                    int tempID;
                    do{
                        System.out.print("Please enter a specific material ID: ");
                        tempID = kb.nextInt();
                        idIdx = materialID.indexOf(tempID);
                        if (idIdx == -1){
                            System.out.println("This ID is not avaliable!");
                        }
                    }while(idIdx == -1);

                    for (int i = 0; i < rings.size(); i++){
                        if (rings.get(i).getMaterial().getId() == tempID){
                            System.out.println("The cost of ring " + rings.get(i).getId() + " is " + rings.get(i).getCost());
                        }
                    }
                    break;

                case 8: //list out all rings by price
                    ArrayList<Integer> sortedRings = new ArrayList<>();
                    int maxID = Integer.MAX_VALUE;
                    for (int j = 0; j < rings.size(); j++) {
                        double max = -1;
                        for (int i = 0; i < rings.size(); i++) {
                            if (sortedRings.indexOf(i) == -1) {
                                if (rings.get(i).getCost() > max) {
                                    max = rings.get(i).getCost();
                                    maxID = i;
                                }
                            }
                        }
                        sortedRings.add(maxID);
                    }
                    System.out.println("The list of rings's ID by cost is: ");
                    for (int i = 0; i < rings.size(); i++){
                        System.out.println((i+1) + ". " + ringID.get(sortedRings.get(i)));
                    }
                    break;

                case 9: //exit
                    System.out.println("THANK YOU FOR COMMING BUT PLZ NEVER COME BACK XD");
                    break;

                default:
                    break;
            }
        }while(order != 9);

    }
}
