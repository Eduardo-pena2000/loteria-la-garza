package k7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h4 {
    public final Context a;
    public Boolean b;
    public long c;
    public zzdd d;
    public boolean e;
    public final Long f;
    public String g;

    public h4(Context context, zzdd zzddVar, Long l) {
        this.e = true;
        com.google.android.gms.common.internal.t.l(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.t.l(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (zzddVar != null) {
            this.d = zzddVar;
            this.e = zzddVar.zzc;
            this.c = zzddVar.zzb;
            this.g = zzddVar.zze;
            Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
