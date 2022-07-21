package com.hoon.ch2901.dao;

import java.util.ArrayList;

import com.hoon.ch2901.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao(); // 리스트 불러오기
	public void writeDao(String mwriter, String mcontent);
	public void deleteDao(String mid);
	
}
