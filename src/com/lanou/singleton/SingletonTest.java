package com.lanou.singleton;


public class SingletonTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new getTask()).start();
		}
	}

}

class SingleLazy{
	private SingleLazy(){}
	private static SingleLazy instance;
	public static SingleLazy getInstance(){
		if (instance==null) {
			synchronized (SingleLazy.class) {
				if (instance==null) {
					instance=new SingleLazy();
				}
			}
		}
		return instance;
	}
}

class SingleHunger{
	private SingleHunger(){}
	public static int method(){return 0;}
	static class Holder{
		private static SingleHunger instance=new SingleHunger();
	}
	public static SingleHunger getInstance(){
		return Holder.instance;
	}
}

class getTask implements Runnable{
	@Override
	public void run() {
		SingleLazy instance1 = SingleLazy.getInstance();
		System.out.println(instance1);
		SingleHunger instance2 = SingleHunger.getInstance();
		System.out.println(instance2);
	}
}