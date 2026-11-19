

// ENCAPSULATION

 class student{
    private String student;
    private double grade ;


    public void setgrade(double g){
        if ( g > 0 && g <= 20){
            grade = g;
        }
    }
     public double getgrade(){
        return grade;
     }
}

// INHERITANCE

class person {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public person(String n, int a) {
        name = n;
        age = a;

    }
}
class eleve extends person {

    public eleve(String n, int a) {
        super(n, a);
    }
}

class houssem{
    String jsp;
    int nb;

    public void display() {
        System.out.println("Name: " + jsp);
        System.out.println("Age: " + nb);
    }
}

class douifi extends houssem{
}





// POLYMORPHISME

class animal {

    public void makesound() {
        System.out.println("Makesound");
    }
}

class Dog extends animal{
    @Override
    public void makesound() {
        System.out.println("bark");
    }
}
class Cat extends animal{
    @Override
    public void makesound() {
        System.out.println("meow");
    }
}

// ABSTRACTION
abstract class bird {
    String action;

    abstract void sing();
}

    class ma9nin extends bird {

        void sing() {
            System.out.println("tiwawati");
        }
    }


class Main{
    public void  main(String args[]){
        // ENCAPSULATION
        student s1 = new student();
        s1.setgrade(21);
        IO.println(s1.getgrade());

        // INHERITENCE
        eleve e1 = new eleve("alo", 20 );
        e1.display();

        // POLYMORPHISME
        animal d = new Dog();
        animal c = new Cat();
        d.makesound();
        c.makesound();

        // ABSTRACTION
        bird z = new ma9nin();
                z.sing();

                douifi d1 = new douifi();
                d1.jsp = "houssem";
                        d1.nb = 20 ;
                d1.display();

                
    }
}







