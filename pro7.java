import java.util.Arrays;
import java.util.Scanner;

public class pro7 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String order[] = {"first","second","third"};
        String cities[] = {"","",""};
        for(int i = 0; i<3; i++){
            System.out.print("Enter the " + order[i] +" city: ");
            String input = scanner.nextLine();
            input = input.trim().toLowerCase();
            cities[i] = input;
        }
        Arrays.sort(cities);
        for(int i = 0; i<3; i++){
            cities[i] = cities[i].substring(0,1).toUpperCase() + cities[i].substring(1);
        }

        System.out.println("The three cities in alphabetical order are :  " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}

