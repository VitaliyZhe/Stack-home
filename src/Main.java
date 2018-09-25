
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		int i = 20;
		double b = 21.5;
		MyStack stack = new MyStack(10);
		Black_list blackList = new Black_list();
		blackList.addBlackList(new MyStack());

		System.out.println("add_stack " + stack.addStack(s));

		System.out.println("add_stack " + stack.addStack(i));

		System.out.println();
		if (!blackList.blackListIs(stack)) {
			stack.addStack(stack);
		}

		System.out.println("add_stack " + stack.addStack(b));

		System.out.println();
		if (!stack.isEmpty()) {
			System.out.println("GetStack " + stack.getStackTop());
			System.out.println("Get & DellStack " + stack.getDellStack());
			//System.out.println("GetStack " + stack.getStack());
			System.out.println("GetStack " + stack.getStackTop());
			System.out.println("Dellstack " + stack.dellStack());
			System.out.println("GetStack " + stack.getStackTop());
			System.out.println("Add_stack +5 " + stack.addStack(i + 5));
			System.out.println("GetStack " + stack.getStackTop());
			System.out.println("Dellstack " + stack.dellStack());
			System.out.println("GetStack " + stack.getStackTop());
			System.out.println("Dell stack " + stack.dellStack());
			System.out.println("GetStack " + stack.getStackTop());
			System.out.println();

		}

	}

}
