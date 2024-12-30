package com.highgarden.springboot_board.controller;

import com.highgarden.springboot_board.dto.BoardDTO;
import com.highgarden.springboot_board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor //생성자 주입(DI)
public class BoardController {
    
    //@Autowired - final 빼고 @Autowired 를 넣어도 되고
    private final BoardService boardService;

    @GetMapping("/save")
    public String save(){
        return "save";
    }

    @PostMapping("/save")
    public void save(BoardDTO boardDto){
        boardService.save(boardDto);
    }

    
}
