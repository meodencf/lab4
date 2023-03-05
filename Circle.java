
package baiap2;
 
public class Circle {
    public double radius;
    public String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }      

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
        
    }
    public double getArea(){
       return this.radius*radius*3.14;
    }
    @Override
    public String toString(){
        return "(area="+getArea()+")";
    }
}
