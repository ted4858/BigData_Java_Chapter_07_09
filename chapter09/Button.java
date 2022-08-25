package chapter09;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void onTouch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
