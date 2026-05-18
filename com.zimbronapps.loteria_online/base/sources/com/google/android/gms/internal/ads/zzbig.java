package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbig extends v.b {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzlq)).split(","));
    private final zzbij zzc;
    private final v.b zzd;
    private final zzdye zze;

    public zzbig(zzbij zzbijVar, v.b bVar, zzdye zzdyeVar) {
        this.zzd = bVar;
        this.zzc = zzbijVar;
        this.zze = zzdyeVar;
    }

    private final void zzb(String str) {
        b6.c.e(this.zze, null, "pact_action", new Pair("pe", str));
    }

    public final void extraCallback(String str, Bundle bundle) {
        v.b bVar = this.zzd;
        if (bVar != null) {
            bVar.extraCallback(str, bundle);
        }
    }

    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        v.b bVar = this.zzd;
        if (bVar != null) {
            return bVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    public final void onActivityResized(int i, int i2, Bundle bundle) {
        v.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onActivityResized(i, i2, bundle);
        }
    }

    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        v.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onMessageChannelReady(bundle);
        }
    }

    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.set(false);
        v.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onNavigationEvent(i, bundle);
        }
        zzbij zzbijVar = this.zzc;
        zzbijVar.zzg(R5.t.o().a());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        zzbijVar.zzc();
        zzb("pact_reqpmc");
    }

    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            o0.l("Message is not in JSON format: ", e);
        }
        v.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onPostMessage(str, bundle);
        }
    }

    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        v.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
