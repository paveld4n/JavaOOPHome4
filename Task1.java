public class Task1 {
    public static void main(String[] args) {
    

    Gen<Integer, String, Double, Float> i_Ob = new Gen<>(88, "Жопа", 45.4, 48.4f );
    
    i_Ob.ShowType();
    int i = i_Ob.GetOb1();
    String str = i_Ob.GetOb2();
    double d = i_Ob.GetOb3();
    float f = i_Ob.GetOb4();

    System.out.println("Значение I =  " + i);
    System.out.println("Значение S =  " + str);
    System.out.println("Значение D =  " + d);
    System.out.println("Значение F =  " + f);

    }
}