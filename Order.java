//Order's menu 

package Menu;

import Logging.Logging;
import java.util.Scanner;
import java.io.IOException;

public class Order 
{
    public Scanner scan = new Scanner(System.in);
    public Burger burger = new Burger();
    public Water water = new Water();
    
    public void mainmenu() throws IOException, Exception
    {   
        int choice;
        
        do
        {
            System.out.println(":: WELCOME TO MACK-A-DONALD ::");
            System.out.println("[1]. Burger");
            System.out.println("[2]. Water");
            System.out.println("[3]. Exit\n");  
            System.out.print("Enter menu [1-3]: ");
            choice = scan.nextInt();
            
            switch(choice)
            {
                case 1:
                    burger.burger();
                    break;
                case 2:
                    water.water();
                    break;
            }
            
        }while(choice != 3);
    }
}

class Burger
{
    public Scanner scan = new Scanner(System.in);
    public Logging log = new Logging();
    
    public void burger() throws Exception,IOException
    {
        int burger;
        
        System.out.println(":: LIST OF BURGERS ::");
        System.out.println("[1]. Wack-A-Chicken");
        System.out.println("[2]. Wack-A-Beef\n");
        System.out.print("Choose your burger: ");
        burger = scan.nextInt();
        if (burger == 1)
        {
            log.writeFile("Wack-A-Chicken");
        }
        if (burger == 2)
        {
            log.writeFile("Wack-A-Beef");
        }
    }
}

class Water
{
    public Scanner scan = new Scanner(System.in);
    public Logging log = new Logging();
    
    public void water() throws Exception,IOException
    {
        int water;
        System.out.println(":: LIST OF WATERS ::");
        System.out.println("[1]. Cola-Cola");
        System.out.println("[2]. 100Plus");
        System.out.println("[3]. Mineral Water\n");
        System.out.print("Choose your water: ");
        water = scan.nextInt();
        
        if (water == 1)
            log.writeFileWater("Coca-Cola");
        if (water == 2)
            log.writeFileWater("100Plus");
        if (water == 3)
            log.writeFileWater("Mineral Water");
    }
}
