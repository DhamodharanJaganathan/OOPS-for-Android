package com.dhamodharan.android_oops.Polymorphism;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Method_Override extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Engineer engineer = new Engineer();
    engineer.work();

    Teacher teacher = new Doctor();
    teacher.work();

  }
}


class Engineer {

  void work() {

    System.out.println("Engineer");

  }

}

class Doctor extends Teacher {

  void work() {

    System.out.println("Doctor");

  }
}

class Teacher {

  void work() {

    System.out.println("Teacher");

  }


}


