package inhatc.cse.spring.service;

import inhatc.cse.spring.dto.BookDto;
import inhatc.cse.spring.dto.MemberDto;
import inhatc.cse.spring.repository.BookRepository;
import inhatc.cse.spring.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public int save(BookDto bookDto, MultipartFile bookImage) {
        String uploadDir = new File("src/main/resources/images").getAbsolutePath();
        // 파일 저장 로직 추가
        if (!bookImage.isEmpty()) {
            try {
                String fileName = bookImage.getOriginalFilename();
                String filePath = uploadDir + "/" + fileName;
                File dest = new File(filePath);
                bookImage.transferTo(dest);
                // 파일 경로를 DTO에 설정하거나 데이터베이스에 저장
                bookDto.setBookImagePath(filePath);

            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return bookRepository.save(bookDto);
    }
}
