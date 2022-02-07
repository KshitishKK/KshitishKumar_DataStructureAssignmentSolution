import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building\n");
        int floors= sc.nextInt();
        int sizearray[] = new int[floors];
        int j=0;
        for(int i=0;i<floors;i++) {
            System.out.println("enter the floor size given on day : " + ++j + "\n");
            sizearray[i]= sc.nextInt();
        }
        OrderOfConstruction orc= new OrderOfConstruction();
        orc.ordering(sizearray);
        }
}
