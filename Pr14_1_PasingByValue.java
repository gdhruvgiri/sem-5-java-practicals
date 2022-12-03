class Pr14_1_PasingByValue{
    void method(int value){
        System.out.println("value is " + value);
    }

    public static void main(String[] args){
        Pr14_1_PasingByValue obj = new Pr14_1_PasingByValue();
        obj.method(1);
    }
}