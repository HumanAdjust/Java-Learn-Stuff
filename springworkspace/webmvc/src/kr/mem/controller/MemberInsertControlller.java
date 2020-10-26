package kr.mem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberInsertControlller  implements Controller{
	  public String requestHandler(HttpServletRequest request, 
	    		HttpServletResponse response) throws ServletException, IOException{
	        // 파라메터 수집
		    int bun=Integer.parseInt(request.getParameter("bun"));
			String name=request.getParameter("name");
			String phone=request.getParameter("phone");
			String email=request.getParameter("email");
			String addr=request.getParameter("addr");
			// Model연동(DAO)
			MemberVO vo=new MemberVO();
		    vo.setBun(bun);
		    vo.setName(name);
		    vo.setPhone(phone);
		    vo.setEmail(email);
		    vo.setAddr(addr);
		    
		    MemberDAO dao=new MemberDAO();
		    int cnt=dao.memInsert(vo);
		    String nextPage=null;
		    if(cnt>0) {
		    	//성공->리스트 페이지로 이동? 404
		    	nextPage="redirect:/webmvc/list.do"; // MemberListController
		    }else {
		       	throw new ServletException("error");
		    }
		    return nextPage;
	  }	  
}
