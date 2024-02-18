package homework;

public class Report implements Rep{
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }

    @Override
    public void report() {

    }
}

