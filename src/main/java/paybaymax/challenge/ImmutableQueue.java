package paybaymax.challenge;

public final class ImmutableQueue<T> implements Queue<T> {

	private final int size;
	private final Object[] data;

	private final int DEFAULT_SIZE = 0;

	public ImmutableQueue() {
		super();
		data = new Object[DEFAULT_SIZE];
		this.size = 0;

	}

	private ImmutableQueue(Object[] data) {

		this.data = data;
		this.size = data.length;

	}

	public final Queue<T> enQueue(T t) {

		Object[] newData = new Object[size + 1];

		System.arraycopy(data, 0, newData, 0, size);

		newData[newData.length - 1] = t;

		return new ImmutableQueue<T>(newData);

	}

	public final Queue<T> deQueue() {

		if (isEmpty()) {
			return new ImmutableQueue<T>();
		}

		Object[] newData = new Object[size - 1];
		System.arraycopy(data, 1, newData, 0, size - 1);

		return new ImmutableQueue<T>(newData);

	}

	public final T head() {

		if (isEmpty()) {
			return null;
		}
		return (T) data[0];
	}

	public final boolean isEmpty() {
		return size <= 0;
	}

}
