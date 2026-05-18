package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhzc extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzhyv();
    zzhzb zza;
    int zzb;
    int zzc;
    final zzhzb zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzhyx zzh;
    private zzhyz zzi;

    public zzhzc() {
        this(zze, true);
    }

    private final void zzf(zzhzb zzhzbVar, zzhzb zzhzbVar2) {
        zzhzb zzhzbVar3 = zzhzbVar.zza;
        zzhzbVar.zza = null;
        if (zzhzbVar2 != null) {
            zzhzbVar2.zza = zzhzbVar3;
        }
        if (zzhzbVar3 == null) {
            this.zza = zzhzbVar2;
        } else if (zzhzbVar3.zzb == zzhzbVar) {
            zzhzbVar3.zzb = zzhzbVar2;
        } else {
            zzhzbVar3.zzc = zzhzbVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzg(com.google.android.gms.internal.ads.zzhzb r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.zzhzb r0 = r9.zzb
            com.google.android.gms.internal.ads.zzhzb r1 = r9.zzc
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.zzi
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.zzi
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.zzhzb r0 = r1.zzb
            com.google.android.gms.internal.ads.zzhzb r3 = r1.zzc
            if (r3 == 0) goto L22
            int r3 = r3.zzi
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.zzi
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.zzi(r1)
            r8.zzh(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.zzh(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.ads.zzhzb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzhzb r3 = r0.zzc
            if (r3 == 0) goto L4e
            int r3 = r3.zzi
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.zzi
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.zzh(r0)
            r8.zzi(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.zzi(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.zzi = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.zzi = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.zzhzb r9 = r9.zza
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzc.zzg(com.google.android.gms.internal.ads.zzhzb, boolean):void");
    }

    private final void zzh(zzhzb zzhzbVar) {
        zzhzb zzhzbVar2 = zzhzbVar.zzb;
        zzhzb zzhzbVar3 = zzhzbVar.zzc;
        zzhzb zzhzbVar4 = zzhzbVar3.zzb;
        zzhzb zzhzbVar5 = zzhzbVar3.zzc;
        zzhzbVar.zzc = zzhzbVar4;
        if (zzhzbVar4 != null) {
            zzhzbVar4.zza = zzhzbVar;
        }
        zzf(zzhzbVar, zzhzbVar3);
        zzhzbVar3.zzb = zzhzbVar;
        zzhzbVar.zza = zzhzbVar3;
        int max = Math.max(zzhzbVar2 != null ? zzhzbVar2.zzi : 0, zzhzbVar4 != null ? zzhzbVar4.zzi : 0) + 1;
        zzhzbVar.zzi = max;
        zzhzbVar3.zzi = Math.max(max, zzhzbVar5 != null ? zzhzbVar5.zzi : 0) + 1;
    }

    private final void zzi(zzhzb zzhzbVar) {
        zzhzb zzhzbVar2 = zzhzbVar.zzb;
        zzhzb zzhzbVar3 = zzhzbVar.zzc;
        zzhzb zzhzbVar4 = zzhzbVar2.zzb;
        zzhzb zzhzbVar5 = zzhzbVar2.zzc;
        zzhzbVar.zzb = zzhzbVar5;
        if (zzhzbVar5 != null) {
            zzhzbVar5.zza = zzhzbVar;
        }
        zzf(zzhzbVar, zzhzbVar2);
        zzhzbVar2.zzc = zzhzbVar;
        zzhzbVar.zza = zzhzbVar2;
        int max = Math.max(zzhzbVar3 != null ? zzhzbVar3.zzi : 0, zzhzbVar5 != null ? zzhzbVar5.zzi : 0) + 1;
        zzhzbVar.zzi = max;
        zzhzbVar2.zzi = Math.max(max, zzhzbVar4 != null ? zzhzbVar4.zzi : 0) + 1;
    }

    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzhzb zzhzbVar = this.zzd;
        zzhzbVar.zze = zzhzbVar;
        zzhzbVar.zzd = zzhzbVar;
    }

    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    public final Set entrySet() {
        zzhyx zzhyxVar = this.zzh;
        if (zzhyxVar != null) {
            return zzhyxVar;
        }
        zzhyx zzhyxVar2 = new zzhyx(this);
        this.zzh = zzhyxVar2;
        return zzhyxVar2;
    }

    public final Object get(Object obj) {
        zzhzb zzb = zzb(obj);
        if (zzb != null) {
            return zzb.zzh;
        }
        return null;
    }

    public final Set keySet() {
        zzhyz zzhyzVar = this.zzi;
        if (zzhyzVar != null) {
            return zzhyzVar;
        }
        zzhyz zzhyzVar2 = new zzhyz(this);
        this.zzi = zzhyzVar2;
        return zzhyzVar2;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzhzb zza = zza(obj, true);
        Object obj3 = zza.zzh;
        zza.zzh = obj2;
        return obj3;
    }

    public final Object remove(Object obj) {
        zzhzb zze2 = zze(obj);
        if (zze2 != null) {
            return zze2.zzh;
        }
        return null;
    }

    public final int size() {
        return this.zzb;
    }

    public final zzhzb zza(Object obj, boolean z) {
        int i;
        zzhzb zzhzbVar;
        Comparator comparator = this.zzf;
        zzhzb zzhzbVar2 = this.zza;
        if (zzhzbVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(zzhzbVar2.zzf) : comparator.compare(obj, zzhzbVar2.zzf);
                if (i == 0) {
                    return zzhzbVar2;
                }
                zzhzb zzhzbVar3 = i < 0 ? zzhzbVar2.zzb : zzhzbVar2.zzc;
                if (zzhzbVar3 == null) {
                    break;
                }
                zzhzbVar2 = zzhzbVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        zzhzb zzhzbVar4 = this.zzd;
        if (zzhzbVar2 != null) {
            zzhzbVar = new zzhzb(this.zzg, zzhzbVar2, obj, zzhzbVar4, zzhzbVar4.zze);
            if (i < 0) {
                zzhzbVar2.zzb = zzhzbVar;
            } else {
                zzhzbVar2.zzc = zzhzbVar;
            }
            zzg(zzhzbVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzhzbVar = new zzhzb(this.zzg, null, obj, zzhzbVar4, zzhzbVar4.zze);
            this.zza = zzhzbVar;
        }
        this.zzb++;
        this.zzc++;
        return zzhzbVar;
    }

    public final zzhzb zzb(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final zzhzb zzc(Map.Entry entry) {
        zzhzb zzb = zzb(entry.getKey());
        if (zzb == null || !Objects.equals(zzb.zzh, entry.getValue())) {
            return null;
        }
        return zzb;
    }

    public final void zzd(zzhzb zzhzbVar, boolean z) {
        zzhzb zzhzbVar2;
        zzhzb zzhzbVar3;
        int i;
        if (z) {
            zzhzb zzhzbVar4 = zzhzbVar.zze;
            zzhzbVar4.zzd = zzhzbVar.zzd;
            zzhzbVar.zzd.zze = zzhzbVar4;
        }
        zzhzb zzhzbVar5 = zzhzbVar.zzb;
        zzhzb zzhzbVar6 = zzhzbVar.zzc;
        zzhzb zzhzbVar7 = zzhzbVar.zza;
        int i2 = 0;
        if (zzhzbVar5 == null || zzhzbVar6 == null) {
            if (zzhzbVar5 != null) {
                zzf(zzhzbVar, zzhzbVar5);
                zzhzbVar.zzb = null;
            } else if (zzhzbVar6 != null) {
                zzf(zzhzbVar, zzhzbVar6);
                zzhzbVar.zzc = null;
            } else {
                zzf(zzhzbVar, null);
            }
            zzg(zzhzbVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzhzbVar5.zzi > zzhzbVar6.zzi) {
            do {
                zzhzbVar3 = zzhzbVar5;
                zzhzbVar5 = zzhzbVar5.zzc;
            } while (zzhzbVar5 != null);
        } else {
            do {
                zzhzbVar2 = zzhzbVar6;
                zzhzbVar6 = zzhzbVar6.zzb;
            } while (zzhzbVar6 != null);
            zzhzbVar3 = zzhzbVar2;
        }
        zzd(zzhzbVar3, false);
        zzhzb zzhzbVar8 = zzhzbVar.zzb;
        if (zzhzbVar8 != null) {
            i = zzhzbVar8.zzi;
            zzhzbVar3.zzb = zzhzbVar8;
            zzhzbVar8.zza = zzhzbVar3;
            zzhzbVar.zzb = null;
        } else {
            i = 0;
        }
        zzhzb zzhzbVar9 = zzhzbVar.zzc;
        if (zzhzbVar9 != null) {
            i2 = zzhzbVar9.zzi;
            zzhzbVar3.zzc = zzhzbVar9;
            zzhzbVar9.zza = zzhzbVar3;
            zzhzbVar.zzc = null;
        }
        zzhzbVar3.zzi = Math.max(i, i2) + 1;
        zzf(zzhzbVar, zzhzbVar3);
    }

    public final zzhzb zze(Object obj) {
        zzhzb zzb = zzb(obj);
        if (zzb != null) {
            zzd(zzb, true);
        }
        return zzb;
    }

    public zzhzc(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzhzb(z);
    }

    public zzhzc(boolean z) {
        this(zze, false);
    }
}
