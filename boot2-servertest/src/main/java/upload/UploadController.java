package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@RequestMapping(value="/fileupload", method = RequestMethod.GET)
	public String uploadform() {
		return "upload/uploadform";
	}
	
	@RequestMapping(value="/fileupload", method = RequestMethod.POST)
	public String uploadresult(@ModelAttribute("dto") UploadDTO dto) throws IOException {
		MultipartFile mf1 = dto.getFile1();
		MultipartFile mf2 = dto.getFile2();
		
		System.out.println(dto.getName());
		System.out.println(dto.getDescription());
		
		System.out.println(mf1.getOriginalFilename()); //MultipartFile의 파일이름을 보여주는 메소드
		System.out.println(mf2.getOriginalFilename());
		
		System.out.println(mf1.getSize()); //파일 사이즈 (길이)
		System.out.println(mf2.getSize());
		
		System.out.println(mf1.isEmpty()); //파일선택여부
		System.out.println(mf2.isEmpty());
		
		
		//파일내용 + 파일명 -> 서버 c:/upload 폴더에 영구저장
		String savePath = "c:/upload/";
		
		
		if(!mf1.isEmpty()) {
			String originname1 = mf1.getOriginalFilename();
			String beforeext1 = originname1.substring(0, originname1.indexOf("."));
			String ext1 = originname1.substring(originname1.indexOf("."));
			File serverfile1 = new File(savePath + beforeext1+"("+UUID.randomUUID().toString()+")"+ ext1);
			mf1.transferTo(serverfile1);
		}
		if(!mf2.isEmpty()) {
			String originname2 = mf2.getOriginalFilename();
			String beforeext2 = originname2.substring(0, originname2.indexOf("."));
			String ext2 = originname2.substring(originname2.indexOf("."));
			File serverfile2 = new File(savePath + beforeext2+"("+UUID.randomUUID().toString()+")"+ ext2);
			mf2.transferTo(serverfile2);
		}
		
		
		//파일이름 랜덤지정 (같은 파일 저장시에 아예 다른 파일명으로 저장하거나 파일명뒤에 (1), (2)를 붙이는 방법 사용가능
		//System.out.println(UUID.randomUUID().toString().substring(0,10));
		//System.out.println(UUID.randomUUID().toString());
		
		return "upload/uploadresult";
	}
}
