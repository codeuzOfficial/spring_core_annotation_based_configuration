package dasturlash.uz;

import org.springframework.stereotype.Component;

@Component
public class Assistant {
    private String name = "Shogirtjon";
    private String surname = "Mazgiyev";

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

