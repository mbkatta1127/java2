public class Person extends Animal{
    public int ssn;
    public String firstName;
    public String lastName;

    public static int numOfPersons;

    public Person(){numOfPersons++;}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        numOfPersons++;
    }

    public Person(String firstName, String lastName, int age, int ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        numOfPersons++;
    }

    public String speak(){
        if(this.firstName==null) return "I don't have a name.";


        else{
            if(age>0) return "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";

            else return "My name is " + firstName + " " + lastName + ".";
        }
    }

    public String toString(){
        String s = "";
        if(firstName==null) return s+"N/a";
        else{
            s+=(firstName + " " + lastName);
            if(ssn>0) s+=" " + ssn%10000;
        }
        return s;
    }

    public static int getPersonCount(){
        return numOfPersons;
    }

}
