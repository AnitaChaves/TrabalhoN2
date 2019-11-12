/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhon2;

/**
 *
 * @author USUARIO
 */
public class Circulo extends FiguraGeometrica {
    
    private double r;
    
    
    
    @Override
 public double calcArea(){
     
     super.setArea((r*r)*3.14);
     
     return super.getArea();
     
 }
 
    @Override
 public double calcPerimetro(){
     
     super.setPerimetro(2*3.14*r);
     
     return super.getPerimetro();
    
}
 public double r(){
     
     return r;
 }
 
 public void setR(double r){
     this.r = r;
 }
 
}