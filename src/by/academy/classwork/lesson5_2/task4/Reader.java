package by.academy.classwork.lesson5_2.task4;

public class Reader {
    private String userName;
    private int userTicket;
    private String userFaculty;
    private long userBDate;
    private int userPhoneNumber;

    public Reader(){
        super();
    }
    public Reader(String userName,int userTicket,String userFaculty,long userBirthDate,int userPhoneNumber){
        super();
        this.userName = userName;
        this.userTicket = userTicket;
        this.userFaculty = userFaculty;
        this.userBDate = userBirthDate;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserTicket() {
        return userTicket;
    }

    public String getUserFaculty() {
        return userFaculty;
    }

    public long getUserBirthDate() {
        return userBDate;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserTicket(){
        this.userTicket = userTicket;
    }

    public void setUserFaculty(String userFaculty) {
        this.userFaculty = userFaculty;
    }

    public void setUserBirthDate(long userBirthDate) {
        this.userBDate = userBirthDate;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void takeBook(int book){
        System.out.println(userName+" взял "+book+" книги.");
    }

    public void takeBook(String... userBooks){
        System.out.print(getUserName()+" взял книги: ");
        for (String userBook : userBooks) {
            System.out.print("" + userBook + " ");
        }
        System.out.println();
    }
    public void returnBook(int book){
        System.out.println(userName+" вернул "+book+" книги.");
    }
    public void returnBook(String... userBooks){
        System.out.print(getUserName()+" вернул книги: ");
        for (String userBook : userBooks) {
            System.out.print("" + userBook + " ");
        }
        System.out.println();
    }

}
