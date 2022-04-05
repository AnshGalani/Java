/*
Write a program that store details of 5 employees and display this information after every 10 seconds
*/

public class Program2 {
    public static void main(String[] args) throws InterruptedException{
        String[] name = {"Ansh", "Meet", "Raj", "Kartik", "Vivek"};
        int[] age = {18, 30, 22, 40, 30};
        String[] dept = {"Marketing", "Sales", "Finance", "Marketing", "Services"};
        int[] salary = {40000, 45000, 44000, 44000, 40000};

        for(int i = 0; i < 5; i++) {
            System.out.println("Name: " + name[i] + ",\tAge: " + age[i] + ",\tDepartment: " + dept[i] + ",\tSalary: " + salary[i]);
            Thread.sleep(10000);
        }
    }
}
