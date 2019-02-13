public class GuiltListSys{
  ///////////////////////////ATTRIBUTES//////////////////////////////////////
  private static LinkedList<User> users = new LinkedList<User>;
/*
**finding a User's ref
*/
public static User searchUsers(String email) {
    for(int i=0; i < users.size(); i++) {
        if(email.equals(users.get(i).getEmail())) return users.get(i);
    }
    return null;
}
/*
**adding a User's ref to GuiltListSys
*/
public static void addUsers(String name, String email, String password) {
                users.add(new User(name, email, password));
    }

public static void main(String[] args) {
            GuiltListSys gs = new GuiltListSys();
            MainGUI g = new MainGUI();
            g.setVisible(true);
        }
}
