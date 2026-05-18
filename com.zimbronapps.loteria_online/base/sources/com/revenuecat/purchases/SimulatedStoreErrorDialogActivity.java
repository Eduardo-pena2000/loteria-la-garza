package com.revenuecat.purchases;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SimulatedStoreErrorDialogActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String redactedApiKeyExtra = "redactedApiKey";

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void show(Context context, String str) {
            t.g(context, "context");
            t.g(str, "redactedApiKey");
            Intent intent = new Intent(context, SimulatedStoreErrorDialogActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("redactedApiKey", str);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void a(SimulatedStoreErrorDialogActivity simulatedStoreErrorDialogActivity, DialogInterface dialogInterface, int i) {
        onCreate$lambda$0(simulatedStoreErrorDialogActivity, dialogInterface, i);
    }

    private final void crashApp() {
        if (!wasLaunchedThroughSDK()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "SimulatedStoreErrorDialogActivity was launched incorrectly. This activity is only meant to be launched internally by the SDK.", null);
            finish();
            return;
        }
        throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ConfigurationError, null, 2, null), "Test Store API key used in release build: " + getRedactedApiKey() + ". Please configure the Play Store/Amazon app on the RevenueCat dashboard and use its corresponding API key before releasing. Visit https://rev.cat/sdk-test-store to learn more.");
    }

    private static final void onCreate$lambda$0(SimulatedStoreErrorDialogActivity simulatedStoreErrorDialogActivity, DialogInterface dialogInterface, int i) {
        simulatedStoreErrorDialogActivity.crashApp();
    }

    private final boolean wasLaunchedThroughSDK() {
        return getIntent().hasExtra("redactedApiKey");
    }

    public final String getRedactedApiKey() {
        String stringExtra = getIntent().getStringExtra("redactedApiKey");
        return stringExtra == null ? "" : stringExtra;
    }

    public void onBackPressed() {
        crashApp();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        new AlertDialog.Builder(this).setTitle("Wrong API Key").setMessage("This app is using a test API key: " + getRedactedApiKey() + ".\n\nTo prepare for release, update your RevenueCat settings to use a production key.\n\nFor more info, visit the RevenueCat dashboard.\n\nThe app will close now to protect the security of test purchases.").setCancelable(false).setPositiveButton("OK", new m(this)).show();
    }

    public void onPause() {
        super.onPause();
        crashApp();
    }
}
