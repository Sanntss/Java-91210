/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;

public class Aula3 {

    public static void main(String[] args) {
      Caneta c1 = new Caneta();
      c1.cor = "verde";
      c1.ponta = 1.0f;
      c1.modelo = "Fabre-Castell";
      c1.destampar();
      c1.status();
      c1.rabiscar();
        System.out.println("\n");
      Caneta c2 = new Caneta();
      c2.cor = "preto";
      c2.modelo = "BIC";
      c2.ponta = 0.5f;
      c2.destampar();
      c2.status();
      c2.rabiscar();
           
      
              
    }
}
