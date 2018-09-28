
public class MyStack {

	private Object mArray[];
	private int mSize;
	private int mPoint;
	private BlackList blackList = new BlackList();

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

		boolean i;
		i = blackList.blackListIs(o.getClass());

		if (i) {
			return false;
		} else {
			mArray[++mPoint] = o;
			return o;
		}
	}

	// dell stack
	public Object dellStack() {
		if (mPoint == 0) {
			return null;
		}
		return mArray[mPoint--];
	}

	// get & dell stack
	public Object getDellStack() {
		Object o = mArray[mPoint];
		dellStack();
		return o;
	}

	// get stack
	public Object getStack() {

		return mArray[mPoint];
	}

	// get isEmpty
	public boolean isEmpty() {
		return (mPoint == -1);
	}

	// get isEmpty
	public boolean isFull() {
		return (mSize == mSize - 1);
	}

}
