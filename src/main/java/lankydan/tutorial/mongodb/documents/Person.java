package lankydan.tutorial.mongodb.documents;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {"id", "dateOfBirth"})
public class Person {

  @Id private String id;
  private String firstName;
  private String secondName;
  private LocalDateTime dateOfBirth;
  private Address address;
  private String profession;
  private int salary;
  private List<Hobby> hobbies;

  public Person(
      final String firstName,
      final String secondName,
      final LocalDateTime dateOfBirth,
      final Address address,
      final String profession,
      final int salary,
      final List<Hobby> hobbies) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.profession = profession;
    this.salary = salary;
    this.hobbies = hobbies;
  }
}
