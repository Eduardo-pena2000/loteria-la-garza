package com.revenuecat.purchases_ui_flutter.views;

import R9.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import io.flutter.plugin.platform.i;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class BasePaywallView implements i {
    public BasePaywallView(Context context) {
        t.g(context, "context");
        checkActivityType(context);
    }

    private final Activity activity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            t.f(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    private final void checkActivityType(Context context) {
        Activity activity = activity(context);
        if (activity != null && !k.class.isAssignableFrom(activity.getClass())) {
            throw new RuntimeException("Implementation Error: PaywallView requires the MainActivity to extend FlutterFragmentActivity in order for the paywall to be displayed correctly.\nPlease change your MainActivity to extend FlutterFragmentActivity instead. See https://rev.cat/flutter-paywall-installation for more information.");
        }
    }

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ View getView();

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
        super.onFlutterViewAttached(view);
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
        super.onFlutterViewDetached();
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        super.onInputConnectionLocked();
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        super.onInputConnectionUnlocked();
    }
}
