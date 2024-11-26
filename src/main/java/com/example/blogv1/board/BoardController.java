package com.example.blogv1.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor //final이 붙은 필드에 대한 생성자 만들어줌
@Controller
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public String list(Model model) {
        List<BoardResponse.DTO> boardList = boardService.게시글목록보기();
        model.addAttribute("boardList",boardList);
        return "list";
    }

}
