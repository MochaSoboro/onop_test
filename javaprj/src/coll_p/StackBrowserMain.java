package coll_p;

import java.util.Stack;

class StackBrowser {
	Object now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void goUrl(String url) {
		System.out.println("goUrl("+url+")");
		
		next.clear();
		
		if (now != null) {
			back.push(now);
		}
		now = url;
		
		ppp();
	}
	
	void goBack() {
		System.out.println("goBack()");
		if (back.empty()) {
			System.out.println("뒤로 갈 페이지 없음");
			return;
		}
		next.push(now);
		now = back.pop();
		
		ppp();
	}
	
	void goNext() {
		System.out.println("goNext()");
		if (next.empty()) {
			System.out.println("앞으로 갈 페이지 없음");
			return;
		}
		back.push(now);
		now = next.pop();
		
		ppp();
	}
	
	void ppp() {
		System.out.println("현재 : "+now);
		System.out.println("이전 : "+back);
		System.out.println("다음 : "+next);
	}
}

public class StackBrowserMain {

	public static void main(String[] args) {
		StackBrowser sb = new StackBrowser();
		sb.goUrl("naver");
		sb.goUrl("google");
		sb.goUrl("daum");
		sb.goUrl("zoom");
		sb.goUrl("yahoo");
		sb.goBack();
		sb.goBack();
		sb.goBack();
		sb.goBack();
		sb.goNext();
		sb.goNext();
		sb.goUrl("youtube");
	}

}
