package a;

import java.util.*;
 
public class silent {
	
	static Formatter x;
	static Scanner scn;
	String a = name;
	public static void main(String args[]) {
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
	    	
	    	Calendar rightNow = Calendar.getInstance();
            
            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
            int min = rightNow.get(Calendar.MINUTE);
            int sec = rightNow.get(Calendar.SECOND);
            int day = rightNow.get(Calendar.DATE);
            int m = rightNow.get(Calendar.MONTH)+1;
            int r = rightNow.get(Calendar.YEAR);
            int w = rightNow.get(Calendar.DAY_OF_WEEK);
            
            	if(w == 1){
            		String b = ("�����");
            		
                    System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s \n", a);
        	    	x.close();
            	}
            	if(w == 2){
            		String b = ("��������");
            		
            		System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s", a);
        	    	x.close();
            	}
            	if(w == 3){
            		String b = ("³������");
            		
            		System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s", a);
        	    	x.close();
            	}
            	if(w == 4){
            		String b = ("������");
            		
            		System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s", a);
        	    	x.close();
            	}
            	if(w == 5){
            		String b = ("������");
            		
            		System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s", a);
        	    	x.close();
            	}
            	if(w == 6){
            		String b = ("�'������");
            		
            		System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s", a);
        	    	x.close();
            	}
            	if(w == 7){
            		String b = ("������");
            		
            		System.out.println(day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");
        	    	String a = (day+"."+m+"."+r+" "+hour+":"+min+":"+sec+" ("+b+")");//scn.next();
        	    	
            		x.format("����� ������� ��: %s", a);
        	    	x.close();
            	}
            
			
		}catch(Exception e){};
    	
	}
}