/*
Create package 'stores'. Under it create a class called 'Stock' with member variables (item_no, item_name, stock_available and cost). Under the default package create a class called 'Sales' with field name (qty_sold) and it is the child class of 'Stock' class. Write a program to print the current stock of each item and perform addition.
*/

package stores;

public class Stock {
    public int[] item_no = new int[3];
    public String[] item_name = new String[3];
    public int[] stock_available = new int[3];
    public int[] cost = new int[3];

    public Stock() {
        item_no[0] = 1;
        item_no[1] = 2;
        item_no[2] = 3;

        item_name[0] = "Noodles";
        item_name[1] = "Manchurian";
        item_name[2] = "Fried Rice";

        stock_available[0] = 4;
        stock_available[1] = 6;
        stock_available[2] = 5;

        cost[0] = 30;
        cost[1] = 50;
        cost[2] = 60;
    }
}


/*
Create package 'stores'. Under it create a class called 'Stock' with member variables (item_no, item_name, stock_available and cost). Under the default package create a class called 'Sales' with field name (qty_sold) and it is the child class of 'Stock' class. Write a program to print the current stock of each item and perform addition.
*/

import stores.Stock;

class Sales extends Stock {
    public int[] qty_sold = new int[3];

    public Sales() {
        qty_sold[0] = 50;
        qty_sold[1] = 65;
        qty_sold[2] = 84;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Sales s = new Sales();

        for (int i = 0; i < 3; i++) {
            System.out.println("Item no: " + s.item_no[i] + "\tItem Name: " + s.item_name[i] + "\tStock Available: "
                    + s.stock_available[i] + "\tCost: " + s.cost[i] + "\tQuantity Sold: " + s.qty_sold[i]);
        }

        System.out.println("\n\nTotal Cost of all items per plate: " + (s.cost[0] + s.cost[1] + s.cost[2]));
        System.out.println("Total Quantities of all items sold: " + (s.qty_sold[0] + s.qty_sold[1] + s.qty_sold[2]));
    }
}
