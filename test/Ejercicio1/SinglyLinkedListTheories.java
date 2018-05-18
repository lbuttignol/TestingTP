package Ejercicio1;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
@RunWith(Theories.class)
public class SinglyLinkedListTheories {

	@Theory
	public void addValueIncreaseSize(@SinglyLinkedListGenerator(
			minVal=Integer.MIN_VALUE,
			maxVal=Integer.MAX_VALUE,
			minLength=0,
			maxLength=30,
			cant=5) SinglyLinkedList l) {
		
		int oldSize = l.getSize();
		l.addFirst(7);
		assertTrue(oldSize < l.getSize());
	}
	
	@Theory
	public void removeValueDecreaseSize(@SinglyLinkedListGenerator(
			minVal=-5,
			maxVal=5,
			minLength=0,
			maxLength=20,
			cant=20) SinglyLinkedList l) {
		
		assumeTrue(l.contains(5));
		assertFalse(l.isEmpty());
		int oldSize = l.getSize();
		l.remove(5);
		assertTrue(oldSize > l.getSize());
	}
	
	@Theory
	public void removeValueNotAlwaysDecreaseSize(@SinglyLinkedListGenerator(
			minVal=Integer.MIN_VALUE,
			maxVal=Integer.MAX_VALUE, 
			minLength=0, 
			maxLength=20, 
			cant=30) SinglyLinkedList l) {
		
		int oldSize = l.getSize();
		l.remove(5);
		assertTrue(oldSize >= l.getSize());
	}
	
	@Theory
	public void compareByToString(@SinglyLinkedListGenerator(
			minVal=Integer.MIN_VALUE, 
			maxVal=Integer.MAX_VALUE, 
			minLength=0, 
			maxLength=20, 
			cant=40) SinglyLinkedList l) {
		
		SinglyLinkedList otherL = new SinglyLinkedList(l);
		assertEquals(l.toString(),otherL.toString());
		otherL.addFirst(123);
		assertNotEquals(l.toString(),otherL.toString());
	}
	
	@Theory
	public void badGeneratorCall(@SinglyLinkedListGenerator(
			minVal=100, 
			maxVal=-100, 
			minLength=0, 
			maxLength=20, 
			cant=5) SinglyLinkedList l) {
		
		SinglyLinkedList otherL = new SinglyLinkedList(l);
		assertEquals(l.toString(),otherL.toString());
		otherL.addFirst(123);
		assertNotEquals(l.toString(),otherL.toString());
	}
	@Test
	public void emptyVsNotEmpty() {
		SinglyLinkedList l = new SinglyLinkedList();
		assertTrue(l.isEmpty());
		l.addFirst(1);
		assertFalse(l.isEmpty());
	}
	
}
