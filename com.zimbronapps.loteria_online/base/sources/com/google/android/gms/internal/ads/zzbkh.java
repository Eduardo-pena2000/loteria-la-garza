package com.google.android.gms.internal.ads;

import S5.e2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkh extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbki();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final e2 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbkh(int i, boolean z, int i2, boolean z2, int i3, e2 e2Var, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = e2Var;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.b zza(com.google.android.gms.internal.ads.zzbkh r5) {
        /*
            com.google.android.gms.ads.nativead.b$a r0 = new com.google.android.gms.ads.nativead.b$a
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.b r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.e(r1)
            int r1 = r5.zzh
            r0.d(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.b(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.q(r2)
        L39:
            S5.e2 r1 = r5.zzf
            if (r1 == 0) goto L45
            L5.C r2 = new L5.C
            r2.<init>(r1)
            r0.h(r2)
        L45:
            int r1 = r5.zze
            r0.c(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.g(r1)
            boolean r5 = r5.zzd
            r0.f(r5)
            com.google.android.gms.ads.nativead.b r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkh.zza(com.google.android.gms.internal.ads.zzbkh):com.google.android.gms.ads.nativead.b");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.g(parcel, 2, this.zzb);
        y6.c.t(parcel, 3, this.zzc);
        y6.c.g(parcel, 4, this.zzd);
        y6.c.t(parcel, 5, this.zze);
        y6.c.C(parcel, 6, this.zzf, i, false);
        y6.c.g(parcel, 7, this.zzg);
        y6.c.t(parcel, 8, this.zzh);
        y6.c.t(parcel, 9, this.zzi);
        y6.c.g(parcel, 10, this.zzj);
        y6.c.t(parcel, 11, this.zzk);
        y6.c.b(parcel, a);
    }

    @Deprecated
    public zzbkh(O5.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new e2(eVar.d()) : null, eVar.g(), eVar.c(), 0, false, 0);
    }
}
