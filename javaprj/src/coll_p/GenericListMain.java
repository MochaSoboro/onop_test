package coll_p;

import java.util.ArrayList;
import java.util.Iterator;

class Phone {}
class HandPhone extends Phone {}
class SmartPhone extends HandPhone {}
class TV {}

public class GenericListMain {

	public static void main(String[] args) {
		ArrayList ooArr = new ArrayList();	// Object
		ArrayList<Phone> phoneArr = new ArrayList();
		ArrayList<HandPhone> handArr = new ArrayList();
		ArrayList<SmartPhone> smartArr = new ArrayList();
		ArrayList<? super HandPhone> superHandArr = new ArrayList();	// 자신 + 자손, handArr과 같음
		ArrayList<? extends HandPhone> extendsHandArr = new ArrayList();	// 의미 없음
		ArrayList<TV> tvArr = new ArrayList();
		
		// Object
		ooArr.add(new TV());
		ooArr.add(new Phone());
		ooArr.add(new HandPhone());
		ooArr.add(new SmartPhone());
		
		// Phone
//		phoneArr.add(new TV());
		phoneArr.add(new Phone());		// 자신 가능
		phoneArr.add(new HandPhone());	// 자손 가능
		phoneArr.add(new SmartPhone());	// 자손 가능
		
		// HandPhone
//		handArr.add(new TV());
//		handArr.add(new Phone());		// 부모 불가
		handArr.add(new HandPhone());	// 자신 가능
		handArr.add(new SmartPhone());	// 자손 가능
		
		// SmartPhone
//		smartArr.add(new TV());
//		smartArr.add(new Phone());
//		smartArr.add(new HandPhone());
		smartArr.add(new SmartPhone());	// 자신 가능
		
		// <? super HandPhone> = <HandPhone>
//		superHandArr.add(new TV());
//		superHandArr.add(new Phone());
		superHandArr.add(new HandPhone());	// 자신 가능
		superHandArr.add(new SmartPhone());	// 자손 가능
		
		// <? extends Phone>	모두 불가
//		extendsHandArr.add(new TV());
//		extendsHandArr.add(new Phone());
//		extendsHandArr.add(new HandPhone());
//		extendsHandArr.add(new SmartPhone());
		
		// TV
		tvArr.add(new TV());
//		tvArr.add(new Phone());
//		tvArr.add(new HandPhone());
//		tvArr.add(new SmartPhone());
		
		// Object
		methObj(ooArr);
		methObj(phoneArr);
		methObj(handArr);
		methObj(smartArr);
		methObj(superHandArr);
		methObj(extendsHandArr);
		methObj(tvArr);
		
		// Phone - 자신만 가능
//		methPhone(ooArr);	컴파일 시 정상으로 보이나 실행시 에러 발생
		methPhone(phoneArr);
//		methPhone(handArr);
//		methPhone(smartArr);
//		methPhone(superHandArr);
//		methPhone(extendsHandArr);
//		methPhone(tvArr);
		
		// HandPhone - 자신만 가능
//		methHand(ooArr);	컴파일 시 정상으로 보이나 실행시 에러 발생
//		methHand(phoneArr);
		methHand(handArr);
//		methHand(smartArr);
//		methHand(superHandArr);
//		methHand(extendsHandArr);
//		methHand(tvArr);
		
		// SmartPhone - 자신만 가능
//		methSmart(ooArr);	컴파일 시 정상으로 보이나 실행시 에러 발생
//		methSmart(phoneArr);
//		methSmart(handArr);
		methSmart(smartArr);
//		methSmart(superHandArr);
//		methSmart(extendsHandArr);
//		methSmart(tvArr);
		
		// <? extends HandPhone> - 자신, 자손 가능
//		methEx(ooArr);	컴파일 시 정상으로 보이나 실행시 에러 발생
//		methEx(phoneArr);
		methEx(handArr);	// 자신 가능
		methEx(smartArr);	// 자손 가능
//		methEx(superHandArr);
		methEx(extendsHandArr);	// 자신 + 자손 가능
//		methEx(tvArr);
		
		// <? super HandPhone>
//		methSuper(ooArr);	컴파일 시 정상으로 보이나 실행시 에러 발생
		methSuper(phoneArr);	// 부모
		methSuper(handArr);		// 자신
//		methSuper(smartArr);
		methSuper(superHandArr);	// 부모 + 자신
//		methSuper(extendsHandArr);
//		methSuper(tvArr);
		
		Iterator itObj;
		itObj = ooArr.iterator();
		itObj = phoneArr.iterator();
		itObj = handArr.iterator();
		itObj = smartArr.iterator();
		itObj = superHandArr.iterator();
		itObj = extendsHandArr.iterator();
		itObj = tvArr.iterator();
		
		Iterator<Phone> itPhone;
//		itPhone = ooArr.iterator();
		itPhone = phoneArr.iterator();
//		itPhone = handArr.iterator();
//		itPhone = smartArr.iterator();
//		itPhone = superHandArr.iterator();
//		itPhone = extendsHandArr.iterator();
//		itPhone = tvArr.iterator();
		
		Iterator<HandPhone> itHand;
//		itHand = ooArr.iterator();
//		itHand = phoneArr.iterator();
		itHand = handArr.iterator();
//		itHand = smartArr.iterator();
//		itHand = superHandArr.iterator();
//		itHand = extendsHandArr.iterator();
//		itHand = tvArr.iterator();
		
		Iterator<SmartPhone> itSmart;
//		itSmart = ooArr.iterator();
//		itSmart = phoneArr.iterator();
//		itSmart = handArr.iterator();
		itSmart = smartArr.iterator();
//		itSmart = superHandArr.iterator();
//		itSmart = extendsHandArr.iterator();
//		itSmart = tvArr.iterator();
		
		Iterator<? super HandPhone> itSuper;	// 자신 + 부모
//		itSuper = ooArr.iterator();
		itSuper = phoneArr.iterator();		// 자신
		itSuper = handArr.iterator();		// 부모
//		itSuper = smartArr.iterator();
		itSuper = superHandArr.iterator();	// 자신 + 부모
//		itSuper = extendsHandArr.iterator();
//		itSuper = tvArr.iterator();
		
		Iterator<? extends HandPhone> itEx;	// 자신 + 자손
//		itEx = ooArr.iterator();
//		itEx = phoneArr.iterator();
		itEx = handArr.iterator();		// 자신
		itEx = smartArr.iterator();		// 자손
//		itEx = superHandArr.iterator();
		itEx = extendsHandArr.iterator();	// 자신 + 자손
//		itEx = tvArr.iterator();
		
		Iterator<TV> itTv;
//		itTv = ooArr.iterator();
//		itTv = phoneArr.iterator();
//		itTv = handArr.iterator();
//		itTv = smartArr.iterator();
//		itTv = superHandArr.iterator();
//		itTv = extendsHandArr.iterator();
		itTv = tvArr.iterator();
		
	}
	
	static void methObj(ArrayList arr) {
		for (Object obj : arr) {
			
		}
	}
	
	static void methPhone(ArrayList<Phone> arr) {
		for (Phone obj : arr) {
			
		}
	}
	
	static void methHand(ArrayList<HandPhone> arr) {
		for (HandPhone obj : arr) {
			
		}
	}
	
	static void methSmart(ArrayList<SmartPhone> arr) {
		for (SmartPhone obj : arr) {
			
		}
	}
	
	static void methEx(ArrayList<? extends HandPhone> arr) {	// 자신 + 자손
		for (HandPhone obj : arr) {
			
		}
	}
	
	static void methSuper(ArrayList<? super HandPhone> arr) {	// 자신 + 부모
//		for (HandPhone obj : arr) {		}
		for (Object obj : arr) {	// 부모가 가능하기에 Object로 올라가야함
			
		}
	}

}
