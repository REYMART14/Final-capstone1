package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Pest extends AppCompatActivity {
    private ImageButton camera1;
    private ImageButton home1;
    ListView listView;


    String[] values = new String[]{

            "Ant",
            "Army Worm",
            "Bird",
            "Black Bug",
            "Brown Planthopper",
            "Golden Apple Snail",
            "Green Planthopper",
            "Rat",
            "Rice Bug",
            "Rice Mealy bug",
            "Stem Borer",
            "Water Weevil",
            "White Planthopper",

    };

    int insect[] = {R.drawable.ant,
            R.drawable.armyworm,
            R.drawable.bird,
            R.drawable.blackbug,
            R.drawable.brownplanthopper,
            R.drawable.goldensnail,
            R.drawable.greenplant,
            R.drawable.rat,
            R.drawable.ricebug,
            R.drawable.ricemealybug,
            R.drawable.stemborer,
            R.drawable.waterweevil,
            R.drawable.whiteplanthopper,


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest);

        listView = findViewById(R.id.listview);


        CustomAdaptor customAdaptor = new CustomAdaptor();
        listView.setAdapter(customAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int index = position;
                Toast.makeText(Pest.this, values[index], Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Pest.this, pest2.class);
                intent1.putExtra("select", values[index]);
                intent1.putExtra("image", insect[index]);
                startActivity(intent1);

                listView.setSelector(R.color.green);

            }
        });


        camera1 = findViewById(R.id.camera);
        camera1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Pest.this, Camera.class);
                startActivity(intent1);

            }
        });

        home1 = findViewById(R.id.home);
        home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pest.this, HomeMainActivity2.class);
                startActivity(intent);
            }
        });
        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_file, menu);


        return true;
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            if(item.getItemId()==R.id.T){
                Intent intent = new Intent( Pest.this,Pest3.class);
                startActivity(intent);
            }
            if(item.getItemId()==R.id.W){
                Intent intent = new Intent( Pest.this,Pest5.class);
                startActivity(intent);
            }
            return super.onOptionsItemSelected(item);
        }
    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return insect.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            View view2 = getLayoutInflater().inflate(R.layout.mylayout, null);
            ImageView imageView = view2.findViewById(R.id.image);
            TextView textView = view2.findViewById(R.id.text);
            imageView.setImageResource(insect[position]);
            textView.setText(values[position]);
            return view2;
        }
    }}

