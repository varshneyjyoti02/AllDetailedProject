package com.cgi.mobilepurchase1.util;

import java.util.*;
import com.cgi.mobilepurchase1.bean.*;
public class MobileRepository {
	private static List<Mobile> MobilesList;
       static {
    	   prepareMobilesList();
       }
       private static void prepareMobilesList() {
    	   MobilesList=new ArrayList<>();
    	   MobilesList.add(new Mobile(1001,"Nokia Lumia 520",8000,20));
    	   MobilesList.add(new Mobile(1002,"Samsung Galaxy IV",38000,40));
    	   MobilesList.add(new Mobile(1003,"Sony Xperia C",15000,30));
    	   MobilesList.add(new Mobile(1004,"Honor View 20",48000,10));
    	   MobilesList.add(new Mobile(1005,"Apple iPhone X",75000,5));
    	   MobilesList.add(new Mobile(1006,"LG V40 ThinQ",49900,14));
    	   MobilesList.add(new Mobile(1007,"Samsung Galaxy Note 8",13000,25));
    	   MobilesList.add(new Mobile(1008,"Xiaomi Redmi 6 Pro",9999,35));
    	   MobilesList.add(new Mobile(1009,"OnePlus 6T McLaren Edition",50999,10));
    	   MobilesList.add(new Mobile(1010,"Panasonic Eluga Z",10000,25));
       }
       public static List<Mobile> getMobilesList(){
    	   
    	   return MobilesList;
       }
}
