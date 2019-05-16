package com.oss.service;

import com.oss.domain.CartItem;
import com.oss.domain.Product;
import com.oss.domain.ShoppingCart;
import com.oss.domain.User;

import java.util.List;

public interface CartItemService {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addProductToCartItem(Product product, User user, int qty);

    CartItem findById(Long id);

    void removeCartItem(CartItem cartItem);

}
