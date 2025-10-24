package Packages.Tasks.First;

public class TaskFirst {
    public static void main(String[] args){

        TaskFirstClass object = new TaskFirstClass("John", "Smith", "English", "20k");

        System.out.println(object.getName());
        System.out.println(object.getSurname());
        System.out.println(object.getLanguage());
        System.out.println(object.getSalary());
    }
}
