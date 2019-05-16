package com.oss.repository;

import com.oss.domain.CartItem;
import com.oss.domain.ProductToCartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem,Long> {
    void deleteByCartItem(CartItem cartItem);

}
