
package hashtimecount;
import java.util.*;

public class HashTimeCount {

    public static void main(String[] args) {
        HashMap<Integer,String> pessoaHashMap = 
                new HashMap<>();
        ArrayList<Integer> pessoaArray = 
                new ArrayList<>();
        LinkedList<Integer> pessoaLinkedList =
                new LinkedList<>();
        
        
        for(int i=0;i<200000;i++){
            pessoaHashMap.put(i, "Pessoa "+i);
            pessoaArray.add(i);
            pessoaLinkedList.add(i);
        }
        
        // hash
        long tempoInicial = 
                System.currentTimeMillis();
        for(int i=0;i<200000;i++)
            pessoaHashMap.containsKey(i);
        long tempoFinal = 
                System.currentTimeMillis();
        System.out.printf("Tempo Hash:%.3f \n",
                (tempoFinal-tempoInicial)/1000.00);
       //--------------
       //Array
            tempoInicial = 
                System.currentTimeMillis();
        for(int i=0;i<200000;i++)
            pessoaArray.contains(i);
         tempoFinal = 
                System.currentTimeMillis();
        System.out.printf("Tempo Array:%.3f \n",
                (tempoFinal-tempoInicial)/1000.00);
        
        //LinkedList
            tempoInicial = 
                System.currentTimeMillis();
        for(int i=0;i<200000;i++)
            pessoaLinkedList.contains(i);
         tempoFinal = 
                System.currentTimeMillis();
        System.out.printf("Tempo LinkedList:%.3f \n",
                (tempoFinal-tempoInicial)/1000.00);
    }
    
}
