package accessmodifier;

public class Calculator {

    // protected: accessible within the same package
    // and by subclasses in other packages through inheritance
    protected int add(int a, int b) {
        return a + b;
    }

    // public: accessible from anywhere (same package or different package)
    public int subtract(int a, int b) {
        return a - b;
    }
}

// private   → same class only
// default   → same package only
// protected → same package + subclass in another package
// public    → accessible everywhere
