class Pr10_ThisKeyword{
    private int var = 1;
    void check() {
        System.out.println("This keyword "+(this.var ==1?"can":"can not")+" access private Members !");
    }
    public static void main(String a[]){
        Pr10_ThisKeyword obj = new Pr10_ThisKeyword();
        obj.check();
    }
}