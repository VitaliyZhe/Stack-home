
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		int i = 20;
		double b = 21.5;
		MyStack stack = new MyStack(10);
		BlackList blackList = new BlackList();
		blackList.addBlackList(MyStack.class);

		System.out.println("add_stack " + stack.addStack(s));

		System.out.println("add_stack " + stack.addStack(i));

		System.out.println();
		System.out.println("add_stack " + stack.addStack(stack));
		System.out.println("add_stack " + stack.addStack(b));

		System.out.println();
		if (!stack.isEmpty()) {
			System.out.println("GetStack " + stack.getStack());
			System.out.println("GetDellStack " + stack.getDellStack());
			System.out.println("GetStack " + stack.getStack());
			System.out.println("GetStack " + stack.getStack());
			System.out.println("DellStack " + stack.dellStack());
			stack.dellStack();
			System.out.println("Add_stack " + stack.addStack(i + 5));
			System.out.println("GetStack " + stack.getStack());
		}

	}

}
