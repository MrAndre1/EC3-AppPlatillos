package com.ec3_appplatillos;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMenu;
    private MenuAdapter menuAdapter;
    private List<Dish> dishList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerViewMenu = findViewById(R.id.recyclerViewMenu);
        dishList = createSampleDishList();
        menuAdapter = new MenuAdapter(dishList, new MenuAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(Dish dish) {
                openDishDetailActivity(dish);
            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewMenu.setLayoutManager(layoutManager);
        recyclerViewMenu.setAdapter(menuAdapter);
    }

    private void openDishDetailActivity(Dish dish) {
        Intent intent = new Intent(this, DishDetailActivity.class);
        intent.putExtra("imageResId", dish.getImageResId());
        intent.putExtra("name", dish.getName());
        intent.putExtra("description", dish.getDescription());
        intent.putExtra("ingredients", dish.getIngredients());
        intent.putExtra("price", dish.getPrice());
        startActivity(intent);
    }

    private List<Dish> createSampleDishList() {
        List<Dish> dishes = new ArrayList<>();

        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 1", "Descripcio 1", "Ingredientes", 10.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 2", "Descripcio 2", "Ingredientes", 8.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 3", "Descripcio 3", "Ingredientes", 11.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 4", "Descripcio 4", "Ingredientes", 7.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 5", "Descripcio 5", "Ingredientes", 12.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 6", "Descripcio 6", "Ingredientes", 9.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 7", "Descripcio 7", "Ingredientes", 15.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 8", "Descripcio 8", "Ingredientes", 13.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 9", "Descripcio 9", "Ingredientes", 6.99));
        dishes.add(new Dish(R.drawable.lomo_saltado, "Platillo 10", "Descripcio 10", "Ingredientes", 14.99));

        return dishes;
    }
}
