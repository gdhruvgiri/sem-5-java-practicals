
class A{
   int x;
   A(int x){
        this.x = x;
        System.out.println("X in SuperClass is " + this.x);
   }
}

class B extends A{
    int x;
    B(int a, int b){
        super(a);
        this.x = b;
        System.out.println("X in SubClass is " + this.x);
    }
}

class Pr18_SubSuperConst{
    public static void main(String[] args){
        B obj = new B(10,20);
    }
}