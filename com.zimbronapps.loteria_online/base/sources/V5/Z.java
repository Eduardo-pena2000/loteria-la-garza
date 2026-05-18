package V5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaru;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzasn;
import com.google.android.gms.internal.ads.zzasu;
import com.google.android.gms.internal.ads.zzasz;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzfxl;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z extends zzasn {
    public final Context a;

    public z(Context context, zzasm zzasmVar) {
        super(zzasmVar);
        this.a = context;
    }

    public static zzasb a(Context context) {
        zzasb zzasbVar = new zzasb(new zzasu(new File(zzfxl.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new z(context, new zzasz(null, null)), 4);
        zzasbVar.zza();
        return zzasbVar;
    }

    public final zzaru zza(zzary zzaryVar) {
        if (zzaryVar.zza() == 0) {
            if (Pattern.matches((String) S5.D.c().zzd(zzbhe.zzfq), zzaryVar.zzh())) {
                Context context = this.a;
                S5.B.a();
                if (W5.g.E(context, 13400000)) {
                    zzaru zza = new zzbqf(context).zza(zzaryVar);
                    if (zza != null) {
                        o0.k("Got gmscore asset response: ".concat(String.valueOf(zzaryVar.zzh())));
                        return zza;
                    }
                    o0.k("Failed to get gmscore asset response: ".concat(String.valueOf(zzaryVar.zzh())));
                }
            }
        }
        return super.zza(zzaryVar);
    }
}
