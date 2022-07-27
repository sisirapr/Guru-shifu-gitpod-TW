class Rectangle{
    private final int breadth, height;
    
    Rectangle(int breadth,int height){
        this.breadth = breadth;
        this.height = height;
    }

    public int area(){
        return this.breadth*this.height;
    }
}