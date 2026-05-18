package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.B0;
import cb.O;
import cb.Q;
import cb.f;
import cb.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzs extends l implements p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, e eVar) {
        super(2, eVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    public final e create(Object obj, e eVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, eVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            O o = (O) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List zzn = zzv.zzn(this.zzb);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : zzn) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(i.d(o, (Ga.i) null, (Q) null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3, (Object) null));
            }
            B0[] b0Arr = (B0[]) arrayList2.toArray(new B0[0]);
            B0[] b0Arr2 = (B0[]) Arrays.copyOf(b0Arr, b0Arr.length);
            this.zza = 1;
            if (f.c(b0Arr2, this) == f) {
                return f;
            }
        }
        s.a aVar = s.b;
        return s.a(s.b(zzv.zzm(this.zzb, this.zzc)));
    }
}
