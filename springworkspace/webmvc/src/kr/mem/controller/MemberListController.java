package kr.mem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberListController  implements Controller{
    public String requestHandler(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException{
    	
    	MemberDAO dao=new MemberDAO();
		ArrayList<MemberVO> list=dao.memList();		
		request.setAttribute("list", list);//°´Ã¼¹ÙÀÎµù
		String nextPage="member/memberList.jsp";
		return nextPage;
    }
}
