package hideojr.practice.ch4;

import java.io.IOException;

public class Practice_Exception {

	public static void main(String[] args) {
		Practice_Exception obj = new Practice_Exception();
		try {
			obj.showMsg(null);
		} catch (IOException e) {
			//e.printStackTrace();
		}
		finally {
			String str ="";
			System.out.println(str.length());
		}
		System.out.println("HHH");
		//try-with resources
		try(MyResource res = new MyResource()) {
			res.doSomething();
			//throw new RuntimeException("occurred in doSomething method inside");
		}
		catch(Exception e) {
			Throwable[] t = e.getSuppressed();
			for(Throwable ele : t)
				System.out.println(ele.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void showMsg(String word) throws IOException {
		if(word == null)
			throw new IOException("the word argument is null.");
		System.out.println(word);
	}

	void dealThing () throws Exception { //declare throws or surround try-catch
		throw new Exception();
	}
}

class MyResource implements AutoCloseable {
	
	void doSomething() {
		System.out.println("doSomething");
		throw new RuntimeException("occurred in doSomething method inside");
	}

	@Override
	public void close() throws Exception {
		throw new Exception("Close...");
	}
	
}