package com.espe.util;


import com.espe.model.Auto;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class MemoryStore {
    private  static HashMap<String, Auto> autos = new HashMap<>();
    public static void addAuto(Auto auto){
        String placa = auto.getPlaca();
        if (autos.containsKey(placa)){
            autos.remove(placa);
        }
        autos.put(placa, auto);
    }
    // actualizar el auto
    public static void editAuto(Auto auto){
        autos.replace(auto.getPlaca(), auto);
    }
    // listrar los autos del almacen
    public static List <Auto> getAutos(){
        return new ArrayList<>(autos.values());
    }
    // obtener un auto por su placa
    public static Auto getAuto(String placa){
        return autos.get(placa);
    }

}

