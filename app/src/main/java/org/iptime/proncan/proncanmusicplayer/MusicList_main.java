package org.iptime.proncan.proncanmusicplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MusicList_main extends Activity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musiclist_main);

        // Android에서 제공하는 string 문자열 하나를 출력 가능한 layout으로 어댑터 생성
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);

        listView = (ListView) findViewById(R.id.musicList_listView);    // listView 연결
        listView.setAdapter(arrayAdapter);  // adapter 연결
        // 노래 파일 끝날때까지 출력하고
        arrayAdapter.add("첫번째");
        arrayAdapter.add("두번째");
        arrayAdapter.add("테스트");
        arrayAdapter.add("노래노래");
    }
}