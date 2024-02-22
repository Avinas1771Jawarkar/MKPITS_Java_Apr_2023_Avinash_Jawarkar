package com.example.ThursdayCurdWithBharat.repo;

import com.example.ThursdayCurdWithBharat.model.CartFormData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<CartFormData, String> {
}
