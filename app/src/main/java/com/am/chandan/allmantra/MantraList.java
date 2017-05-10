package com.am.chandan.allmantra;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Copyright @ MaxximoTech, created by Nisheeth Gunjan.
 */

public class MantraList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;
    String[] itemname ={
            "Shree Ganesh Mantra\nOm Gam Ganapataye Namaha",
            "Gayatri Mantra\nOm Bhurbhuvah Svah \nTatsavitur Varennyam,\nBhargo Devasya Dhimahi \nDhiyo Yonah Prachodayat",
            "Hanuman Mantra\nOm Hum Hanumate Namaha",
            "MahaKali Mantra\nOm Aim Hreem Kleem Chamundaye Vichche Namah",
            "Kubera Mantra\nOm Shreem Om Hreem Shreem Hreem Kleem Shreem Kleem Vitteshvaraya Namah",
            "MahaLakshmi Mantra\nOm Shreem Maha Lakshmiyei Namaha",
            "MahaMrityunjaya Mantra \nOm Tryambakam Yajaamahe \nSugandhim Pushthivardhanam, \nUrvaarukamiva Bandhanaan \nMrityormuksheeya Maamritaat",
            "Om Namah Shivaya Mantra\nOm Namah Shivaya",
            "Shani Dev Mantra \nOm Neelanjanan Samabhasam Raviputram Yamagrajam, Chaaya Martand Sambhutam Tam Namami Shanaishcharam",
            "Shree Krishna Mantra\nOm Namo Bhagwate Vasudevaya",
            "Sai Baba Mantra\nOm Shri Sainathaya Namaha"


    };
    Integer[] imgid={
            R.drawable.list1,
            R.drawable.list2,
            R.drawable.list3,
            R.drawable.list4,
            R.drawable.list5,
            R.drawable.list6,
            R.drawable.list7,
            R.drawable.list8,
            R.drawable.list9,
            R.drawable.list10,
            R.drawable.list11
    };
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.

     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.mantra_list);



        //ListView listView = (ListView) findViewById(R.id.sites_list);
        //listView.setOnItemClickListener(this);
        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.mantras_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(this);





    }

    @Override
    public void onItemClick(AdapterView<?> l, View v, int position, long id) {


        Intent intent = new Intent();


        switch (position) {
            case 0:
                intent.setClass(this, GanpatiMantra.class);
                startActivity(intent);


                break;
            case 1:
                intent.setClass(this, GayatriMantra.class);
                startActivity(intent);

                break;
            case 2:
                intent.setClass(this, HanumanMantra.class);
                startActivity(intent);

                break;
            case 3:
                intent.setClass(this, MahaKaliMantra.class);
                startActivity(intent);

                break;
            case 4:
                intent.setClass(this, KuberaMantra.class);
                startActivity(intent);

                break;
            case 5:
                intent.setClass(this, MahaLakshmiMantra.class);
                startActivity(intent);

                break;
            case 6:
                intent.setClass(this, MahaMrityunjayaMantra.class);
                startActivity(intent);

                break;
            case 7:
                intent.setClass(this, OmNamahShivayaMantra.class);
                startActivity(intent);

                break;
            case 8:
                intent.setClass(this, ShaniMantra.class);
                startActivity(intent);

                break;
            case 9:
                intent.setClass(this, ShreeKrishnaMantra.class);
                startActivity(intent);


                break;
            case 10:
                intent.setClass(this, SaiBabaMantra.class);
                startActivity(intent);


                break;
            default:
                intent.setClass(this, GanpatiMantra.class);
                startActivity(intent);

                break;
        }
    }

}
