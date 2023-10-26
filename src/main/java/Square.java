public class Square extends Shape{
    public int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    public String draw(){
        String drawing = "";
        for(int i = 0; i<sideLength; i++){
            for(int j = 0; j<sideLength; j++){
                if(i == 0|| j== 0|| i== sideLength -1 || j == sideLength-1)
                    drawing += "*";
                else
                    drawing += " ";
            }
            drawing += "\n";
        }
        return drawing;
    }
}
