package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;
    ArrayList<Info> alInfo;
    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.ListViewInfo);
        alInfo = new ArrayList<>();



        Info item1 = new Info("John","Software Technical Leader",3400);
        Info item2 = new Info("May","Programmer",2200);
        Info item3 = new Info("Makalel","It Helpdesk",1200);
        Info item4 = new Info("Makalel","It Helpdesk",1200);
        Info item5 = new Info("Makalel","It Helpdesk",1200);
        Info item6 = new Info("Makalel","It Helpdesk",1200);
        Info item7 = new Info("Makalel","It Helpdesk",1200);
        Info item8 = new Info("Makalel","It Helpdesk",1200);
        Info item9 = new Info("Makalel","It Helpdesk",1200);
        Info item10 = new Info("Makalel","It Helpdesk",1200);
        Info item11 = new Info("Makalel","It Helpdesk",1200);
        Info item12 = new Info("Makalel","It Helpdesk",1200);
        Info item13 = new Info("Makalel","It Helpdesk",1200);
        Info item14 = new Info("Makalel","It Helpdesk",1200);
        Info item15 = new Info("Makalel","It Helpdesk",1200);
        Info item16 = new Info("Makalel","It Helpdesk",1200);
        Info item17 = new Info("Makalel","It Helpdesk",1200);
        Info item18 = new Info("Makalel","It Helpdesk",1200);
        Info item19 = new Info("Makalel","It Helpdesk",1200);
        Info item20 = new Info("Makalel","It Helpdesk",1200);




        alInfo.add(item1);
        alInfo.add(item2);
        alInfo.add(item3);
        alInfo.add(item4);
        alInfo.add(item5);
        alInfo.add(item6);
        alInfo.add(item7);
        alInfo.add(item8);
        alInfo.add(item9);
        alInfo.add(item10);
        alInfo.add(item11);
        alInfo.add(item12);
        alInfo.add(item13);
        alInfo.add(item14);
        alInfo.add(item15);
        alInfo.add(item16);
        alInfo.add(item17);
        alInfo.add(item18);
        alInfo.add(item19);
        alInfo.add(item20);


        caInfo = new CustomAdapter(this, R.layout.info_layout,alInfo);

        lvEmployeeInfo.setAdapter(caInfo);

    }
}
