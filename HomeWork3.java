package Java.HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;

public class HomeWork3 {
    public static void main(String[] args){
        Random random = new Random();
        int size = 20;
        ArrayList<Integer> arrayList = new ArrayList<>(100);
            for (int i = 0; i < size; i++){
                arrayList.add(random.nextInt(0, 100));
         }
        System.out.println(arrayList);
        System.out.println("Минимальное значение списка равно: " + Collections.min(arrayList));
        System.out.println("Максимальное значение списка равно: " + Collections.max(arrayList));
        
        double sum = 0;
            for (double m : arrayList){
                sum += m;
            }
        double avg = sum / size;
        
        System.out.println("Среднее значение списка равно: " + avg);
        
        Iterator<Integer> it = arrayList.iterator();
 
            while (it.hasNext())
        {
            if (it.next() % 2 == 0) {    
                it.remove();
            }
        }   
        System.out.println("Список без четных чисел:");
        System.out.println(arrayList);
    }
}
