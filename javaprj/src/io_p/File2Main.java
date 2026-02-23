package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Date;

public class File2Main {

	public static void main(String[] args) throws Exception {
		File ff = new File("fff/aaa.txt");
		
		System.out.println(ff);
		System.out.println(ff.exists());		// 파일 존재 여부 확인
		System.out.println(ff.isFile());		// 파일인지 확인
		System.out.println(ff.isDirectory());	// 디렉터리인지 확인
		System.out.println(ff.isAbsolute());	// 절대주소인지 확인
		System.out.println(ff.getParent());		// 파일을 포함하고 있는 폴더
		System.out.println(ff.getName());		// 파일 이름
		System.out.println(ff.getAbsolutePath());	// 절대주소 경로
		System.out.println(ff.getPath());		// 주소
		System.out.println(ff.isHidden());		// 숨김파일인지 확인
		System.out.println(ff.canExecute());	// 리눅스에서는 파일 실행을 못하도록 막을 수 있음 (윈도우에서는 항상 true라 의미 없음)
		System.out.println(ff.canRead());		// 파일을 읽을 수 있는지
		System.out.println(ff.canWrite());		// 파일을 쓸 수 있는지
		System.out.println(ff.length());		// 파일 크기
		System.out.println(ff.lastModified());	// 마지막 수정시간
		System.out.println(new Date(ff.lastModified()));	// 마지막 수정시간
		
		// 새로운 파일 생성
		ff = new File("fff/ggg.txt");
		boolean bb = ff.createNewFile();
		
		// 새로운 폴더(디렉터리) 생성
		bb = new File("fff/qqq").mkdir();
//		new File("fff/rrr/uuu").mkdir();	rrr이 없는 폴더라 만들지 않음
		bb = new File("fff/rrr/uuu").mkdirs();
		
		// 파일 삭제
		bb = new File("fff/ggg.txt").delete();
		System.out.println(bb);	// 파일 삭제 성공 여부
		
		// 디렉터리 삭제
		bb = new File("fff/qqq").delete();
		System.out.println(bb);	// 폴더 삭제 성공 여부
		bb = new File("fff/rrr").delete();	// false -> 빈 폴더만 삭제 가능
		System.out.println(bb);	// 폴더 삭제 성공 여부
		
		// 파일 이동
		bb = new File("fff/ddd.txt").renameTo(new File("ggg/sss.txt"));
		System.out.println(bb);
		
		// 파일 복사
		Files.copy(new File("fff/dog.jpg").toPath(), new FileOutputStream("ggg/dog2.jpg"));
		
		
		System.out.println("-----------------------------");
		
		// fff 안에 존재하는 파일, 폴더를 모두 보겠다
		File [] arr = new File("fff").listFiles();
		for (File file : arr) {
			System.out.println(file.getName());
		}
	}

}
