package Udemy.Code.Colections.Map;

import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // ordenação alfabetica.
        Map<String, String> cookies = new TreeMap<>();
        //            k e y      v a l u e
        cookies.put("username",  "maria");
        cookies.put("email",  "maria@gmail.com");
        cookies.put("phone",  "996278359");

        cookies.remove("email");
        // repetição SOBRESCREVE
        cookies.put("phone",  "998");
       
        System.out.println(cookies.containsKey("phone")? "Sim" : "Não");

        // QUANDO NÃO EXISTE RETORNA NULO
        System.out.println("Phone Number: " + cookies.get("phone"));



        System.out.println("ALL COOKIES");
        // retorna um set e percorre
        for (String key : cookies.keySet()) {
            System.out.println("key: " + cookies.get(key));
            
        }


    
    }
}
