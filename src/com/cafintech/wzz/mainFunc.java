package com.cafintech.wzz;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;


/**
 * Created by 15600 on 2017/8/18.
 */
public class mainFunc {
    public static void main(String[] args) {
        Student student=new Student();
        setFieldValue(student,"age", 10);
        System.out.println(student.getAge());
    }

    public static void getObjectFields(Object object){
        try {
            Class<?> objectClass=object.getClass();
            Field []fields=objectClass.getDeclaredFields();
            Field []fields1=objectClass.getSuperclass().getDeclaredFields();
            ArrayList<String> fieldNames=new ArrayList<>();
            for(Field field:fields){
//                System.out.println(field.getName()+"  "+field.getGenericType());
                fieldNames.add(field.getName());
            }//得到一个类的属性和属性类型
            for(Field field:fields1){
//                System.out.println(field.getName()+"  "+field.getGenericType());
                fieldNames.add(field.getName());
            }//得到一个类的继承的父类的属性和属性类型
            for(String s:fieldNames){
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * params  object:进行赋值的对象  field:复制的属性  value:赋予的值
     * */
    public static void setFieldValue(Object object,String field,Object value){
        char[] chars = field.trim().toCharArray();
        chars[0] -= 32;//将field的首字母转为大写，因为set方法后跟的是首字母大写的属性
        try {
            Method method = object.getClass().getMethod("set" + String.valueOf(chars), value.getClass());
            method.invoke(object, value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }    }
}
