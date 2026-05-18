package b6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzgup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b0 {
    public final Context a;
    public final ApplicationInfo b;
    public final List c;
    public final W5.a d;
    public final JSONObject e = new JSONObject();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public b0(Context context, zzbgo zzbgoVar, List list, W5.a aVar) {
        this.a = context;
        this.b = context.getApplicationInfo();
        this.c = list;
        this.d = aVar;
    }

    public final void a(WebView webView) {
        if (this.f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            ApplicationInfo applicationInfo = this.b;
            if (applicationInfo != null) {
                packageInfo = G6.e.a(this.a).f(applicationInfo.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                JSONObject jSONObject = this.e;
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e) {
                R5.t.l().zzg(e, "PawAppSignalGenerator.initialize");
            }
        }
        ApplicationInfo applicationInfo2 = this.b;
        if (applicationInfo2 != null) {
            this.e.put("pn", applicationInfo2.packageName);
        }
        JSONObject jSONObject2 = this.e;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) S5.D.c().zzd(zzbhe.zzll)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.d.a);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Object obj = jSONObject2.get(str2);
            if (obj != null) {
                jSONObject2.put(str2, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzbjj.zzb.zze()).booleanValue() && t4.j.a("DOCUMENT_START_SCRIPT") && webView != null) {
            t4.i.a(webView, String.format(Locale.getDefault(), (String) S5.D.c().zzd(zzbhe.zzlk), new Object[]{b()}), zzgup.zzi("*"));
        }
    }

    public final JSONObject b() {
        if (!this.f.get()) {
            a(null);
        }
        return this.e;
    }
}
