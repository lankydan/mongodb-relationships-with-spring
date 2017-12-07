package lankydan.tutorial.mongodb.documents;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"id", "dateOfBirth"})
@Document(collection = "people")
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
