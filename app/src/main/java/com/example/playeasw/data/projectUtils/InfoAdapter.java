package com.example.playeasw.data.projectUtils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.playeasw.R;

import java.util.List;

public class InfoAdapter  extends ArrayAdapter {
    private int resourceId;
    public InfoAdapter(Context context,
                        int textViewResourceId,
                        List<InfoItems> object){
        super(context,textViewResourceId,object);
        resourceId=textViewResourceId;
    }
    public View getView(int position, View coverView, ViewGroup parent){
       InfoItems project= (InfoItems) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView VideoView=view.findViewById(R.id.video_image);
        TextView textView=view.findViewById(R.id.video_name);

        //此处需要修改成路径
        VideoView.setImageResource(project.getImage());
        textView.setText(project.getInformation());
        return view;



    }

}
