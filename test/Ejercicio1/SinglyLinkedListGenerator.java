package Ejercicio1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(RandomSinglyLinkedList.class)
public @interface SinglyLinkedListGenerator {
	// Min value inside of the List
	int minVal();
	// Max value inside of the list
	int maxVal();
	// Min length of the list
	int minLength();
	// Max length of the list
	int maxLength();
	// Number of list to generate
	int cant();
}
