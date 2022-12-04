public class Pr7_WrapperClass {
    public static void main(String[] args) {
     Integer intObj = new Integer(20);
     Character charObj = new Character('C');
     Double doubleObj = new Double(1.0);
     Float floatObj = new Float(2.0);

     int i = intObj.intValue();
     char c = charObj.charValue();
     double d = doubleObj.doubleValue();
     float f = floatObj.floatValue();
     
     System.out.println(i);
     System.out.println(c);
     System.out.println(d);
     System.out.println(f);
    }
}