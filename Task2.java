public class Task2 {
    public static void main(String[] args) {
          
        Output print = new Output();

        String[] body = {"голова", "рука", "нога", "спина", "живот", "шея"};
        Integer[] num1 = {123, 41,- 5, 2, 13, -456, 54};
        Double[] num2 = {-1.5, 2.0, 4.7, -9.9, 122.44, 0.1};
        print.<String>printArray(body);
        print.<Integer>printArray(num1);
        print.<Double>printArray(num2);
    }
}
