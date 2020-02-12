package ua.lviv.lgs.max;

import java.security.KeyStore;
import java.util.*;

public class Map <K,V> {

    private HashMap<K, V> map = new HashMap<>();

//    public Map(Object obg1, Object obg2) {
//        super(obg1, obg2);
//    }

    public void addNewObject(K obg1, V obg2){
        map.put(obg1,obg2);
    }

    public void removeByKey(K obg1){
        map.remove(obg1);
    }


    public void removeByValue(Object obg2){
        map.values().remove(obg2);

    }

    public void showSetKey(){
        Set<String> keys = (Set<String>) map.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k);
        }
    }

    public List showListValue(){
        List<Integer> value = new ArrayList<>();
        for (V s : map.values()) {
            int v = Integer.parseInt(String.valueOf(s)); //  тото s ПЕРЕВОДИМО ПЕРШЕ В String
            value.add(v);
        }
        return value;
    }

    public void showMap(){
        System.out.println(Arrays.asList(map));
    }


}
