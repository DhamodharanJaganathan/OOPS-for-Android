package com.dhamodharan.android_oops.Abstract;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Abstract extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);


    sub_class subClass=new sub_class();
    subClass.fun();

  }
}


class sub_class extends  super_class{


  @Override
  void fun() {
    System.out.println("Sub Class");
  }
}


abstract class super_class{

  super_class(){
    System.out.println("Super Class");
  };
  abstract void fun();
}