public class Output {
    
    public <T> void printArray(T[] array){
        for(T item: array){
            
            System.out.print(" " + item);
        }
        System.out.println();
    }
}
