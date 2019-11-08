package cn.callback;

public class CallBack_test {
	public static void main(String[] args) {
		printFrame(new MyFrame01());
	}
	public static void printFrame(IMyFrame f) {
		f.drawFrame();
	}
	
}

class MyFrame01 implements IMyFrame{
	public void drawFrame() {
		System.out.println("»­³ö´°¿Ú£¡£¡£¡");
	}
}
