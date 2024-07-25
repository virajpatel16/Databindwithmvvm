package com.example.databindingmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.databindingmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
Mainmodelview mainmodelview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     ActivityMainBinding mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

  Product p = new Product("dvv");
//  mainBinding.setProduct(p);

  mainmodelview= ViewModelProviders.of(this).get(Mainmodelview.class);
  mainBinding.setProduct(mainmodelview.getProduct());
    }
}