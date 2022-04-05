package shapes;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
         return this.width * this.height;
    }

    public int getPerimeter(){
        return 2 * this.height + 2 * this.width;
    }

}
