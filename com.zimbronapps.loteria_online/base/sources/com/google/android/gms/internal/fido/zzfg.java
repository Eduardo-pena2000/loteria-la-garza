package com.google.android.gms.internal.fido;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfg extends AbstractMap {
    private static final Comparator zza = new zzfd();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzff(this, -1);
    private Integer zze = null;
    private String zzf = null;

    public zzfg(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            zzfc.zza((zzfc) it.next());
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            zzfc.zza((zzfc) it2.next());
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        this.zzb = objArr;
        this.zzc = iArr;
    }

    public static /* bridge */ /* synthetic */ Comparator zza() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ int[] zzb(zzfg zzfgVar) {
        return zzfgVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Object[] zzc(zzfg zzfgVar) {
        return zzfgVar.zzb;
    }

    public final Set entrySet() {
        return this.zzd;
    }

    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }
}
