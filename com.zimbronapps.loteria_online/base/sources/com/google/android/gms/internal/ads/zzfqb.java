package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfqb {
    private final W5.y zza;
    private final W5.v zzb;
    private final zzgzz zzc;
    private final zzfqc zzd;
    private final zzclx zze;

    public zzfqb(W5.y yVar, W5.v vVar, zzgzz zzgzzVar, zzfqc zzfqcVar, zzclx zzclxVar) {
        this.zza = yVar;
        this.zzb = vVar;
        this.zzc = zzgzzVar;
        this.zzd = zzfqcVar;
        this.zze = zzclxVar;
    }

    private final x7.e zze(String str, long j, int i) {
        String str2;
        W5.y yVar = this.zza;
        if (i > yVar.a()) {
            zzfqc zzfqcVar = this.zzd;
            if (zzfqcVar == null || !yVar.d()) {
                return zzgzo.zza(W5.u.c);
            }
            zzfqcVar.zza(str, "", 2);
            return zzgzo.zza(W5.u.d);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjS)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(valueOf);
            sb.append("&");
            sb.append(encodedQuery);
            str2 = sb.toString();
        } else {
            str2 = str;
        }
        zzfqa zzfqaVar = new zzfqa(this, i, j, str);
        if (j == 0) {
            zzgzz zzgzzVar = this.zzc;
            return zzgzo.zzj(zzgzzVar.submit(new zzfpz(this, str2)), zzfqaVar, zzgzzVar);
        }
        zzgzz zzgzzVar2 = this.zzc;
        return zzgzo.zzj(zzgzzVar2.schedule(new zzfpy(this, str2), j, TimeUnit.MILLISECONDS), zzfqaVar, zzgzzVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final W5.u zzd(String str) {
        zzclx zzclxVar;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzkk)).booleanValue() || (zzclxVar = this.zze) == null || (!R5.t.g().V(str) && !R5.t.g().W(str))) {
            return this.zzb.b(str, null);
        }
        String zzb = zzclxVar.zzb();
        Map hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) S5.D.c().zzd(zzbhe.zzkl), zzb);
        }
        return this.zzb.b(str, hashMap);
    }

    public final x7.e zza(String str) {
        if (str != null) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (RejectedExecutionException | NullPointerException unused) {
                    return zzgzo.zza(W5.u.b);
                }
            }
        }
        return zzgzo.zza(W5.u.b);
    }

    public final /* synthetic */ x7.e zzb(int i, long j, String str, W5.u uVar) {
        if (uVar != W5.u.c) {
            return zzgzo.zza(uVar);
        }
        W5.y yVar = this.zza;
        long b = yVar.b();
        if (i != 1) {
            b = (long) (yVar.c() * j);
        }
        return zze(str, b, i + 1);
    }
}
