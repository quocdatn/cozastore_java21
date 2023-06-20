package com.cybersoft.cozastore_java21.service;

import com.cybersoft.cozastore_java21.entity.CategoryEntity;
import com.cybersoft.cozastore_java21.payload.response.CategoryResponse;
import com.cybersoft.cozastore_java21.repository.CategoryRepository;
import com.cybersoft.cozastore_java21.service.imp.CategorySeviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements CategorySeviceImp {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAllCategory() {
        List<CategoryEntity> list = categoryRepository.findAll();
        List<CategoryResponse> responsesList = new ArrayList<>();

        for (CategoryEntity data : list) {
            CategoryResponse categoryResponse = new CategoryResponse();
            categoryResponse.setId(String.valueOf(data.getId())); // Mentor fix add thêm valueOf
            categoryResponse.setName(data.getName());

            responsesList.add(categoryResponse);
        }

        return responsesList;
    }
}
