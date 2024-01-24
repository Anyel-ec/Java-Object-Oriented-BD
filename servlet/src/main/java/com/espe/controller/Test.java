package com.espe.controller;

import com.espe.dao.AutoDAOImpl;
import com.espe.model.Auto;

public class Test {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setPlaca("ABC-1234");
        auto1.setMarca("Toyota");
        auto1.setModelo("Corolla");
        auto1.setAnio("2018");
        auto1.setConsumo("Gasolina");


        // auto 2
        Auto auto2 = new Auto();
        auto2.setPlaca("DEF-5678");
        auto2.setMarca("Chevrolet");
        auto2.setModelo("Sail");
        auto2.setAnio("2019");
        auto2.setConsumo("Gasolina");


        // auto 3
        Auto auto3 = new Auto();
        auto3.setPlaca("GHI-9012");
        auto3.setMarca("Kia");
        auto3.setModelo("Rio");
        auto3.setAnio("2017");
        auto3.setConsumo("Gasolina");


        AutoDAOImpl oAutoDAO = new AutoDAOImpl();
        oAutoDAO.add(auto1);
        oAutoDAO.add(auto2);
        oAutoDAO.add(auto3);

        //listar todos los autos mediante el get
        for (Auto auto : oAutoDAO.get()) {
            System.out.println(auto);
        }


    }
}
