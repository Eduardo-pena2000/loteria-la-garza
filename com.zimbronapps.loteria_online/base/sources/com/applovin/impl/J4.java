package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class j4 {
    private final com.applovin.impl.sdk.k a;
    private final Context b = com.applovin.impl.sdk.k.o();
    private String c;

    public j4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ void a(j4 j4Var) {
        j4Var.g();
    }

    public static /* synthetic */ void b(j4 j4Var) {
        j4Var.f();
    }

    private /* synthetic */ void f() {
        if (this.c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            this.c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(readLine);
                    }
                } catch (IOException e) {
                    Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                }
            } catch (Throwable th) {
                try {
                    Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th3);
            }
        }
    }

    private /* synthetic */ void g() {
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.b);
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o O = this.a.O();
            StringBuilder sb = new StringBuilder();
            sb.append("Init ");
            sb.append(d() ? "succeeded" : "failed");
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
            O.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    private void h() {
        this.a.q0().a((i5) new r6(this.a, "OpenMeasurementService", new S1(this)), d6.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = (String) this.a.n0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.a.a(x4.a0)).booleanValue()) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new R1(this));
        }
    }

    public String a() {
        return this.c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.a.a(x4.b0), AppLovinSdk.VERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            boolean r0 = r3.e()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            com.applovin.impl.sdk.k r0 = r3.a     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = com.applovin.impl.k4.a(r0, r5)     // Catch: java.lang.Throwable -> L17
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r5 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r5, r4)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r5 = move-exception
            goto L21
        L19:
            r5 = r4
        L1a:
            java.lang.String r0 = r3.c     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r0, r5)     // Catch: java.lang.Throwable -> L17
            return r4
        L21:
            com.applovin.impl.sdk.k r0 = r3.a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L39
            com.applovin.impl.sdk.k r0 = r3.a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.String r1 = "OpenMeasurementService"
            java.lang.String r2 = "Failed to inject JavaScript SDK into HTML"
            r0.a(r1, r2, r5)
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j4.a(java.lang.String, java.util.Map):java.lang.String");
    }
}
