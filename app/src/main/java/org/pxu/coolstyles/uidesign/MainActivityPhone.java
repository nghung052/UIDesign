package org.pxu.coolstyles.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivityPhone extends AppCompatActivity {
    private EditText editTextSearch;
    private ListView listViewContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_phone);

        editTextSearch = findViewById(R.id.editTextSearch);
        listViewContacts = findViewById(R.id.listViewContacts);

        // Giả sử danh sách liên lạc có các tên
        final ArrayList<String> contactsList = new ArrayList<>();
        contactsList.add("John Doe");
        contactsList.add("Jane Smith");
        contactsList.add("Tom Johnson");
        // ...

        // Tạo Adapter cho ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contactsList);

        // Gán Adapter cho ListView
        listViewContacts.setAdapter(adapter);

        // Xử lý sự kiện click trên mỗi phần tử danh bạ
        listViewContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy tên của phần tử được click
                String selectedContact = contactsList.get(position);

                // Hiển thị thông báo với tên phần tử được chọn
                Toast.makeText(MainActivityPhone.this, "Selected Contact: " + selectedContact, Toast.LENGTH_SHORT).show();
            }
        });
    }
}