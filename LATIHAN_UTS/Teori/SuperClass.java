class SuperClass {

    int a,b,c;

    SuperClass(int p, int q, int r) {
        a = p;
        b = q;
        c = r;
    }

    void show() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    void show(String s) {
        System.out.println(s);
    }
}

