package thread;

public class MyThread implements Runnable{
	private int end;
	private String name;
	
	public MyThread (String name, int end){
		this.end = end;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<end; i++){
			System.out.println(name + ":" + i);
		}
	}
}
