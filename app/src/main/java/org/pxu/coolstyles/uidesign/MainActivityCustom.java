package org.pxu.coolstyles.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityCustom extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPhone;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom);
        setContentView(R.layout.activity_main_custom2);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nút Save được click
                submitData();
            }
        });
    }

    private void submitData() {
        // Lấy thông tin từ các EditText
        String name = editTextName.getText().toString();
        String email = editTextEmail.getText().toString();
        String phone = editTextPhone.getText().toString();

        // Hiển thị thông tin trong LogCat
        Log.d("CustomerInfoActivity", "Name: " + name);
        Log.d("CustomerInfoActivity", "Email: " + email);
        Log.d("CustomerInfoActivity", "Phone: " + phone);
    }
}