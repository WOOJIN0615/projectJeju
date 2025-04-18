package com.jeju.app.publicBoards;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.jeju.app.pages.PB_Pager;
import com.jeju.app.pages.Pager;

public interface PB_Service {
	
	public List<PB_DTO> getList(PB_Pager pager) throws Exception;
	
	public int add(PB_DTO dto, HttpSession session) throws Exception;
	
	public int delete(PB_DTO dto, HttpSession session) throws Exception;
	
	public PB_DTO getDetail(PB_DTO dto) throws Exception;
	
	public int update(PB_DTO dto, HttpSession session) throws Exception;

}
