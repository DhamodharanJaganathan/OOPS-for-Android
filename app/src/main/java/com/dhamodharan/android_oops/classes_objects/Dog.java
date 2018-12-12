package com.dhamodharan.android_oops.classes_objects;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Dog extends AppCompatActivity {

  //Instances Variable
  String age, color, size, weight;


  //method 1
  public void getInfo() {

    System.out.println(
        "Dog Age is " + age + " & color = " + color + " & size = " + size + " & " + "weight = " +
            weight);
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //object creation
    Dog dog = new Dog();
    dog.size = "12";
    dog.color = "Black";
    dog.age = "2";
    dog.weight = "4.5";
    dog.getInfo();

  }
}