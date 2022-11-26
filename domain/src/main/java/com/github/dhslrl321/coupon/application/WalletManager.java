package com.github.dhslrl321.coupon.application;

import com.github.dhslrl321.coupon.core.Coupon;
import com.github.dhslrl321.coupon.core.CouponId;
import com.github.dhslrl321.coupon.core.UserId;
import java.util.List;

public interface WalletManager {

    void add(UserId userId, Coupon coupon);

    Coupon useBy(UserId userId, CouponId couponId);

    List<Coupon> getAllBy(UserId userId);
}
