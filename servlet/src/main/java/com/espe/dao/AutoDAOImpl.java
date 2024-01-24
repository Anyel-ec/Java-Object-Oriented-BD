package com.espe.dao;

import com.espe.idao.IAutoDAO;
import com.espe.model.Auto;
import com.espe.util.MemoryStore;

import java.util.List;

public class AutoDAOImpl implements IAutoDAO {

    @Override
    public void add(Auto auto) {
        MemoryStore.addAuto(auto);
    }

    @Override
    public void update(Auto auto) {
        MemoryStore.editAuto(auto);
    }

    @Override
    public List<Auto> get() {
        return MemoryStore.getAutos();
    }

    @Override
    public Auto getAuto(String placa) {
        return MemoryStore.getAuto(placa);
    }
}
