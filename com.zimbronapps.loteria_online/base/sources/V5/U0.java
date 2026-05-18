package V5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzikw;
import java.util.Objects;
import v.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u0 implements zzbie {
    public final /* synthetic */ zzbif a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Uri d;

    public u0(F0 f0, zzbif zzbifVar, Bundle bundle, Context context, Uri uri) {
        this.a = zzbifVar;
        this.b = bundle;
        this.c = context;
        this.d = uri;
        Objects.requireNonNull(f0);
    }

    public final void zza() {
        zzbif zzbifVar = this.a;
        d.d dVar = new d.d(zzbifVar.zzc());
        F0.w(dVar, this.b);
        v.d a = dVar.a();
        Intent intent = a.a;
        Context context = this.c;
        intent.setPackage(zzikw.zza(context));
        a.a(context, this.d);
        zzbifVar.zzb((Activity) context);
    }
}
