package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeMainActivity4 extends AppCompatActivity {



    private ImageButton camera1;
    private ImageButton pest1;


    SearchView text;


    String[] values = new String[]{
            "Tubak",
            "Harabas",
            "Tamsi",
            "Itom nga asno",
            "Ngusong Kabayo",
            "Kuhol",
            "Burit",
            "Yatot",
            "Atangya",
            "Ulalo sa ugat",
            "Tayangaw",
            "Bukbok",
            "Puting nguso"
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

    ArrayAdapter<String> adapter;
    ArrayList<Integer> arraylist=new ArrayList<>();

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main4);


        listView = findViewById(R.id.listview1);
        arraylist.add(R.drawable.ant);
        arraylist.add(R.drawable.armyworm);
        arraylist.add( R.drawable.bird);
        arraylist.add(R.drawable.blackbug);
        arraylist.add(R.drawable.brownplanthopper);
        arraylist.add(R.drawable.goldensnail);
        arraylist.add(R.drawable.greenplant);
        arraylist.add( R.drawable.rat);
        arraylist.add( R.drawable.ricebug);
        arraylist.add(R.drawable.ricemealybug);
        arraylist.add(R.drawable.stemborer);
        arraylist.add( R.drawable.waterweevil);
        arraylist.add(R.drawable.whiteplanthopper);

        text = findViewById(R.id.search);
        text.clearFocus();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);

        text.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                adapter.getFilter().filter(query);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        int index = position;
                        Toast.makeText(HomeMainActivity4.this, adapter.getItem(index), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(HomeMainActivity4.this, MainActivity5.class);
                        intent1.putExtra("select", adapter.getItem(index));
                        if (adapter.getItem(index).equals("Harumigas")) {
                            intent1.putExtra("image", insect[0]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Harabas")) {
                            intent1.putExtra("image", insect[1]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Tamsi")) {
                            intent1.putExtra("image", insect[2]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Itom na asno")) {
                            intent1.putExtra("image", insect[3]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Ngusong-Kabayo")) {
                            intent1.putExtra("image", insect[4]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Kuhol")) {
                            intent1.putExtra("image", insect[5]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Burit")) {
                            intent1.putExtra("image", insect[6]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Yatot")) {
                            intent1.putExtra("image", insect[7]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Atangya")) {
                            intent1.putExtra("image", insect[8]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Ulalo sa ugat")) {
                            intent1.putExtra("image", insect[9]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Tayangaw")) {
                            intent1.putExtra("image", insect[10]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Bukbok")) {
                            intent1.putExtra("image", insect[11]);
                            startActivity(intent1);
                        } else if (adapter.getItem(index).equals("Puting nguso")) {
                            intent1.putExtra("image", insect[12]);
                            startActivity(intent1);

                            listView.setSelector(R.color.green);

                        }
                    }
                });
                return true;
            }
        });
        camera1 = findViewById(R.id.camera);
        camera1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomeMainActivity4.this, Camera2.class);
                startActivity(intent1);
            }
        });
        pest1 = findViewById(R.id.pest);
        pest1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeMainActivity4.this, Pest5.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int index = position;
                Toast.makeText(HomeMainActivity4.this, adapter.getItem(index), Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(HomeMainActivity4.this, MainActivity5.class);
                intent1.putExtra("select", adapter.getItem(index));
                intent1.putExtra("image", insect[index]);
                startActivity(intent1);

                listView.setSelector(R.color.green);

            }

        });
        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_file2, menu);


        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.E){
            Intent intent = new Intent(HomeMainActivity4.this,HomeMainActivity2.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.T){
            Intent intent = new Intent(HomeMainActivity4.this,HomeMainActivity3.class);
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
    }
}