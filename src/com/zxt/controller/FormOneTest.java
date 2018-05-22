package com.zxt.controller;

import java.lang.annotation.Annotation;

public class FormOneTest {
    public static void main(String[] args)
    throws Exception
    {
        Class FormOne = Class.forName("com.zxt.controller.FormOne");
        System.out.println(FormOne);

        FormOne formOne = new FormOne();
        System.out.println(FormOne.getAnnotations());
        for (Annotation a: FormOne.getAnnotations()) {
            System.out.println(a);
        }
    }
}
