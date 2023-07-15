package com.geekster.Restaurant.management.service.API.Service;

import com.geekster.Restaurant.management.service.API.Model.Food;
import com.geekster.Restaurant.management.service.API.Repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    IFoodRepo iFoodRepo;

    public void addFoodItem(Food food) {
        iFoodRepo.save(food);
    }

    public boolean isFoodInTheMenu(Food food) {

        Integer id = food.getFoodId();

        return iFoodRepo.existsById(id);
    }
}
