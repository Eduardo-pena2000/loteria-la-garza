package com.google.android.gms.internal.firebase-auth-api;

import E6.i;
import E6.v;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzahv extends a implements zzaez {
    public static final Parcelable.Creator CREATOR = new zzahu();
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahv() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahv zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = v.a(jSONObject.optString("refresh_token"));
            this.zzc = v.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = v.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 2, this.zzb, false);
        c.E(parcel, 3, this.zzc, false);
        c.z(parcel, 4, Long.valueOf(zza()), false);
        c.E(parcel, 5, this.zze, false);
        Long l = this.zzf;
        l.longValue();
        c.z(parcel, 6, l, false);
        c.b(parcel, a);
    }

    public final long zza() {
        Long l = this.zzd;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaao(e);
        }
    }

    public final boolean zzg() {
        return i.c().a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public static zzahv zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahv zzahvVar = new zzahv();
            zzahvVar.zzb = jSONObject.optString("refresh_token", (String) null);
            zzahvVar.zzc = jSONObject.optString("access_token", (String) null);
            zzahvVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahvVar.zze = jSONObject.optString("token_type", (String) null);
            zzahvVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahvVar;
        } catch (JSONException e) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaao(e);
        }
    }

    public final void zzc(String str) {
        this.zzb = t.f(str);
    }

    public zzahv(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzahv(String str, String str2, Long l, String str3, Long l2) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l;
        this.zze = str3;
        this.zzf = l2;
    }

    public final String zzd() {
        return this.zzb;
    }
}
