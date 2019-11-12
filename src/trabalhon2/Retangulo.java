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
public class Retangulo extends FiguraGeometrica {
    
    private double largura;
    private double altura;
    
    
    @Override
     public double calcArea(){
        
        super.setArea (altura*largura);
        
        return super.getArea();
        
    }
    
    @Override
       public double calcPerimetro(){
        
        super.setArea (altura + altura + largura + largura );
        
        return super.getPerimetro();
        
    }
    

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    }
    
