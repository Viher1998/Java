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
            	
            	//Дні неділі
            	if(w == 1){
            		b = ("Неділя");
            	}
            	if(w == 2){
            		b = ("Понеділок");
            	}
            	if(w == 3){
            		b = ("Вівторок");
            	}
            	if(w == 4){
            		b = ("Середа");;
            	}
            	if(w == 5){
            		b = ("Четвер");
            	}
            	if(w == 6){
            		b = ("П'ятниця");
            	}
            	if(w == 7){
            		b = ("Субота");
            	}
            	//Місяця
            	if(m == 1){
            		mm = ("Січеня");
            	}
            	if(m == 2){
            		mm = ("Лютого");
            	}
            	if(m == 3){
            		mm = ("Березеня");
            	}
            	if(m == 4){
            		mm = ("Квітеня");
            	}
            	if(m == 5){
            		mm = ("Травеня");
            	}
            	if(m == 6){
            		mm = ("Червеня");
            	}
            	if(m == 7){
            		mm = ("Липеня");
            	}
            	if(m == 8){
            		mm = ("Серпеня");
            	}
            	if(m == 9){
            		mm = ("Вересеня");
            	}
            	if(m == 10){
            		mm = ("Жовтня");
            	}
            	if(m == 11){
            		mm = ("Листопада");
            	}
            	if(m == 12){
            		mm = ("Грудня");
            	}
            	//Визначні дати
            	if(m == 1){
            		if(day == 1){
            			x.format("З Новим Роком!\n");
            		}
            		if(day == 7){
            			x.format("З Різдвом Христовим!\n");
            		}
            	}
            	if(m == 3){
            		if(day == 8){
            			x.format("8 БЕРЕЗНЯ О_О Потрібно бігти за подарунком!!!\n");
            		}
            	}
            	if(m == 4){
            		if(day == 28){
            			x.format("З Днюхою Хазяїн!!! ЙОПТ го бухати!!!\n");
            		}
            		if(day == 1){
            			x.format("Форматирование диска С начнется через 5с!!!\n");
                    	x.format("З Першем Квітням!=)\n");
            		}
            	}
            	if(m == 9){
            		if(day == 1  ){
            		x.format("БЛІН ТИ СПІЗНЮЄШСЯ НА ПАРИ!!!\n");
            		}
            	}
            	System.out.println(day+" "+mm+" "+r+" "+hour+":"+min+":"+sec+" ("+b+")");
    	    	String a = (day+" "+mm+" "+r+" "+hour+":"+min+":"+sec+" ("+b+")");
    	    	
    	    	x.format("Час запуску ПК: %s", a);
    	    	x.close();
            
			
		}catch(Exception e){};
    	
	}
}