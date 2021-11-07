package com.libercom.lab5.Task1;

import java.util.ArrayList;
import java.util.Arrays;

class A {
    public String a;

    public A() { }

    public A(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}

class B extends A {
    public String b;

    public B() { }

    public B(String b) {
        super();
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}

class C extends B {
    public String c;

    public C() { }

    public C(String c) {
        super();
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}

class D extends C {
    public String d;

    public D() {
    }

    public D(String d) {
        super();
        this.d = d;
    }

    @Override
    public String toString() {
        return "D{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}

class E extends D {
    public String e;

    public E() {
    }

    public E(String e) {
        super();
        this.e = e;
    }

    @Override
    public String toString() {
        return "E{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                '}';
    }
}

class F extends E {
    public String f;

    public F() {
    }

    public F(String f) {
        super();
        this.f = f;
    }

    @Override
    public String toString() {
        return "F{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                '}';
    }
}

class G extends F {
    public String g;

    public G() {
    }

    public G(String g) {
        super();
        this.g = g;
    }

    @Override
    public String toString() {
        return "G{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                ", g='" + g + '\'' +
                '}';
    }
}

class H extends G {
    public String h;

    public H() {
    }

    public H(String h) {
        super();
        this.h = h;
    }

    @Override
    public String toString() {
        return "H{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                ", g='" + g + '\'' +
                ", h='" + h + '\'' +
                '}';
    }
}

class I extends H {
    public String i;

    public I() {
    }

    public I(String i) {
        super();
        this.i = i;
    }

    @Override
    public String toString() {
        return "I{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                ", g='" + g + '\'' +
                ", h='" + h + '\'' +
                ", i='" + i + '\'' +
                '}';
    }
}

class J extends I {
    public String j;

    public J(String j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "J{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                ", g='" + g + '\'' +
                ", h='" + h + '\'' +
                ", i='" + i + '\'' +
                ", j='" + j + '\'' +
                '}';
    }
}

public class Task1 {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<>(Arrays.asList(
                new A("a"),
                new B("b"),
                new C("c"),
                new D("d"),
                new E("e"),
                new F("f"),
                new G("g"),
                new H("h"),
                new I("i"),
                new J("j")
        ));

        list.forEach(System.out::println);
    }
}
