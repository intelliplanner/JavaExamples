package immutable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Java Program to demonstrate that making all
 * fields final doesn't make a class Immutable.
 * You can still break immutability if you return
 * reference to mutable objects to client.
 * 
 * @author WINDOWS 8
 *
 */

class Person{
  private final String name;
  private final Date birthday;
  private final List hobbies;
  
  

/**
 * Creates a configured person instance for the represented workflow.
 */
public Person(String name, Date birthday, List hobbies){
    this.name = name;
    this.birthday = birthday;
    this.hobbies = hobbies;
  }
  /**
 * Retrieves or locates get name data needed for decision-making.
 */
  public String getName() {
    return name;
  }
  /**
 * Retrieves or locates get birthday data needed for decision-making.
 */
  public Date getBirthday() {
    return (Date)birthday.clone();
  }
  /**
 * Retrieves or locates get hobbies data needed for decision-making.
 */
  public List getHobbies() {
    return Collections.unmodifiableList(hobbies);
  }
  @Override
  /**
 * Provides a readable representation for reporting or diagnostics.
 */
  public String toString() {
    return "Person [name=" + name + ", birthday=" + birthday + ", hobbies="
        + hobbies + "]";
  }
  
  
  
}