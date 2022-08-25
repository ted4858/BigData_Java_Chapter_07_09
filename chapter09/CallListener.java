package chapter09;

public class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.printf("%s \r\n", "전화를 겁니다.");
	}
}
