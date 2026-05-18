package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProxyAmazonBillingActivityBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    public static final String PURCHASE_FINISHED_ACTION = "com.revenuecat.purchases.purchase_finished";
    private final WeakReference activity;
    private boolean onReceiveCalled;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Intent newPurchaseFinishedIntent(String str) {
            t.g(str, "packageName");
            Intent intent = new Intent("com.revenuecat.purchases.purchase_finished");
            intent.setPackage(str);
            return intent;
        }

        public final IntentFilter newPurchaseFinishedIntentFilter() {
            return new IntentFilter("com.revenuecat.purchases.purchase_finished");
        }

        private Companion() {
        }
    }

    public ProxyAmazonBillingActivityBroadcastReceiver(Activity activity) {
        t.g(activity, "activity");
        this.activity = new WeakReference(activity);
    }

    public static /* synthetic */ void getOnReceiveCalled$annotations() {
    }

    public final boolean getOnReceiveCalled() {
        return this.onReceiveCalled;
    }

    public void onReceive(Context context, Intent intent) {
        t.g(context, "context");
        t.g(intent, "intent");
        this.onReceiveCalled = true;
        Activity activity = (Activity) this.activity.get();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void setOnReceiveCalled(boolean z) {
        this.onReceiveCalled = z;
    }
}
