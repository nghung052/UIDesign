package org.pxu.coolstyles.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityHome extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        // Khởi tạo các thành phần
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        // Đăng ký sự kiện cho nút đăng ký
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện đăng ký
                registerUser();
            }
        });
    }

    private void registerUser() {
        // Xử lý sự kiện đăng ký
        String username = editTextUsername.getText().toString();
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        // Kiểm tra điều kiện đăng ký (ví dụ đơn giản)
        if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            // Nếu đúng, hiển thị thông báo thành công
            Toast.makeText(MainActivityHome.this, "Registration successful", Toast.LENGTH_SHORT).show();
        } else {
            // Nếu sai, hiển thị thông báo thất bại
            Toast.makeText(MainActivityHome.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        }
    }
}