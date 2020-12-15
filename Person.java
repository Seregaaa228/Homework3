
public class Person{
    public static void main(String[] args) {
        Person person = new Person("Mark", "Mark2020");
       person.account.displayAccount();
    }

    private String name;
    Account account;

    Person(String name, String password){
        this.name = name;
        account = new Account(password);
    }

    public class Account{
        String password;


        public Account(String password) {
            this.password = password;
        }

        void displayAccount(){

            System.out.println(Person.this.name + " Pass: " + password);
        }
    }
}