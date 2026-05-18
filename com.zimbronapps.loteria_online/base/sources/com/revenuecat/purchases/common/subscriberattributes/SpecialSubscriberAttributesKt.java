package com.revenuecat.purchases.common.subscriberattributes;

import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SpecialSubscriberAttributesKt {
    public static final SubscriberAttributeKey getSubscriberAttributeKey(String str) {
        t.g(str, "<this>");
        return t.c(str, ReservedSubscriberAttribute.EMAIL.getValue()) ? SubscriberAttributeKey.Email.INSTANCE : t.c(str, ReservedSubscriberAttribute.DISPLAY_NAME.getValue()) ? SubscriberAttributeKey.DisplayName.INSTANCE : t.c(str, ReservedSubscriberAttribute.PHONE_NUMBER.getValue()) ? SubscriberAttributeKey.PhoneNumber.INSTANCE : t.c(str, ReservedSubscriberAttribute.FCM_TOKENS.getValue()) ? SubscriberAttributeKey.FCMTokens.INSTANCE : new SubscriberAttributeKey.Custom(str);
    }
}
