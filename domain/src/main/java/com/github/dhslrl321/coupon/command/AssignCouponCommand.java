package com.github.dhslrl321.coupon.command;

import com.github.dhslrl321.coupon.core.CouponCode;
import com.github.dhslrl321.coupon.core.UserId;
import lombok.Value;

@Value(staticConstructor = "of")
public class AssignCouponCommand {
    UserId userId;
    CouponCode couponCode;
}
