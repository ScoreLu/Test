package xo;
class Cylinder implements C {
private double radius;
private double height;
private String color;
public Cylinder(double radius, double height, String color){
this.radius = radius;
this.height = height;
this.color = color;
}

public void setColor(String c){
this.color = c;
}

public String getColor(){
return this.color;
}

public double area(){
return PI*radius*radius;
}

public void volume(){
System.out.println("圆柱体的体积为："+this.area()*this.height);
}

}
