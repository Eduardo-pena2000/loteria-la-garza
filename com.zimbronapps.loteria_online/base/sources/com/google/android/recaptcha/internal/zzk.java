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
final class zzk extends l implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, e eVar) {
        super(2, eVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    public final e create(Object obj, e eVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, eVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object a;
        zzen zzenVar;
        Object b;
        Object f = Ha.c.f();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            t.b(obj);
            a = obj;
        } else {
            t.b(obj);
            O o = (O) this.zzf;
            zzl.zze(this.zzb, this.zzc);
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(i.b(o, (Ga.i) null, (Q) null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, (Object) null));
            }
            W[] wArr = (W[]) arrayList.toArray(new W[0]);
            W[] wArr2 = (W[]) Arrays.copyOf(wArr, wArr.length);
            this.zzf = zzf;
            this.zza = 1;
            a = f.a(wArr2, this);
            if (a == f) {
                return f;
            }
            zzenVar = zzf;
        }
        List list = (List) a;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!s.g(((s) it2.next()).j())) {
                    zzenVar.zza();
                    b = s.b(I.a);
                    break;
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            s.a aVar = s.b;
            b = s.b(t.a(zzbdVar));
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            s.a aVar2 = s.b;
            b = s.b(t.a(zzbdVar2));
        }
        return s.a(b);
    }
}
