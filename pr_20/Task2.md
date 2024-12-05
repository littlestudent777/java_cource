```java
class A {
  int a1;        // package-private
  public int a2; // доступен в любом месте
  protected int a3; // доступен в подклассах и в том же пакете
  private int a4; // доступен только в классе A

  void method1() { ... } // package-private
  public void method2() { ... } // доступен в любом месте
  protected void method3() { ... } // доступен в подклассах и в том же пакете
  private void method4() { ... } // доступен только в классе A
}

class B extends A {
  void test() {
    // Доступные члены:
    // a1, a2, a3 - доступно (если B и A в одном пакете)
    // a4 - не доступно
    // method1, method2, method3 - доступны
    // method4 - не доступно
  }
}

class C extends B {
  void test() {
    // Доступные члены:
    // a1, a2, a3 - доступны (если C и A в одном пакете)
    // a4 - не доступно
    // method1, method2, method3 - доступны
    // method4 - не доступно
  }
}
```
