package com.soft1841.map;

import java.util.*;

/**
 * 有关Map接口的练习
 *
 * @author 屏儿
 * 2019/03/20
 */
public class HashMapTest {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();
        //向Map集合中添加元素
        map.put("ISBN 978-7-5677-8742-100", "Android项目开发实战入门");
        map.put("ISBN 978-7-5677-8742-100", "Android项目开发实战入门");
        map.put("ISBN 978-7-5677-8742-100", "Android项目开发实战入门");
        //构建Map集合中所有key的set集合
        Set<String> set = map.keySet();
        //创建Iterator迭代器
        Iterator<String> it = set.iterator();
        System.out.println("key值：");
        //遍历并输出Map集合中的key值
        while (it.hasNext()) {
            System.out.println(it.next() + "");
        }
        //构建Map集合中所有value值得集合
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("\nvalue值：");
        while (it.hasNext()) {
            System.out.println(it.next() + "");
        }
    }
}
