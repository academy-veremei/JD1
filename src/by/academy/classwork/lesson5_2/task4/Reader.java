package by.academy.classwork.lesson5_2.task4;

public class Reader {
    private String userName;
    private int userTicket;
    private String userFaculty;
    private int userBirthDate;
    private int userPhoneNumber;
    private String[] books;

    public Reader(){
        super();
    }
    public Reader(String userName,int userTicket,String userFaculty,int userBirthDate,int userPhoneNumber){
        super();
        this.userName = userName;
        this.userTicket = userTicket;
        this.userFaculty = userFaculty;
        this.userBirthDate = userBirthDate;
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

    public int getUserBirthDate() {
        return userBirthDate;
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

    public void setUserBirthDate(int userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void takeBook(){}
    public void returnBook(){}
}
