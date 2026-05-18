package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import b6.b0;
import b6.k0;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbij {
    private final ScheduledExecutorService zza;
    private final k0 zzb;
    private final b0 zzc;
    private final zzdye zzd;
    private Runnable zze;
    private zzbig zzf;
    private v.f zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbij(ScheduledExecutorService scheduledExecutorService, k0 k0Var, b0 b0Var, zzdye zzdyeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = k0Var;
        this.zzc = b0Var;
        this.zzd = zzdyeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) S5.D.c().zzd(com.google.android.gms.internal.ads.zzbhe.zzlo)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbig r0 = r5.zzf
            if (r0 != 0) goto Lc
            int r0 = V5.o0.b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            W5.p.c(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r5.zzh
            if (r0 == 0) goto L70
            v.f r0 = r5.zzg
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L70
            long r1 = r5.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3b
        L2c:
            E6.f r1 = R5.t.o()
            long r1 = r1.b()
            long r3 = r5.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzlo
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L70
        L4d:
            v.f r1 = r5.zzg
            java.lang.String r2 = r5.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.i(r2)
            java.lang.Runnable r1 = r5.zze
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzlp
            com.google.android.gms.internal.ads.zzbhc r3 = S5.D.c()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            V5.o0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbij.zzh():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) S5.D.c().zzd(zzbhe.zzlr));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final void zza(Context context, v.c cVar, String str, v.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdye zzdyeVar = this.zzd;
        zzbig zzbigVar = new zzbig(this, bVar, zzdyeVar);
        this.zzf = zzbigVar;
        v.f e = cVar.e(zzbigVar);
        this.zzg = e;
        if (e == null) {
            int i = o0.b;
            W5.p.c("CustomTabsClient failed to create new session.");
        }
        b6.c.e(zzdyeVar, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final v.f zzb() {
        return this.zzg;
    }

    public final void zzc() {
        this.zzi = R5.t.o().b() + ((Integer) S5.D.c().zzd(zzbhe.zzln)).intValue();
        if (this.zze == null) {
            this.zze = new zzbii(this);
        }
        zzh();
    }

    public final void zzd(String str) {
        try {
            v.f fVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.b());
            }
            fVar.h(jSONObject.toString(), (Bundle) null);
            zzbih zzbihVar = new zzbih(this, str);
            if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
                this.zzb.b(this.zzg, zzbihVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            e6.a.a(this.zzl, L5.c.b, ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).o(), zzbihVar);
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Error creating JSON: ", e);
        }
    }

    public final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbjj.zze.zze()).booleanValue() ? ((Long) zzbjj.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.b());
        }
        return jSONObject;
    }

    public final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbjj.zze.zze()).booleanValue() ? ((Long) zzbjj.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.b());
        }
        return jSONObject;
    }

    public final void zzg(long j) {
        this.zzj = j;
    }

    public final /* synthetic */ v.f zzi() {
        return this.zzg;
    }
}
