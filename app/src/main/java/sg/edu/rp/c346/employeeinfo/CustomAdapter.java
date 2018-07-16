package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16033265 on 7/16/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Info> infoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Info> objects) {
        super(context,resource,objects);
        parent_context = context;
        layout_id = resource;
        infoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        View rowView;
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(layout_id, parent,false);
            TextView tvName = rowView.findViewById(R.id.textViewName);
            TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
            TextView tvSalary = rowView.findViewById(R.id.textViewSalary);
            Info currentItem = infoList.get(position);
            String name = currentItem.getName();
            String title = currentItem.getTitle();
            String salary = currentItem.getSalary() + "";

            tvName.setText(name);
            tvTitle.setText(title);
            tvSalary.setText(salary);
        }
        else{
            rowView = convertView;

        }



        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);
        Info currentItem = infoList.get(position);
        String name = currentItem.getName();
        String title = currentItem.getTitle();
        String salary = currentItem.getSalary() + "";

        tvName.setText(name);
        tvTitle.setText(title);
        tvSalary.setText(salary);
        return rowView;
    }
}
