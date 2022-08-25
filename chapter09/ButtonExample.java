package chapter09;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		CallListener call = new CallListener();
		
		btn.setOnClickListener(call);
		btn.onTouch();
		
		btn.setOnClickListener(new MessageListener());
		btn.onTouch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("새로운 버튼클릭");
			}
		});
		btn.onTouch();
		
		btn.setOnClickListener(()->{ //lambda, 8.0 버전부터 가능한 방식
			System.out.printf("%s \r\n", "람다클릭");
		});
		btn.onTouch();
		
		Button.OnClickListener onclick = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.printf("%s \r\n", "버튼 on Click");
				
			}
		};
		onclick.onClick();
		
	}
}
