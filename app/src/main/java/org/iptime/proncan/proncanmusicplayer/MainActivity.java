package org.iptime.proncan.proncanmusicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends Activity implements View.OnClickListener {

    // mainActivity
    ImageButton go_musicList_imgButton;
    //ImageButton go_likeList_imgButton;
    ImageButton go_setting_imgButton;

    Intent intent;

    // musicList_main, musicList_main_customAdapter
    private ListView musicListView;
    private MusicList_main_customAdapter musicListCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mainActivity
        go_musicList_imgButton = (ImageButton) findViewById(R.id.go_musicList);
//      go_likeList_imgButton = (ImageButton) findViewById(R.id.go_likeList);
        go_setting_imgButton = (ImageButton) findViewById(R.id.go_setting);

        go_musicList_imgButton.setOnClickListener(this);
//      go_likeList_imgButton.setOnClickListener(this);
        go_setting_imgButton.setOnClickListener(this);

        // musicList_main, musicList_main_customAdapter
        musicListCustomAdapter = new MusicList_main_customAdapter();    // 커스텀 어댑터 생성
        musicListView = (ListView) findViewById(R.id.musicList_listView);   // xml에서 추가한 listview 연결
        musicListView.setAdapter(musicListCustomAdapter);   // 어댑터 연결
        //아이템 추가
        musicListCustomAdapter.add("첫번째");
        musicListCustomAdapter.add("두번째");
        musicListCustomAdapter.add("테스트");
        musicListCustomAdapter.add("테스트232");
    }

    @Override
    public void onClick(View v) {
//        String log = String.valueOf(v.getId());
//        Log.d(log, "asdf");
        switch (v.getId()) {
            case R.id.go_musicList:
                intent = new Intent(this, MusicList_main.class);
                startActivity(intent);
                break;
//           case R.id.go_likeList :
//              intent = new Intent(this, MusicList_main.class);
//              startActivity(intent);
//              break;
            case R.id.go_setting:
                intent = new Intent(this, Setting.class);
                startActivity(intent);
                break;
        }
    }
}
