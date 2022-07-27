class Rectangle{
    private final double breadth, height;
    
    Rectangle(double breadth,double height){
        this.breadth = breadth;
        this.height = height;
    }

    public double area(){
        return this.breadth*this.height;
    }

    public double perimeter(){
        return 2*(breadth+height);
    }
}