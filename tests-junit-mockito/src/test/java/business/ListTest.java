package business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListTest {
	List<?> list;

	@BeforeEach
	public void setup() {
		list = mock(List.class);
	}

	@Test
	void testMockingList_When_aizeIsCalled_ShouldReturn10() {
		when(list.size()).thenReturn(10).thenReturn(15).thenReturn(55); // thenReturn() -> "return a specific,
																		// predefined value

		assertEquals(10, list.size());
		assertEquals(15, list.size());
		assertEquals(55, list.size());

	}
	@Test
	void testMockingList_When_GetIsCalled_ShoudReturnName() {
		var list = mock(List.class);
		when(list.get(0)).thenReturn("Pc_Oliver");
		
		assertEquals("Pc_Oliver", list.get(0));
		assertNull(list.get(1));
		
		
	}
	@Test
	void testMockingList_When_GetIsCalledWithArgumentMatcher_ShoudReturnName() {
		var list = mock(List.class);
		when(list.get(anyInt())).thenReturn("Pc_Oliver");
		
		assertEquals("Pc_Oliver", list.get(anyInt()));
		assertNotNull(list.get(anyInt()));
//		assertNull(list.get(anyInt()));
		
	}
}
