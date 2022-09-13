package com.ms;

import com.ms.entity.Category;
import com.ms.entity.Product;
import com.ms.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_returnListProducts(){
        Product product = Product.builder()
                .name("Computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("144.9"))
                .createAt(new Date())
                .build();
        productRepository.save(product);
        List<Product> products = productRepository.findByCategory(product.getCategory());

        Assertions.assertThat(products.size()).isEqualTo(2);
    }
}
