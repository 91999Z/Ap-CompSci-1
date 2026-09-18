
/**
 * The CalculationsV4 class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author Evan Dockter
 * @ version9/18/2026
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        //variables here
        
        //addition values
        int addNum1 = 25;
        int addNum2 = 9;
        
        //subtraction values
        int subNum1 = 11;
        int subNum2 = 9;
        int subNum3 = 25;
        
        //multiplication values
        int multNum1 = 25;
        int multNum2 = 9;
        
        //division values
        int divNum1 =9;
        int divNum2  = 25;
        
        //modulus values
        int modNum1 = 11;
        int modNum2 =9;
        
        //aditional Equations values
        int ae1 =43;
        int ae2 =67;
        int eq1A;
        int ae3 =12;
        int ae4 =92;
        int ae5 =30;
        int ae6 =72;
        
        
        
        
        // Addition
        System.out.println("Addition");
        System.out.print( addNum1 + " + " + addNum2 + " = ");
        System.out.println(addNum1 + addNum2);
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( subNum1 + "-" + subNum2 + "-" + subNum3 + "= " + (subNum1 - subNum2 - subNum3));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(multNum1 + "*" + multNum2 + "= " + (multNum1 * multNum2)); 
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(divNum1 + "/" + divNum2 + "= " + (divNum1 / divNum2));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(modNum1 + "%" + modNum2 + "= " + (modNum1 % modNum2));
        //eq1A = (modNum1 % modNum2);
        System.out.println();
        
        // 1.04 Additional int Equations
        
        System.out.println("1.04 Aditional Equations" );
        System.out.println();
        
        //EQ 1
        System.out.println("EQ1");
        System.out.println("("+ ae1 + "+" + ae2 + ")" + "%" + ae1 + "= " + (eq1A = (ae1 + ae2) % ae1));
        System.out.println();
        
        //EQ2
        System.out.println("EQ2");
        System.out.println((ae3 + "/" + ae4 + "/" + eq1A + "= " + (ae3 * ae4 / eq1A)));
        System.out.println();
        
        //EQ3
        System.out.println("EQ3");
        System.out.println("umm "+ ae5 + "-" + ae6 + "= " + (ae5 / ae6)+ "?");
        System.out.println("No silly "+ ae5 + "-" + ae6 + "= " + (ae5 - ae6));
        
        
    } // end of main method
} // end of class
