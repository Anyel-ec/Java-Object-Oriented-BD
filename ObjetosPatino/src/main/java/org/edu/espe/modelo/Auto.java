package org.edu.espe.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

    @Entity
    public class Auto {
        String marca;
        @Id
        String placa;
        String modelo;
        String version;
        LocalDate anioFabricacion;

        public Auto(String marca, String placa, String modelo, String version, LocalDate anioFabricacion) {
            this.marca = marca;
            this.placa = placa;
            this.modelo = modelo;
            this.version = version;
            this.anioFabricacion = anioFabricacion;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public LocalDate getAnioFabricacion() {
            return anioFabricacion;
        }

        public void setAnioFabricacion(LocalDate anioFabricacion) {
            this.anioFabricacion = anioFabricacion;
        }

        @Override
        public String toString() {
            return "Auto{" +
                    "marca='" + marca + '\'' +
                    ", placa='" + placa + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", version='" + version + '\'' +
                    ", Año de Fabricacion=" + anioFabricacion +
                    '}';
        }
    }


