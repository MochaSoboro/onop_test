package coll_p;

import java.util.Map;
import java.util.TreeMap;

public class WordCntMain {

	public static void main(String[] args) {
		String [] article = ("오너' 문현준이 소속팀 T1과 2년 연장 계약을 체결하며 오는 2028년까지 팀과 함께하게 됐다. "
				+ "T1은 24일 공식 유튜브와 SNS를 통해 '오너' 문현준과의 계약을 2년 연장해 2028년까지 함께하게 됐다고 밝혔다. "
				+ "2002년생인 '오너' 문현준은 2020년 T1 아카데미를 통해 입단, 2021시즌부터 1군 무대에 데뷔한 이후 빠르게 주전 정글러 자리를 꿰찼다. 공격적인 경기 운영과 뛰어난 한타 기여도를 앞세워 팀의 중심으로 활약했으며 특히 2022 리그 오브 레전드 월드 챔피언십(롤드컵) 준우승을 발판 삼아 2023년부터 2025년까지 전무후무한 롤드컵 3연패를 이끄는 데 핵심적인 역할을 했다. "
				+ "이번 재계약을 통해 문현준은 '페이커' 이상혁(2029년), '페이즈' 김수환(2028년)과 함께 장기 계약 라인업의 일원이 됐다. "
				+ "'오너' 문현준은 재계약 발표 영상에서 \"T1과 2년을 더 같이 하게 됐고 팬분들이 좋아해 주셨으면 좋겠다\"며 \"T1에 있는 동안에 함께 좋은 추억 만들어 가면서 좋은 선수로 보답하겠다. 선물 아닌 선물을 드릴 수 있게 돼서 개인적으로 행복하고 내년에도 좋은 모습 보이도록 노력하겠다\"고 말했다.").split(" ");

		TreeMap res = new TreeMap();
		for (int i=0; i<article.length; i++) {
//			System.out.println(article[i]);
			int cnt = 1;
			if (res.containsKey(article[i])) {
				cnt += (int)res.get(article[i]);
			}
			res.put(article[i], cnt);
		}
		

//		System.out.println(res);

		for (Object obj : res.entrySet()) {
			Map.Entry word = (Map.Entry)obj;
			System.out.println(word.getKey()+"\t:\t"+word.getValue());
		}
	}

}
