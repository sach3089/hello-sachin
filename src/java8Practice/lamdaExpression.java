package java8Practice;

interface  A{
    void show();
}

class Xyz implements A{
    public void show(){
        System.out.println("hello");
    }
}

public class lamdaExpression {

    public static void main(String[] args) {

        A obj = new Xyz();
        obj.show();

    }
}
