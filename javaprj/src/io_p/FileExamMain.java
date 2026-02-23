package io_p;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

class FileExamStud {
	String name, jumS;
	int total, evg, rank;
	String [] jum;
	
	FileExamStud(String name, String jumS) {
		this.name = name.trim();
		this.jumS = jumS.trim();
		jum = jumS.split(",");
		calc();
	}
	
	void calc() {
		for (int i=0; i<jum.length; i++) {
			total += (jum[i].charAt(0)-'0')*10 + jum[i].charAt(1)-'0';
		}
		
		evg = total/jum.length;
		rank = 1;
	}

	@Override
	public String toString() {
		return name + "_" + jumS + "," + total + "," + evg + "," + rank;
	}
	
	
}

public class FileExamMain {

	public static void main(String[] args) {
		FileExamStud [] st = new FileExamStud[5];
		try {
			Reader rr = new FileReader("fff/exam.txt");
			Writer ww = new FileWriter("ggg/examRes.txt", true);
			
			int data, cnt = 0;
			
			String ttt = "";
			while((data = rr.read()) != -1) {
				if (((char)data) == '\n') {
					st[cnt++] = new FileExamStud(ttt.split("_")[0], ttt.split("_")[1]);
					ttt = "";
					data = 0;
				}
				if (data != 13) {
				}
				ttt += (char)data;
			}
			st[cnt++] = new FileExamStud(ttt.split("_")[0], ttt.split("_")[1]);
			
			
			for (int i=0; i<st.length; i++) {
				for (int j=0; j<st.length; j++) {
					if (st[i].total > st[j].total) {
						st[j].rank++;
					}
				}
			}
			
			for (FileExamStud fs : st) {
				System.out.println(fs);
			}
			
			for (int i=0; i<st.length; i++) {
				if (i != 4) {
					ww.write(st[i]+"\n");
				}
				else {
					ww.write(st[i]+"");
				}
			}
			
			ww.close();
			rr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
