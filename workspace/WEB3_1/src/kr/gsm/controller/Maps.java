package kr.gsm.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Maps{
public static void main(String[] args) throws JSONException {
        try {
 
        	Scanner scan = new Scanner(System.in);
        	System.out.print("주소를 입력: ");

            String location = scan.next();
 
            String addr = "https://dapi.kakao.com/v2/local/search/address.json";
 
            String apiKey = "KakaoAK 414d687eeafb18a6979a63d226bca63e";
 
            location = URLEncoder.encode(location, "UTF-8");
 
            String query = "query=" + location;
            
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(addr);
            stringBuffer.append("?");
            stringBuffer.append(query);
            
            System.out.println("stringBuffer.toString() "+ stringBuffer.toString());
            
            URL url = new URL(stringBuffer.toString());
            
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            conn.setRequestProperty("Authorization", apiKey);
            conn.setRequestMethod("GET");
            
            BufferedReader rd = null;
            
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            StringBuffer docJson = new StringBuffer();
            
            String line;
            
            while((line=rd.readLine())!=null){
                docJson.append(line);
            }
            
            if(0<docJson.toString().length()){
                System.out.println("docJson    :"+docJson.toString());
                
            }
            
            rd.close();
            
            JSONObject jsonObject = new JSONObject(docJson.toString());
            
            JSONArray jsonArray= (JSONArray) jsonObject.get("documents");
            
            JSONObject tempObj = (JSONObject) jsonArray.get(0);
                
            System.out.println("latitude : " + tempObj.getDouble("y"));
            System.out.println("longitude : " + tempObj.getDouble("x"));
            
        }catch(Exception e) {
            e.printStackTrace();
        }
      }
    }
