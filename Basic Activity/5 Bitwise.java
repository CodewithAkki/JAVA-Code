public class Bitwise {
    public static void main(String []args){
         byte x=10,y=11;
         System.out.println("Complement:\t"+"~x:\t"+(~x)+"\t~y:\t"+(~y));
         System.out.println("AND:\t"+"x&y:\t"+(x&y));
         System.out.println("OR:\t"+"x|y:\t"+(x|y));
         System.out.println("XOR:\t"+"x^y:\t"+(x^y));
         System.out.println("LEFT SHIFT:\t"+"x<<2:\t"+(x<<2)+"\ty<<2\t"+(y<<2));
         System.out.println("RIGHT SHIFT:\t"+"2>>x:\t"+(2>>x)+"\t2>>y\t"+(2>>y));
         System.out.println("ZERO FILL RIGHT SHIFT:\t"+"x>>>3:\t"+(x>>>3)+"\ty>>>3\t"+(y>>>3));
         System.out.println("TERNARY:\n"+(x>y?"x is greater":"y is greater"));
    }
}
