package a;

import java.util.*;
 
public class silent {
	
	static Formatter x;
	static Scanner scn;
	public static void main(String args[]) {
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			String b = null;
			String mm = null;
	    	
	    	Calendar rightNow = Calendar.getInstance();
            
            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
            int min = rightNow.get(Calendar.MINUTE);
            int sec = rightNow.get(Calendar.SECOND);
            int day = rightNow.get(Calendar.DATE);
            int m = rightNow.get(Calendar.MONTH)+1;
            int r = rightNow.get(Calendar.YEAR);
            int w = rightNow.get(Calendar.DAY_OF_WEEK);
            	
            	//�� ����
            	if(w == 1){
            		b = ("�����");
            	}
            	if(w == 2){
            		b = ("��������");
            	}
            	if(w == 3){
            		b = ("³������");
            	}
            	if(w == 4){
            		b = ("������");;
            	}
            	if(w == 5){
            		b = ("������");
            	}
            	if(w == 6){
            		b = ("�'������");
            	}
            	if(w == 7){
            		b = ("������");
            	}
            	//̳����
            	if(m == 1){
            		mm = ("ѳ����");
            	}
            	if(m == 2){
            		mm = ("������");
            	}
            	if(m == 3){
            		mm = ("��������");
            	}
            	if(m == 4){
            		mm = ("������");
            	}
            	if(m == 5){
            		mm = ("�������");
            	}
            	if(m == 6){
            		mm = ("�������");
            	}
            	if(m == 7){
            		mm = ("������");
            	}
            	if(m == 8){
            		mm = ("�������");
            	}
            	if(m == 9){
            		mm = ("��������");
            	}
            	if(m == 10){
            		mm = ("������");
            	}
            	if(m == 11){
            		mm = ("���������");
            	}
            	if(m == 12){
            		mm = ("������");
            	}
            	//������� ����
            	if(m == 1){
            		if(day == 1){
            			x.format("� ����� �����!\n");
            		}
            		if(day == 7){
            			x.format("� г����� ���������!\n");
            		}
            	}
            	if(m == 3){
            		if(day == 8){
            			x.format("8 ������� �_� ������� ���� �� ����������!!!\n");
            		}
            	}
            	if(m == 4){
            		if(day == 28){
            			x.format("� ������ ������!!! ���� �� ������!!!\n");
            		}
            		if(day == 1){
            			x.format("�������������� ����� � �������� ����� 5�!!!\n");
                    	x.format("� ������ ������!=)\n");
            		}
            	}
            	if(m == 9){
            		if(day == 1  ){
            		x.format("�˲� �� �ϲ��ު��� �� ����!!!\n");
            		}
            	}
            	System.out.println(day+" "+mm+" "+r+" "+hour+":"+min+":"+sec+" ("+b+")");
    	    	String a = (day+" "+mm+" "+r+" "+hour+":"+min+":"+sec+" ("+b+")");
    	    	
    	    	x.format("��� ������� ��: %s", a);
    	    	x.close();
            
			
		}catch(Exception e){};
    	
	}
}