
public class MyStack {

	private Object mArray[];
	private int mSize;
	private int mPoint;
	private Black_list blackList = new Black_list();

	public MyStack(int mSize) {
		super();
		this.mSize = mSize;
		mArray = new Object[mSize];
		this.mPoint = -1;

	}

	public MyStack() {
		super();
	}

	// Add to stack
	public Object addStack(Object o) {
		mArray[++mPoint] = o;
		System.out.println("mPoint" + mPoint);
		return o;

	}

	// dell stack
	public Object dellStack() {
		if (mPoint == 0 | mPoint < 0) {
			mPoint = -1;
			System.out.println("mPoint" + mPoint);
			return mArray[mPoint + 1];

		}
		System.out.println(mPoint);
		return mArray[mPoint--];
	}

	// get & dell stack
	public Object getDellStack() {
		System.out.println("mPoint" + mPoint);
		Object o = mArray[mPoint];
		dellStack();
		return o;
	}

	// get stack
	public Object getStackTop() {
		if (mPoint > -1) {
			if (mArray[mPoint] != null) {
				System.out.println("mPoint" + mPoint);
				return mArray[mPoint];
			}
		}
		return false;
	}

	// get isEmpty
	public boolean isEmpty() {
		return (mPoint == -1);
	}

	// get isEmpty
	public boolean isFull() {
		return (mSize == -1);
	}

}
