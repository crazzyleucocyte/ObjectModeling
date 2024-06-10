package _07_Observer;

public class ObserverA implements Observer {

	@Override
	public void update() {
		System.out.println("옵저버에이에게 이벤트 알림이 왔습니다.");
	}

	@Override
	public String toString() {
		return "Observer A";
	}
	
}
