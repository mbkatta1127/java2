public class AwesomeNumber {
    public Integer number;

    public AwesomeNumber(int number){
        this.number = (Integer) number;
    }

    public Integer getNumber(){
        return this.number;
    }
    public static Integer add(AwesomeNumber n1, AwesomeNumber n2){
        return n1.getNumber()+n2.getNumber();
    }

    public static Integer subtract(AwesomeNumber n1, AwesomeNumber n2){
        return n1.getNumber()-n2.getNumber();
    }
}
