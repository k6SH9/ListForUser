import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\avolgapkin\\Desktop\\TestUsers\\src\\users.txt");
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            List<User> userArrayList = new ArrayList<>();
            User user;
            System.out.println("=============До сортировки==============");
            while (line != null) {

                user = new User();
                user.setSecondName(line);
                user.setFirstName(reader.readLine());
                user.setThirdName(reader.readLine());
                user.setAge(reader.readLine());
                if (user.getAge().length() == 0){
                    user.setAge(null);
                }
                user.setPassportInfo(reader.readLine());
                System.out.println(user.toString());
                line = reader.readLine();
                userArrayList.add(user);
            }
            Collections.sort(userArrayList);
            System.out.println("============Переопределение compareTO=============");
            for (User userSort : userArrayList) {
                System.out.println(userSort.toString());
            }
            userArrayList.sort(Comparator.nullsFirst(Comparator.comparing(User::getAge, Comparator.nullsFirst(Comparator.reverseOrder()))));
            System.out.println("===============Сортировка компаратором==================");
            for (User userSecond : userArrayList){
                System.out.println(userSecond.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Лист юзеров вывести на экран
    //Отсортировать по возрасту по убыванию, пустой в начале
    //Возраст необязательный
}
