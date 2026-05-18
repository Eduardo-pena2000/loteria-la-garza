package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbut implements Y5.e {
    final /* synthetic */ zzbtz zza;
    final /* synthetic */ zzbuu zzb;

    public zzbut(zzbuu zzbuuVar, zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
        Objects.requireNonNull(zzbuuVar);
        this.zzb = zzbuuVar;
    }

    public final void onFailure(L5.b bVar) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int a = bVar.a();
            String c = bVar.c();
            String b = bVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(a).length() + 17 + String.valueOf(c).length() + 16 + String.valueOf(b).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(a);
            sb.append(". ErrorMessage = ");
            sb.append(c);
            sb.append(". ErrorDomain = ");
            sb.append(b);
            W5.p.a(sb.toString());
            zzbtz zzbtzVar = this.zza;
            zzbtzVar.zzx(bVar.d());
            zzbtzVar.zzw(bVar.a(), bVar.c());
            zzbtzVar.zzg(bVar.a());
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzU((Y5.h) obj);
            this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        return new zzbuk(this.zza);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            W5.p.a(sb.toString());
            zzbtz zzbtzVar = this.zza;
            zzbtzVar.zzw(0, str);
            zzbtzVar.zzg(0);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }
}
