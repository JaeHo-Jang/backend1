package com.highgarden.springboot_board.service;

import com.highgarden.springboot_board.dto.BoardDTO;
import com.highgarden.springboot_board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
   private final BoardRepository boardRepository;

    public void save(BoardDTO boardDto) {
        boardRepository.save(boardDto);
    }
}
