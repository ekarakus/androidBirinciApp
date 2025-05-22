package com.example.androidbirinciapp;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


import com.example.androidbirinciapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sayi1 = binding.edit1.getText().toString();
                String sayi2 = binding.edit2.getText().toString();
                int sayi1Int = Integer.parseInt(sayi1);
                int sayi2Int = Integer.parseInt(sayi2);
                int toplam = sayi1Int + sayi2Int;
                binding.textTabela.setText(String.valueOf(toplam));

            }

        });

    }
}