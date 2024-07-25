package com.example.databindingmvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class Mainmodelview extends AndroidViewModel {

    Product product;
    public Mainmodelview(@NonNull Application application) {
        super(application);
product = new Product("viraj");
    }
    public  Product getProduct(){
        return this.product;
    }
}
