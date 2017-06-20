package org.iptime.proncan.proncanmusicplayer;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MusicList_main_customAdapter extends BaseAdapter {

    private ArrayList<String> stringArrayList;  // 문자열을 보관 할 ArrayList

    // 생성자
    public MusicList_main_customAdapter() {
        stringArrayList = new ArrayList<String>();
    }

    // 아이템 수 리턴
    @Override
    public int getCount() {
        return stringArrayList.size();
    }

    // 아이템 오브젝트 리턴, Object를 상황에 맞게 변경 또는 리턴받은 오브젝트를 캐스팅해서 사용
    @Override
    public Object getItem(int position) {
        return stringArrayList.get(position);
    }

    // 아이템 position의 id값 리턴
    @Override
    public long getItemId(int position) {
        return position;
    }

    //출력될 아이템 관리

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // 화면에 안보이는것들은 null로 들어온다
        if(convertView == null) {
            // 커스텀 레이아웃 얻어옴
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.musiclist_main_custom, parent, false);

//            // ImageView에 현재 position의 이미지 추가
//            ImageView imageView = (ImageView) convertView.findViewById(R.id.musicList_imgView);
//            //imageView.setImage; // 이미지 어떻게?

            //textview에 현재 position의 문자열 추가
            TextView textView = (TextView) convertView.findViewById(R.id.musicList_title);
            textView.setText(stringArrayList.get(position));

            // 리스트 아이템 터치했을 때 이벤트
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, context.getText(0), Toast.LENGTH_SHORT).show();
                }
            });
        }
        return convertView;
    }

    // 외부에서 아이템 추가 요청시
    public void add(String msg) {
        stringArrayList.add(msg);
    }

    // 외부에서 아이템 삭제 요청시
    public void remove(int position) {
        stringArrayList.remove(position);
    }
}

