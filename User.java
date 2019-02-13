public class User {
  ///////////////////////////ATTRIBUTES//////////////////////////////////////
    private String user;
    private String email;
    private String password;
    /*
    **stores list of Items related
    **and shared with User
    */
    private LinkedList<Item> items = new LinkedList<Item>();
    /*
    **stores list of Friends
    */
    private LinkedList<String> friendEmail = new LinkedList<String>();
    /*
    **stores list of shared Items
    */
    private LinkedList<Item> sharedItems = new LinkedList<Item>();

    ///////////////////////////Constructor//////////////////////////////////////
    public USER(String user,String email,String password){
      this.user = user;
      this.email = email;
      this.password = password;
    }

    //public USER(){}
    ///////////////////////////Methods//////////////////////////////////////
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public LinkedList<Item> getItems() { return items; }
    public LinkedList<String> getFriends() { return friends; }
    //public LinkedList<Customer> getCustomers() { return customers; }

    public void addToItemList(Item item) {
        items.add(item);
    }
    public void addFriend(String email) {
        items.add(email);
    }
    // public User searchFriends() {
    //     for(int i=0; i < friends.size(); i++) {
    //         if(email.equals(users.get(i).getEmail())) return users.get(i);
    //     }
    //     return null;
    // }


}
