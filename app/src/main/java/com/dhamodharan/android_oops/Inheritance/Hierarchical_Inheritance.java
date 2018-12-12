package com.dhamodharan.android_oops.Inheritance;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Hierarchical_Inheritance extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    B b =new B();
    b.MethodA();
    b.MethodB();

    C c =new C();
    c.MethodA();
    c.MethodC();

  }

  class A {

    public void MethodA() {

      System.out.println("Method A");

    }
  }

  class B extends A {

    public void MethodB() {

      System.out.println("Method B");
    }
  }

  class C extends B {

    public void MethodC() {

      System.out.println("Method C");
    }
  }
}




