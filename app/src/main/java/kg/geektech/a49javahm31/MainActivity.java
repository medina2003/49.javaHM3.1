package kg.geektech.a49javahm31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> contactList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactList.add("Медина");
        contactList.add("Асыл");
        contactList.add("Айдай");
        contactList.add("Марат");
        contactList.add("Асан");
        contactList.add("Данияр");
        contactList.add("Даурен");
        contactList.add("Даулет");
        contactList.add("Амир");
        contactList.add("Алтынай");
        contactList.add("Тансуу");
        contactList.add("Адеми");
        contactList.add("Тансулуу");
        contactList.add("Мадина");
        contactList.add("Адылбек");
        contactList.add("Азимбек");
        contactList.add("Мария");
        contactList.add("Мира");
        contactList.add("Наталия");
        contactList.add("максат");

        recyclerView=findViewById(R.id.recycler_view_Ac);
        ContactAdapter adapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(adapter);
    }
}