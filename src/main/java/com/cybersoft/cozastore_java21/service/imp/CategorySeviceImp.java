package com.cybersoft.cozastore_java21.service.imp;

import com.cybersoft.cozastore_java21.payload.response.CategoryResponse;
import com.cybersoft.cozastore_java21.repository.CategoryRepository;

import java.util.List;

public interface CategorySeviceImp {
    List<CategoryResponse> getAllCategory();
}
