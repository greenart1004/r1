package com.FRONT.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.FRONT.model.Board;
import com.FRONT.repository.BoardRepository;


@Controller
@RequestMapping("/board")
public class BoardController {


	    @Autowired
	    private BoardRepository boardRepository;

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
	}

    @GetMapping("/form")
    public String form(Model model, @RequestParam(required=false) Long id) {
    	if(id == null) {
	        model.addAttribute("board", new Board());
    	}else{
    		Board board = boardRepository.findById(id).orElse(null);
	        model.addAttribute("board", board);
    	}
    	      return "board/form";
	}

	    @PostMapping("/form")
	    public String greetingSubmit(@ModelAttribute Board board) {
	    	boardRepository.save(board);
	        return "board/detailform";

	}

//=====================================================================================

    @GetMapping("/detailform")
    public String detailform(Model model, @RequestParam(required=false) Long id) {
		Board board = boardRepository.findById(id).orElse(null);
        model.addAttribute("board", board);
        return "board/detailform";
	}
}