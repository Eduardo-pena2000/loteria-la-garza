package R5;

import com.google.android.gms.internal.ads.zzfwf;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h implements zzfwf {
    public final /* synthetic */ k a;

    public h(k kVar) {
        Objects.requireNonNull(kVar);
        this.a = kVar;
    }

    public final void zza(int i, long j) {
        this.a.f().zzb(i, System.currentTimeMillis() - j);
    }

    public final void zzb(int i, long j, String str) {
        this.a.f().zzf(i, System.currentTimeMillis() - j, str);
    }
}
