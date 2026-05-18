package com.revenuecat.purchases.ui.revenuecatui.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.extensions.UrisKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.t;
import v.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class URLOpener {
    public static final int $stable = 0;
    public static final URLOpener INSTANCE = new URLOpener();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[URLOpeningMethod.values().length];
            try {
                iArr[URLOpeningMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[URLOpeningMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[URLOpeningMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private URLOpener() {
    }

    public static final /* synthetic */ void access$openURL$handleException(Context context, Exception exc) {
        openURL$handleException(context, exc);
    }

    private static final void openURL$handleException(Context context, Exception exc) {
        String string = exc instanceof ActivityNotFoundException ? context.getString(R.string.no_browser_cannot_open_link) : context.getString(R.string.cannot_open_link);
        t.f(string, "if (exception is Activit…_open_link)\n            }");
        Toast.makeText(context, string, 0).show();
        Logger.INSTANCE.e(string, exc);
    }

    public final /* synthetic */ void openURL$revenuecatui_defaultsBc8Release(Context context, String url, URLOpeningMethod method) {
        t.g(context, "context");
        t.g(url, "url");
        t.g(method, "method");
        int i = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                UrisKt.openUriOrElse(context, url, new URLOpener$openURL$1(context));
                return;
            }
            return;
        }
        v.d a = new d.d().a();
        t.f(a, "Builder()\n                    .build()");
        try {
            a.a(context, Uri.parse(url));
        } catch (IllegalArgumentException e) {
            openURL$handleException(context, e);
        } catch (ActivityNotFoundException e2) {
            openURL$handleException(context, e2);
        }
    }
}
