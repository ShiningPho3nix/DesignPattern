package filterPattern;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonPredicates {

	public static Predicate<Person> isMale() {
		return p -> p.getGender().equalsIgnoreCase("MALE");
	}

	public static Predicate<Person> isFemale() {
		return p -> p.getGender().equalsIgnoreCase("FEMALE");
	}

	public static Predicate<Person> isSingle() {
		return p -> p.getMaritalStatus().equalsIgnoreCase("SINGLE");
	}

	public static List<Person> filterPersons(List<Person> persons, Predicate<Person> predicate) {
		return persons.stream().filter(predicate).collect(Collectors.<Person>toList());
	}

}
