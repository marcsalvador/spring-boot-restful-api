package com.SearchAndPay.Repositories;

import com.SearchAndPay.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
