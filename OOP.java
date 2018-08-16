//The main for this project

package Main;

import Array.LinkList;
import Menu.Order;
import Logging.Logging;
import java.util.InputMismatchException;
import java.util.Scanner;

//This will be the main

class OOP
{
    public static void main(String[] args) throws Exception 
    {
        int choice=0;
        int i = 1001;
        Order menu = new Order();
        LinkList link = new LinkList();
        Scanner scan = new Scanner(System.in);    
        Logging log = new Logging();
        
        //Loop until user enter 4 to exit.
        do
        {
            //Throws exception if user enter other than int 
             try
            {
                
                    System.out.println(":: WELCOME TO WACK-A-DONALD ::");
                    System.out.println("[1]. New Customer?");
                    System.out.println("[2]. Remove Served Customer?");
                    System.out.println("[3]. Display in Queue");
                    System.out.println("[4]. Display log for today");
                    System.out.println("[5]. Exit\n");
                    System.out.print("Select menu: ");
                    choice = scan.nextInt();
                                        
                    switch(choice)
                    {
                        case 1:
                            //
                            link.insert(i);
                            menu.mainmenu();
                            i++;
                            System.out.println("\n");
                            break;
                        case 2:
                            link.delete();
                            System.out.println("\n");
                            break;
                        case 3:
                            link.display();
                            System.out.println("\n");
                            break;
                        case 4:
                            log.readLog();
                            System.out.println("\n");
                            break;
                        case 5:
                            System.out.println("\n");
                            break;
                        default:
                            System.out.println("Please enter digits 1 - 4 only");
                            break;
                    }                   
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter digits 1 - 4 only");
                scan.next();
            } 
        }while (choice != 5);
          
    } 
}
