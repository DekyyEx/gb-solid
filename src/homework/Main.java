package homework;

public class Main{
    static Report report = new Report();
    static Repository repository = new Repository();
    public static void main(String[] args){
        User user = new User("Bob");
        report.report(user);
        repository.save(user);
    }
}