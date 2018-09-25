
public class Black_list {
	private Object blacklist[] = new Object[10];
	private int i = -1;

	public Black_list(Object[] blacklist) {
		super();
		this.blacklist = blacklist;
	}

	public Black_list() {
		super();
	}

	public void addBlackList(Object o) {
		blacklist[++i] = o;
		System.out.println("add to black list " + o);
		System.out.println();
	}

	public boolean blackListIs(Object o) {
		
		for (Object obj : blacklist) {
			if (obj != null) {
				
				if (obj.getClass()==o.getClass()) {
					System.out.println();
					System.out.println("Object in black list ");
					return true;
				}
				
			}
			
		}
		return false;

	}
}
