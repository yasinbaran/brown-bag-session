package com.isbank.session3.Reflection;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {

        /*Bu örnek program, Java'nın LinkedList sınıfının tüm metodlarını listeler. 
Bu, normalde bir sınıf hakkında bu kadar çok bilgiye sahip olmanın mümkün olmadığı durumlarda kullanışlı olabilir. */
        try {
            // Get Class using reflection
            Class<?> cls = Class.forName("java.util.LinkedList");
            
            // Get Methods
            Method[] methods = cls.getDeclaredMethods();
            
            // Print methods
            for (Method method:methods){
                System.out.println("Method: " + method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
