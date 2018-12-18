package com.dhamodharan.android_oops.Encapsulation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Encapsulation extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Model_Encapsulation model_encapsulation =new Model_Encapsulation();
    model_encapsulation.setPrice(2000);
    model_encapsulation.setTyre("MRF");
    model_encapsulation.setWheel("Alloy");

    System.out.println("Things :::"+model_encapsulation.getTyre()+":"+model_encapsulation.getWheel()
        +":"+model_encapsulation.getPrice());

  }
}
