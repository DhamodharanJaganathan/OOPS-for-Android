package com.dhamodharan.android_oops.Inteface;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Interface extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    speed speed =new A();
    speed.speed();


    speed speed1=new B();
    speed1.speed();
  }

  interface speed {

    int speed = 20;     // Public static final int speed = 20;

    void speed();      // Public abstract void speed ();

  }


  class A implements speed {

    @Override
    public void speed() {

      System.out.println("class A is called");

    }
  }

  class B implements speed {


    @Override
    public void speed() {

      System.out.println("class B is called");

    }
  }


}
