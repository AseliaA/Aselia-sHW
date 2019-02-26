package kg.itacademy.dao;

import kg.itacademy.model.CategoryModel;


import java.time.LocalDateTime;
import java.util.*;

public class CategoryDao {
    private static final Map<Integer, CategoryModel> categoryMap = new HashMap<>();

    static {

    }

    private static void initCategory() {
        CategoryModel categoryModel1 = new CategoryModel(1, "Utilities", 1, true, LocalDateTime.now());
        CategoryModel categoryModel2 = new CategoryModel(1, "Electronic", 1, true, LocalDateTime.now());
        CategoryModel categoryModel3 = new CategoryModel(1, "Food", 1, true, LocalDateTime.now());


        categoryMap.put(categoryModel1.getId(), categoryModel1);
        categoryMap.put(categoryModel1.getId(), categoryModel2);
        categoryMap.put(categoryModel1.getId(), categoryModel3);
    }

    public static CategoryModel getCategory(Integer id) {
        return categoryMap.get(id);
    }

    public static CategoryModel addCategory(CategoryModel categoryModel) {
        return categoryMap.put(categoryModel.getUserId() ,categoryModel);
    }

    public static CategoryModel updateCategory(CategoryModel categoryModel) {
        categoryMap.put(categoryModel.getUserId(), categoryModel);
        return categoryModel;
    }

    public static void deleteCategory(Integer id) {
        categoryMap.remove(id);
    }

    public static List<CategoryModel> getAllCategories() {
//        Collection<CategoryModel> categories = categoryMap.values();
//        List<CategoryModel > list = new ArrayList<>();
//        list.addAll(categories);
//        return categories;
        return new ArrayList<>(categoryMap.values());
    }
}

