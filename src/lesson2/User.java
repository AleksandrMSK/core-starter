package lesson2;

import java.util.Objects;

public class User {

    private String name;
    private byte age;
    public static double salary;
    private static final String MY_NAME_IS = "Меня зовут ";

    public void say() {
        String me = "dfwsd";
        String toLowerCase = me.toLowerCase();
        System.out.println(MY_NAME_IS + name
                + toLowerCase + age + " моя зп " + salary);
    }

    public byte getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (byte) age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void run() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
