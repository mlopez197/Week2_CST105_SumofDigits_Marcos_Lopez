/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecxercise2;

/**
 *
 * @author marcosalopez
 */
public class Ecxercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = 12345;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
    
}
