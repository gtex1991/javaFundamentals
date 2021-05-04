package com.company.invokeMethodHandles;

import com.company.invokeMethodHandles.model.Person;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class MethodHandles {

    public static void main(String [] args) throws Throwable {
        java.lang.invoke.MethodHandles.Lookup lookup = java.lang.invoke.MethodHandles.lookup();

        MethodType emptyConstructorMethodType = MethodType.methodType((void.class));
        MethodHandle emptyConstructor = lookup.findConstructor(Person.class, emptyConstructorMethodType);

        Person p = (Person) emptyConstructor.invoke();
        System.out.println(p);


        MethodType constructorMethodType = MethodType.methodType(void.class, String.class, int.class);
        MethodHandle constructor = lookup.findConstructor(Person.class, constructorMethodType);

        Person p2 = (Person) constructor.invoke("James", 28);
        System.out.println(p2);


        MethodType nameGetterMethodType = MethodType.methodType(String.class);
        MethodHandle nameGetter = lookup.findVirtual(Person.class, "getName", nameGetterMethodType);

        String name = (String) nameGetter.invoke(p2);
        System.out.println(name);

        MethodType nameSetterMethodType = MethodType.methodType(String.class);
        MethodHandle nameSetter = lookup.findVirtual(Person.class, "getName", nameSetterMethodType);

//        nameSetter.invoke(p2, "Linda");
//        System.out.println(p2);

//        java.lang.invoke.MethodHandles.Lookup privateLookup = MethodHandle.privateLookupIn(Person.class, lookup);
//        MethodHandle nameReader = lookup.findGetter(Person.class, "name", String.class);
//        String name2 = (String) nameReader.invoke(p2);
//        System.out.println(name2);



    }
}
