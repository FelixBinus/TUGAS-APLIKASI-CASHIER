import java.util.Scanner;

public class TugasCashierApp {
     public static void main(String[] args) {
     Scanner Iname = new Scanner(System.in);

     System.out.println("Felix's Company Cashier app \n==========================");

     System.out.println("Please input the item's name");
     String Ina1 = Iname.nextLine();

     System.out.println("Please input item's price");
     double Ipric1 = Iname.nextDouble();

     System.out.println("Please input item's quantity");
     int Iquan1 = Iname.nextInt();

     System.out.println("Please input item's discount");
     int Idisc = Iname.nextInt();

     System.out.println("Felix's Company Invoice \n==========================");
     System.out.println("\nINVOICE");
     
     System.out.println("Item's name: "+Ina1+"\nItem's price: "+Ipric1+"\nItem's quantity: "+Iquan1+"\nItem's discount: "+Idisc+"%");

     //Total Price
     double Invoice = Ipric1*Iquan1*(100-Idisc)/100;
     System.out.println("\nTotal Price: "+Invoice);

     System.out.println("Please input your money");
     double Imoney = Iname.nextDouble();

     
     if(Invoice==Imoney){
          System.out.println("Thanks for purchasing!");
          
     }else if(Invoice<Imoney){
          System.out.println("Thanks for purchasing!"+"\nYour change: "+(Imoney-Invoice));
          
     }else if(Invoice>Imoney){
          System.out.println("Your money is not enough!");
          
     
     } 

     }
     
     }

