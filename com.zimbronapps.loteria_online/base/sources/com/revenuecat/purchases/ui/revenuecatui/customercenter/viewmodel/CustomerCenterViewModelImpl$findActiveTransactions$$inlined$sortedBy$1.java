package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Fa.b;
import com.revenuecat.purchases.SubscriptionInfo;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelImpl$findActiveTransactions$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return b.d(((SubscriptionInfo) obj).getExpiresDate(), ((SubscriptionInfo) obj2).getExpiresDate());
    }
}
