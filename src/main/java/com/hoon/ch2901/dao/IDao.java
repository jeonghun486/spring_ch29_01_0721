package com.hoon.ch2901.dao;

import java.util.ArrayList;

import com.hoon.ch2901.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao(); // ����Ʈ �ҷ�����
	public void writeDao(String mwriter, String mcontent);
	public void deleteDao(String mid);
	
}
