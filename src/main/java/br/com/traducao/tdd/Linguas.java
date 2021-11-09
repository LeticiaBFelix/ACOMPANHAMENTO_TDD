package br.com.traducao.tdd;

import java.util.Map;
import java.util.Scanner;

public class Linguas {
    String pais;
    Map<String, String> linguas = new java.util.HashMap<>();

    public void adicionar(String key, String pais){
        linguas.put(key, pais);
    }

    public String encontrarTraducao(String pais1){
        //Scanner sr = new Scanner(System.in);
        //sr.nextLine();
        pais = pais1;
        if(linguas.containsKey(pais)){
            System.out.println(linguas.get(pais));
        }else{
            System.out.println("--- NOT FOUND ---");
        }
        return pais;
    }
}
