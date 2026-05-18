package com.google.android.gms.internal.ads;

import O5.e;
import S5.A1;
import S5.e2;
import android.location.Location;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbuz implements Y5.A {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbkh zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbuz(Date date, int i, Set set, Location location, boolean z, int i2, zzbkh zzbkhVar, List list, boolean z2, int i3, String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbkhVar;
        this.zzi = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        String str3 = split[2];
                        if ("true".equals(str3)) {
                            this.zzj.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(str3)) {
                            this.zzj.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return A1.f().k();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    public final Set getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    public final O5.e getNativeAdOptions() {
        Parcelable.Creator creator = zzbkh.CREATOR;
        e.a aVar = new e.a();
        zzbkh zzbkhVar = this.zzg;
        if (zzbkhVar == null) {
            return aVar.a();
        }
        int i = zzbkhVar.zza;
        if (i == 2) {
            aVar.b(zzbkhVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    aVar.e(zzbkhVar.zzg);
                    aVar.d(zzbkhVar.zzh);
                }
            }
            e2 e2Var = zzbkhVar.zzf;
            if (e2Var != null) {
                aVar.h(new L5.C(e2Var));
            }
            aVar.b(zzbkhVar.zze);
        }
        aVar.g(zzbkhVar.zzb);
        aVar.c(zzbkhVar.zzc);
        aVar.f(zzbkhVar.zzd);
        return aVar.a();
    }

    public final com.google.android.gms.ads.nativead.b getNativeAdRequestOptions() {
        return zzbkh.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return A1.f().m();
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public final boolean zza() {
        return this.zzh.contains("3");
    }

    public final Map zzb() {
        return this.zzj;
    }
}
