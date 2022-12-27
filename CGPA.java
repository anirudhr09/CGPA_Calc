/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cgpa;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author student
 */
 //public class CGPA{
public class CGPA {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        char y;
        float cgpa=0;
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
        int ch;
        System.out.println("Enter semester: ");
        ch= Integer.parseInt(cin.nextLine());
        switch(ch)
        {
            case 1:
                {
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
                System.out.println("\n BASIC SCIENCES LABORATORY: ");                                   //Science LAB 
                g1=cin.nextLine();
                total+=points.get(g1)*cred.get("BASIC SCIENCES LABORATORY");
                System.out.println("\nENGINEERING CHEMISTRY: ");                                        //Chem
                g2=cin.nextLine();
                total+=points.get(g2)*cred.get("ENGINEERING CHEMISTRY");
                System.out.println("\nENGINEERING PHYSICS: ");                                          //Phy
                g3=cin.nextLine();
                total+=points.get(g3)*cred.get("ENGINEERING PHYSICS");
                System.out.println("\nENGINEERING MATHEMATICS - I: ");                                  //Maths
                g4=cin.nextLine();
                total+=points.get(g4)*cred.get("ENGINEERING MATHEMATICS - I");
                System.out.println("\nPROBLEM SOLVING AND PYTHON PROGRAMMING: ");                       //python
                g5=cin.nextLine();
                total+=points.get(g5)*cred.get("PROBLEM SOLVING AND PYTHON PROGRAMMING");
                System.out.println("\nPROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY: ");            //python lab
                g6=cin.nextLine();
                total+=points.get(g6)*cred.get("PROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY");
                System.out.println("\nTECHNICAL ENGLISH: ");                                            //English
                g7=cin.nextLine();
                total+=points.get(g7)*cred.get("TECHNICAL ENGLISH");
                cgpa = total/21;
                break;
                }
            case 2:
                {
                HashMap<String,Integer> cred = new HashMap<>();
                float total=0;
                String g1,g2,g3,g4,g5,g6,g7;
                cred.put("BASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING",3);
                cred.put("ELECTRICAL AND ELECTRONICS ENGINEERING LABORATORY",2);
                cred.put("INFORMATION TECHNOLOGY ESSENTIALS",3);
                cred.put("INFORMATION TECHNOLOGY ESSENTIALS LABORATORY",2);
                cred.put("PROFESSIONAL COMMUNICATION",4);
                cred.put("ENGINEERING MATHEMATICS - II",4);
                cred.put("ENGINEERING GRAPHICS",3);
                System.out.println("\n \n ENTER GRADES");
                System.out.println("\n SUBJECT NAME \t\t\t             GRADE\n");
                System.out.println("\nBASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING: ");               //BEEE 
                g1=cin.nextLine();
                total+=points.get(g1)*cred.get("BASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING");
                System.out.println("\nELECTRICAL AND ELECTRONICS ENGINEERING LABORATORY");                //BEEE lab
                g2=cin.nextLine();
                total+=points.get(g2)*cred.get("ELECTRICAL AND ELECTRONICS ENGINEERING LABORATORY");
                System.out.println("\nINFORMATION TECHNOLOGY ESSENTIALS : ");                             //ITE
                g3=cin.nextLine();
                total+=points.get(g3)*cred.get("INFORMATION TECHNOLOGY ESSENTIALS");
                System.out.println("\nINFORMATION TECHNOLOGY ESSENTIALS LABORATORY : ");                  //ITE lab
                g5=cin.nextLine();
                total+=points.get(g5)*cred.get("INFORMATION TECHNOLOGY ESSENTIALS LABORATORY");
                System.out.println("\nENGINEERING MATHEMATICS - II: ");                                   //Maths
                g4=cin.nextLine();
                total+=points.get(g4)*cred.get("ENGINEERING MATHEMATICS - II");
                System.out.println("\nENGINEERING GRAPHICS : ");                                         //Engg Graphics
                g6=cin.nextLine();
                total+=points.get(g6)*cred.get("ENGINEERING GRAPHICS");
                System.out.println("\nPROFESSIONAL COMMUNICATION ");                                     //English
                g7=cin.nextLine();
                total+=points.get(g7)*cred.get("PROFESSIONAL COMMUNICATION");
                cgpa = total/21;
                break;
                }
            case 3: 
                {
                HashMap<String,Integer> cred = new HashMap<>();
                float total=0;
                String g1,g2,g3,g4,g5,g6,g7;
                cred.put("HUMANITIES - I",3);
                cred.put("DIGITAL LOGIC AND DESIGN",3);
                cred.put("SOFTWARE ENGINEERING",3);
                cred.put("PROGRAMMING AND DATA STRUCTURES",3);
                cred.put("PROGRAMMING AND DATA STRUCTURES LABORATORY",2);
                cred.put("DATABASE MANAGEMENT SYSTEMS",3);
                cred.put("DATABASE MANAGEMENT SYSTEMS LABORATORY",2);
                System.out.println("\n \n ENTER GRADES");
                System.out.println("\n SUBJECT NAME \t\t\t             GRADE\n");
                System.out.println("\nHUMANITIES - I :");                                                    //HSMC
                g1=cin.nextLine();
                total+=points.get(g1)*cred.get("HUMANITIES - I");
                System.out.println("\nDIGITAL LOGIC AND DESIGN : ");                                         //DLD
                g2=cin.nextLine();
                total+=points.get(g2)*cred.get("DIGITAL LOGIC AND DESIGN");
                System.out.println("\nSOFTWARE ENGINEERING : ");                                             //SE
                g3=cin.nextLine();
                total+=points.get(g3)*cred.get("SOFTWARE ENGINEERING");
                System.out.println("\nPROGRAMMING AND DATA STRUCTURES : ");                                  //PDS
                g4=cin.nextLine();
                total+=points.get(g4)*cred.get("PROGRAMMING AND DATA STRUCTURES");
                System.out.println("\nPROGRAMMING AND DATA STRUCTURES LABORATORY");                          //PDS lab
                g5=cin.nextLine();
                total+=points.get(g5)*cred.get("PROGRAMMING AND DATA STRUCTURES LABORATORY");
                System.out.println("\nDATABASE MANAGEMENT SYSTEMS : ");                                     //DBMS
                g6=cin.nextLine();
                total+=points.get(g6)*cred.get("DATABASE MANAGEMENT SYSTEMS");
                System.out.println("\nDATABASE MANAGEMENT SYSTEMS LABORATORY : ");                          //DBMS lab
                g7=cin.nextLine();
                total+=points.get(g7)*cred.get("DATABASE MANAGEMENT SYSTEMS LABORATORY");
                cgpa = total/19;
                break;
                }
            case 4:
                {
                HashMap<String,Integer> cred = new HashMap<>();
                float total=0;
                String g1,g2,g3,g4,g5,g6,g7;
                cred.put("ENVIRONMENTAL SCIENCES",3);
                cred.put("HUMANITIES -II",3);
                cred.put("OBJECT ORIENTED PROGRAMMING AND ADVANCED DATA STRUCTURES",3);
                cred.put("DESIGN AND ANALYSIS OF ALGORITHMS",3);
                cred.put("ADVANCED DATA STRUCTURES LABORATORY",2);
                cred.put("OPERATING SYSTEMS",3);
                cred.put("OPERATING SYSTEMS LABORATORY",3);
                System.out.println("\n \n ENTER GRADES");
                System.out.println("\n SUBJECT NAME \t\t\t             GRADE\n");
                System.out.println("\nENVIRONMENTAL SCIENCES : ");                                                  //EVS
                g1=cin.nextLine();
                total+=points.get(g1)*cred.get("ENVIRONMENTAL SCIENCES");
                System.out.println("\nHUMANITIES -II : ");                                                          //HSMC
                g2=cin.nextLine();
                total+=points.get(g2)*cred.get("HUMANITIES -II");
                System.out.println("\nOBJECT ORIENTED PROGRAMMING AND ADVANCED DATA STRUCTURES : ");                //ADS
                g3=cin.nextLine();
                total+=points.get(g3)*cred.get("OBJECT ORIENTED PROGRAMMING AND ADVANCED DATA STRUCTURES");
                System.out.println("\nDESIGN AND ANALYSIS OF ALGORITHMS : ");                                       //DAA
                g4=cin.nextLine();
                total+=points.get(g4)*cred.get("DESIGN AND ANALYSIS OF ALGORITHMS");
                System.out.println("\nADVANCED DATA STRUCTURES LABORATORY : ");                                     //ADS lab
                g5=cin.nextLine();
                total+=points.get(g5)*cred.get("ADVANCED DATA STRUCTURES LABORATORY");
                System.out.println("\nOPERATING SYSTEMS : ");                                                       //OS
                g6=cin.nextLine();
                total+=points.get(g6)*cred.get("OPERATING SYSTEMS");
                System.out.println("\nOPERATING SYSTEMS LABORATORY : ");                                            //OS lab
                g7=cin.nextLine();
                total+=points.get(g7)*cred.get("OPERATING SYSTEMS LABORATORY");
                cgpa = total/19;
                break;
                }
        }
        System.out.println("CGPA : "+String.format("%.3f",cgpa));
        System.out.println("Do you want to continue? (y/n) ");
        y=cin.next().charAt(0);
        }
        while(y=='y');
    }
}
