package com.dhamodharan.android_oops.Inheritance;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Multiple_Inheritance extends AppCompatActivity {

    // JAVA not support multiple inheritance

  // Alternate : Multiple inheritance is achieved by Interface Concept

  // Example :

  /*interface InterfaceA
  {
    public void disp();
  }
  interface InterfaceB
  {
    public void disp();
  }
  public class Client implements InterfaceA,InterfaceB
  {
    @Override
    public void disp()
    {
      System.out.println("disp() method implementation");
    }
    public static void main(String args[])
    {
      Client c = new Client();
      c.disp();
    }
  }*/

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    XXX xxx = new XXX();
    xxx.speed();
    xxx.distance();

  }

  interface  A {

    int speed = 60;
    public void speed();

  }


  interface B {

    int distance = 40 ;
    public  void distance ();


  }

  class XXX implements A,B{


    @Override
    public void speed() {
      System.out.println("Speed" + speed);
    }

    @Override
    public void distance() {
      System.out.println("Distance" + distance);
    }
  }
}
