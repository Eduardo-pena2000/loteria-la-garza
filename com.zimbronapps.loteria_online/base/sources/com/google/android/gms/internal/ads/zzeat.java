package com.google.android.gms.internal.ads;

import S5.c1;
import S5.u2;
import V5.o0;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeat implements zzdbi, zzdel, zzdcx {
    private final zzebf zza;
    private final String zzb;
    private final String zzc;
    private zzday zzf;
    private c1 zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzeas zze = zzeas.AD_REQUESTED;

    public zzeat(zzebf zzebfVar, zzfjk zzfjkVar, String str) {
        this.zza = zzebfVar;
        this.zzc = str;
        this.zzb = zzfjkVar.zzg;
    }

    private final JSONObject zzh(zzday zzdayVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdayVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzdayVar.zzc());
        jSONObject.put("responseId", zzdayVar.zzf());
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkH)).booleanValue()) {
            String zzd = zzdayVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                String valueOf = String.valueOf(zzd);
                int i = o0.b;
                W5.p.a("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        JSONObject jSONObject2 = this.zzk;
        if (jSONObject2 != null) {
            jSONObject.put("adResponseHeaders", jSONObject2);
        }
        JSONObject jSONObject3 = this.zzl;
        if (jSONObject3 != null) {
            jSONObject.put("transactionExtras", jSONObject3);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkK)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (u2 u2Var : zzdayVar.zzg()) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("adapterClassName", u2Var.a);
            jSONObject4.put("latencyMillis", u2Var.b);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkI)).booleanValue()) {
                jSONObject4.put("credentials", S5.B.a().v(u2Var.d));
            }
            c1 c1Var = u2Var.c;
            jSONObject4.put("error", c1Var == null ? null : zzi(c1Var));
            jSONArray.put(jSONObject4);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzi(c1 c1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c1Var.c);
        jSONObject.put("errorCode", c1Var.a);
        jSONObject.put("errorDescription", c1Var.b);
        c1 c1Var2 = c1Var.d;
        jSONObject.put("underlyingError", c1Var2 == null ? null : zzi(c1Var2));
        return jSONObject;
    }

    public final void zza(zzcwf zzcwfVar) {
        zzebf zzebfVar = this.zza;
        if (zzebfVar.zzs()) {
            this.zzf = zzcwfVar.zzn();
            this.zze = zzeas.AD_LOADED;
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue()) {
                zzebfVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != zzeas.AD_REQUESTED;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zzdI(c1 c1Var) {
        zzebf zzebfVar = this.zza;
        if (zzebfVar.zzs()) {
            this.zze = zzeas.AD_LOAD_FAILED;
            this.zzg = c1Var;
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue()) {
                zzebfVar.zzk(this.zzb, this);
            }
        }
    }

    public final void zzdO(zzbzu zzbzuVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue()) {
            return;
        }
        zzebf zzebfVar = this.zza;
        if (zzebfVar.zzs()) {
            zzebfVar.zzk(this.zzb, this);
        }
    }

    public final void zzdP(zzfjc zzfjcVar) {
        zzebf zzebfVar = this.zza;
        if (zzebfVar.zzs()) {
            zzfjb zzfjbVar = zzfjcVar.zzb;
            List list = zzfjbVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzfir) list.get(0)).zzb;
            }
            zzfiu zzfiuVar = zzfjbVar.zzb;
            String str = zzfiuVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfiuVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfiuVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkK)).booleanValue()) {
                if (!zzebfVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzfiuVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzfiuVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzebfVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final JSONObject zzg() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfir.zza(this.zzd));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzday zzdayVar = this.zzf;
        if (zzdayVar != null) {
            jSONObject = zzh(zzdayVar);
        } else {
            c1 c1Var = this.zzg;
            JSONObject jSONObject3 = null;
            if (c1Var != null && (iBinder = c1Var.e) != null) {
                zzday zzdayVar2 = (zzday) iBinder;
                jSONObject3 = zzh(zzdayVar2);
                if (zzdayVar2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }
}
