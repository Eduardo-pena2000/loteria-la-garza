package V5;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzebe;
import com.google.android.gms.internal.ads.zzebf;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public zzebf g;

    public static final String o(Context context, String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", R5.t.g().R(context, str2));
        x7.e b = new N(context).b(0, str, hashMap, null);
        try {
            return (String) b.get(((Integer) S5.D.c().zzd(zzbhe.zzfV)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            int i = o0.b;
            W5.p.d("Timeout while retrieving a response from: ".concat(valueOf), e);
            b.cancel(true);
            return null;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(str);
            int i2 = o0.b;
            W5.p.d("Error retrieving a response from: ".concat(valueOf2), e2);
            return null;
        } catch (InterruptedException e3) {
            String valueOf3 = String.valueOf(str);
            int i3 = o0.b;
            W5.p.d("Interrupted while retrieving a response from: ".concat(valueOf3), e3);
            b.cancel(true);
            return null;
        }
    }

    public final void a(zzebf zzebfVar) {
        this.g = zzebfVar;
    }

    public final zzebf b() {
        return this.g;
    }

    public final void c(Context context) {
        zzebf zzebfVar;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue() || (zzebfVar = this.g) == null) {
            return;
        }
        zzebfVar.zzo(new v(this, context), zzebe.DEBUG_MENU);
    }

    public final boolean d(Context context, String str, String str2) {
        String o = o(context, p(context, (String) S5.D.c().zzd(zzbhe.zzfS), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            int i = o0.b;
            W5.p.a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(o.trim());
            String optString = jSONObject.optString("gct");
            this.f = jSONObject.optString("status");
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
                String str3 = this.f;
                boolean z = "0".equals(str3) || "2".equals(str3);
                j(z);
                q0 zzo = R5.t.l().zzo();
                if (!z) {
                    str = "";
                }
                zzo.f(str);
            }
            synchronized (this.a) {
                this.c = optString;
            }
            return true;
        } catch (JSONException e) {
            int i2 = o0.b;
            W5.p.g("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean e(Context context, String str, String str2) {
        String o = o(context, p(context, (String) S5.D.c().zzd(zzbhe.zzfT), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            int i = o0.b;
            W5.p.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o.trim()).optString("debug_mode"));
            j(equals);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
                q0 zzo = R5.t.l().zzo();
                if (true != equals) {
                    str = "";
                }
                zzo.f(str);
            }
            return equals;
        } catch (JSONException e) {
            int i2 = o0.b;
            W5.p.g("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void f(Context context, String str, String str2) {
        R5.t.g();
        F0.C(context, p(context, (String) S5.D.c().zzd(zzbhe.zzfR), str, str2));
    }

    public final boolean g(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        int i = o0.b;
        W5.p.a("Sending troubleshooting signals to the server.");
        h(context, str, str2, str3);
        return true;
    }

    public final void h(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) S5.D.c().zzd(zzbhe.zzfU), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        R5.t.g();
        F0.q(context, str, buildUpon.build().toString());
    }

    public final String i() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void j(boolean z) {
        synchronized (this.a) {
            try {
                this.e = z;
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
                    R5.t.l().zzo().zzK(z);
                    zzebf zzebfVar = this.g;
                    if (zzebfVar != null) {
                        zzebfVar.zzb(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final void l(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void n(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            F0.l.post(new x(this, context, str, z, z2));
        } else {
            int i = o0.b;
            W5.p.e("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:8:0x0018, B:9:0x0034, B:11:0x003c, B:14:0x0051, B:17:0x0063, B:19:0x002b, B:20:0x006a, B:21:0x006c), top: B:3:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri p(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L6a
            R5.t.g()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3 = 1
            byte[] r1 = E6.m.e(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            goto L34
        L29:
            r5 = move-exception
            goto L81
        L2b:
            java.lang.String r1 = "Error reading from internal storage."
            int r2 = V5.o0.b     // Catch: java.lang.Throwable -> L29
            W5.p.a(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
        L34:
            r4.b = r2     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L6a
            R5.t.g()     // Catch: java.lang.Throwable -> L29
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r4.b = r1     // Catch: java.lang.Throwable -> L29
            R5.t.g()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            r5.write(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            goto L6a
        L62:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            int r2 = V5.o0.b     // Catch: java.lang.Throwable -> L29
            W5.p.d(r1, r5)     // Catch: java.lang.Throwable -> L29
        L6a:
            java.lang.String r5 = r4.b     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L81:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.y.p(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
