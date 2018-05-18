package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;



public class RandomSinglyLinkedList extends ParameterSupplier {
	/**
	 * This mehtod generate 'cant' SinglyLinkedList with size between'minLength' and 'maxLength'
	 * filled by integers between 'minVal' and 'maxVal'.
	 */
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
		SinglyLinkedListGenerator annotation = sig.getAnnotation(SinglyLinkedListGenerator.class); 
		int minVal = annotation.minVal();
		int maxVal = annotation.maxVal();
		int minLength = annotation.minLength();
		int maxLength = annotation.maxLength();
		int cant = annotation.cant();
		
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rnd = new Random();
		// length of the List to build
		for(int i=0; i<cant; i++) {
			int length = nextIntInRange(minLength,maxLength,rnd);
			SinglyLinkedList list = new SinglyLinkedList();
			for(int j=0; j<=length; j++) {
				int val = nextIntInRange(minVal,maxVal,rnd);
				list.addFirst(val);
			}
			values.add(i, PotentialAssignment.forValue(Integer.toString(i),list));
		}
		return values;
	}
	
	private int nextIntInRange(int min, int max, Random rng) {
	   if (min > max) {
		   int aux = min;
		   min = max;
		   max = aux;
	   }
	   int diff = max - min;
	   if (diff >= 0 && diff != Integer.MAX_VALUE) {
	      return (min + rng.nextInt(diff + 1));
	   }
	   int i;
	   do {
	      i = rng.nextInt();
	   } while (i < min || i > max);
	   return i;
	}
}
