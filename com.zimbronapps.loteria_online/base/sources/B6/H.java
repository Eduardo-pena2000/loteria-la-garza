package b6;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h implements zzgzl {
    public final /* synthetic */ zzbyh a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w c;

    public h(w wVar, zzbyh zzbyhVar, boolean z) {
        this.a = zzbyhVar;
        this.b = z;
        Objects.requireNonNull(wVar);
        this.c = wVar;
    }

    public final void zza(Throwable th) {
        try {
            zzbyh zzbyhVar = this.a;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbyhVar.zzf(sb.toString());
        } catch (RemoteException e) {
            int i = V5.o0.b;
            W5.p.d("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            w wVar = this.c;
            wVar.c2(list);
            this.a.zze(list);
            if (!wVar.t1() && !this.b) {
                return;
            }
            for (Uri uri : list) {
                if (wVar.S1(uri)) {
                    wVar.r1().zzb(w.F1(uri, wVar.C1(), "1").toString(), null, null, null);
                } else {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zziu)).booleanValue()) {
                        wVar.r1().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i = V5.o0.b;
            W5.p.d("", e);
        }
    }
}
