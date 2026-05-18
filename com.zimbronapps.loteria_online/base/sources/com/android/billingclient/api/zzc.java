package com.android.billingclient.api;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzc {
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ zzc(JSONObject jSONObject, zzd zzdVar) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.a.equals(zzcVar.a) && this.b.equals(zzcVar.b) && Objects.equals(this.c, zzcVar.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", new Object[]{this.a, this.b, this.c});
    }
}
