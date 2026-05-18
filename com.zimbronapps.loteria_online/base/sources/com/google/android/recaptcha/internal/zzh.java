package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import cb.Q;
import cb.W;
import cb.f;
import cb.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzh extends l implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, e eVar) {
        super(2, eVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    public final e create(Object obj, e eVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, eVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object a;
        zzen zzenVar2;
        Object f = Ha.c.f();
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            t.b(obj);
            a = obj;
        } else {
            t.b(obj);
            O o = (O) this.zze;
            zzek zza = zzl.zza(this.zzb);
            if (zza != null) {
                zza.zzc(this.zzc);
                zzenVar = zza.zzf(31);
            } else {
                zzenVar = null;
            }
            zzen zzenVar3 = zzenVar;
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(i.b(o, (Ga.i) null, (Q) null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, (Object) null));
                }
            }
            W[] wArr = (W[]) arrayList.toArray(new W[0]);
            W[] wArr2 = (W[]) Arrays.copyOf(wArr, wArr.length);
            this.zze = zzenVar3;
            this.zza = 1;
            a = f.a(wArr2, this);
            if (a == f) {
                return f;
            }
            zzenVar2 = zzenVar3;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) a).iterator();
        while (it.hasNext()) {
            Object j = ((s) it.next()).j();
            if (s.h(j)) {
                zzf.zzh((zzsi) j);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzi();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
