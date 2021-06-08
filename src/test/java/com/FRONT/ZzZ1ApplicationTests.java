package com.FRONT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.FRONT.model.Board;
import com.FRONT.repository.BoardRepository;

@SpringBootTest
class ZzZ1ApplicationTests {

	@Autowired
	BoardRepository boardRepository;
	
	@Test
	void contextLoads() {
		
	}

	@Test
	public void dummyinsert() {
		for(int i =1 ; i<3 ; i++) {
			Board board = new Board(); 
	//		board.setId("id.."+i);
			board.setTitle("제목.."+i);
			board.setContent("내용"+i);
			board.setContent1("내용1"+i);
			board.setContent2("내용2"+i);
			board.setContent3("내용3"+i);
			board.setContent4("내용4"+i);
		
			boardRepository.save(board);
		}
	}
	
	
	
}


