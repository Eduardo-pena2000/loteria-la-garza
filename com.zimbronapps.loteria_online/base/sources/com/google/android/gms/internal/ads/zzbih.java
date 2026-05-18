package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbih extends e6.b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbij zzb;

    public zzbih(zzbij zzbijVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbijVar);
        this.zzb = zzbijVar;
    }

    public final void onFailure(String str) {
        int i = o0.b;
        W5.p.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbij zzbijVar = this.zzb;
            zzbijVar.zzi().h(zzbijVar.zze(this.zza, str).toString(), (Bundle) null);
        } catch (JSONException e) {
            W5.p.d("Error creating PACT Error Response JSON: ", e);
        }
    }

    public final void onSuccess(e6.a aVar) {
        String b = aVar.b();
        try {
            zzbij zzbijVar = this.zzb;
            zzbijVar.zzi().h(zzbijVar.zzf(this.zza, b).toString(), (Bundle) null);
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
