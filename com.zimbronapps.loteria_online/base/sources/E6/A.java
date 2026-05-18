package e6;

import S5.D;
import S5.E1;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbyj;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a {
    public final E1 a;

    public a(E1 e1) {
        this.a = e1;
    }

    public static void a(Context context, L5.c cVar, AdRequest adRequest, b bVar) {
        c(context, cVar, adRequest, null, bVar);
    }

    public static void c(Context context, L5.c cVar, AdRequest adRequest, String str, b bVar) {
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzj.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new c(context, cVar, adRequest, str, bVar));
                return;
            }
        }
        new zzbyj(context, cVar, adRequest == null ? null : adRequest.a(), str).zzb(bVar);
    }

    public String b() {
        return this.a.a();
    }
}
