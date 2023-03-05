
package baiap2;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height=height;
    }  

    public double getHeight(){
        return this.height;
    }
     public void setHeight(double height){
        this.height=height;
    }
     public double getVolume(){
         return getArea()*height;
     }
    
}
