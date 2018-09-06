/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class Square extends Shape{
    
    int length;
    
    public Square(String name) {
        super(name);
    }
    
    public void setDimensions(int x){
        this.length = x;
    }
    
    public void printDimensions(){
        System.out.println(this.length);
    }
    
    public double getArea(){
        return this.length * this.length;
    }
    
}
