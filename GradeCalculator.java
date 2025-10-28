import java.util.*;

public class GradeCalculator
{
    public static void main(String [] args)
    {
        Scanner kb= new Scanner(System.in);

        //TITLE BOX W/ GRADUATION CAP EMOJIS
        System.out.println("\t\t\t╔═══════════════════════════════════════╗");
        System.out.println("\t\t\t║             GRADE CALCULATOR          ║");
        System.out.println("\t\t\t╚═══════════════════════════════════════╝");
        System.out.println();


        //CLASS 1 INPUT 
        System.out.print("Enter the name of the first class -->");
        String firstclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage1=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight1= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage1=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight1=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage1,majorweight1);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage1,minorweight1);
       
        double majorcontribution1 = majorweight1/100*majoraverage1;
        double minorcontribution1 = minorweight1/100*minoraverage1;
        double finalGrade1= majorcontribution1+minorcontribution1;
        System.out.printf("My final grade in %s is %.1f%%.",firstclass,finalGrade1);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade1>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade1 >=93 && finalGrade1 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade1 >=90 && finalGrade1 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade1 >=87 && finalGrade1 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade1 >=83 && finalGrade1 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade1 >=80 && finalGrade1 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade1 >=77 && finalGrade1 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade1 >=73 && finalGrade1 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade1 >=70 && finalGrade1 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }




     //CLASS 2 INPUT 
        kb.nextLine(); // clear leftover newline from previous nextDouble
        System.out.print("Enter the name of the second class -->");
        String secondclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage2=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight2= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage2=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight2=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage2,majorweight2);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage2,minorweight2);
       
        double majorcontribution2 = majorweight2/100*majoraverage2;
        double minorcontribution2 = minorweight2/100*minoraverage2;
        double finalGrade2= majorcontribution2+minorcontribution2;
        System.out.printf("My final grade in %s is %.1f%%.",secondclass,finalGrade2);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade2>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade2 >=93 && finalGrade2 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade2 >=90 && finalGrade2 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade2 >=87 && finalGrade2 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade2 >=83 && finalGrade2 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade2 >=80 && finalGrade2 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade2 >=77 && finalGrade2 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade2 >=73 && finalGrade2 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade2 >=70 && finalGrade2 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }



     //CLASS 3 INPUT 
        kb.nextLine(); // clear leftover newline from previous nextDouble
        System.out.print("Enter the name of the third class -->");
        String thirdclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage3=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight3= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage3=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight3=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage3,majorweight3);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage3,minorweight3);
       
        double majorcontribution3 = majorweight3/100*majoraverage3;
        double minorcontribution3 = minorweight3/100*minoraverage3;
        double finalGrade3= majorcontribution3+minorcontribution3;
        System.out.printf("My final grade in %s is %.1f%%.",thirdclass,finalGrade3);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade3>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade3 >=93 && finalGrade3 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade3 >=90 && finalGrade3 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade3 >=87 && finalGrade3 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade3 >=83 && finalGrade3 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade3 >=80 && finalGrade3 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade3 >=77 && finalGrade3 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade3 >=73 && finalGrade3 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade3 >=70 && finalGrade3 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }


     //CLASS 4 INPUT 
        kb.nextLine(); // clear leftover newline from previous nextDouble
        System.out.print("Enter the name of the fourth class -->");
        String fourthclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage4=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight4= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage4=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight4=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage4,majorweight4);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage4,minorweight4);
       
        double majorcontribution4 = majorweight4/100*majoraverage4;
        double minorcontribution4 = minorweight4/100*minoraverage4;
        double finalGrade4= majorcontribution4+minorcontribution4;
        System.out.printf("My final grade in %s is %.1f%%.",fourthclass,finalGrade4);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade4>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade4 >=93 && finalGrade4 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade4 >=90 && finalGrade4 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade4 >=87 && finalGrade4 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade4 >=83 && finalGrade4 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade4 >=80 && finalGrade4 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade4 >=77 && finalGrade4 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade4 >=73 && finalGrade4 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade4 >=70 && finalGrade4 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }



     //CLASS 5 INPUT 
        kb.nextLine(); // clear leftover newline from previous nextDouble
        System.out.print("Enter the name of the fifth class -->");
        String fifthclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage5=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight5= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage5=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight5=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage5,majorweight5);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage5,minorweight5);
       
        double majorcontribution5 = majorweight5/100*majoraverage5;
        double minorcontribution5 = minorweight5/100*minoraverage5;
        double finalGrade5= majorcontribution5+minorcontribution5;
        System.out.printf("My final grade in %s is %.1f%%.",fifthclass,finalGrade5);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade5>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade5 >=93 && finalGrade5 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade5 >=90 && finalGrade5 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade5 >=87 && finalGrade5 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade5 >=83 && finalGrade5 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade5 >=80 && finalGrade5 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade5 >=77 && finalGrade5 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade5 >=73 && finalGrade5 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade5 >=70 && finalGrade5 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }


     //CLASS 6 INPUT 
        kb.nextLine(); // clear leftover newline from previous nextDouble
        System.out.print("Enter the name of the sixth class -->");
        String sixthclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage6=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight6= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage6=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight6=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage6,majorweight6);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage6,minorweight6);
       
        double majorcontribution6 = majorweight6/100*majoraverage6;
        double minorcontribution6 = minorweight6/100*minoraverage6;
        double finalGrade6= majorcontribution6+minorcontribution6;
        System.out.printf("My final grade in %s is %.1f%%.",sixthclass,finalGrade6);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade6>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade6 >=93 && finalGrade6 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade6 >=90 && finalGrade6 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade6 >=87 && finalGrade6 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade6 >=83 && finalGrade6 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade6 >=80 && finalGrade6 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade6 >=77 && finalGrade6 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade6 >=73 && finalGrade6 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade6 >=70 && finalGrade6 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }


      
            
       
     //CLASS 7 INPUT 
        kb.nextLine(); // clear leftover newline from previous nextDouble
        System.out.print("Enter the name of the seventh class -->");
        String seventhclass =kb.nextLine();
        System.out.print("Enter your major grade average -->");
        double majoraverage7=kb.nextDouble();
        System.out.print("Enter the weight for the major grade -->");
        double majorweight7= kb.nextDouble();
        System.out.print("Enter your minor grade average -->");
        double minoraverage7=kb.nextDouble();
        System.out.print("Enter the weight for the minor grade -->");
        double minorweight7=kb.nextDouble();
        //System.out.println("My major grade average is "+majoraverage+" and the weight is "+majorweight+"%.\n");
        System.out.printf("My major grade average is %.1f and the weight is %.0f%%.\n",majoraverage7,majorweight7);
        //System.out.println("My minor grade average is "+minoraverage+" and the weight is "+minorweight+"%.\n");
        System.out.printf("My minor grade average is %.1f and the weight is %.0f%%.\n\n",minoraverage7,minorweight7);
       
        double majorcontribution7 = majorweight7/100*majoraverage7;
        double minorcontribution7 = minorweight7/100*minoraverage7;
        double finalGrade7= majorcontribution7+minorcontribution7;
        System.out.printf("My final grade in %s is %.1f%%.",seventhclass,finalGrade7);

        //find the letter grade average
        //while loops are can be used to go on forever; if statements dont so change it to if
        if(finalGrade7>=97){
            System.out.println(" My letter grade is A+\n\n");
        } else if(finalGrade7 >=93 && finalGrade7 <=96){
            System.out.println(" My letter grade is A\n\n");
        } else if(finalGrade7 >=90 && finalGrade7 <= 92){
            System.out.println(" My letter grade is A-\n\n");
        } else if(finalGrade7 >=87 && finalGrade7 <=89){
            System.out.println(" My letter grade is B+\n\n");
        } else if(finalGrade7 >=83 && finalGrade7 <=86){
            System.out.println(" My letter grade is B\n\n");
        } else if(finalGrade7 >=80 && finalGrade7 <=82){
            System.out.println(" My letter grade is B-\n\n");
        } else if(finalGrade7 >=77 && finalGrade7 <=79){
            System.out.println(" My letter grade is C+\n\n");
        }else if(finalGrade7 >=73 && finalGrade7 <=76){
            System.out.println(" My letter grade is C\n\n");
        }else if(finalGrade7 >=70 && finalGrade7 <=72){
            System.out.println(" My letter grade is C-\n\n");
        }else{
            System.out.println(" My letter grade is F\n\n");
        }


     
        

  

   
        




    }




}