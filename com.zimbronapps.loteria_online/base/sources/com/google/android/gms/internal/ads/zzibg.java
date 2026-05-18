package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzibg {
    private static final zzibg zzd = new zzibg(true);
    final zzieb zza = new zzidx();
    boolean zzb;
    boolean zzc;

    private zzibg() {
    }

    public static zzibg zza() {
        return zzd;
    }

    public static void zzf(zziaw zziawVar, zzies zziesVar, int i, Object obj) throws IOException {
        if (zziesVar == zzies.zzj) {
            zziawVar.zzH(i, 3);
            ((zzidc) obj).zzcX(zziawVar);
            zziawVar.zzH(i, 4);
            return;
        }
        zziawVar.zzH(i, zziesVar.zzb());
        zziet zzietVar = zziet.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zziawVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zziawVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zziawVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzian)) {
                    zziawVar.zzx((String) obj);
                    break;
                } else {
                    zziawVar.zzl((zzian) obj);
                    break;
                }
            case 9:
                ((zzidc) obj).zzcX(zziawVar);
                break;
            case 10:
                zziawVar.zzp((zzidc) obj);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    byte[] bArr = (byte[]) obj;
                    zziawVar.zzm(bArr, 0, bArr.length);
                    break;
                } else {
                    zziawVar.zzl((zzian) obj);
                    break;
                }
            case 12:
                zziawVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzibv)) {
                    zziawVar.zzr(((Integer) obj).intValue());
                    break;
                } else {
                    zziawVar.zzr(((zzibv) obj).zza());
                    break;
                }
            case 14:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zziawVar.zzs((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zziawVar.zzu((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static int zzh(zzies zziesVar, int i, Object obj) {
        int zzA = zziaw.zzA(i << 3);
        if (zziesVar == zzies.zzj) {
            zzA += zzA;
        }
        return zzA + zzi(zziesVar, obj);
    }

    public static int zzi(zzies zziesVar, Object obj) {
        int zzc;
        int zzA;
        zzies zziesVar2 = zzies.zza;
        zziet zzietVar = zziet.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = zziaw.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = zziaw.zzf;
                return 4;
            case 2:
                return zziaw.zzB(((Long) obj).longValue());
            case 3:
                return zziaw.zzB(((Long) obj).longValue());
            case 4:
                return zziaw.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = zziaw.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = zziaw.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = zziaw.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzian)) {
                    int i6 = zziaw.zzf;
                    zzc = zzier.zzc((String) obj);
                    zzA = zziaw.zzA(zzc);
                    break;
                } else {
                    int i7 = zziaw.zzf;
                    zzc = ((zzian) obj).zzc();
                    zzA = zziaw.zzA(zzc);
                    break;
                }
            case 9:
                return ((zzidc) obj).zzbr();
            case 10:
                if (!(obj instanceof zzicl)) {
                    return zziaw.zzC((zzidc) obj);
                }
                zzc = ((zzicl) obj).zzb();
                zzA = zziaw.zzA(zzc);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    int i8 = zziaw.zzf;
                    zzc = ((byte[]) obj).length;
                    zzA = zziaw.zzA(zzc);
                    break;
                } else {
                    int i9 = zziaw.zzf;
                    zzc = ((zzian) obj).zzc();
                    zzA = zziaw.zzA(zzc);
                    break;
                }
            case 12:
                return zziaw.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzibv ? zziaw.zzB(((zzibv) obj).zza()) : zziaw.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i10 = zziaw.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i11 = zziaw.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zziaw.zzA((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zziaw.zzB((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzA + zzc;
    }

    public static int zzj(zzibf zzibfVar, Object obj) {
        zzies zzb = zzibfVar.zzb();
        int zza = zzibfVar.zza();
        if (!zzibfVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzibfVar.zze()) {
            int i2 = 0;
            while (i < size) {
                i2 += zzh(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzi(zzb, list.get(i));
            i++;
        }
        return zziaw.zzA(zza << 3) + i3 + zziaw.zzA(i3);
    }

    private static boolean zzk(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        if (zzibfVar.zzc() != zziet.zzi) {
            return true;
        }
        if (!zzibfVar.zzd()) {
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
        if (obj instanceof zzidd) {
            return ((zzidd) obj).zzbi();
        }
        if (obj instanceof zzicl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzA;
        int zzA2;
        zzibf zzibfVar = (zzibf) entry.getKey();
        Object value = entry.getValue();
        if (zzibfVar.zzc() != zziet.zzi || zzibfVar.zzd() || zzibfVar.zze()) {
            return zzj(zzibfVar, value);
        }
        if (value instanceof zzicl) {
            int zza = ((zzibf) entry.getKey()).zza();
            int zzA3 = zziaw.zzA(8);
            i = zzA3 + zzA3;
            zzA = zziaw.zzA(16) + zziaw.zzA(zza);
            int zzA4 = zziaw.zzA(24);
            int zzb = ((zzicl) value).zzb();
            zzA2 = zzA4 + zziaw.zzA(zzb) + zzb;
        } else {
            int zza2 = ((zzibf) entry.getKey()).zza();
            int zzA5 = zziaw.zzA(8);
            i = zzA5 + zzA5;
            zzA = zziaw.zzA(16) + zziaw.zzA(zza2);
            zzA2 = zziaw.zzA(24) + zziaw.zzC((zzidc) value);
        }
        return i + zzA + zzA2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzibf r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzies r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzice.zzb
            r3.getClass()
            com.google.android.gms.internal.ads.zzies r1 = com.google.android.gms.internal.ads.zzies.zza
            com.google.android.gms.internal.ads.zziet r1 = com.google.android.gms.internal.ads.zziet.zza
            com.google.android.gms.internal.ads.zziet r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzidc
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzicl
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzibv
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzian
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
            com.google.android.gms.internal.ads.zzies r2 = r2.zzb()
            com.google.android.gms.internal.ads.zziet r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzibg.zzn(com.google.android.gms.internal.ads.zzibf, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzibg zzibgVar = new zzibg();
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzd2 = zziebVar.zzd(i);
            zzibgVar.zzd((zzibf) ((zzidy) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zziebVar.zze()) {
            zzibgVar.zzd((zzibf) entry.getKey(), entry.getValue());
        }
        zzibgVar.zzc = this.zzc;
        return zzibgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzibg) {
            return this.zza.equals(((zzibg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zziebVar.zzd(i).getValue();
            if (value instanceof zzibr) {
                ((zzibr) value).zzbm();
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzibr) {
                ((zzibr) value2).zzbm();
            }
        }
        zziebVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzieb zziebVar = this.zza;
        return zziebVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzick(zziebVar.entrySet().iterator()) : zziebVar.entrySet().iterator();
    }

    public final void zzd(zzibf zzibfVar, Object obj) {
        if (!zzibfVar.zzd()) {
            zzn(zzibfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzibfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzicl) {
            this.zzc = true;
        }
        this.zza.zzf(zzibfVar, obj);
    }

    public final boolean zze() {
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zziebVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zziebVar.zzd(i2));
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    private zzibg(boolean z) {
        zzb();
        zzb();
    }
}
