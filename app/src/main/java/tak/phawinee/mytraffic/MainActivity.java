package tak.phawinee.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private String urlYoutubeString;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        //Setup Array for Integer
        int[] icoInts = new int[20];
        icoInts[0] = R.drawable.traffic_01;
        icoInts[1] = R.drawable.traffic_02;
        icoInts[2] = R.drawable.traffic_03;
        icoInts[3] = R.drawable.traffic_04;
        icoInts[4] = R.drawable.traffic_05;
        icoInts[5] = R.drawable.traffic_06;
        icoInts[6] = R.drawable.traffic_07;
        icoInts[7] = R.drawable.traffic_08;
        icoInts[8] = R.drawable.traffic_09;
        icoInts[9] = R.drawable.traffic_10;
        icoInts[10] = R.drawable.traffic_11;
        icoInts[11] = R.drawable.traffic_12;
        icoInts[12] = R.drawable.traffic_13;
        icoInts[13] = R.drawable.traffic_14;
        icoInts[14] = R.drawable.traffic_15;
        icoInts[15] = R.drawable.traffic_16;
        icoInts[16] = R.drawable.traffic_17;
        icoInts[17] = R.drawable.traffic_18;
        icoInts[18] = R.drawable.traffic_19;
        icoInts[19] = R.drawable.traffic_20;

        //For Setup Title
        String[] titleStrings = getResources().getStringArray(R.array.my_title);

        String[] detailLongStrings = getResources().getStringArray(R.array.my_detail);

        String[] detailShort = new String[detailLongStrings.length];

        for (int i=0;i<detailLongStrings.length;i++) {
            detailShort[i] = detailLongStrings[i].substring(0, 20) + "...";
        }


        //Create ListView
        MyAdapter myAdapter = new MyAdapter(this, icoInts, titleStrings, detailShort);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(MainActivity.this, DetelActivity.class);
                startActivity(intent);
            }
        });


    }   //Main Method

    public void clickAboutMe(View view) {

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.phonton2);
        mediaPlayer.start();


        //Intent to WebView
        urlYoutubeString = "https://youtu.be/6GfGlGOR9j4";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlYoutubeString));
        startActivity(intent);


    }

}    //Main Class คลาสหลัก
