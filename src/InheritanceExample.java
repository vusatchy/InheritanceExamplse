/**
 * Created by white on 04.01.2017.
 */
enum Gender {MAN,WOMAN}

class Person {

    protected String name;
    protected String surname;
    protected int weight;
    protected int height;
    protected Gender gender;


    public Person(String name, String surname,Gender gender,int weight,int height){

        this.name=name;
        this.surname=surname;
        this.gender=gender;
        this.weight=weight;
        this.height=height;
    }

    public void showInfo(){

        System.out.println("Name: " + name + " Surname: " + surname);
        System.out.println("Gender :" + gender);
        System.out.println("Height :" + height+"sm"+ " Weight:"+weight+"kg");

    }
}


class Worker extends Person{     //Inheriting by using Is-a rule

    private int salary;
    private  String company;

    public  Worker(String name, String surname,Gender gender,int weight,int height,String company,int salary){
        super(name,surname,gender,weight,height);        // Example of code economy
        this.company=company;
        this.salary=salary;
    }

    public  void  showInfo(){
        super.showInfo();     // Example of code economy
        System.out.println("Works for "+company +" and earns " + salary + "$");

    }
}

public class InheritanceExample {
    public static void main(String[] args){
       Worker Martha = new Worker("Martha","Condor",Gender.WOMAN,51,162,"Eleks",450);
       Worker Roman = new Worker("Roman","Gnativ",Gender.MAN,85,185,"InterLogic",700);
       Martha.showInfo();
       System.out.println();
       Roman.showInfo();
    }
}
