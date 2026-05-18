package c6;

import R5.t;
import S5.D;
import V5.F0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzgrt;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a {
    public final Context a;
    public final String b;
    public final String c;

    public a(Context context, W5.a aVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = aVar.a;
    }

    public void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        t.g();
        map.put("device", F0.i0());
        map.put("app", this.b);
        t.g();
        Context context = this.a;
        map.put("is_lite_sdk", true != F0.j(context) ? "0" : "1");
        zzbgv zzbgvVar = zzbhe.zza;
        List zzf = D.b().zzf();
        if (((Boolean) D.c().zzd(zzbhe.zzhN)).booleanValue()) {
            zzf.addAll(t.l().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", zzf));
        map.put("sdkVersion", this.c);
        if (((Boolean) D.c().zzd(zzbhe.zzmN)).booleanValue()) {
            t.g();
            map.put("is_bstar", true != F0.g(context) ? "0" : "1");
        }
        if (((Boolean) D.c().zzd(zzbhe.zzkR)).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzcX)).booleanValue()) {
                map.put("plugin", zzgrt.zza(t.l().zzu()));
            }
        }
    }
}
