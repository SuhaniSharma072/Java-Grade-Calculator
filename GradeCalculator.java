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


            
       
    



     
        

  

   
        




    }




}