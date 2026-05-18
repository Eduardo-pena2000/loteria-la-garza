package com.google.android.gms.internal.ads;

import S5.c1;
import S5.u2;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzekl {
    private final String zzc;
    private zzfiu zzd = null;
    private zzfir zze = null;
    private u2 zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzekl(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfir zzfirVar, int i) {
        Map map = this.zzb;
        String zzl = zzl(zzfirVar);
        if (map.containsKey(zzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfirVar.zzv;
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                bundle.putString(str, jSONObject.getString(str));
            } catch (JSONException unused) {
            }
        }
        u2 u2Var = new u2(zzfirVar.zzE, 0L, null, bundle, zzfirVar.zzF, zzfirVar.zzG, zzfirVar.zzH, zzfirVar.zzI);
        try {
            this.zza.add(i, u2Var);
        } catch (IndexOutOfBoundsException e) {
            R5.t.l().zzg(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzl, u2Var);
    }

    private final void zzk(zzfir zzfirVar, long j, c1 c1Var, boolean z) {
        Map map = this.zzb;
        String zzl = zzl(zzfirVar);
        if (map.containsKey(zzl)) {
            if (this.zze == null) {
                this.zze = zzfirVar;
            }
            u2 u2Var = (u2) map.get(zzl);
            u2Var.b = j;
            u2Var.c = c1Var;
            if (((Boolean) S5.D.c().zzd(zzbhe.zzhH)).booleanValue() && z) {
                this.zzf = u2Var;
            }
        }
    }

    private static String zzl(zzfir zzfirVar) {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzev)).booleanValue() ? zzfirVar.zzap : zzfirVar.zzw;
    }

    public final void zza(zzfiu zzfiuVar) {
        this.zzd = zzfiuVar;
    }

    public final void zzb(zzfir zzfirVar) {
        zzj(zzfirVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            u2 u2Var = (u2) map.get(str);
            List list2 = this.zza;
            int indexOf = list2.indexOf(u2Var);
            try {
                list2.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                R5.t.l().zzg(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfir) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzd(zzfir zzfirVar, long j, c1 c1Var) {
        zzk(zzfirVar, j, null, true);
    }

    public final void zze(zzfir zzfirVar, long j, c1 c1Var) {
        zzk(zzfirVar, j, c1Var, false);
    }

    public final zzday zzf() {
        return new zzday(this.zze, "", this, this.zzd, this.zzc);
    }

    public final u2 zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfir zzfirVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfirVar));
        List list = this.zza;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.zzf = (u2) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            u2 u2Var = (u2) list.get(indexOf);
            u2Var.b = 0L;
            u2Var.c = null;
        }
    }
}
