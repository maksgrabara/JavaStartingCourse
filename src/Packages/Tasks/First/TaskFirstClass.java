package Packages.Tasks.First;

public class TaskFirstClass {

    private String name, surname, language, salary;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getLanguage(){
        return language;
    }

    public String getSalary(){
        return salary;
    }

    public TaskFirstClass(String nameMethod, String surnameMethod, String languageMethod, String salaryMethod){
        name = nameMethod;
        surname = surnameMethod;
        language = languageMethod;
        salary = salaryMethod;
    }


}
