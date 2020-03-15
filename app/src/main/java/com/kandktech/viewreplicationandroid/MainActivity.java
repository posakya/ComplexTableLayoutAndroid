package com.kandktech.viewreplicationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout parentLinearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_view);
//        parentLinearLayout = findViewById(R.id.parent_linear_layout);
    }
//    public void onAddField(View v) {
//        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////        assert inflater != null;
//        final View rowView = inflater.inflate(R.layout.field, null);
//        // Add the new row before the add field button.
//        parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() - 1);
//    }
//
//    public void onDelete(View v) {
//        parentLinearLayout.removeView((View) v.getParent());
//    }
}
