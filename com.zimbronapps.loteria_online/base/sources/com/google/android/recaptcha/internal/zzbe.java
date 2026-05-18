package com.google.android.recaptcha.internal;

import Ca.q;
import Ca.x;
import Da.S;
import Da.Y;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            t.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return Y.b();
        }
    }

    private static final Map zzb() {
        Map o = S.o(new q[]{x.a(0, zzqi.NET_CAPABILITY_MMS), x.a(1, zzqi.NET_CAPABILITY_SUPL), x.a(2, zzqi.NET_CAPABILITY_DUN), x.a(3, zzqi.NET_CAPABILITY_FOTA), x.a(4, zzqi.NET_CAPABILITY_IMS), x.a(5, zzqi.NET_CAPABILITY_CBS), x.a(6, zzqi.NET_CAPABILITY_WIFI_P2P), x.a(7, zzqi.NET_CAPABILITY_IA), x.a(8, zzqi.NET_CAPABILITY_RCS), x.a(9, zzqi.NET_CAPABILITY_XCAP), x.a(10, zzqi.NET_CAPABILITY_EIMS), x.a(11, zzqi.NET_CAPABILITY_NOT_METERED), x.a(12, zzqi.NET_CAPABILITY_INTERNET), x.a(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), x.a(14, zzqi.NET_CAPABILITY_TRUSTED), x.a(15, zzqi.NET_CAPABILITY_NOT_VPN)});
        int i = Build.VERSION.SDK_INT;
        o.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        o.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i >= 28) {
            o.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            o.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            o.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            o.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            o.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            o.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            o.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            o.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            o.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            o.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            o.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return o;
    }
}
