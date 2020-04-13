package com.example.obidi.androidflavor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 10/15/2018.
 */
public class AndroidFlavorAdapter extends ArrayAdapter<AndroidFlavor> {
    public AndroidFlavorAdapter(Context context, List<AndroidFlavor> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get reusable view or inflate a new one
        View listItemView = convertView;

        if (listItemView == null) { // inflate a new one
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.my_list_item_view, parent, false);
        }

        // get current androidFlavor data
        AndroidFlavor currentFlavor = getItem(position);

        // get and update listItemView widgets
        ImageView flavorImage = (ImageView) listItemView.findViewById(R.id.flavor_image);
        flavorImage.setImageResource(currentFlavor.getImageResId());
        flavorImage.setContentDescription(currentFlavor.getName());

        TextView flavorName = (TextView) listItemView.findViewById(R.id.flavor_name);
        flavorName.setText(currentFlavor.getName());

        TextView flavorVersion = (TextView) listItemView.findViewById(R.id.flavor_version);
        flavorVersion.setText(currentFlavor.getVersion());

        return listItemView;
    }
}
