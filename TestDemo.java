// interface TestIntf {
//     int i=10;
//     int j=20;
// }
// class TestDemo implements TestIntf {
//     public static void main(String args[]){
//         System.out.println("i+j = "+(i+j));
//         // i +=j;
//         // j +=3;
//         System.out.println("i+j = "+(i+j));
//     }
// }

interface MyInteface{
    void f();
    static void show(){
        System.out.println("in show");
    }
    default void display(){
        System.out.println("in display");
    }
}

class TestDemo implements MyInteface{
    public void f(){
        System.out.println("in f");
    }
    public static void main(String args[]){
        TestDemo obj=new TestDemo();
        obj.f();
       // obj.show();
        obj.display();
        MyInteface.show();
    }
}