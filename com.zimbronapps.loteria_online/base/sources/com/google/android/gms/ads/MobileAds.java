package com.google.android.gms.ads;

import L5.A;
import L5.s;
import L5.y;
import S5.A1;
import W5.p;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcdd;
import d6.a;
import java.util.List;
import v.b;
import v.c;
import v.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        A1.f().q(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return A1.f().p();
    }

    private static String getInternalVersion() {
        return A1.f().s();
    }

    public static y getRequestConfiguration() {
        return A1.f().t();
    }

    public static A getVersion() {
        A1.f();
        String[] split = TextUtils.split("24.9.0", "\\.");
        if (split.length != 3) {
            return new A(0, 0, 0);
        }
        try {
            return new A(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new A(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        A1.f().g(context, null, null);
    }

    public static void openAdInspector(Context context, s sVar) {
        A1.f().r(context, sVar);
    }

    public static void openDebugMenu(Context context, String str) {
        A1.f().n(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return A1.f().v(z);
    }

    public static f registerCustomTabsSession(Context context, c cVar, String str, b bVar) {
        A1.f();
        t.e("#008 Must be called on the main UI thread.");
        zzcdd zza = zzbyj.zza(context);
        if (zza == null) {
            p.c("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (f) N6.b.r1(zza.zzm(N6.b.s1(context), N6.b.s1(cVar), str, N6.b.s1(bVar)));
        } catch (RemoteException | IllegalArgumentException e) {
            p.d("Unable to register custom tabs session. Error: ", e);
            return null;
        }
    }

    public static void registerRtbAdapter(Class cls) {
        A1.f().o(cls);
    }

    public static void registerWebView(WebView webView) {
        A1.f();
        t.e("#008 Must be called on the main UI thread.");
        if (webView == null) {
            p.c("The webview to be registered cannot be null.");
            return;
        }
        zzcdd zza = zzbyj.zza(webView.getContext());
        if (zza == null) {
            p.c("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(N6.b.s1(webView));
        } catch (RemoteException e) {
            p.d("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        A1.f().l(z);
    }

    public static void setAppVolume(float f) {
        A1.f().j(f);
    }

    private static void setPlugin(String str) {
        A1.f().w(str);
    }

    public static void setRequestConfiguration(y yVar) {
        A1.f().u(yVar);
    }

    @Deprecated
    public static void startPreload(Context context, List list, a aVar) {
        A1.f().i(context, list, aVar);
    }

    private static void stop() {
        A1.f().h();
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        A1.f().g(context, null, onInitializationCompleteListener);
    }
}
