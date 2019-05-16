package com.oss.repository;

import com.oss.domain.CartItem;
import com.oss.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem,Long> {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
