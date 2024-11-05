/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author moham
 */
public class Continue {

    public static void main(String[] args) { Scanner input = new Scanner(System.in);
    
    String ac;
System.out.println(" Enter 1 for math questions \n Enter 2  for true and false questions \n Enter 3 for odd or even question \n Enter 4 for Multiple choices Array question");
int s = input.nextInt();
switch (s){
    case 1:{
  int n1;
      int n2;
  System.out.println("Choose a section");
 
     System.out.println(" 1- multiple equations"+"\n"+" 2- substraction equations \n 3- addition equations ");
     int v = input.nextInt();
     
         switch(v){
         case 1:{
         n1= (int)(Math.random()*11);
         n2= (int)(Math.random()*11);
    int op = n1*n2;
    System.out.println("What is the result of "+n1+" * "+n2+"?");
     double answer= input.nextDouble();
    if(answer==op){
        System.out.println("Correct");}
    else{
       System.out.println("Wrong \n The correct answer is "+op);}
     break;
         }
         
         case 2:{
     n1= (int)(Math.random()*11);
     n2= (int)(Math.random()*11);   
         
              int op = n1-n2;
    System.out.println("What is the result of "+n1+" - "+n2+"?");
     double answer= input.nextDouble();
    if(answer==op){
        System.out.println("Correct");}
    else{
        System.out.println("Wrong \n The correct answer is "+op);}
     break;
    }
         
         
         
      case 3:{
              n1= (int)(Math.random()*600);
         n2= (int)(Math.random()*600);
     int  op = n1+n2;
    System.out.println("What is the result of "+n1+" + "+n2+"?");
     double answer= input.nextDouble();
    if(answer==op){
        System.out.println("Correct");}
    else{
         System.out.println("Wrong \n The correct answer is "+op);}
     break;
      }
      }
     System.out.println("Try another one? answer with yes or no");
    ac=input.next();
     }while(ac.equals("yes"));
    if(!ac.equals("yes"))
        System.exit(0); 

    
    
    
    
    case 2:{
         System.out.println("Choose a section");

    System.out.println("1-powers question ");

    System.out.println("2-square root questions \n3- log questions");

    System.out.println("4- sin questions \n5- absolute value questions");

    System.out.println("6- Division questions \n7- Factorial number questions");
    int m= input.nextInt();
    do {
     switch(m){
         
     case 1:{
          int q = (int) (Math.random()*7);
        int p = (int) (Math.random()*7);
        int n = (int) (Math.random()*2);
      double pq= Math.pow(p,q);
     String t;
     String f;
          double qp=Math.pow(q,p);
   if(p==q)
       p++;
   
    if(n==1){
      
     
       t="true";
       f="false";
          System.out.println(p+" to power of "+q+" = "+pq+" true or false?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong \n Number "+p+" to power of "+q+" = "+pq+" so the correct answer is true");
          
    }
    
    if(n==0){
        
        t="false";
        f="true";
   System.out.println(p+" to power of "+q+" = "+qp+" true or false ?");
   String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong \n Number "+p+" to power of "+q+" is "+pq+" so the correct is false");
          
    }
    break;
         }
     
     
     case 2:{
         int q = (int) (Math.random()*100);
        int p = (int) (Math.random()*100);
        int n = (int) (Math.random()*2);
      double pq= Math.sqrt(p);
     String t;
     String f;
          double qp=Math.sqrt(q);
   if(p==q)
        {p++;}
  
    if(n==1){
         

     
       t="true";
       f="false";
         System.out.println("The square root of "+p+" = "+pq+" true or false ?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
       System.out.println("Wrong \n The square root of "+p+" = "+pq+" so the correct answer is true");
         
    }
    
    if(n==0){
         
  
        t="false";
        f="true";
   System.out.println("The square root of "+p+" = "+qp+" true or false ?");
    String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
          System.out.println("Wrong \n The square root of "+p+" = "+pq+" so the correct answer is false");
    
    }
    break;
     }
     
     
     case 3:{
     int q = (int) (Math.random()*100);
        int p = (int) (Math.random()*100);
        int n = (int) (Math.random()*2);
      double pq= Math.log10(p);
     String t;
     String f;
          double qp=Math.log10(q);
   
   
    if(p==q)
        {p++;}
     if(n==1){
         

        
       t="true";
       f="false";
         System.out.println("The result of log("+p+") = "+pq+" true or false ?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong \n The result of log("+p+") = "+pq+" so the correct answer is true");
     }
    
    if(n==0){
         

       
        t="false";
        f="true";
  System.out.println("The result of log("+q+") is "+pq+" true or false ?");
   String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
            System.out.println("Wrong \n The result of log("+q+") = "+qp+" so the correct answer is false");
    }
 break;
     }
     
     
     
     
     case 4:{
      int q = (int) (Math.random()*100);
        int p = (int) (Math.random()*100);
        int n = (int) (Math.random()*2);
      
     String t;
     String f;
          double ra=Math.toRadians(p);
               double rq=Math.toRadians(q); 
        double pq= Math.sin(ra);
          double qp=Math.sin(rq);
   
   
    if(p==q)
        {p++;}
    if(n==1){
         

       
       t="true";
       f="false";
         System.out.println("The result of sin("+p+") = "+pq+" true or false ?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
          System.out.println("Wrong \n The result of sin("+p+") = "+pq+" so the correct answer is true");
        
          
    }
    if(n==0){
        
        t="false";
        f="true";
        
    System.out.println("The result of sin("+q+") = "+pq+" true or false ?");
   String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
       System.out.println("Wrong \n The result of sin("+p+") is "+qp+" so the correct answer is false");    
    }
    break;
     }
     
     
     case 5:{
      int q = (int) (Math.random()*-100);
        int p = (int) (Math.random()*-100);
        int n = (int) (Math.random()*2);
      int pq= Math.abs(p);
     String t;
     String f;
          int qp=Math.abs(q);
   
 
    if(p==q)
        {p++;}
    if(n==1){
         

        
       t="true";
       f="false";
         System.out.println("The absolute value of "+p+" = "+pq+" true or false ?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong \n The abslute value of "+p+" = "+pq+" so the correct answer is true");
         
    }
    
    if(n==0){
        

      
        t="false";
        f="true";
    System.out.println("The abslute value of "+q+" = "+""+q+" true or false ?");
   String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong \n The abslute value of "+q+" = "+qp+" so the correct answer is false");
  
     }
    break;
     }
     
     case 6:{
         float q = (int) (Math.random()*100);
        float p = (int) (Math.random()*100);
        int n = (int) (Math.random()*2);
      double pq= p/q ;
     String t;
     String f;
          double qp= q/p;
   if(p==q)
        {p++;}
  
    if(n==1){
         

     
       t="true";
       f="false";
         System.out.println("The result of "+p+"/"+q+" = "+pq+" true or false ?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
       System.out.println("Wrong \n The result of "+p+"/"+q+" = "+pq+" so the correct answer is true");
         
    }
    
    if(n==0){
         
  
        t="false";
        f="true";
   System.out.println("The result of "+p+"/"+q+" = "+qp+" true or false ?");
    String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
          System.out.println("Wrong \n The result of "+p+"/"+q+" is "+pq+" so the correct answer is false");
    
    }
    break;
     }
     
     
     case 7:{
     String t,f;
     int a=(int)(Math.random()*13);
int b = (int)(Math.random()*13);
int n= (int)(Math.random()*2);
if(a==b)
        {a++;}
if(n==1){
     

     t="true";
       f="false";
         System.out.println("The factorial of "+a+" = "+factorial(a)+" true or false ?");
         String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
System.out.println("Wrong \n The factorial number of "+a+" = "+factorial(a)+" so the correct answer is true");
}
if(n==0){
    
        t="false";
        f="true";
    System.out.println("The factorial of "+a+" = "+factorial(b)+" true or false ?");   
    String answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
  System.out.println("Wrong \n The factorial number of "+a+" = "+factorial(a)+" so the correct answer is false");
    
     }
break;
     }

     }
     System.out.println("Try another one? answer with yes or no");
    ac=input.next();    
     }while(ac.equals("yes"));
    if(!ac.equals("yes"))
     System.exit(0);
    }
    
    
    
    case 3:{
    do{ 
int p = (int) (Math.random()*500);
String t;
 String f;
 String answer;
 
 if(p%2==0){
     t="even";
     f="odd";
     System.out.println("Number "+p+"  odd or even ?");
      answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong");
 }
  if(p%2!=0){
     t="odd";
     f="even";
     System.out.println("Number "+p+" odd or even ?");
      answer= input.next(); 
   if(answer.equals(t))
        System.out.println("Correct");
         if(answer.equals(f))   
        System.out.println("Wrong");
}
  System.out.println("Try another one? answer with yes or no");
    ac=input.next();    
}while(ac.equals("yes"));
    if(!ac.equals("yes"))
     System.exit(0);
    break;
}
    
    case 4:{
    do{
     char answer;
     char a='A';
     char b='B';
     char c='C';
     
    System.out.println("Enter the first number and make sure to memorize it");
    double n1= input.nextDouble();
    System.out.println("Enter the second number and make sure to memorize it");
    double n2= input.nextDouble();
    double av=(n1+n2)/2;
        int r = (int) (Math.random()*3);   

    double [] array = new double [3];
    double [] arraya = new double [3];
    double [] arrayb = new double [3];
    double [] arrayc = new double [3];
if(r==0){
 double q1= (int) (Math.random()*50);
double q2= (int) (Math.random()*50);
double avq=(q1+q2)/2;
 double q1b= (int) (Math.random()*50);
double q2b= (int) (Math.random()*50);
 double q1c= (int) (Math.random()*50);
double q2c= (int) (Math.random()*50);
     double avqb=(q1b+q2b)/2;
      double avqc=(q1c+q2c)/2;
    array[0]=av;
    array[1]=n1;
    array[2]=n2;
    
    arraya[0]=q1b;
    arraya[1]=q2b;
    arraya[2]=avqb;
    
    arrayb[0]=avq;
    arrayb[1]=q1;
    arrayb[2]=q2;
   
    arrayc[0]=q2c;
    arrayc[1]=avqc;
    arrayc[2]=q1c;
 System.out.println("Which one of these has the same order as this one "+Arrays.toString(array)+" ?");
 System.out.println(a+"."+Arrays.toString(arraya));
 System.out.println(b+"."+Arrays.toString(arrayb));
 System.out.println(c+"."+Arrays.toString(arrayc));
 System.out.println("\n");
 System.out.println("Answer with Capital Letters");

  answer= input.next().charAt(0);
   if(answer==b)
        System.out.println("Correct");
         if(answer==a||answer==c)   
        System.out.println("Wrong");
}
if(r==1){
  double q1= (int) (Math.random()*50);
double q2= (int) (Math.random()*50);
    double avq=(q1+q2)/2;
     double q1b= (int) (Math.random()*50);
double q2b= (int) (Math.random()*50);
 double q1c= (int) (Math.random()*50);
double q2c= (int) (Math.random()*50);
     double avqb=(q1b+q2b)/2;
      double avqc=(q1c+q2c)/2;
    array[0]=n2;
    array[1]=av;
    array[2]=n1;
    
    arraya[0]=q2;
    arraya[1]=avq;
    arraya[2]=q1;
    
    arrayb[0]=q1b;
    arrayb[1]=q2b;
    arrayb[2]=avqb;
   
    arrayc[0]=avqc;
    arrayc[1]=q2c;
    arrayc[2]=q1c;
 System.out.println("Which one of these has the same order as this one "+Arrays.toString(array)+" ?");
 System.out.println(a+"."+Arrays.toString(arraya));
 System.out.println(b+"."+Arrays.toString(arrayb));
 System.out.println(c+"."+Arrays.toString(arrayc));
 System.out.println("\n");
 System.out.println("Answer with Capital Letters");
  answer= input.next().charAt(0);
   if(answer==a)
        System.out.println("Correct");
         if(answer==c||answer==b)   
        System.out.println("Wrong");

}
if(r==2){
  double q1= (int) (Math.random()*50);
double q2= (int) (Math.random()*50);
    double avq=(q1+q2)/2;
     double q1b= (int) (Math.random()*50);
double q2b= (int) (Math.random()*50);
 double q1c= (int) (Math.random()*50);
double q2c= (int) (Math.random()*50);
     double avqb=(q1b+q2b)/2;
      double avqc=(q1c+q2c)/2;
    array[0]=n2;
    array[1]=n1;
    array[2]=av;
    
    arraya[0]=avqb;
    arraya[1]=q2b;
    arraya[2]=q1b;
    
    arrayb[0]=q2c;
    arrayb[1]=avqc;
    arrayb[2]=q1;
   
    arrayc[0]=q2;
    arrayc[1]=q1;
    arrayc[2]=avq;
 System.out.println("Which one of these has the same order as this one "+Arrays.toString(array)+" ?");
 System.out.println(a+"."+Arrays.toString(arraya));
 System.out.println(b+"."+Arrays.toString(arrayb));
 System.out.println(c+"."+Arrays.toString(arrayc));
 System.out.println("\n");
 System.out.println("Answer with Capital Letters");
  answer= input.next().charAt(0);
   if(answer==c)
        System.out.println("Correct");
         if(answer==a||answer==b)   
        System.out.println("Wrong");

}
System.out.println("Try another one? answer with yes or no");
    ac=input.next();   
}while(ac.equals("yes"));
    if(!ac.equals("yes"))
     System.exit(0); 
    
}
    break;
    }
    }

     public static int factorial(int a){
    int total=1;
   for(int i=1;i<=a;a--){
    total*=a;
   }
    return total;
}
public static int factorialb(int b){
   int total=1;
   for(int i=1;i<=b;b--){
    total*=b;
   }
    return total;
}
}




