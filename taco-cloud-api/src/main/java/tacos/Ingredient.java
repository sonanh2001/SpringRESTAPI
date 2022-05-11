package tacos;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@RequiredArgsConstructor
@NoArgsConstructor(force=true)
@Entity
public class Ingredient {
  
  @Id
  private final String id;
  private final String name;
  @Enumerated(EnumType.STRING)
  private final Type type;
  public static enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }
}
