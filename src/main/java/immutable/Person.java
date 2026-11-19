package immutable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/** Purpose: Encapsulates person behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Person{
  private final String name;
  private final Date birthday;
  private final List hobbies;

/** Purpose: Creates a person instance. */
public Person(String name, Date birthday, List hobbies){
    this.name = name;
    this.birthday = birthday;
    this.hobbies = hobbies;
  }
  
  /** Purpose: Retrieves get name data. */
  public String getName() {
    return name;
  }
  
  /** Purpose: Retrieves get birthday data. */
  public Date getBirthday() {
    return (Date)birthday.clone();
  }
  
  /** Purpose: Retrieves get hobbies data. */
  public List getHobbies() {
    return Collections.unmodifiableList(hobbies);
  }
  @Override
  
  /** Purpose: Provides a readable object representation. */
  public String toString() {
    return "Person [name=" + name + ", birthday=" + birthday + ", hobbies="
        + hobbies + "]";
  }

  
}