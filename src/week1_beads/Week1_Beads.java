/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_beads;

/**
 *
 * @author AndyR
 */
public class Week1_Beads {

    /**
     * @param args the command line arguments
     */
    // adding a comment for test
    private String color;
    private char letter;
    
    Week1_Beads()
    {
        color = "black";
        letter = 'b';
        //week1_Beads(String clr);
       
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String clr) {
        color = clr;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public static void main(String[] args) {
        int num1 = 0;
        for(int i=0; i>=50; i+=10)
            System.out.println(num1);
    }
        
    
}
