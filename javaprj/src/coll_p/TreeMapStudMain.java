package coll_p;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class TreeStud implements Comparable<TreeStud> {
	final int ban;
	final String kind, name;
	final int jum;
	
	TreeStud(int ban, String kind, String name, int jum) {
		this.ban = ban;
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return ban + "\t" + kind + "\t" + name + "\t" + jum;
	}
	
	@Override
	public int compareTo(TreeStud you) {
		int res = you.jum - jum;
		
		if (res == 0) {
			res = name.compareTo(you.name);
		}
		return res;
	}
}

class MyMapCom implements Comparator<String> {
	@Override
	public int compare(String me, String you) {
		return you.compareTo(me);
	}
}

public class TreeMapStudMain {

	public static void main(String[] args) {
		TreeStud [] ori = {
			new TreeStud(2, "예체능", "원빈", 77),	
			new TreeStud(1, "일반", "투빈", 47),	
			new TreeStud(4, "예체능", "현빈", 67),	
			new TreeStud(4, "예체능", "김우빈", 97),	
			new TreeStud(1, "일반", "장희빈", 27),	
			new TreeStud(4, "일반", "하얼빈", 97),	
			new TreeStud(2, "예체능", "골빈", 47),	
			new TreeStud(1, "일반", "텅빈", 87),	
			new TreeStud(4, "일반", "커피빈", 27),	
			new TreeStud(2, "예체능", "빈미스터", 37),	
			new TreeStud(1, "예체능", "숙빈", 77),	
			new TreeStud(2, "일반", "젤리빈", 57),	
			new TreeStud(4, "일반", "속빈", 97),	
			new TreeStud(2, "예체능", "빈빈", 47),	
			new TreeStud(1, "예체능", "휘빈", 27),	
			new TreeStud(2, "일반", "내빈", 87),	
			new TreeStud(4, "일반", "허빈", 77),	
		};
		
		MyMapCom mmc = new MyMapCom();
		
		TreeMap<Integer, TreeMap<String, TreeSet<TreeStud>>> res = new TreeMap(new Comparator<Integer>() {
			@Override
			public int compare(Integer me, Integer you) {
				return you-me;	// 내림차순
			}
		});
		
		for (TreeStud st : ori) {
			TreeMap<String, TreeSet<TreeStud>> ban;
			if(res.containsKey(st.ban)) {
				ban = res.get(st.ban);
			}
			else {
				ban = new TreeMap(mmc);
			}
			
			res.put(st.ban, ban);
			
			
			TreeSet<TreeStud> kind;
			if(ban.containsKey(st.kind)) {
				kind = ban.get(st.kind);
			}
			else {
				kind = new TreeSet();
			}
			
			ban.put(st.kind, kind);
			
			kind.add(st);
			
			
		}
//		System.out.println(res);
		
		for (Map.Entry<Integer, TreeMap<String, TreeSet<TreeStud>>> banSet : res.entrySet()) {
//			Map.Entry<Integer, TreeMap<String, TreeSet<TreeStud>>> banSet = (Map.Entry)obj1;
			System.out.println("["+banSet.getKey()+"]");
			
			for (Map.Entry<String, TreeSet<TreeStud>> kindSet : banSet.getValue().entrySet()) {
//				Map.Entry<String, TreeSet<TreeStud>> kindSet = (Map.Entry)obj2;
				System.out.println(kindSet.getKey()+">>>>");
				for (TreeStud st : kindSet.getValue()) {
					System.out.println(st);
				}
			}
		}
	}

}
