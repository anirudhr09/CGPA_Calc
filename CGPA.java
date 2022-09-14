/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author student
 */
public class CGPA {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int ch;
        char y;
        HashMap<String,Integer> points = new HashMap<>();
        points.put("O", 10);
        points.put("A+", 9);
        points.put("A", 8);
        points.put("B+", 7);
        points.put("B", 6);
        points.put("RA", 0);
        System.out.println("CGPA Calculator");
        System.out.println("-------------------------------------------------------------");
        do
        {
        System.out.println("Enter semester: ");
        ch= Integer.parseInt(cin.nextLine());
        switch(ch)
        {
            case 1 -> {
                HashMap<String,Integer> cred = new HashMap<>();
                float total=0;
                String g1,g2,g3,g4,g5,g6,g7;
                cred.put("BASIC SCIENCES LABORATORY",2);
                cred.put("ENGINEERING CHEMISTRY",3);
                cred.put("PROBLEM SOLVING AND PYTHON PROGRAMMING",3);
                cred.put("PROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY",2);
                cred.put("TECHNICAL ENGLISH",4);
                cred.put("ENGINEERING MATHEMATICS - I",4);
                cred.put("ENGINEERING PHYSICS",3);
                System.out.println("\n \n ENTER GRADES");
                System.out.println("\n SUBJECT NAME \t\t\t             GRADE\n");
                System.out.println("\n BASIC SCIENCES LABORATORY: ");                    //Science LAB 
                g1=cin.nextLine();
                total+=points.get(g1)*cred.get("BASIC SCIENCES LABORATORY");
                System.out.println("\nENGINEERING CHEMISTRY: ");                         //Chem
                g2=cin.nextLine();
                total+=points.get(g2)*cred.get("ENGINEERING CHEMISTRY");
                System.out.println("\nENGINEERING PHYSICS: ");                           //Phy
                g3=cin.nextLine();
                total+=points.get(g3)*cred.get("ENGINEERING PHYSICS");
                System.out.println("\nENGINEERING MATHEMATICS - I: ");                   //Maths
                g4=cin.nextLine();
                total+=points.get(g4)*cred.get("ENGINEERING MATHEMATICS - I");
                System.out.println("\nPROBLEM SOLVING AND PYTHON PROGRAMMING: ");       //python
                g5=cin.nextLine();
                total+=points.get(g5)*cred.get("PROBLEM SOLVING AND PYTHON PROGRAMMING");
                System.out.println("\nPROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY: ");        //python lab
                g6=cin.nextLine();
                total+=points.get(g6)*cred.get("PROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY");
                System.out.println("\nTECHNICAL ENGLISH: ");                            //English
                g7=cin.nextLine();
                total+=points.get(g7)*cred.get("TECHNICAL ENGLISH");
                }
        }
        System.out.println("Do you want to continue? (y/n) ");
        y=cin.next().charAt(0);
        }
        while(y=='y');
    }
}
