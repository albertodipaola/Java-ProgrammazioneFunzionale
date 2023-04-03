import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> pepole = List.of(
            new Person("marco", "rossi", 23, Gender.Male),
            new Person("fabio", "bellini", 31, Gender.Male),
            new Person("sofia", "bianchi", 25, Gender.Female),
            new Person("fabbrizio", "nota", 19, Gender.Male),
            new Person("viola", "cera", 30, Gender.Female)
        );

        //metodo imperativo
        // List<Person> females = new ArrayList<Person>();
        // for (Person person : pepole) {
        //     if (person.getGender().equals(Gender.Female)) {
        //         females.add(person);
        //         System.out.println(person.getName());
        //     }
        // }

        //metodo dichiarativo
        List<Person> females = pepole.stream()
            .filter(person->person.getGender()
            .equals(Gender.Female)).collect(Collectors.toList());
            
        for (Person person : females) {
            System.out.println(person.getName());
        }

        List<String> names = List.of("spring", "java", "oop", "php");

        List<String> intrudes = names.stream()
            .filter(name->name
            .equals("php"))
            .toList();
        for (String string : intrudes) {
            System.out.println(string);
        }
    }
}
