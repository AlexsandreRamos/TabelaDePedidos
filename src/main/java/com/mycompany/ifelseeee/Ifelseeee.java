
package com.mycompany.ifelseeee;

import java.util.Scanner;

public class Ifelseeee {

    public static void main(String[] args) {
       
        /*Scanner teclado = new Scanner(System.in);
        
        int numero,numero1;
        
        System.out.println("Escolha um numero aleatorio negativo ou positivo:");
        
       numero = teclado.nextInt();
        
        if (numero < 0){
            System.out.printf("o numero é negativo e ");
            
        }
        else 
          
            System.out.printf("o numero é positivo e ");
        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        if (numero %2 == 0){
            System.out.println("par");
        }
        else{
            System.out.println("impar");
        }      
        */
       
        Scanner teclado = new Scanner(System.in);
        
        String enter;
        int pedido, quantidade; 
        double total;
        
        System.out.printf(
                 " 1  | Cachorro Quente | R$4.00 \n "
                + "2  |     X-Salada    | R$4.50 \n "
                + "3  |     X-Bacon     | R$5.00 \n "
                + "4  | Torrada Simples | R$2.00 \n "
                + "5  |   Refrigerante  | R$3.00 \n ");
        
        System.out.println("pressione o enter para continuar:");
        enter = teclado.nextLine();
       
         
  
     
        System.out.println("Escreva o numero do pedido:");
        
        pedido = teclado.nextInt();
        
        if ( pedido == 1){
            
            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 4.00;
            System.out.printf("Seu/s %d cachorro/s quente/s saiu: R$%.2f",quantidade,total);
        }
        else{
        if ( pedido == 2){
            
            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 4.50;
            System.out.printf("Seu/s %d X-Salada saiu: R$%.2f",quantidade,total);
        }
        else{
        if ( pedido == 3){
            
            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 5.00;
            System.out.printf("Seu/s %d X-Bacon saiu: R$%.2f",quantidade,total);
            
        }
        else{
        if ( pedido == 4){
            
            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 2.00;
            System.out.printf("Seu/s %d Torrada/s simples saiu: R$%.2f",quantidade,total);
        }
        else{
        if ( pedido == 5){
            
            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 3.00;
            System.out.printf("Seu/s %d Refrigerante/s saiu: R$%.2f",quantidade,total);
        }
        
        }}}}
            
                
       
        
        
        
        
    }
    
}
