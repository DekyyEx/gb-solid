package homework;

public class Repository implements Save{
    public void save(User user){
        Persister persister = new Persister(user);
        persister.save();
    }
}
