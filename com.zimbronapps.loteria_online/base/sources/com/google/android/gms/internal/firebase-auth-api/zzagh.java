package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzagh extends zzael {
    private final String zza;
    private final /* synthetic */ zzagc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagh(zzagc zzagcVar, zzael zzaelVar, String str) {
        super(zzaelVar);
        Objects.requireNonNull(zzagcVar);
        this.zzb = zzagcVar;
        this.zza = str;
    }

    public final void zza(Status status) {
        int i = 0;
        zzagc.zza().c("SMS verification code request failed: " + d.a(status.O1()) + " " + status.P1(), new Object[0]);
        zzagj zzagjVar = (zzagj) zzagc.zza(this.zzb).get(this.zza);
        if (zzagjVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(zzagjVar.zzb);
        this.zzb.zzb(this.zza);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzael) obj).zza(status);
        }
    }

    public final void zzb(String str) {
        zzagc.zza().a("onCodeSent", new Object[0]);
        zzagj zzagjVar = (zzagj) zzagc.zza(this.zzb).get(this.zza);
        if (zzagjVar == null) {
            return;
        }
        Iterator it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzael) it.next()).zzb(str);
        }
        zzagjVar.zzg = true;
        zzagjVar.zzd = str;
        if (zzagjVar.zza <= 0) {
            zzagc.zzd(this.zzb, this.zza);
        } else if (!zzagjVar.zzc) {
            zzagc.zzc(this.zzb, this.zza);
        } else {
            if (zzac.zzc(zzagjVar.zze)) {
                return;
            }
            zzagc.zzb(this.zzb, this.zza);
        }
    }
}
