package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzqf {
    private static final zzqf zzd = new zzqf(true);
    final zzsi zza = new zzsd();
    boolean zzb;
    boolean zzc;

    private zzqf() {
    }

    public static int zza(zzsz zzszVar, int i, Object obj) {
        int zzC = zzpv.zzC(i << 3);
        if (zzszVar == zzsz.zzj) {
            zzC += zzC;
        }
        return zzC + zzb(zzszVar, obj);
    }

    public static int zzb(zzsz zzszVar, Object obj) {
        int zzd2;
        int zzC;
        zzsz zzszVar2 = zzsz.zza;
        zzta zztaVar = zzta.zza;
        switch (zzszVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = zzpv.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = zzpv.zzf;
                return 4;
            case 2:
                return zzpv.zzD(((Long) obj).longValue());
            case 3:
                return zzpv.zzD(((Long) obj).longValue());
            case 4:
                return zzpv.zzD(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = zzpv.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = zzpv.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = zzpv.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzpm)) {
                    return zzpv.zzB((String) obj);
                }
                int i6 = zzpv.zzf;
                zzd2 = ((zzpm) obj).zzd();
                zzC = zzpv.zzC(zzd2);
                break;
            case 9:
                return ((zzrq) obj).zzn();
            case 10:
                if (!(obj instanceof zzqz)) {
                    return zzpv.zzA((zzrq) obj);
                }
                zzd2 = ((zzqz) obj).zza();
                zzC = zzpv.zzC(zzd2);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    int i7 = zzpv.zzf;
                    zzd2 = ((byte[]) obj).length;
                    zzC = zzpv.zzC(zzd2);
                    break;
                } else {
                    int i8 = zzpv.zzf;
                    zzd2 = ((zzpm) obj).zzd();
                    zzC = zzpv.zzC(zzd2);
                    break;
                }
            case 12:
                return zzpv.zzC(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzqo ? zzpv.zzD(((zzqo) obj).zza()) : zzpv.zzD(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i9 = zzpv.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i10 = zzpv.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzC + zzd2;
    }

    public static int zzc(zzqe zzqeVar, Object obj) {
        zzsz zzb = zzqeVar.zzb();
        int zza = zzqeVar.zza();
        if (!zzqeVar.zze()) {
            return zza(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzqeVar.zzd()) {
            int i2 = 0;
            while (i < size) {
                i2 += zza(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzb(zzb, list.get(i));
            i++;
        }
        return zzpv.zzC(zza << 3) + i3 + zzpv.zzC(i3);
    }

    public static zzqf zze() {
        return zzd;
    }

    public static void zzi(zzpv zzpvVar, zzsz zzszVar, int i, Object obj) throws IOException {
        if (zzszVar == zzsz.zzj) {
            zzpvVar.zzu(i, 3);
            ((zzrq) obj).zzB(zzpvVar);
            zzpvVar.zzu(i, 4);
            return;
        }
        zzpvVar.zzu(i, zzszVar.zza());
        zzta zztaVar = zzta.zza;
        switch (zzszVar.ordinal()) {
            case 0:
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzpvVar.zzy(((Long) obj).longValue());
                break;
            case 3:
                zzpvVar.zzy(((Long) obj).longValue());
                break;
            case 4:
                zzpvVar.zzo(((Integer) obj).intValue());
                break;
            case 5:
                zzpvVar.zzm(((Long) obj).longValue());
                break;
            case 6:
                zzpvVar.zzk(((Integer) obj).intValue());
                break;
            case 7:
                zzpvVar.zzJ(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzpm)) {
                    zzpvVar.zzt((String) obj);
                    break;
                } else {
                    zzpvVar.zzi((zzpm) obj);
                    break;
                }
            case 9:
                ((zzrq) obj).zzB(zzpvVar);
                break;
            case 10:
                zzpvVar.zzp((zzrq) obj);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.zzL(bArr, 0, bArr.length);
                    break;
                } else {
                    zzpvVar.zzi((zzpm) obj);
                    break;
                }
            case 12:
                zzpvVar.zzw(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzqo)) {
                    zzpvVar.zzo(((Integer) obj).intValue());
                    break;
                } else {
                    zzpvVar.zzo(((zzqo) obj).zza());
                    break;
                }
            case 14:
                zzpvVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzpvVar.zzm(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzpvVar.zzw((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzpvVar.zzy((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzqe zzqeVar = (zzqe) entry.getKey();
        if (zzqeVar.zzc() != zzta.zzi) {
            return true;
        }
        if (!zzqeVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzrr) {
            return ((zzrr) obj).zzo();
        }
        if (obj instanceof zzqz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzC;
        int zzC2;
        zzqe zzqeVar = (zzqe) entry.getKey();
        Object value = entry.getValue();
        if (zzqeVar.zzc() != zzta.zzi || zzqeVar.zze() || zzqeVar.zzd()) {
            return zzc(zzqeVar, value);
        }
        if (value instanceof zzqz) {
            int zza = ((zzqe) entry.getKey()).zza();
            int zzC3 = zzpv.zzC(8);
            i = zzC3 + zzC3;
            zzC = zzpv.zzC(16) + zzpv.zzC(zza);
            int zzC4 = zzpv.zzC(24);
            int zza2 = ((zzqz) value).zza();
            zzC2 = zzC4 + zzpv.zzC(zza2) + zza2;
        } else {
            int zza3 = ((zzqe) entry.getKey()).zza();
            int zzC5 = zzpv.zzC(8);
            i = zzC5 + zzC5;
            zzC = zzpv.zzC(16) + zzpv.zzC(zza3);
            zzC2 = zzpv.zzC(24) + zzpv.zzA((zzrq) value);
        }
        return i + zzC + zzC2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzn(com.google.android.gms.internal.consent_sdk.zzqe r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.consent_sdk.zzsz r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.consent_sdk.zzqs.zzb
            r3.getClass()
            com.google.android.gms.internal.consent_sdk.zzsz r1 = com.google.android.gms.internal.consent_sdk.zzsz.zza
            com.google.android.gms.internal.consent_sdk.zzta r1 = com.google.android.gms.internal.consent_sdk.zzta.zza
            com.google.android.gms.internal.consent_sdk.zzta r0 = r0.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.consent_sdk.zzrq
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.consent_sdk.zzqz
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.consent_sdk.zzqo
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.consent_sdk.zzpm
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.consent_sdk.zzsz r2 = r2.zzb()
            com.google.android.gms.internal.consent_sdk.zzta r2 = r2.zzb()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzqf.zzn(com.google.android.gms.internal.consent_sdk.zzqe, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzqf zzqfVar = new zzqf();
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = zzsiVar.zzg(i);
            zzqfVar.zzh((zzqe) ((zzse) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzsiVar.zzd()) {
            zzqfVar.zzh((zzqe) entry.getKey(), entry.getValue());
        }
        zzqfVar.zzc = this.zzc;
        return zzqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqf) {
            return this.zza.equals(((zzqf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzsiVar.zzg(i2));
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    public final Iterator zzf() {
        zzsi zzsiVar = this.zza;
        return zzsiVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzqx(zzsiVar.entrySet().iterator()) : zzsiVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzsiVar.zzg(i).getValue();
            if (value instanceof zzqm) {
                ((zzqm) value).zzx();
            }
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzqm) {
                ((zzqm) value2).zzx();
            }
        }
        zzsiVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzqe zzqeVar, Object obj) {
        if (!zzqeVar.zze()) {
            zzn(zzqeVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzqeVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzqz) {
            this.zzc = true;
        }
        this.zza.zzf(zzqeVar, obj);
    }

    public final boolean zzj() {
        zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzsiVar.zzg(i))) {
                return false;
            }
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzqf(boolean z) {
        zzg();
        zzg();
    }
}
