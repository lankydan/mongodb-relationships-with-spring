package lankydan.tutorial.mongodb.documents;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "hobbies")
public class Hobby {

  private String name;

  public Hobby(final String name) {
    this.name = name;
  }
}
