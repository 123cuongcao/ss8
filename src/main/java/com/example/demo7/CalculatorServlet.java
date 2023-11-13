package com.example.demo7;

import com.example.demo7.entity.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String operator = request.getParameter("operator");
//        switch(action){
////            case "MULTIPLY":
////                double FO = Double.parseDouble(request.getParameter("FO"));
////                double SO = Double.parseDouble(request.getParameter("SO"));
////                double result = FO*SO;
////                request.setAttribute("result",result);
////                request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
////                break;
////            case "DIVIDE":
////                double FO1 = Double.parseDouble(request.getParameter("FO"));
////                double SO1 = Double.parseDouble(request.getParameter("SO"));
////                double result1 = FO1/SO1;
////                request.setAttribute("result",result1);
////                request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
////                break;
////            case "PLUS":
////                double FO2 = Double.parseDouble(request.getParameter("FO"));
////                double SO2 = Double.parseDouble(request.getParameter("SO"));
////                double result2 = FO2+SO2;
////                request.setAttribute("result",result2);
////                request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
////                break;
////            case "MINUS":
////                double FO3 = Double.parseDouble(request.getParameter("FO"));
////                double SO3 = Double.parseDouble(request.getParameter("SO"));
////                double result3 = FO3-SO3;
////                request.setAttribute("result",result3);
////                request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
////                break;
//        }
        double FO = Double.parseDouble(request.getParameter("FO"));
        double SO = Double.parseDouble(request.getParameter("SO"));
        double result = Calculator.calculate(FO,SO,operator);
        request.setAttribute("result",result);
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}