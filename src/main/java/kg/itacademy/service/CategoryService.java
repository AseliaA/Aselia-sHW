package kg.itacademy.service;

import kg.itacademy.dao.CategoryDao;
import kg.itacademy.model.CategoryModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class CategoryService {
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<CategoryModel> getCategory_JSON(){
        System.out.println("Getting categories");
        List<CategoryModel> categoryModels = CategoryDao.getAllCategories();
        return categoryModels;
    }

    @GET
    @Path("/{categoryId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CategoryModel getCategory(@PathParam("CategoryId") Integer categoryId){
        return CategoryDao.getCategory(categoryId);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CategoryModel addCategory(CategoryModel categoryModel){
        return CategoryDao.addCategory(categoryModel);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CategoryModel updateCategory(CategoryModel categoryModel){
        return CategoryDao.updateCategory(categoryModel);
    }

    @DELETE
    @Path("/{CategoryId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteCategory(@PathParam("categoryId") Integer categoryId){
        CategoryDao.deleteCategory(categoryId);
    }
}
