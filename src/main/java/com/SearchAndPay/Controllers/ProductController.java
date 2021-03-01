package com.SearchAndPay.Controllers;

import com.SearchAndPay.Models.Category;
import com.SearchAndPay.Models.MeasureType;
import com.SearchAndPay.Models.Product;

import com.SearchAndPay.Repositories.CategoryRepository;
import com.SearchAndPay.Repositories.MeasureTypeRepository;
import com.SearchAndPay.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MeasureTypeRepository measureTypeRepository;

    @GetMapping(value="/")
    public String GetPage()
    {
        return "Hello";
    }

    @GetMapping(value="/products")
    public List<Product> GetProducts()
    {
        return productRepository.findAll();
    }

    @GetMapping(value="/categories")
    public List<Category> GetCategories()
    {
        return categoryRepository.findAll();
    }

    @GetMapping(value="/measure-types")
    public List<MeasureType> GetMeasureTypes()
    {
        return measureTypeRepository.findAll();
    }
}
