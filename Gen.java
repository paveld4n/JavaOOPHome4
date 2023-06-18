public class Gen<I, S, D, F> {
    I ob1;
    S ob2;
    D ob3;
    F ob4;

    Gen(I o1, S o2, D o3, F o4) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
        ob4 = o4;
    }

    I GetOb1() {
        return ob1;
    }
    S GetOb2() {
        return ob2;
    }
    D GetOb3() {
        return ob3;
    }
    F GetOb4() {
        return ob4;
    }
    public void ShowType() {
        System.out.println("Тип I - Это " + ob1.getClass().getName());
        System.out.println("Тип S - Это " + ob2.getClass().getName());
        System.out.println("Тип D - Это " + ob3.getClass().getName());
        System.out.println("Тип F - Это " + ob4.getClass().getName());
    }
}