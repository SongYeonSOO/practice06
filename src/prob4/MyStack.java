package prob4;

public class MyStack implements Stack {
	int buffersize; // real buffer size
	int count;// pointer where the
	String[] stack;

	public MyStack(int buffersize) {
		if (buffersize > 0) {
			this.buffersize = buffersize;
			count = 0;
			stack = new String[buffersize];
		}
	}

	public void push(String str) throws RuntimeException {
		if (count < buffersize) {
			stack[count] = str;
			count++;

		} else
			System.out.println("buffer full!");

	}

	public String pop() throws RuntimeException {
		if ((!isEmpty()) && count >= 0) {

			String result = stack[count - 1];
			stack[count - 1] = null; // 이거해야하나?
			count--;
			return result;
		}
		return "stack is empty!";

	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public int size() {
		return buffersize;
	}
}
