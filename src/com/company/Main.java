package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cities> cities = new ArrayList<>();
        cities.add(new Cities(312 , "Bishkek"));
        cities.add(new Cities(3457 , "Bakai-Ata"));
        cities.add(new Cities(3222 , "Osh"));
        cities.add(new Cities(3459 , "Pokrovka"));
        cities.add(new Cities(3422 , "Talas"));
        cities.add(new Cities(3535 , "Kochkorka"));

        Set<Cities> treeSet = new TreeSet<>();
        HashSet<Cities> hashSet = new HashSet<>();


        for(int i = 0; i <cities.size() ; i++ ){
            if(cities.get(i).name.length() > 5){
                cities.remove(i);
            }
        }

        for(int i = 0; i < cities.size();i++){
            if(cities.get(i).code % 2 != 0){
                treeSet.add(cities.get(i));
            }
            else {
                hashSet.add(cities.get(i));
            }
        }


        System.out.println(hashSet);
        Iterator<Cities> it = ((TreeSet<Cities>) treeSet).descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
