package com.ec3_appplatillos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class DishDetailActivity extends AppCompatActivity {
    private ImageView imageViewDish;
    private TextView nameTextView;
    private TextView descriptionTextView;
    private TextView ingredientsTextView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_detail);

        imageViewDish = findViewById(R.id.imageViewDish);
        nameTextView = findViewById(R.id.nameTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        ingredientsTextView = findViewById(R.id.ingredientsTextView);
        priceTextView = findViewById(R.id.priceTextView);

        // Obtener los datos del platillo del Intent
        Intent intent = getIntent();
        if (intent != null) {
            int imageResId = intent.getIntExtra("imageResId", R.drawable.lomo_saltado);
            String name = intent.getStringExtra("name");
            String description = intent.getStringExtra("description");
            String ingredients = intent.getStringExtra("ingredients");
            double price = intent.getDoubleExtra("price", 0.0);

            // Mostrar los datos en la interfaz
            imageViewDish.setImageResource(imageResId);
            nameTextView.setText(name);
            descriptionTextView.setText(description);
            ingredientsTextView.setText(ingredients);
            priceTextView.setText(String.format(Locale.getDefault(), "$%.2f", price));
        }
    }
}
