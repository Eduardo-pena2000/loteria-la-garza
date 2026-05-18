package com.applovin.impl.sdk;

import com.applovin.impl.n7;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.x4;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class NativeCrashReporter implements g.d {
    private static boolean b;
    private static boolean c;
    private static final NativeCrashReporter d = new NativeCrashReporter();
    private final HashMap a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(x4.q4)).booleanValue() && !n7.k(k.o())) {
            if (c) {
                try {
                    g l = kVar.l();
                    NativeCrashReporter nativeCrashReporter = d;
                    l.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    kVar.D().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List c2 = kVar.c(x4.r4);
            int[] iArr = new int[c2.size()];
            for (int i = 0; i < c2.size(); i++) {
                try {
                    iArr[i] = Integer.parseInt((String) c2.get(i));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.o().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) kVar.a(x4.s4)).booleanValue());
                if (((Boolean) kVar.a(x4.t4)).booleanValue()) {
                    Set hashSet = new HashSet();
                    hashSet.add(g.c.b);
                    hashSet.add(g.c.c);
                    hashSet.add(g.c.d);
                    hashSet.add(g.c.f);
                    hashSet.add(g.c.h);
                    hashSet.add(g.c.g);
                    kVar.l().a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th2) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                kVar.D().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!b) {
            b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                c = true;
            } catch (Throwable th) {
                o.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.io.File r16, com.applovin.impl.sdk.k r17) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.k):void");
    }

    public void a(g.b bVar) {
        String h = bVar.h();
        if (bVar.i() == g.c.g) {
            this.a.remove(h);
        } else if (this.a.containsKey(h)) {
            JsonUtils.putString((JSONObject) this.a.get(h), "operation", bVar.i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.g());
            JsonUtils.putString(jSONObject, "network_name", bVar.c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
            JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
            JsonUtils.putString(jSONObject, "bcode", bVar.e());
            JsonUtils.putString(jSONObject, "creative_id", bVar.f());
            JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
            this.a.put(h, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}
