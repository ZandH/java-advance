package com.soft1841.daily;

/**
 * 测试类
 * @author 屏儿
 * 2019/05/21
 */
public class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getCircleInstance();
        circle.draw();
        Shape rectangle = ShapeFactory.getRectangleInstance();
        rectangle.draw();
    }
}
