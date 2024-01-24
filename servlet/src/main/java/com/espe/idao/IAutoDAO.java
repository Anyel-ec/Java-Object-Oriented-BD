package com.espe.idao;

import com.espe.model.Auto;

import java.util.List;

public interface IAutoDAO {
    // insertar un nuevo auto
    void add (Auto auto);
    // actualizar un auto
    void update (Auto auto);
    // listar los autos del memoryStore
    List<Auto> get();
    // obtener un auto por su placa
    Auto getAuto(String placa);
}
