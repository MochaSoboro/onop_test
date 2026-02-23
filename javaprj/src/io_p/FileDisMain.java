package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;

//ori 폴더의 파일을 각각 종류별로 dst 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요
//이미지 : bmp, jpg, gif, png, jpeg
//음악 : mp3, wma, wav
//문서 : doc, hwp, ppt, xls, pptx, xlsx, docx
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음

public class FileDisMain {
	
	public static void main(String[] args) throws Exception {
		File [] arr = new File("ori").listFiles();
		String imgExt = "bmp, jpg, gif, png, jpeg";
		String musicExt = "mp3, wma, wav";
		String docExt = "doc, hwp, ppt, xls, pptx, xlsx, docx";
		
		
		String path;
		for (File file : arr) {
			path = file.getParent()+"\\"+file.getName();
//			System.out.println(file.getParent()+"\\"+file.getName());
			// 파일인지 확인
			if (new File(path).isFile()) {
				// 파일 확장자 확인
				String ext = file.getName().substring(file.getName().lastIndexOf(".")+1).toLowerCase();
				
				if (imgExt.contains(ext)) {
					if (!new File("organize\\image").exists()) {
						new File("organize\\image").mkdir();
					}
					Files.copy(new File(path).toPath(), new FileOutputStream("organize\\image"+"\\"+file.getName()));
				}
				else if (musicExt.contains(ext)) {
					
					if (!new File("organize\\music").exists()) {
						new File("organize\\music").mkdir();
					}
					Files.copy(new File(path).toPath(), new FileOutputStream("organize\\music"+"\\"+file.getName()));
				}
				else if (docExt.contains(ext)) {
					
					if (!new File("organize\\document").exists()) {
						new File("organize\\document").mkdir();
					}
					Files.copy(new File(path).toPath(), new FileOutputStream("organize\\document"+"\\"+file.getName()));
				}
				else {
					
					if (!new File("organize\\etc").exists()) {
						new File("organize\\etc").mkdir();
					}
					Files.copy(new File(path).toPath(), new FileOutputStream("organize\\etc"+"\\"+file.getName()));
				}
				
			}
			if (new File(path).isDirectory()) {
				System.out.println("폴더");
				for (File sub_file : new File(path).listFiles()) {
					String sub_path = sub_file.getParent()+"\\"+sub_file.getName();
					System.out.println(sub_file);
					if (new File(sub_path).isFile()) {
						// 파일 확장자 확인
						String ext = sub_file.getName().substring(sub_file.getName().lastIndexOf(".")+1).toLowerCase();
						
						if (imgExt.contains(ext)) {
							if (!new File("organize\\image").exists()) {
								new File("organize\\image").mkdir();
							}
							Files.copy(new File(sub_path).toPath(), new FileOutputStream("organize\\image"+"\\"+sub_file.getName()));
						}
						else if (musicExt.contains(ext)) {
							if (!new File("organize\\music").exists()) {
								new File("organize\\music").mkdir();
							}
							Files.copy(new File(sub_path).toPath(), new FileOutputStream("organize\\music"+"\\"+sub_file.getName()));
						}
						else if (docExt.contains(ext)) {
							if (!new File("organize\\document").exists()) {
								new File("organize\\document").mkdir();
							}
							Files.copy(new File(sub_path).toPath(), new FileOutputStream("organize\\document"+"\\"+sub_file.getName()));
						}
						else {
							if (!new File("organize\\etc").exists()) {
								new File("organize\\etc").mkdir();
							}
							Files.copy(new File(sub_path).toPath(), new FileOutputStream("organize\\etc"+"\\"+sub_file.getName()));
						}
						
					}
				}
			}
		}
		
	}

}
