package com.revenuecat.purchases.ui.revenuecatui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallContract extends h.a {
    public static final int $stable = 0;

    public Intent createIntent(Context context, PaywallActivityArgs args) {
        t.g(context, "context");
        t.g(args, "args");
        Intent intent = new Intent(context, PaywallActivity.class);
        intent.putExtra("paywall_args", args);
        return intent;
    }

    public PaywallResult parseResult(int i, Intent intent) {
        PaywallResult paywallResult;
        if (i != -1 || intent == null) {
            return PaywallResult.Cancelled.INSTANCE;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            paywallResult = (PaywallResult) a.a(intent, "paywall_result", PaywallResult.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("paywall_result");
            paywallResult = parcelableExtra instanceof PaywallResult ? (PaywallResult) parcelableExtra : null;
        }
        return paywallResult == null ? new PaywallResult.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "PaywallActivity returned null result")) : paywallResult;
    }
}
