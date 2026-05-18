package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import android.app.Activity;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements o {
    public final /* synthetic */ CustomerCenterViewModel a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ a(CustomerCenterViewModel customerCenterViewModel, Activity activity) {
        this.a = customerCenterViewModel;
        this.b = activity;
    }

    public final void onStateChanged(r rVar, k.a aVar) {
        InternalCustomerCenterKt$InternalCustomerCenter$4$1.a(this.a, this.b, rVar, aVar);
    }
}
