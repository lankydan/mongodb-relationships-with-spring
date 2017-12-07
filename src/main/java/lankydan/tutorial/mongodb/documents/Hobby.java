package lankydan.tutorial.mongodb.documents;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Hobby {

  private String name;

  public Hobby(final String name) {
    this.name = name;
  }
}
