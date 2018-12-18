package com.dhamodharan.android_oops.Polymorphism;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Method_Overload extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    System.out.println(Adder.add(10,20));
    System.out.println(Adder.add(10.654654564564,20.5446546464));

  }
}


class Adder{
  static int add(int a, int b){return a+b;}
  static double add(double a, double b){return a+b;}
}


// method overloading is not possible by changing the return type of the method only because of ambiguity.

//Can we overload java main() method?

//Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. Let's see the simple example: