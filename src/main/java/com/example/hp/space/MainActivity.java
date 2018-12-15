package com.example.hp.space;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.jgabrielfreitas.core.BlurImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slider_in_left, R.anim.slide_out_left);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Item List");

        Toast.makeText(this, "Click on Icon for details", Toast.LENGTH_LONG).show();

        title = new String[]{"HD 143761 c",
                "KOI-1843.03",
                "KOI-1843.01",
                "KOI-1843.02",
                "Kepler-9 b",
                "Kepler-9 c",
                "Kepler-9 d",
                "GJ 160.2 b",
                "Kepler-566 b",
                "WASP-124 b",
                "HD 240210 b",
                "OGLE-05-390L b",
                "Kepler-1343 b",
                "Kepler-1011 b",
                "WASP-82 b",
                "Gliese 1214 b",
                "Kepler-153 b",
                "Kepler-153 c",
                "HD 4203 b",
                "HD 4203 c",
                "HD 179079 b",
                "Kepler-1368 b",
                "HD 187123 b",
                "HD 187123 c",
                "Kepler-1111 b",
                "Kepler-1289 b",
                "Kepler-431 b",
                "Kepler-431 c",
                "Kepler-431 d",
                "Kepler-131 b",
                "Kepler-131 c",
                "Kepler-548 b",
                "HD 114729 A b",
                "CoRoT-24 b",
                "CoRoT-24 c",
                "Kepler-1105 b",
                "Kepler-211 c",
                "Kepler-211 b",
                "Kepler-294 c",
                "Kepler-294 b",
                "HD 164595 b",
                "Kepler-257 c",
                "Kepler-257 b",
                "Kepler-257 d",
                "Kepler-214 c",
                "Kepler-214 b",
                "Kepler-1112 b",
                "Kepler-130 c",
                "Kepler-130 b",
                "Kepler-130 d",
                "WASP-108 b",
                "K2-34 b",
                "Kepler-815 b",
                "Kepler-1145 b",
                "38 Vir b",
                "Kepler-1575 b",
                "Kepler-1380 b",
                "Kepler-189 c",
                "Kepler-189 b",
                "Kepler-327 b",
                "Kepler-327 d",
                "Kepler-327 c",
                "Kepler-1071 b",
                "Kepler-101 b",
                "Kepler-101 c",
                "Kepler-156 c",
                "Kepler-156 b",
                "HIP 11952 b",
                "HIP 11952 c",
                "HD 122430 b",
                "Kepler-827 b",
                "Kepler-344 b",
                "Kepler-344 c",
                "Kepler-859 b",
                "Kepler-227 b",
                "Kepler-227 c",
                "Kepler-843 b",
                "Kepler-404 b",
                "Kepler-404 c",
                "Kepler-1483 b",
                "Gliese 86 b",
                "Kepler-1314 b",
                "Kepler-1099 b"};
        description = new String[]{"102.54",
                "0.1768913",
                "4.194525",
                "6.356006",
                "19.22418",
                "39.03106",
                "1.592851",
                "5.2354",
                "18.42794624",
                "3.37265",
                "501.75",
                "3500",
                "3.35183158",
                "5.75322197",
                "2.705782",
                "1.58040417",
                "18.870227",
                "46.90232",
                "437.05",
                "6700",
                "14.476",
                "0.67564949",
                "3.0965886",
                "3324",
                "8.79617863",
                "7.99019627",
                "6.803",
                "8.703",
                "11.922",
                "16.092",
                "25.5169",
                "4.45419434",
                "1135",
                "5.1134",
                "11.759",
                "4.42157218",
                "6.04045",
                "4.138575",
                "6.6264",
                "3.701212",
                "40",
                "6.581484",
                "2.382667",
                "24.664551",
                "28.7798",
                "15.660544",
                "14.36267939",
                "27.508653",
                "8.457458",
                "87.517905",
                "2.6755463",
                "2.995607",
                "8.57503552",
                "3.97076766",
                "825.9",
                "2.55314213",
                "10.3108245",
                "20.134866",
                "10.399931",
                "2.549575",
                "13.969457",
                "5.212333",
                "6.1799844",
                "3.4876812",
                "6.02976",
                "15.906801",
                "4.973456",
                "290",
                "6.95",
                "344.95",
                "51.92927591",
                "21.963945",
                "125.596809",
                "20.38177573",
                "9.488015",
                "54.418694",
                "2.05387982",
                "11.829851",
                "14.751166",
                "9.5085156",
                "15.76491",
                "5.42474928",
                "2.16845259"};
        icon = new int[]{R.drawable.download, R.drawable.images, R.drawable.download1, R.drawable.download2, R.drawable.download3};

        listView = (ListView) findViewById(R.id.list_view);

        for(int i = 0; i < title.length; i++){
            Model model = new Model(title[i], description[i], icon[new Random().nextInt(5)]);
            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this, arrayList);

        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else{
                    adapter.filter(s);
                }
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_setting){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
