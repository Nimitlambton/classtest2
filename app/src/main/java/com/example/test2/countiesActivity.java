package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class countiesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    public static int pos;
    public static int prodNo;
    ImageView prodImg;
    TextView textView6;
    ArrayList<String> spinnerdata = new ArrayList<String>();
    TextView capital;
  ListView  listView;
    public static String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);


        spinner = (Spinner) findViewById(R.id.spinner);

        capital = findViewById(R.id.textView6);
        //make spinner

        spinnerdata.add("Canada");
        spinnerdata.add("USA");
        spinnerdata.add("England");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinnerdata);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        prodImg=findViewById(R.id.imageView);


        listView = findViewById(R.id.listview);

        ArrayList<String> pois = new ArrayList<String>();
        pois.add("Niagara falls");
        pois.add("CN Tower");
        pois.add("The Butchart Gardens");
        pois.add("Notre-Dame Basilica");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pois);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        pos = i;

      if (pos == 0){

          capital.setText("Capital ="+"Ottwa");
          prodImg.setImageResource(R.drawable.canada);

          listView = findViewById(R.id.listview);

          ArrayList<String> pois = new ArrayList<String>();
          pois.add("Niagara falls");
          pois.add("CN Tower");
          pois.add("The Butchart Gardens");
          pois.add("Notre-Dame Basilica");

          ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pois);
          listView.setAdapter(arrayAdapter);



          listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  if(i == 0){


                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "fall";

                  }

                  else  if (i==1){

                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "tower";
                      System.out.println("Tower");
                  }
                  else  if (i==2){
                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "garden";
                      System.out.println("Tower");
                      System.out.println("The");
                  }
                  else  if (i==3){

                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "hall";
                      System.out.println("Tower");
                      System.out.println("The");

                      System.out.println("Notre");
                  }

              }
          });





      }
      else if (pos == 1){
          capital.setText("Capital ="+"Wahington");
          prodImg.setImageResource(R.drawable.usa);

          listView = findViewById(R.id.listview);

          ArrayList<String> pois2 = new ArrayList<String>();
          pois2.add("The Statue of Liberty");
          pois2.add("The White House");
          pois2.add("Tims Square");
          ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pois2);
          listView.setAdapter(arrayAdapter);



          listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  if(i == 0){


                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "liberty";

                  }

                  else  if (i==1){

                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "wh";
                      System.out.println("Tower");
                  }
                  else  if (i==2){
                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "ts";
                      System.out.println("Tower");
                      System.out.println("The");
                  }

              }
          });



      }
      else if(pos == 2)  {
          capital.setText("Capital ="+"London");
          prodImg.setImageResource(R.drawable.england);


          listView = findViewById(R.id.listview);
          ArrayList<String> pois3 = new ArrayList<String>();
          pois3.add("Big Ben");
          pois3.add("Westminster Abbey");
          pois3.add("Hyde Park");
          ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pois3);
          listView.setAdapter(arrayAdapter);



          listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  if(i == 0){


                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "big";

                  }

                  else  if (i==1){

                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "wb";
                      System.out.println("Tower");
                  }
                  else  if (i==2){
                      Intent go = new Intent(countiesActivity.this ,disp.class);


                      startActivity(go);
                      name = "hy";
                      System.out.println("Tower");
                      System.out.println("The");
                  }

              }
          });


      }











    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
