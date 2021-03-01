package com.SearchAndPay.Repositories;

import com.SearchAndPay.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
