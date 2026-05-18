package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Qa.l;
import androidx.compose.animation.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterAnimations;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import y.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$1$1 extends u implements l {
    final /* synthetic */ CustomerCenterState.Success $customerCenterState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$1$1(CustomerCenterState.Success success) {
        super(1);
        this.$customerCenterState = success;
    }

    public final k invoke(c AnimatedContent) {
        t.g(AnimatedContent, "$this$AnimatedContent");
        return CustomerCenterAnimations.INSTANCE.getTransitionForNavigation((CustomerCenterDestination) AnimatedContent.b(), (CustomerCenterDestination) AnimatedContent.a(), this.$customerCenterState.getNavigationState());
    }
}
