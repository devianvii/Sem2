package PaketOne;

public class demo {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3), c2 = new ComplexNumber(2, -1);
        System.out.println("(" + c1 + ") + (" + c2 + ") = " + c1.add(c2));
        System.out.println("(" + c1 + ") - (" + c2 + ") = " + c1.subtract(c2));
        System.out.println("(" + c1 + ") * (" + c2 + ") = " + c1.multiply(c2));
        System.out.println("(" + c1 + ") / (" + c2 + ") = " + c1.divide(c2));
      
    }
     
    
}
