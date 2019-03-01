package filterPattern;

import java.util.ArrayList;
import java.util.List;
import static filterPattern.PersonPredicates.*;

/**
 * Filter pattern or Criteria pattern is a design pattern that enables
 * developers to filter a set of objects using different criteria and chaining
 * them in a decoupled way through logical operations. This type of design
 * pattern comes under structural pattern as this pattern combines multiple
 * criteria to obtain single criteria.
 * 
 * We're going to create a Person object, Criteria interface and concrete
 * classes implementing this interface to filter list of Person objects.
 * CriteriaPatternDemo, our demo class uses Criteria objects to filter List of
 * Person objects based on various criteria and their combinations.
 * 
 * Besser gelöst mit Predicates, siehe PersonPredicates. Alles an einem Ort,
 * kürzer, static und lesbarer.
 * 
 * @author Steffen Dworsky
 *
 */
public class CriteriaFilterDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		// Done using Predicates
		System.out.println("Is Male: " + filterPersons(persons, isMale()));
		System.out.println("Is Female: " + filterPersons(persons, isFemale()));
		System.out.println("Is Single: " + filterPersons(persons, isSingle()));
		System.out.println("Is Single and Male: " + filterPersons(persons, isSingle().and(isMale())));
		System.out.println("Is Single or Female: " + filterPersons(persons, isSingle().or(isFemale())));

		// Done using Filter Pattern
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.println("Males: ");
		System.out.println(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		System.out.println(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		System.out.println(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		System.out.println(singleOrFemale.meetCriteria(persons));
	}
}
