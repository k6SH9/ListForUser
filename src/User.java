import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparable<User> {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String age;
    private String passportInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassportInfo() {
        return passportInfo;
    }

    public void setPassportInfo(String passportInfo) {
        this.passportInfo = passportInfo;
    }



    @Override
    public String toString() {
        return "User{" +
                "Фамилия='" + secondName + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Отчество='" + thirdName + '\'' +
                ", Возраст='" + age + '\'' +
                ", Паспорт='" + passportInfo + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {
        if(this.getAge() == null){
            return (user.getAge() == null) ? 0 : -1;
        }
        if(user.getAge() == null){
            return 1;
        }
        return user.getAge().trim().compareTo(getAge().trim());
    }
}
