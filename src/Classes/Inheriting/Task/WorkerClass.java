package Classes.Inheriting.Task;

public class WorkerClass extends PersonClass {

    private String position, company;

    public WorkerClass(String name, String surname, String position, String company){
        super(name, surname);
        this.position = position;
        this.company = company;
    }

    @Override
    public void introduceMe() {
        System.out.println("I'm " + name + " " + surname + " and I'm working for " + company + " as a " + position);
    }
}
