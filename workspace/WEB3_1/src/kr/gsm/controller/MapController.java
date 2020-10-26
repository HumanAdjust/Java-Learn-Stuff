package kr.gsm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import kr.gsm.model.LBSMAP;
@WebServlet("/map.do")
public class MapController extends HttpServlet {
	   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.setCharacterEncoding("utf-8");
	         String location=request.getParameter("address");
	         
	         LBSMAP map=new LBSMAP();
	         try {
	         String json=map.getMaps(location);
	         
	         response.setContentType("text/json;charset=euc-kr");
	           PrintWriter out=response.getWriter();    
	           out.println(json);
	             
	      } catch (Exception e) {         
	         e.printStackTrace();
	      }         
	   }

}