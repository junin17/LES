/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.IOException; 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

public class ExibePaginaFlamengo implements Comando{
    
    public void execute(HttpServletRequest request, HttpServletResponse response) { 
        try { 
            RequestDispatcher d = request.getRequestDispatcher("/flamengo.jsp"); 
            d.forward(request,response); 
        } 
        catch (ServletException e) { 
            e.printStackTrace(); 
        } 
        catch (IOException e){
            e.printStackTrace(); 
        }
    }
    
}