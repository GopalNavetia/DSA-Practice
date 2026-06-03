import java.util.*;

public class _03_Shortest_Path{
    
    public static void shortestDistance(String route){
        int x=0, y=0;

        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    x++;
                    break;
            
                case 'S':
                    x--;
                    break;
            
                case 'E':
                    y++;
                    break;
            
                case 'W':
                    y--;
                    break;
            }
        }

        System.out.println("Shortest Path:"+ (int)(Math.sqrt((x*x)+(y*y))));
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Route (E,W,N,S):");
        String route=sc.next();
        sc.close();

        shortestDistance(route);
    }
}