package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzkb {
    private static final zzkb zzov = new zzkb(true);
    private boolean zzot;
    private boolean zzou = false;
    final zzmi zzos = zzmi.zzav(16);

    private zzkb() {
    }

    private final Object zza(zzkd zzkdVar) {
        Object obj = this.zzos.get(zzkdVar);
        return obj instanceof zzkt ? zzkt.zzdp() : obj;
    }

    private static boolean zzb(Map.Entry entry) {
        zzkd zzkdVar = (zzkd) entry.getKey();
        if (zzkdVar.zzcr() == zznr.zzxx) {
            if (zzkdVar.zzcs()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzlq) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzlq)) {
                    if (value instanceof zzkt) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzlq) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void zzc(Map.Entry entry) {
        zzkd zzkdVar = (zzkd) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzkt) {
            value = zzkt.zzdp();
        }
        if (zzkdVar.zzcs()) {
            Object zza = zza(zzkdVar);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zze(it.next()));
            }
            this.zzos.zza(zzkdVar, zza);
            return;
        }
        if (zzkdVar.zzcr() != zznr.zzxx) {
            this.zzos.zza(zzkdVar, zze(value));
            return;
        }
        Object zza2 = zza(zzkdVar);
        if (zza2 == null) {
            this.zzos.zza(zzkdVar, zze(value));
        } else {
            this.zzos.zza(zzkdVar, zza2 instanceof zzlx ? zzkdVar.zza((zzlx) zza2, (zzlx) value) : zzkdVar.zza(((zzlq) zza2).zzcy(), (zzlq) value).zzdf());
        }
    }

    public static zzkb zzcn() {
        return zzov;
    }

    private static int zzd(Map.Entry entry) {
        zzkd zzkdVar = (zzkd) entry.getKey();
        Object value = entry.getValue();
        return (zzkdVar.zzcr() != zznr.zzxx || zzkdVar.zzcs() || zzkdVar.zzct()) ? zzb(zzkdVar, value) : value instanceof zzkt ? zzjr.zzb(((zzkd) entry.getKey()).zzcp(), (zzkt) value) : zzjr.zzb(((zzkd) entry.getKey()).zzcp(), (zzlq) value);
    }

    private static Object zze(Object obj) {
        if (obj instanceof zzlx) {
            return ((zzlx) obj).zzef();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzkb zzkbVar = new zzkb();
        for (int i = 0; i < this.zzos.zzer(); i++) {
            Map.Entry zzaw = this.zzos.zzaw(i);
            zzkbVar.zza((zzkd) zzaw.getKey(), zzaw.getValue());
        }
        for (Map.Entry entry : this.zzos.zzes()) {
            zzkbVar.zza((zzkd) entry.getKey(), entry.getValue());
        }
        zzkbVar.zzou = this.zzou;
        return zzkbVar;
    }

    public final Iterator descendingIterator() {
        return this.zzou ? new zzkw(this.zzos.zzet().iterator()) : this.zzos.zzet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkb) {
            return this.zzos.equals(((zzkb) obj).zzos);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzos.hashCode();
    }

    public final boolean isImmutable() {
        return this.zzot;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzos.zzer(); i++) {
            if (!zzb(this.zzos.zzaw(i))) {
                return false;
            }
        }
        Iterator it = this.zzos.zzes().iterator();
        while (it.hasNext()) {
            if (!zzb((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        return this.zzou ? new zzkw(this.zzos.entrySet().iterator()) : this.zzos.entrySet().iterator();
    }

    public final void zzbp() {
        if (this.zzot) {
            return;
        }
        this.zzos.zzbp();
        this.zzot = true;
    }

    public final int zzco() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzos.zzer(); i2++) {
            i += zzd(this.zzos.zzaw(i2));
        }
        Iterator it = this.zzos.zzes().iterator();
        while (it.hasNext()) {
            i += zzd((Map.Entry) it.next());
        }
        return i;
    }

    private zzkb(boolean z) {
        zzbp();
    }

    private final void zza(zzkd zzkdVar, Object obj) {
        if (zzkdVar.zzcs()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    zza(zzkdVar.zzcq(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zza(zzkdVar.zzcq(), obj);
        }
        if (obj instanceof zzkt) {
            this.zzou = true;
        }
        this.zzos.zza(zzkdVar, obj);
    }

    private static int zzb(zznm zznmVar, Object obj) {
        switch (zzkc.zzox[zznmVar.ordinal()]) {
            case 1:
                return zzjr.zzb(((Double) obj).doubleValue());
            case 2:
                return zzjr.zzb(((Float) obj).floatValue());
            case 3:
                return zzjr.zzo(((Long) obj).longValue());
            case 4:
                return zzjr.zzp(((Long) obj).longValue());
            case 5:
                return zzjr.zzac(((Integer) obj).intValue());
            case 6:
                return zzjr.zzr(((Long) obj).longValue());
            case 7:
                return zzjr.zzaf(((Integer) obj).intValue());
            case 8:
                return zzjr.zzd(((Boolean) obj).booleanValue());
            case 9:
                return zzjr.zzd((zzlq) obj);
            case 10:
                if (obj instanceof zzkt) {
                    return zzjr.zza((zzkt) obj);
                }
                return zzjr.zzc((zzlq) obj);
            case 11:
                if (obj instanceof zzjc) {
                    return zzjr.zzb((zzjc) obj);
                }
                return zzjr.zzm((String) obj);
            case 12:
                if (obj instanceof zzjc) {
                    return zzjr.zzb((zzjc) obj);
                }
                return zzjr.zzc((byte[]) obj);
            case 13:
                return zzjr.zzad(((Integer) obj).intValue());
            case 14:
                return zzjr.zzag(((Integer) obj).intValue());
            case 15:
                return zzjr.zzs(((Long) obj).longValue());
            case 16:
                return zzjr.zzae(((Integer) obj).intValue());
            case 17:
                return zzjr.zzq(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzkn) {
                    return zzjr.zzah(((zzkn) obj).zzcp());
                }
                return zzjr.zzah(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.drive.zznm r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.drive.zzkc.zzow
            com.google.android.gms.internal.drive.zznr r2 = r2.zzfj()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L45
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzlq
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzkt
            if (r2 == 0) goto L27
            goto L28
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzkn
            if (r2 == 0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            r1 = r0
            goto L45
        L2a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzjc
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L27
            goto L28
        L33:
            boolean r0 = r3 instanceof java.lang.String
            goto L28
        L36:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L28
        L39:
            boolean r0 = r3 instanceof java.lang.Double
            goto L28
        L3c:
            boolean r0 = r3 instanceof java.lang.Float
            goto L28
        L3f:
            boolean r0 = r3 instanceof java.lang.Long
            goto L28
        L42:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L28
        L45:
            if (r1 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzkb.zza(com.google.android.gms.internal.drive.zznm, java.lang.Object):void");
    }

    public final void zza(zzkb zzkbVar) {
        for (int i = 0; i < zzkbVar.zzos.zzer(); i++) {
            zzc(zzkbVar.zzos.zzaw(i));
        }
        Iterator it = zzkbVar.zzos.zzes().iterator();
        while (it.hasNext()) {
            zzc((Map.Entry) it.next());
        }
    }

    public static void zza(zzjr zzjrVar, zznm zznmVar, int i, Object obj) throws IOException {
        if (zznmVar == zznm.zzxd) {
            zzlq zzlqVar = (zzlq) obj;
            zzkm.zzf(zzlqVar);
            zzjrVar.zzb(i, 3);
            zzlqVar.zzb(zzjrVar);
            zzjrVar.zzb(i, 4);
        }
        zzjrVar.zzb(i, zznmVar.zzfk());
        switch (zzkc.zzox[zznmVar.ordinal()]) {
            case 1:
                zzjrVar.zza(((Double) obj).doubleValue());
                break;
            case 2:
                zzjrVar.zza(((Float) obj).floatValue());
                break;
            case 3:
                zzjrVar.zzl(((Long) obj).longValue());
                break;
            case 4:
                zzjrVar.zzl(((Long) obj).longValue());
                break;
            case 5:
                zzjrVar.zzx(((Integer) obj).intValue());
                break;
            case 6:
                zzjrVar.zzn(((Long) obj).longValue());
                break;
            case 7:
                zzjrVar.zzaa(((Integer) obj).intValue());
                break;
            case 8:
                zzjrVar.zzc(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzlq) obj).zzb(zzjrVar);
                break;
            case 10:
                zzjrVar.zzb((zzlq) obj);
                break;
            case 11:
                if (obj instanceof zzjc) {
                    zzjrVar.zza((zzjc) obj);
                    break;
                } else {
                    zzjrVar.zzl((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzjc) {
                    zzjrVar.zza((zzjc) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzjrVar.zzd(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzjrVar.zzy(((Integer) obj).intValue());
                break;
            case 14:
                zzjrVar.zzaa(((Integer) obj).intValue());
                break;
            case 15:
                zzjrVar.zzn(((Long) obj).longValue());
                break;
            case 16:
                zzjrVar.zzz(((Integer) obj).intValue());
                break;
            case 17:
                zzjrVar.zzm(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzkn) {
                    zzjrVar.zzx(((zzkn) obj).zzcp());
                    break;
                } else {
                    zzjrVar.zzx(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public static int zzb(zzkd zzkdVar, Object obj) {
        zznm zzcq = zzkdVar.zzcq();
        int zzcp = zzkdVar.zzcp();
        if (zzkdVar.zzcs()) {
            int i = 0;
            if (zzkdVar.zzct()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i += zzb(zzcq, it.next());
                }
                return zzjr.zzab(zzcp) + i + zzjr.zzaj(i);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i += zza(zzcq, zzcp, it2.next());
            }
            return i;
        }
        return zza(zzcq, zzcp, obj);
    }

    public static int zza(zznm zznmVar, int i, Object obj) {
        int zzab = zzjr.zzab(i);
        if (zznmVar == zznm.zzxd) {
            zzkm.zzf((zzlq) obj);
            zzab <<= 1;
        }
        return zzab + zzb(zznmVar, obj);
    }
}
