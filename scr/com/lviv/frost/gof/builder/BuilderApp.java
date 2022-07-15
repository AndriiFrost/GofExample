package com.lviv.frost.gof.builder;

import com.lviv.frost.gof.builder.laptopbuilder.GamingLaptopBuilder;
import com.lviv.frost.gof.builder.laptopbuilder.LaptopBuilder;
import com.lviv.frost.gof.builder.laptopbuilder.TripLaptopBuilder;
import com.lviv.frost.gof.builder.model.Laptop;
import com.lviv.frost.gof.builder.model.NutritionFacts;
import com.lviv.frost.gof.builder.model.pizza.Calzone;
import com.lviv.frost.gof.builder.model.pizza.NewYorkPizza;

import static com.lviv.frost.gof.builder.model.pizza.Size.SMALL;
import static com.lviv.frost.gof.builder.model.pizza.Topping.HAM;
import static com.lviv.frost.gof.builder.model.pizza.Topping.ONION;
import static com.lviv.frost.gof.builder.model.pizza.Topping.SAUSAGE;

public class BuilderApp {
    public static void main(String[] args) {
        realisationOfBuilder(new TripLaptopBuilder());
        realisationOfBuilder(new GamingLaptopBuilder());

        NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(240, 5)
                .calories(20)
                .build();

        NewYorkPizza newYorkPizza = new NewYorkPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }

    private static void realisationOfBuilder(LaptopBuilder laptopBuilder) {
        BuyLaptop shopForYou = new BuyLaptop();
        shopForYou.setLaptopBuilder(laptopBuilder);
        shopForYou.constructLaptop();
        Laptop laptop = shopForYou.getLaptop();
        System.out.println(laptop);
    }
}
