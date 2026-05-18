package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpo {
    private final Context zza;
    private final P5.b zzb;
    private zzbpk zzc;

    public zzbpo(Context context, P5.b bVar) {
        com.google.android.gms.common.internal.t.l(context);
        com.google.android.gms.common.internal.t.l(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbhe.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzls)).booleanValue()) {
            return false;
        }
        com.google.android.gms.common.internal.t.l(str);
        if (str.length() > ((Integer) S5.D.c().zzd(zzbhe.zzlu)).intValue()) {
            W5.p.a("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = S5.B.b().k(this.zza, new zzbtp(), this.zzb);
    }

    public final boolean zza(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbpk zzbpkVar = this.zzc;
        if (zzbpkVar == null) {
            return false;
        }
        try {
            zzbpkVar.zze(str);
            return true;
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
            return true;
        }
    }

    public final void zzb() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzls)).booleanValue()) {
            zzd();
            zzbpk zzbpkVar = this.zzc;
            if (zzbpkVar != null) {
                try {
                    zzbpkVar.zzf();
                } catch (RemoteException e) {
                    W5.p.i("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
