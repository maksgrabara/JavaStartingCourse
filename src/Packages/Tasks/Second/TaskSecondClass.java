package Packages.Tasks.Second;

public class TaskSecondClass {

    private int[] tabOperations = new int[5];
    public TaskSecondClass(int[] tabConstructor){
        tabOperations = tabConstructor;
    }

    public int Sum(){
        int sum = 0;

        for(int i = 0; i < tabOperations.length; i++){
            sum += tabOperations[i];
        }

        return sum;
    }

    public int Avg(){
        int sum = 0, avg = 0;

        for(int i = 0; i < tabOperations.length; i++){
            sum += tabOperations[i];
        }

        avg = sum/(tabOperations.length);
        return avg;
    }

    public int Min(){
        int min = tabOperations[0];

        for(int i = 0; i < tabOperations.length; i++){
            if(tabOperations[i] < min) min = tabOperations[i];
        }

        return min;
    }

    public int Max(){
        int max = tabOperations[0];

        for(int i = 0; i < tabOperations.length; i++){
            if(tabOperations[i] > max) max = tabOperations[i];
        }

        return max;
    }



}
