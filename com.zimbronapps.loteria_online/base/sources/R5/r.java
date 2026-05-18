package R5;

import S5.l2;
import V5.o0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbiq;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r {
    public final Context a;
    public final String b;
    public final Map c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public r(Context context, String str) {
        String concat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = G6.e.a(context).f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            int i = o0.b;
            W5.p.d("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f = concat;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.f;
    }

    public final Map e() {
        return this.c;
    }

    public final void f(l2 l2Var, W5.a aVar) {
        this.d = l2Var.j.a;
        Bundle bundle = l2Var.m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbiq.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        Map map = this.c;
        map.put("SDKVersion", aVar.a);
        if (((Boolean) zzbiq.zza.zze()).booleanValue()) {
            Bundle b = V5.d.b(this.a, (String) zzbiq.zzb.zze());
            for (String str3 : b.keySet()) {
                map.put(str3, b.get(str3).toString());
            }
        }
    }
}
