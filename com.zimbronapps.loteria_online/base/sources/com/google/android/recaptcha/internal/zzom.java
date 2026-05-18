package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    public static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    public final int zza(Object obj) {
        int zzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzna) obj).zzb.zzb() : zzb;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        boolean zzO;
        zzpl zzplVar = this.zzb;
        Object zza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzovVar.zzd();
                int i = 0;
                if (zzd != 11) {
                    if ((zzd & 7) != 2) {
                        zzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, zzd >>> 3) != null) {
                            throw null;
                        }
                        zzO = zzplVar.zzk(zza, zzovVar, 0);
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    zznc zzncVar = null;
                    zzle zzleVar = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzovVar.zzd();
                        if (zzd2 == 16) {
                            i = zzovVar.zzj();
                            zzncVar = zzmoVar.zza(this.zza, i);
                        } else if (zzd2 == 26) {
                            if (zzncVar != null) {
                                throw null;
                            }
                            zzleVar = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVar == null) {
                        continue;
                    } else {
                        if (zzncVar != null) {
                            throw null;
                        }
                        zzplVar.zzg(zza, i, zzleVar);
                    }
                }
            } finally {
                zzplVar.zzj(obj, zza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[EDGE_INSN: B:24:0x0084->B:25:0x0084 BREAK  A[LOOP:1: B:10:0x0049->B:18:0x0049], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.recaptcha.internal.zzkt r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 3
            r1 = r10
            com.google.android.recaptcha.internal.zznd r1 = (com.google.android.recaptcha.internal.zznd) r1
            com.google.android.recaptcha.internal.zzpm r2 = r1.zzc
            com.google.android.recaptcha.internal.zzpm r3 = com.google.android.recaptcha.internal.zzpm.zzc()
            if (r2 != r3) goto L12
            com.google.android.recaptcha.internal.zzpm r2 = com.google.android.recaptcha.internal.zzpm.zzf()
            r1.zzc = r2
        L12:
            com.google.android.recaptcha.internal.zzna r10 = (com.google.android.recaptcha.internal.zzna) r10
            r10.zzi()
            r10 = 0
            r1 = r10
        L19:
            if (r12 >= r13) goto L8d
            int r5 = com.google.android.recaptcha.internal.zzku.zzi(r11, r12, r14)
            int r3 = r14.zza
            r12 = 11
            r4 = 2
            if (r3 == r12) goto L47
            r12 = r3 & 7
            if (r12 != r4) goto L42
            com.google.android.recaptcha.internal.zzmo r12 = r14.zzd
            com.google.android.recaptcha.internal.zzoi r1 = r9.zza
            int r4 = r3 >>> 3
            com.google.android.recaptcha.internal.zznc r1 = r12.zza(r1, r4)
            if (r1 != 0) goto L3f
            r4 = r11
            r6 = r13
            r7 = r2
            r8 = r14
            int r12 = com.google.android.recaptcha.internal.zzku.zzh(r3, r4, r5, r6, r7, r8)
            goto L19
        L3f:
            int r11 = com.google.android.recaptcha.internal.zzos.zza
            throw r10
        L42:
            int r12 = com.google.android.recaptcha.internal.zzku.zzo(r3, r11, r5, r13, r14)
            goto L19
        L47:
            r12 = 0
            r3 = r10
        L49:
            if (r5 >= r13) goto L84
            int r5 = com.google.android.recaptcha.internal.zzku.zzi(r11, r5, r14)
            int r6 = r14.zza
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r4) goto L6a
            if (r7 == r0) goto L5a
            goto L7b
        L5a:
            if (r1 != 0) goto L67
            if (r8 != r4) goto L7b
            int r5 = com.google.android.recaptcha.internal.zzku.zza(r11, r5, r14)
            java.lang.Object r3 = r14.zzc
            com.google.android.recaptcha.internal.zzle r3 = (com.google.android.recaptcha.internal.zzle) r3
            goto L49
        L67:
            int r11 = com.google.android.recaptcha.internal.zzos.zza
            throw r10
        L6a:
            if (r8 != 0) goto L7b
            int r5 = com.google.android.recaptcha.internal.zzku.zzi(r11, r5, r14)
            int r12 = r14.zza
            com.google.android.recaptcha.internal.zzmo r1 = r14.zzd
            com.google.android.recaptcha.internal.zzoi r6 = r9.zza
            com.google.android.recaptcha.internal.zznc r1 = r1.zza(r6, r12)
            goto L49
        L7b:
            r7 = 12
            if (r6 == r7) goto L84
            int r5 = com.google.android.recaptcha.internal.zzku.zzo(r6, r11, r5, r13, r14)
            goto L49
        L84:
            if (r3 == 0) goto L8b
            int r12 = r12 << r0
            r12 = r12 | r4
            r2.zzj(r12, r3)
        L8b:
            r12 = r5
            goto L19
        L8d:
            if (r12 != r13) goto L90
            return
        L90:
            com.google.android.recaptcha.internal.zznn r10 = new com.google.android.recaptcha.internal.zznn
            java.lang.String r11 = "Failed to parse the message."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzom.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzkt):void");
    }

    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Iterator zzf = ((zzna) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.zzi) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
