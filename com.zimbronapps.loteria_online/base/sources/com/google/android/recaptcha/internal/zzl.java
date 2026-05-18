package com.google.android.recaptcha.internal;

import Da.A;
import Da.v;
import Ga.e;
import cb.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public zzl() {
        this(null, 1, null);
    }

    public static final /* synthetic */ zzek zza(zzl zzlVar) {
        return zzlVar.zzb;
    }

    public static final /* synthetic */ void zze(zzl zzlVar, zzek zzekVar) {
        zzlVar.zzb = zzekVar;
    }

    private final void zzh(zze... zzeVarArr) {
        A.E(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j, e eVar) {
        return P.e(new zzh(this, str, j, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(long r13, com.google.android.recaptcha.internal.zzsc r15, com.google.android.recaptcha.internal.zzek r16, Ga.e r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            r9 = r12
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r9 = r12
            r1.<init>(r12, r0)
        L1c:
            java.lang.Object r0 = r1.zza
            java.lang.Object r10 = Ha.c.f()
            int r2 = r1.zzc
            r11 = 1
            if (r2 == 0) goto L35
            if (r2 != r11) goto L2d
            Ca.t.b(r0)
            goto L4d
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            Ca.t.b(r0)
            com.google.android.recaptcha.internal.zzk r0 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r2 = r0
            r3 = r12
            r4 = r16
            r5 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r11
            java.lang.Object r0 = cb.P.e(r0, r1)
            if (r0 != r10) goto L4d
            return r10
        L4d:
            Ca.s r0 = (Ca.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, Ga.e):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i, k kVar) {
        List n = v.n();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) n.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
