public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public String draw(){
        String drawing = "";
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                if(i == 0|| j== 0|| i== height -1 || j == width-1)
                    drawing += "*";
                else
                    drawing += " ";
            }
            drawing += "\n";
        }
        return drawing;
    }

}

