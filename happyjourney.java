import java.util.*;
import java.time.*;
abstract class happyjourney{
    static String uname;
        static float km,t;
    static int m,d;
         static Scanner sc= new Scanner(System.in);
    static void userdetail(){
      star();
        System.out.println("Enter user name:");
        uname= sc.next();
        try{System.out.println("Enter your approximate kilometers of travel:");
        km= sc.nextFloat();    
    }
    catch(InputMismatchException ie){
      System.out.println("Only accepts input as numbers. Enter again.");
    }
        System.out.println("Month of Travel");
        m= sc.nextInt();
        while(m<1 || m>12){
          System.out.println("Please enter correct month between 1 to 12");
          System.out.println("Month of Travel");
        m= sc.nextInt();
        }
        System.out.println("On which date of this month do you want to travel!!");
        d= sc.nextInt();
        while(d<1 ||d>31 ){
          System.out.println("Invalid date. Please enter again");
          System.out.println("On which date of this month do you want to travel!!");
        d= sc.nextInt();
        }
        System.out.println("Now enter the time of travel using 24hr clock just like 9:00 for 9:00am, 13:00 for 1:00pm, 14:30 for 2:30pm,etc.");
        t=sc.nextFloat();
        while(t<0.00 || t>23.59 ){
          System.out.println(" PLease enter correct time ");
          System.out.println("Now enter the time of travel using 24hr clock just like 9:00 for 9:00am, 13:00 for 1:00pm, 14:30 for 2:30pm,etc.");
          t=sc.nextFloat();
        }
        star();
        return;
    }
    public static void star(){
        for(int i=0; i<99; i++){
            System.out.print("*");
        }
        System.out.println("\n");
    }
    
  
    public static void main(String args[])throws Exception {
         
       star();
        System.out.println("\nWELCOME TO RIDE-SHARING CHARGES ESTIMATOR AND COMPARISON SYSTEM");
        System.out.println("Developed by Gaurav Gaba(PRN:1132220177)");
        System.out.println("OODP101 Object Oriented Design and Programming");
        Date date1= new Date(System.currentTimeMillis());
        System.out.println(date1);
        System.out.println("");
        star();
          int a;
          do{
        System.out.println("");
        System.out.println("1. Enter user details");
        System.out.println("2. Display charges under OLA");
        System.out.println("3. Display charges under UBER");
        System.out.println("4. Display charges under MERU");
        System.out.println("5. Show Report");
        System.out.println("6. Exit");
        a= sc.nextInt();
        
          switch(a){
            case 1:
            userdetail();
            break;
            case 2:
            ola();
            break;
            case 3:
            uber();
            break;
            case 4:
            meru();
            break;
            case 5:
            showreport();
            break;
            case 6: 
            star();
            System.out.println("Thank you "+uname+ " for using the services. \n All the values have been reset to zero or null.\n Good Bye...." );
            break;
            default: 
            System.out.println("Wrong choice entered. Please enter the input again.");
          }
          }while(a!=6);
    }
    static float charge1;
    static void ola()
    {     
      if(uname == null){
        System.out.println("To know the charges please enter userdetails ");
        userdetail();
      }
      else{
        float ws1;
        float ts1;
        LocalDate ld=LocalDate.of(2022, m, d);
        DayOfWeek dy=ld.getDayOfWeek();
        star();
       System.out.println("Your travel details:- Day of the week on "+ld+" is "+dy);
              if(dy.getValue()==6 || dy.getValue()==7){
                  ws1=(float) 3.00; 
                    System.out.println("Your day of travel falls in weekend category.");
              }
              else{
                ws1=(float) 0;
                System.out.println("Your day of travel does not fall under weekend category.");
              }
              if((t>=7 && t<=9) || (t>=16 && t<=18))
              {
                 ts1=(float) 2.5;
                 System.out.println("Time falls in peaktime category ");
              }
              else{
                ts1=(float) 0;
                System.out.println(" Time doesn't fall in peaktime category ");
              }
              charge1=(float) (5.5)+ (float) (0.75*km) +ts1 +ws1;
              System.out.println("So charges will be applied accordingly");
              System.out.println("The final charges under OLA is: "+charge1);
         star();
        return;
            }
    }
    static float charge2;
    static void uber(){
      if(uname== null){
        System.out.println("To know the charges please enter userdetails ");
        userdetail();
      }
      else{
      float ws2;
      float ts2;
      
      LocalDate ld=LocalDate.of(2022, m, d);
      DayOfWeek dy=ld.getDayOfWeek();
      star();
     System.out.println("Your travel details:- Day of the week on "+ld+" is "+dy);
            if(dy.getValue()==6 || dy.getValue()==7){
                ws2=(float) 2.5; 
                  System.out.println("Your day of travel falls in weekend category.");
            }
            else{
              ws2=(float) 0;
              System.out.println("Your day of travel does not fall under weekend category.");
            }
            if((t>=7 && t<=9) || (t>=16 && t<=18))
            {
               ts2=(float) 2;
               System.out.println("Time falls in peaktime category ");
            }
            else{
              ts2=(float) 0;
              System.out.println(" Time doesn't fall in peaktime category ");
            }
            charge2=(float) (4.5)+ (float) (0.85*km) +ts2 +ws2;
            System.out.println("So charges will be applied accordingly");
            System.out.println("The final charges under UBER is: "+charge2);
           star();
           return;
          }
  }
  static float charge3;
  static void meru(){
    if(uname== null){
      System.out.println("To know the charges please enter userdetails ");
      userdetail();
    }
    else{
    float ws3;
      float ts3;
  
      LocalDate ld=LocalDate.of(2022, m, d);
      DayOfWeek dy=ld.getDayOfWeek();
      star();
     System.out.println("Your travel details:- Day of the week on "+ld+" is "+dy);
            if(dy.getValue()==6 || dy.getValue()==7){
                ws3=(float) 3; 
                  System.out.println("Your day of travel falls in weekend category.");
            }
            else{
              ws3=(float) 0;
              System.out.println("Your day of travel does not fall under weekend category.");
            }
            if((t>=7 && t<=9) || (t>=16 && t<=18))
            {
               ts3=(float) 1;
               System.out.println("Time falls in peaktime category ");
            }
            else{
              ts3=(float) 0;
              System.out.println(" Time doesn't fall in peaktime category ");
            }
            charge3=(float) (6.5)+ (float) (0.65*km) +ts3 +ws3;
            System.out.println("So charges will be applied accordingly");
            
            System.out.println("The final charges under MERU is: "+charge3);
           star();
           return;
          }
  }
         static void olacal(){
          float ws1;
          float ts1;
         LocalDate ld=LocalDate.of(2022, m, d);
          DayOfWeek dy=ld.getDayOfWeek();
                if(dy.getValue()==6 || dy.getValue()==7){
                    ws1=(float) 3.00; 
                }
                else{
                  ws1=(float) 0;
                }
                if((t>=7 && t<=9) || (t>=16 && t<=18))
                {
                   ts1=(float) 2.5;
                }
                else{
                  ts1=(float) 0;
                }
                charge1=(float) (5.5)+ (float) (0.75*km) +ts1 +ws1;
          return;
       }
       static void ubercal(){
        float ws2;
        float ts2;
        LocalDate ld=LocalDate.of(2022, m, d);
        DayOfWeek dy=ld.getDayOfWeek();
              if(dy.getValue()==6 || dy.getValue()==7){
                  ws2=(float) 2.5; 
              }
              else{
                ws2=(float) 0;
              }
              if((t>=7 && t<=9) || (t>=16 && t<=18))
              {
                 ts2=(float) 2;
              }
              else{
                ts2=(float) 0;
              }
              charge2=(float) (4.5)+ (float) (0.85*km) +ts2 +ws2;
             return;
    }
    static void merucal(){
      float ws3;
        float ts3;
        LocalDate ld=LocalDate.of(2022, m, d);
        DayOfWeek dy=ld.getDayOfWeek();
              if(dy.getValue()==6 || dy.getValue()==7){
                  ws3=(float) 3; 
              }
              else{
                ws3=(float) 0;
              }
              if((t>=7 && t<=9) || (t>=16 && t<=18))
              {
                 ts3=(float) 1;
              }
              else{
                ts3=(float) 0;
              }
              charge3=(float) (6.5)+ (float) (0.65*km) +ts3 +ws3;
              
             return;
    }

  static void showreport(){
                 olacal();
                 ubercal();
                 merucal();
                 star();
                 if(charge1>charge2 &&charge1>charge3){
                  System.out.println("The most expensive company is OLA, total charges: "+charge1);
                 }
                 else if(charge2>charge1 &&charge2>charge3){
                  System.out.println("The most expensive company is UBER, total charges: "+charge2);
                 }
                 else if(charge3>charge1 && charge3> charge2){
                  System.out.println("The most expensive company is MERU, total charges: "+charge3);
                 }
                 if(charge3<charge1 && charge3< charge2){
                  System.out.println("The cheapest is MERU, total charges: "+charge3);
                 }
                 else if(charge2<charge1 &&charge2<charge3){
                  System.out.println("The cheapest company is UBER, total charges: "+charge2);
                 }
                 else if(charge1<charge2 &&charge1<charge3){
                  System.out.println("The cheapest company is OLA, total charges: "+charge1);
                 }
                 star();
    }
  }



