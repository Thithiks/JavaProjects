import java.io.*;
import java.util.Scanner;
public class StudentDetails{
int id;
String name;
String clg;
    void setDetails(int id,String name,String clg){
               this.id=id;
               this.name=name;
               this.clg=clg;
                      }
    void print(){
          System.out.println("Id: "+id+" Name: "+name+" College: "+clg);  
          }
     void setId(int id){
          this.id=id;     
          }
     void setName(String name){
           this.name=name;
               }
     void setClg(String clg){
         this.clg=clg;
              }
     void getId(){
          System.out.println("id:"+ this.id);
             }
     void getName(){
         System.out.println("Name:" +this.name);
          }
     void getClg(){
       System.out.println("College:"+ this.clg);
          }
public static void main(String[] args){
StudentDetails st[]=new StudentDetails[50];
int n,i;
int a=0;
Scanner sc=new Scanner(System.in);
System.out.println("_____Welcome to Student info:______"); 
int op=1;
while(op!=0){
       System.out.println("Enter your Option:\n1.Create\n2.View\n3.Edit\n4.Exit-Enter 0");
        op=sc.nextInt();
    if(op==1){
            System.out.print("Enter number of Students:");
            n=sc.nextInt();
            for(i=0;i<n;i++){
               System.out.println("Enter the Student"+(i+1)+" id:");
               int id=sc.nextInt();
               System.out.println("Enter the Student"+(i+1)+" name:");
               sc.nextLine();
               String name=sc.nextLine();
               System.out.println("Enter the Student"+(i+1)+" college Name:");
               String clg=sc.nextLine();
               StudentDetails s=new StudentDetails();
               s.setDetails(id,name,clg);
               st[i]=s;
              
                  }
                  a=n;
                  
           }
     if(op==2){
        System.out.println("Enter your option to Display:\n1.Display Id\n2.Display Name\n3.Display College\n4.Display All");
         int k=sc.nextInt();
            if(k==1){
               for(i=0;i<a;i++){
                    st[i].getId();
                          }
              }
            if(k==2){
               for(i=0;i<a;i++){
                    st[i].getName();
                          }
              }
            if(k==3){
               for(i=0;i<a;i++){
                    st[i].getClg();
                          }
              }
            if(k==4){
               for(i=0;i<a;i++){
                 st[i].print();
                  }
            }
        }
     if (op == 3)
      {
       System.out.println("Enter the student id to be changed");
        int y = sc.nextInt();
        int c=0;
        for ( i = 0; i <a; i++) 
        {
         if (st[i].id == y)
          {
               c++;
           System.out.println("Enter the data to be changed: 1. ID 2. Name 3. College 4.Exit");
          int q = sc.nextInt();
            if (q == 1)
              {
                 System.out.println("Enter the new ID:");
                 int newId = sc.nextInt();
                 st[i].setId(newId);
             }
            if (q == 2)
             {
               System.out.println("Enter the new name:");
               String newName = sc.next();
                st[i].setName(newName);
                }     
             if (q == 3)
              {
                System.out.println("Enter the new college:");
                String newCollege = sc.next();
                st[i].setClg(newCollege);
              } 
            if(q==4)
            {
              System.out.println("Enter a valid input");
            }
          }
        }
if (c==0) 
{
System.out.println("Student with ID " + y + " not found.");
}
}if (op == 0) 
{
break;
} 
if(op>3)
{
System.out.println("Enter a valid option!!!");
}
}
System.out.println("Thank you");
}
}

