package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.api.R;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProxyAmazonBillingActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRAS_PURCHASING_SERVICE_PROVIDER = "purchasing_service_provider";
    public static final String EXTRAS_REQUEST_ID = "request_id";
    public static final String EXTRAS_RESULT_RECEIVER = "result_receiver";
    public static final String EXTRAS_SKU = "sku";
    private ProxyAmazonBillingDelegate proxyAmazonBillingDelegate;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Intent newStartIntent(Context context, ResultReceiver resultReceiver, String str, PurchasingServiceProvider purchasingServiceProvider) {
            t.g(context, "context");
            t.g(resultReceiver, "resultReceiver");
            t.g(str, "sku");
            t.g(purchasingServiceProvider, "purchasingServiceProvider");
            Intent intent = new Intent(context, ProxyAmazonBillingActivity.class);
            intent.putExtra("result_receiver", resultReceiver);
            intent.putExtra("sku", str);
            intent.putExtra("purchasing_service_provider", purchasingServiceProvider);
            return intent;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getProxyAmazonBillingDelegate$purchases_defaultsBc8Release$annotations() {
    }

    public final ProxyAmazonBillingDelegate getProxyAmazonBillingDelegate$purchases_defaultsBc8Release() {
        return this.proxyAmazonBillingDelegate;
    }

    public void onCreate(Bundle bundle) {
        setTheme(R.style.ProxyAmazonBillingActivityTheme);
        super.onCreate(bundle);
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = new ProxyAmazonBillingDelegate();
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
        proxyAmazonBillingDelegate.onCreate(this, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = this.proxyAmazonBillingDelegate;
        if (proxyAmazonBillingDelegate != null) {
            proxyAmazonBillingDelegate.onDestroy(this);
        }
        this.proxyAmazonBillingDelegate = null;
    }

    public final void setProxyAmazonBillingDelegate$purchases_defaultsBc8Release(ProxyAmazonBillingDelegate proxyAmazonBillingDelegate) {
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
    }
}
