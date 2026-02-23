package coll_p;

import java.util.Stack;

//mp3 노래듣기를 구현하세요
//1. 노래 정보 :  트랙번호, 노래제목, 가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 다음곡, 이전곡, 트랙번호

class MP3Music {
	String title, singer;
	int num;
	MP3Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "["+num+", "+title + ", " + singer+"]";
	}
}

class MusicList {
	Object now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void play(MP3Music [] music) {
		if (now != null) {
			back.push(now);
		}
		
		for (int i=music.length-1; i>=0; i--) {
			next.push(music[i]);
			music[i].num = i+1;
		}
		now = next.pop();
		ppp();
	}
	
	void next() {
		if (next.isEmpty()) {
			System.out.println("플레이리스트 마지막 곡");
			System.out.println("--------------------");
			return;
		}
		back.push(now);
		now = next.pop();
		ppp();
	}
	
	void back() {
		if (back.isEmpty()) {
			System.out.println("플레이리스트 첫번째 곡");
			System.out.println("--------------------");
			return;
		}
		next.push(now);
		now = back.pop();
		ppp();
		
	}
	
	void ppp() {
		System.out.println("이전 : "+back);
		System.out.println("현재 : "+now);
		System.out.println("다음 : "+next);
		System.out.println("--------------------");
	}
}

public class StackMP3Main {
	
	
	
	public static void main(String[] args) {
		MP3Music [] musicList = {
				new MP3Music("위너", "really really"),
				new MP3Music("아이콘", "사랑을 했다"),
				new MP3Music("화사", "Good Goodbye"),
				new MP3Music("다비치", "타임캡슐"),
				new MP3Music("올데프", "ONE MORE TIME"),
				new MP3Music("엑소", "첫눈"),
		};

		MusicList ml = new MusicList();
		
		ml.play(musicList);
		ml.next();
		ml.next();
		ml.next();
		ml.next();
		ml.back();
		ml.next();
		ml.next();
		ml.next();
		ml.back();
		ml.back();
	}
	
}
