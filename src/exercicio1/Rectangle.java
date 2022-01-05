package exercicio1;

public class Rectangle {
    public double widht;
    public double height;

    public double area(){
        return widht * height;
    }
    public double perimeter(){
        return (widht*2) + (height*2);
    }
    public double diagonal(){
        return Math.sqrt((widht*widht)+(height*height));
    }
}
