package vn.vnpay;

import jdk.swing.interop.SwingInterOpUtils;
import vn.vnpay.fn_interface.Animal;
import vn.vnpay.fn_interface.Dog;

import java.util.*;

/**
 * @Version 08/12/2020
 * @Author Quangnv3
 */
public class MainApp {


    /**
     * @param code
     * @param role
     */
    @Deprecated
    static void getUser(String code, String role) {

        if (role.equals("A") || role.equals("a")) {
            code = "quang";
        }
    }

    enum season {

        SPRING(1, "xuan"),
        SUMMER(2, "ha");

        private Integer id;
        private String value;

        season(Integer id, String value) {
            this.id = id;
            this.value = value;
        }

    }

    static void testSwitch(int in) {

        switch (in) {
            case 1:
                System.out.println("this in one");
            case 2:
                System.out.println("this in two");
            case 3:
                System.out.println("this in three");
            default:
                System.out.println("defualt");
        }


    }

    public static void main(String[] args) {

//        getUser("A", "A");
//        var a = 16;
//        var x = 5;
//        var b = "thung";
//        System.out.println(a + x);
//        System.out.println(season.SPRING);


//        // get two double numbers
//        double x = 60984.166;
//        double y = -497.12;
//
//        // call floor and print the result
//        System.out.println("Math.floor(" + x + ")=" + Math.floor(x));
//        System.out.println("Math.floor(" + y + ")=" + Math.floor(y));
//        System.out.println("Math.floor(0)=" + Math.floor(0));
//        Map map = new HashMap();
//        map.put("1", "one");
//        map.put("2", "two");
//        map.put("3", "three");
//        map.put("4", "four");
//
//        Set set = map.keySet();
////        set.add("0");
//
//        Set stt = new HashSet(map.keySet());
//        stt.add("5");
//        for(var i : stt){
//            if (set.contains("1")) {
//                System.out.println(i);
//            }
//        }
//
//        Set set1 = new HashSet();
//        set1.add("5");

        List list = Collections.emptyList();
//        list.add("quang");

        List list1 = Collections.singletonList("xtrung");

        List<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Trung", "quang", "Thanh","Tuan"));

        List<String> listSub = list2.subList(0, 3);
        list2.subList(0, 3).add(1,"Thah");
        listSub.add(1, "Huong");
        listSub.forEach(e-> System.out.println(e));
    }
}
