package com.espe.controller;

import java.io.*;

import com.espe.dao.AutoDAOImpl;
import com.espe.model.Auto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
// import Lis
import java.util.List;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // auto 1
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
        // Hello
        // lista de los autos
        List<Auto> listaAutos = oAutoDAO.get();
        request.setAttribute("listaAutos", listaAutos);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}