package com.take.one;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StoryAdapter  extends BaseAdapter{

	List<StoryItem> storyList;
	final String TAG = "STORYADAPTER"; 
	//Lets hold a reference to this context
	Context context;
	
	public StoryAdapter(Context context) {
		this.context = context;  
		storyList = new ArrayList<StoryItem>();
	}
	
	public void add(StoryItem storyItem){
		storyList.add(storyItem);
	}
	
	 private class ViewHolder {
	        RelativeLayout coverPic;
	        TextView author;
	        TextView title;
	}
	
	 @Override
	public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG, "Get View called for position : " + position );
		 ViewHolder holder = null;
        StoryItem rowItem = storyList.get(position);
         
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.story_item_layout, null);
            holder = new ViewHolder();
            holder.author = (TextView) convertView.findViewById(R.id.author);
            holder.title = (TextView) convertView.findViewById(R.id.title);
            //holder.coverPic = (ImageView) convertView.findViewById(R.id.cover_pic);
            holder.coverPic = (RelativeLayout)convertView.findViewById(R.id.story_item_layout);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
                 
        holder.author.setText(rowItem.getAuthor());
        holder.title.setText(rowItem.getTitle());
        holder.coverPic.setBackground(context.getResources().getDrawable(rowItem.getCoverPicId()));
        //holder.coverPic.setImageResource(rowItem.getCoverPicId());
         
        return convertView;
    }

	@Override
	public int getCount() {
		
		return storyList.size();
	}

	@Override
	public Object getItem(int position) {
		
		return storyList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return storyList.get(position).getId();
	}
	
	
	
	
	
	
	
	
	

}
