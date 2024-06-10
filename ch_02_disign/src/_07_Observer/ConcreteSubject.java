package _07_Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	//감시자를 담을 리스트를 만든다
	List<Observer> observers = new ArrayList();
	
	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println(o+"구독 완료");
	}


	@Override
	public void removeObserver(Observer o) {
		
		observers.remove(o);
		System.out.println(o+"구독 취소");
	}
//  감사자에게 이벤트 송신
	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update();//각각의 객체에게 위임
		}
	}


}
