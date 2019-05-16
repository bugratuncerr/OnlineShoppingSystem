package com.oss.service;

import java.util.Set;

import com.oss.domain.User;
import com.oss.domain.UserBilling;
import com.oss.domain.UserPayment;
import com.oss.domain.UserShipping;
import com.oss.domain.security.PasswordResetToken;
import com.oss.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);

	User findById(Long id);

	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);

	void setUserDefaultShipping(Long userShippingId, User user);

}
