//Jamison Wilkes
//Program 5-Compound Propositions
import javax.swing.*;
public class CompoundProposition
{
   public static void main(String[] args)
   {
      String[][] PropArray = {{"p", "q", "x"},
                          {"T", "T", "x"},
                          {"T", "F", "x"},
                          {"F", "T", "x"},
                          {"F", "F", "x"}};
      String answer = null;
      String notP = null;
      String notQ = null;
      
      answer = JOptionPane.showInputDialog("Do you want to AND or OR the two propositional values?");
      
      notP = JOptionPane.showInputDialog("Do you want to NOT p?Y/N");
      
      notQ = JOptionPane.showInputDialog("Do you want to NOT q?Y/N");
      
      if(answer.equals("AND") && notP.equals("Y") && notQ.equals("Y"))
         {
         PropArray[0][2] = "~pA~q";
         PropArray[1][2] = "F";
         PropArray[2][2] = "F";
         PropArray[3][2] = "F";
         PropArray[4][2] = "T";
         }
      if(answer.equals("AND") && notP.equals("Y") && notQ.equals("N"))
         {
         PropArray[0][2] = "~pAq";
         PropArray[1][2] = "F";
         PropArray[2][2] = "F";
         PropArray[3][2] = "T";
         PropArray[4][2] = "F";
         }
       if(answer.equals("AND") && notP.equals("N") && notQ.equals("Y"))
         {
         PropArray[0][2] = "pA~q";
         PropArray[1][2] = "F";
         PropArray[2][2] = "T";
         PropArray[3][2] = "F";
         PropArray[4][2] = "T";
         }
       if(answer.equals("AND") && notP.equals("N") && notQ.equals("N"))
         {
         PropArray[0][2] = "pAq";
         PropArray[1][2] = "T";
         PropArray[2][2] = "F";
         PropArray[3][2] = "F";
         PropArray[4][2] = "F";
         }
       if(answer.equals("OR") && notP.equals("Y") && notQ.equals("Y"))
         {
         PropArray[0][2] = "~pv~q";
         PropArray[1][2] = "F";
         PropArray[2][2] = "T";
         PropArray[3][2] = "T";
         PropArray[4][2] = "T";
         }
       if(answer.equals("OR") && notP.equals("Y") && notQ.equals("N"))
         {
         PropArray[0][2] = "~pvq";
         PropArray[1][2] = "T";
         PropArray[2][2] = "F";
         PropArray[3][2] = "T";
         PropArray[4][2] = "T";
         }
        if(answer.equals("OR") && notP.equals("N") && notQ.equals("Y"))
         {
         PropArray[0][2] = "pv~q";
         PropArray[1][2] = "T";
         PropArray[2][2] = "T";
         PropArray[3][2] = "T";
         PropArray[4][2] = "T";
         }
         if(answer.equals("OR") && notP.equals("N") && notQ.equals("N"))
         {
         PropArray[0][2] = "pvq";
         PropArray[1][2] = "T";
         PropArray[2][2] = "T";
         PropArray[3][2] = "T";
         PropArray[4][2] = "F";
         }
         
      for (int i = 0; i < 5; i++) { 
           for (int j = 0; j < 3; j++) { 
                System.out.print(PropArray[i][j] + " "); 
            } 
         System.out.println();
         }
              
}
}