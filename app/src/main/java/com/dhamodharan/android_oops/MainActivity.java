package com.dhamodharan.android_oops;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.dhamodharan.android_oops.Abstract.Abstract;
import com.dhamodharan.android_oops.Encapsulation.Encapsulation;
import com.dhamodharan.android_oops.Inheritance.Single_Inheritance;
import com.dhamodharan.android_oops.Inteface.Interface;
import com.dhamodharan.android_oops.Polymorphism.Method_Overload;
import com.dhamodharan.android_oops.classes_objects.Dog;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    startActivity(new Intent(this,Single_Inheritance.class));

  }
}
