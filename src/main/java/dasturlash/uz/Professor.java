package dasturlash.uz;

import org.springframework.stereotype.Component;

@Component
public class Professor {
    private String name = "Domlajon";
    private String surname = "Domlayev";

    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) { this.surname = surname; }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

