package paybaymax.challenge;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ImmutableQueueTests {

	private Queue<Object> queue = new ImmutableQueue<Object>();

	@Test
	void testQueueIsEmptyInTheStart() {
		assertTrue(queue.isEmpty());
	}

	@Test
	void testHeadIsNullInTheStart() {
		Object o = queue.head();
		assertNull(o);
	}

	@Test
	void testEnqueueReturnsNewNotNullQueue() {
		Object object = new Object();
		queue = queue.enQueue(object);
		assertNotNull(queue);

	}

	@Test
	void testQueueHasElementAfterInsert() {
		Object object = new Object();
		queue = queue.enQueue(object);
		Object o = queue.head();
		assertNotNull(o);

	}

	@Test
	void testQueueIsNotEmptyAfterEnqueue() {
		Object object = new Object();
		queue = queue.enQueue(object);
		assertFalse(queue.isEmpty());

	}

	@Test
	void testRemoveReturnsNewNotNullQueue() {
		queue = queue.deQueue();
		assertNotNull(queue);
	}

	@Test
	// @Order(7)
	void testDequeueEmptiesTheQueue() {
		while (!queue.isEmpty()) {
			queue = queue.deQueue();
		}

		assertTrue(queue.isEmpty());
	}

	@Test
	void testDequeOnEmptyQueueReturnsEmptyQueue() {

		assertDoesNotThrow(new Executable() {

			public void execute() throws Throwable {
				queue = queue.deQueue();
			}
		});

		assertTrue(queue.isEmpty());

	}

	@Test
	void testEnqueueCreatesReturnsNewInstace() {
		Queue<Object> queue1 = queue.enQueue(new Object());
		assertNotEquals(queue, queue1);
	}

	@Test
	void testDequeueCreatesReturnsNewInstace() {
		Queue<Object> queue1 = queue.deQueue();
		assertNotEquals(queue, queue1);
	}

}
