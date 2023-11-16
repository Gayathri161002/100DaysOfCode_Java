import java.util.*;

public class HashMap1 {
    public static void main(String args[]) {
        HashMap<String, Integer> hmap = new HashMap<>();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter total count: ");
        int n = s.nextInt();
        
        s.nextLine();  
        int val=0;
        System.out.println("Enter name of the candidates : ");
        for (int i = 0; i < n; i++) 
        {
            String name = s.nextLine();
            hmap.put(name, val);
            val++;
        }

        System.out.print(hmap);
    }
}
