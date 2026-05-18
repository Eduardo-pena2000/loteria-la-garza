package com.google.android.recaptcha.internal;

import Ca.o;
import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Ga.e;
import Wa.n;
import android.content.Context;
import cb.O;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import v6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public /* synthetic */ zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i, k kVar) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zza = zzekVar.zza();
        O zzc = zzbiVar.zzc();
        List q = v.q(new zzy[]{zzabVar, zzpVar, zzmVar, zznVar, new zzae(zza, context, zzc, new zzan(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(h.f()))});
        this.zza = zzekVar;
        this.zzb = q;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ zzsi zzm(zzv zzvVar, String str) {
        return zzvVar.zzq(str);
    }

    public static final /* synthetic */ List zzn(zzv zzvVar) {
        return zzvVar.zzb;
    }

    public static final /* synthetic */ void zzp(zzv zzvVar, zzle zzleVar) {
        zzvVar.zzc = zzleVar;
    }

    private final zzsi zzq(String str) {
        LinkedHashMap h;
        List<zzaa> list = (List) this.zzd.remove(str);
        if (list != null) {
            h = new LinkedHashMap(n.e(Q.e(w.y(list, 10)), 16));
            for (zzaa zzaaVar : list) {
                h.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            h = S.h();
        }
        zzsz zzs = zzs(h, str);
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        zzsf zzf2 = zzsg.zzf();
        byte[] zzd = zzs.zzd();
        zzf2.zze(zzkh.zzh().zzi(zzd, 0, zzd.length));
        zzf.zzf(zzf2);
        return (zzsi) zzf.zzi();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzf = zzsx.zzf();
        zzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] zzd = zza.zzd();
            zzf.zzf(zzcf.zza(zzkh.zzh().zzi(zzd, 0, zzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new o();
            }
            zzte zza2 = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] zzd2 = zza2.zzd();
            zzf.zze(zzcf.zza(zzkh.zzh().zzi(zzd2, 0, zzd2.length), zzleVar));
        }
        return (zzsx) zzf.zzi();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzf = zzsz.zzf();
        zzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int zza = zzyVar.zza();
                zztd zzf2 = zzte.zzf();
                zzf2.zzf(zza);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzr(new zzw(zza, (zzte) zzf2.zzi())));
            }
        }
        Iterable values = map.values();
        ArrayList arrayList2 = new ArrayList(w.y(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzsz) zzf.zzi();
    }

    public final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    public final Object zzd(String str, e eVar) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(java.lang.String r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r6)
            com.google.android.recaptcha.internal.zzs r6 = new com.google.android.recaptcha.internal.zzs
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.zzc = r3
            java.lang.Object r6 = cb.P.e(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            Ca.s r6 = (Ca.s) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzf(java.lang.String, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzt
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzt r0 = (com.google.android.recaptcha.internal.zzt) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzt r0 = new com.google.android.recaptcha.internal.zzt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = cb.P.e(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            Ca.s r6 = (Ca.s) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzh(com.google.android.recaptcha.internal.zzsc, Ga.e):java.lang.Object");
    }

    public final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
