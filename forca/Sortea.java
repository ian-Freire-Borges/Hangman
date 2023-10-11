package com.mycompany.forca;

import java.util.Random;



public class Sortea {
    String palavraSorteada="";
    String palavraSorteadaB="";
    public void sortea(Palavras palavras){
        palavras.criapalavras();
        Random random = new Random();
        int x1 = random.nextInt(palavras.palavrasN.length);
        palavraSorteada=palavras.palavrasN[x1];
        palavraSorteadaB=palavras.palavrasBrutasv[x1];
        
        
        
        
        
    
    }
    
}
