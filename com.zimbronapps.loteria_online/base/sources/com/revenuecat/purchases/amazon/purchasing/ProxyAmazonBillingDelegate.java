package com.revenuecat.purchases.amazon.purchasing;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.Arrays;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import o9.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProxyAmazonBillingDelegate {
    private /* synthetic */ ProxyAmazonBillingActivityBroadcastReceiver broadcastReceiver;
    private final IntentFilter filter = ProxyAmazonBillingActivityBroadcastReceiver.Companion.newPurchaseFinishedIntentFilter();

    public static /* synthetic */ void getBroadcastReceiver$purchases_defaultsBc8Release$annotations() {
    }

    public final ProxyAmazonBillingActivityBroadcastReceiver getBroadcastReceiver$purchases_defaultsBc8Release() {
        return this.broadcastReceiver;
    }

    @SuppressLint({"WrongConstant"})
    public final void onCreate(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
        ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver = new ProxyAmazonBillingActivityBroadcastReceiver(activity);
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(activity, proxyAmazonBillingActivityBroadcastReceiver, this.filter, 2);
        } else {
            activity.registerReceiver(proxyAmazonBillingActivityBroadcastReceiver, this.filter);
        }
        if (bundle == null) {
            Intent intent = activity.getIntent();
            t.f(intent, "activity.intent");
            if (startAmazonPurchase$purchases_defaultsBc8Release(intent) == null) {
                activity.finish();
            }
        }
    }

    public final void onDestroy(Activity activity) {
        t.g(activity, "activity");
        activity.unregisterReceiver(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    public final void setBroadcastReceiver$purchases_defaultsBc8Release(ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver) {
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
    }

    public final RequestId startAmazonPurchase$purchases_defaultsBc8Release(Intent intent) {
        t.g(intent, "intent");
        String stringExtra = intent.getStringExtra("sku");
        ResultReceiver parcelableExtra = intent.getParcelableExtra("result_receiver");
        PurchasingServiceProvider purchasingServiceProvider = (PurchasingServiceProvider) intent.getParcelableExtra("purchasing_service_provider");
        if (stringExtra != null && parcelableExtra != null && purchasingServiceProvider != null) {
            RequestId purchase = purchasingServiceProvider.purchase(stringExtra);
            Bundle bundle = new Bundle();
            bundle.putParcelable("request_id", purchase);
            parcelableExtra.send(0, bundle);
            return purchase;
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
        U u = U.a;
        String format = String.format("Failed to make purchase. Arguments are invalid. \n Intent: %s", Arrays.copyOf(new Object[]{intent.toUri(0)}, 1));
        t.f(format, "format(...)");
        LogUtilsKt.errorLog(new PurchasesError(purchasesErrorCode, format));
        return null;
    }
}
