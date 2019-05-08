package com.example.dosth.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lei
 * @create 2018/09/07 17:25.
 */
public class ExcelUtil {
    public static void readXls(Consume consume,Mapping mapping){
        List<String> list1 = Arrays.asList("abc","123");
        List<String> list2 = Arrays.asList("def","345");
        List<String> list3 = Arrays.asList("efg","789");
        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        for(int i = 0; i < list.size() ;i++){
            List<String> listson = list.get(i);
            consume.consume(mapping.mapping(listson));
        }
    }


    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        readXls(new Consume<User>() {
            @Override
            public void consume(User i) {
                list.add(i);
            }
        }, new Mapping<User>() {
            @Override
            public User mapping(List<String> s) {
                User u = new User();
                u.setName(s.get(0));
                u.setPassword(s.get(1));
                return u;
            }
        });
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
        }
    }
}
