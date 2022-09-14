#include<bits/stdc++.h>
using namespace std;
int main()
{
    int ch;
    char y;
    map<string,int>points;
    cout<<"\n\n CGPA CALCULATOR ";
     cout<<"\n-------------------------------------------------------------------------------";
    points["O"]=10;
    points["A+"]=9;
    points["A"]=8;
    points["B+"]=7;
    points["B"]=6;
    do
    {
        cout<<"\n Enter the semester:";
        cin>>ch;
        switch(ch)
        {
        case 1:
            {
    map<string,int>credits;
    float total=0;
    string gr1,gr2,gr3,gr4,gr5,gr6,gr7;
     map<string, int>::iterator itr;

    credits["BASIC SCIENCES LABORATORY"]=2;
    credits["ENGINEERING CHEMISTRY"]=3;
    credits["PROBLEM SOLVING AND PYTHON PROGRAMMING"]=3;
    credits["PROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY"]=2;
    credits["TECHNICAL ENGLISH"]=4;
    credits["ENGINEERING MATHEMATICS - I"]=4;
    credits["ENGINEERING PHYSICS"]=3;
    cout<<"\n \n ENTER GRADES";

    cout<<"\n SUBJECT NAME \t\t\t             GRADE\n";
    cout<<"\n BASIC SCIENCES LABORATORY:";
    cin>>gr1;
    total+=points[gr1]*credits["BASIC SCIENCES LABORATORY"];
    cout<<"\nENGINEERING CHEMISTRY:";
    cin>>gr2;
    total+=points[gr2]*credits["ENGINEERING CHEMISTRY"];
     cout<<"\nPROBLEM SOLVING AND PYTHON PROGRAMMING:";
    cin>>gr3;
    total+=points[gr3]*credits["PROBLEM SOLVING AND PYTHON PROGRAMMING"];
     cout<<"\n PROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY:";
    cin>>gr4;
    total+=points[gr4]*credits["PROBLEM SOLVING AND PYTHON PROGRAMMING LABORATORY"];
    cout<<"\n TECHNICAL ENGLISH:";
    cin>>gr5;
    total+=points[gr5]*credits["TECHNICAL ENGLISH"];
    cout<<"\nENGINEERING MATHEMATICS - I:";
    cin>>gr6;
    total+=points[gr6]*credits["ENGINEERING MATHEMATICS - I"];
     cout<<"\nENGINEERING PHYSICS:";
    cin>>gr7;
    total+=points[gr7]*credits["ENGINEERING PHYSICS"];
    float cgpa=total/21.0;
    cout<<"\n CGPA - "<<setprecision(3)<<cgpa;
            break;
            }
        case 2:
            {
                map<string,int>credits;
    float total=0;
    string gr1,gr2,gr3,gr4,gr5,gr6,gr7,gr8;
     map<string, int>::iterator itr;

    credits["BASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING"]=3;
    credits["ELECTRICAL AND ELECTRONICS ENGINEERING LABORATORY"]=2;
    credits["ENGINEERING GRAPHICS"]=3;
    credits["PROFESSIONAL COMMUNICATION"]=4;
    credits["INFORMATION TECHNOLOGY ESSENTIALS"]=3;
    credits["INFORMATION TECHNOLOGY ESSENTIALS LABORATORY"]=2;
    credits["ENGINEERING MATHEMATICS - II"]=4;

    cout<<"\n \n ENTER GRADES";

    cout<<"\n SUBJECT NAME \t\t\t             GRADE\n";
    cout<<"\n BASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING:";
    cin>>gr1;
    total+=points[gr1]*credits["BASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING"];
    cout<<"\nELECTRICAL AND ELECTRONICS ENGINEERING LABORATORY:";
    cin>>gr2;
    total+=points[gr2]*credits["ELECTRICAL AND ELECTRONICS ENGINEERING LABORATORY"];
     cout<<"\nENGINEERING GRAPHICS:";
    cin>>gr3;
    total+=points[gr3]*credits["ENGINEERING GRAPHICS"];
     cout<<"\n PROFESSIONAL COMMUNICATION:";
    cin>>gr4;
    total+=points[gr4]*credits["PROFESSIONAL COMMUNICATION"];
    cout<<"\n INFORMATION TECHNOLOGY ESSENTIALS:";
    cin>>gr5;
    total+=points[gr5]*credits["INFORMATION TECHNOLOGY ESSENTIALS"];
    cout<<"\nINFORMATION TECHNOLOGY ESSENTIALS LABORATORY:";
    cin>>gr6;
    total+=points[gr6]*credits["INFORMATION TECHNOLOGY ESSENTIALS LABORATORY"];
     cout<<"\nENGINEERING MATHEMATICS - II:";
    cin>>gr7;
    total+=points[gr7]*credits["ENGINEERING MATHEMATICS - II"];
    float cgpa=total/21.0;
    cout<<"\n CGPA - "<<setprecision(3)<<cgpa;
            break;
            }
        case 3:
            {
    map<string,int>credits;
    float total=0;
    string gr1,gr2,gr3,gr4,gr5,gr6,gr7,gr8;
     map<string, int>::iterator itr;

    credits["HUMANITIES - I"]=3;
    credits["DIGITAL LOGIC AND DESIGN"]=3;
    credits["SOFTWARE ENGINEERING"]=3;
    credits["PROGRAMMING AND DATA STRUCTURES LABORATORY"]=2;
    credits["DATABASE MANAGEMENT SYSTEMS LABORATORY"]=2;
    credits["DATABASE MANAGEMENT SYSTEMS"]=3;
    credits["PROGRAMMING AND DATA STRUCTURES"]=3;
    credits["DISCRETE MATHEMATICS"]=4;


    cout<<"\n \n ENTER GRADES";

    cout<<"\n SUBJECT NAME \t\t\t             GRADE\n";
    cout<<"\n HUMANITIES - I:";
    cin>>gr1;
    total+=points[gr1]*credits["HUMANITIES - I"];
    cout<<"\n DIGITAL LOGIC AND DESIGN:";
    cin>>gr2;
    total+=points[gr2]*credits["DIGITAL LOGIC AND DESIGN"];
     cout<<"\nSOFTWARE ENGINEERING:";
    cin>>gr3;
    total+=points[gr3]*credits["SOFTWARE ENGINEERING"];
     cout<<"\n PROGRAMMING AND DATA STRUCTURES LABORATORY:";
    cin>>gr4;
    total+=points[gr4]*credits["PROGRAMMING AND DATA STRUCTURES LABORATORY"];
    cout<<"\n DATABASE MANAGEMENT SYSTEMS LABORATORY:";
    cin>>gr5;
    total+=points[gr5]*credits["DATABASE MANAGEMENT SYSTEMS LABORATORY"];
    cout<<"\n DATABASE MANAGEMENT SYSTEMS:";
    cin>>gr6;
    total+=points[gr6]*credits["DATABASE MANAGEMENT SYSTEMS"];
     cout<<"\nPROGRAMMING AND DATA STRUCTURES:";
    cin>>gr7;
    total+=points[gr7]*credits["PROGRAMMING AND DATA STRUCTURES"];

    cout<<"\nDISCRETE MATHEMATICS:";
    cin>>gr7;
    total+=points[gr7]*credits["DISCRETE MATHEMATICS"];

    float cgpa=total/23.0;
    cout<<"\n CGPA - "<<setprecision(3)<<cgpa;
                 break;
            }
        case 4:
            {
              map<string,int>credits;
    float total=0;
    string gr1,gr2,gr3,gr4,gr5,gr6,gr7,gr8;
     map<string, int>::iterator itr;

    credits["ENVIRONMENTAL SCIENCES"]=3;
    credits["HUMANITIES -II"]=3;
    credits["OBJECT ORIENTED PROGRAMMING AND ADVANCED DATA STRUCTURES"]=3;
    credits["DESIGN AND ANALYSIS OF ALGORITHMS"]=3;
    credits["OPERATING SYSTEMS"]=3;
    credits["OPERATING SYSTEMS LABORATORY"]=2;
    credits["ADVANCED DATA STRUCTURES LABORATORY"]=2;
    credits["COMPUTER ARCHITECTURE"]=3;

    cout<<"\n \n ENTER GRADES";

    cout<<"\n SUBJECT NAME \t\t\t             GRADE\n";
    cout<<"\n ENVIRONMENTAL SCIENCES:";
    cin>>gr1;
    total+=points[gr1]*credits["ENVIRONMENTAL SCIENCES"];
    cout<<"\nHUMANITIES - II:";
    cin>>gr2;
    total+=points[gr2]*credits["HUMANITIES - II"];
     cout<<"\nOBJECT ORIENTED PROGRAMMING AND ADVANCED DATA STRUCTURES:";
    cin>>gr3;
    total+=points[gr3]*credits["OBJECT ORIENTED PROGRAMMING AND ADVANCED DATA STRUCTURES"];
     cout<<"\n DESIGN AND ANALYSIS OF ALGORITHMS:";
    cin>>gr4;
    total+=points[gr4]*credits["DESIGN AND ANALYSIS OF ALGORITHMS"];
    cout<<"\n OPERATING SYSTEMS:";
    cin>>gr5;
    total+=points[gr5]*credits["OPERATING SYSTEMS"];
    cout<<"\nOPERATING SYSTEMS LABORATORY:";
    cin>>gr6;
    total+=points[gr6]*credits["OPERATING SYSTEMS LABORATORY"];
     cout<<"\nCOMPUTER ARCHITECTURE:";
    cin>>gr7;
    total+=points[gr7]*credits["COMPUTER ARCHITECTURE"];
    cout<<"\nADVANCED DATA STRUCTURES LABORATORY:";
    cin>>gr8;
    total+=points[gr8]*credits["ADVANCED DATA STRUCTURES LABORATORY"];
    float cgpa=total/22.0;
    cout<<"\n CGPA - "<<setprecision(3)<<cgpa;
            break;
            }
        }
        cout<<"\n Do you want to continue(Y/N)";
        cin>>y;
    }while((y=='y')||(y=='Y'));

return 0;
}
