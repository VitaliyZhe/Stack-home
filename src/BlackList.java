
public class BlackList {

	private static Class blacklist[] = new Class[10];
	private int i = 0;

	public BlackList() {
		super();
	}

	public void addBlackList(Class<?> o) {
		blacklist[i++] = o;
		System.out.println("add to black list " + o);

	}

	public boolean blackListIs(Object o) {

		for (int obj = 0; obj < blacklist.length; obj++) {

			if (blacklist[obj] != null) {

				if (blacklist[obj].equals(o)) {
					System.out.println();
					System.out.println("Object is black list ");
					return true;
				}

			}

		}
		return false;

	}
}
