package com.e.retrofitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    Button showEmployee,registerEmployee,searchEmployee,updateEmployee,deleteEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        showEmployee=findViewById(R.id.showEmployee);
        registerEmployee=findViewById(R.id.registerEmployee);
        searchEmployee=findViewById(R.id.searchEmployee);
        updateEmployee=findViewById(R.id.updateEmployee);

       showEmployee.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(DashboardActivity.this,MainActivity.class));
           }
       });

       searchEmployee.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(DashboardActivity.this,SearchEmployeeActivity.class));
           }
       });

       registerEmployee.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(DashboardActivity.this,RegisterEmployeeActivity.class));
           }
       });

       updateEmployee.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(DashboardActivity.this,UpdateActivity.class));
           }
       });

    }


}
