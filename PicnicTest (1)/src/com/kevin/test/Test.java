package com.kevin.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.general_member.model.*;
import com.manufacturers.model.*;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy",Locale.ENGLISH);
		SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd");
		
		String stdate = "1993-01-06";
		
		GeneralMemberDAO dd = new GeneralMemberDAO();
		GeneralMemberVO dc = dd.findByPrimaryKey("MG00000009");
        /*
		Date k = str.parse(stdate);
		System.out.println((java.sql.Date) k);
		dc.setMEM_BIRTH((java.sql.Date) k);*/
	}	
}
