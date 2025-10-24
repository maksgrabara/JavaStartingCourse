package Packages.Tasks.Second;

public class TaskSecond {
    public static void main(String[] args){

        int[] tab = {1, 2, 3, 4, 5};
        TaskSecondClass object = new TaskSecondClass(tab);

        System.out.println(object.Sum());
        System.out.println(object.Avg());
        System.out.println(object.Min());
        System.out.println(object.Max());
    }
}
