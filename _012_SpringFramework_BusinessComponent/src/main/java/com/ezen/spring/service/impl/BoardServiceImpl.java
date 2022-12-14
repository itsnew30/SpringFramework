package com.ezen.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.spring.service.BoardService;
import com.ezen.spring.vo.BoardVO;

// ServiceImpl 비즈니스 로직을 구현하는 클래스
// 예를들면 공과급 납부시 할인율 계산, 스마트폰 시리얼번호 자동 생성...
// 비즈니스 로직이 처리가 완료된 데이터를 DB에 넣기 위해서 DAO 객체를 의존성 주입하여 사용
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	// 의존성 주입할 DAO 객체
	@Autowired 
	BoardDAO boardDAO;
	
	// 기본 게시판이라 따로 처리해줘야될 비즈니스 로직이 없어서 바로 DAO의 메소드를 호출하여 DB조작
	@Override
	public void insertBoard(BoardVO boardVO) {
		boardDAO.insertBoard(boardVO);
	}
	
	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}
	
	@Override
	public void deleteBoard(BoardVO boardVO) {
		boardDAO.deleteBoard(boardVO);
	}
	
	@Override
	public BoardVO getBoard(BoardVO boardVO) {
		return boardDAO.getBoard(boardVO);
	}
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}
	
}
