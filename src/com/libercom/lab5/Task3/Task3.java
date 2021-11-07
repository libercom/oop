package com.libercom.lab5.Task3;

class A {
    protected String a;
    protected X x = new X("xxx");

    public A() { }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class B extends A {
    protected String b;

    public B() { }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class C extends B {
    protected String c;

    public C() { }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class D extends C {
    protected String d;
    protected X x = new X("xxxx");

    public D() {
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class E extends D {
    protected String e;

    public E() {
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class F extends E {
    protected String f;

    public F() {
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class G extends F {
    protected String g;

    public G() {
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class H extends G {
    protected String h;
//    private X x = new X("xxxxxx"); In order to make this state private, I have to delete everything
//    related to x in the child classes
    protected X x = new X("xxxxxx");

    public H() {
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class I extends H {
    protected String i;

    public I() {
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class J extends I {
    protected String j;

    public J(String j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class X {
    private String x;

    public X(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "'" + x + "'";
    }
}

public class Task3 {
    public static void main(String[] args) {
        J obj = new J("j");
        System.out.println(obj);
    }
}
