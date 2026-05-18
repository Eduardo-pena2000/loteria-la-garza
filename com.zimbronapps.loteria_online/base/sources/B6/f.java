package b6;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f implements zzgzl {
    public final /* synthetic */ x7.e a;
    public final /* synthetic */ zzcdh b;
    public final /* synthetic */ zzcda c;
    public final /* synthetic */ zzfoe d;
    public final /* synthetic */ w e;

    public f(w wVar, x7.e eVar, zzcdh zzcdhVar, zzcda zzcdaVar, zzfoe zzfoeVar) {
        this.a = eVar;
        this.b = zzcdhVar;
        this.c = zzcdaVar;
        this.d = zzfoeVar;
        Objects.requireNonNull(wVar);
        this.e = wVar;
    }

    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) S5.D.c().zzd(zzbhe.zziL)).booleanValue()) {
            R5.t.l().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            R5.t.l().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfoo d2 = w.d2(this.a, this.b);
        if (((Boolean) zzbix.zze.zze()).booleanValue() && d2 != null) {
            zzfoe zzfoeVar = this.d;
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            d2.zza(zzfoeVar);
            d2.zzh();
        }
        zzcda zzcdaVar = this.c;
        if (zzcdaVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcdaVar.zzb(message);
        } catch (RemoteException e) {
            int i = V5.o0.b;
            W5.p.d("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        x7.e eVar = this.a;
        AtomicBoolean D1 = this.e.D1();
        M m = (M) obj;
        zzfoo d2 = w.d2(eVar, this.b);
        D1.set(true);
        if (!((Boolean) S5.D.c().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzcda zzcdaVar = this.c;
                if (zzcdaVar != null) {
                    zzcdaVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = V5.o0.b;
                W5.p.c(concat);
            }
            if (!((Boolean) zzbix.zze.zze()).booleanValue() || d2 == null) {
                return;
            }
            zzfoe zzfoeVar = this.d;
            zzfoeVar.zzk("QueryInfo generation has been disabled.");
            zzfoeVar.zzd(false);
            d2.zza(zzfoeVar);
            d2.zzh();
            return;
        }
        try {
            try {
                if (m == null) {
                    zzcda zzcdaVar2 = this.c;
                    if (zzcdaVar2 != null) {
                        zzcdaVar2.zzc(null, null, null);
                    }
                    zzfoe zzfoeVar2 = this.d;
                    zzfoeVar2.zzd(true);
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || d2 == null) {
                        return;
                    }
                    d2.zza(zzfoeVar2);
                    d2.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(m.c) ? new JSONObject(m.c) : new JSONObject(m.b)).optString("request_id", ""))) {
                        int i2 = V5.o0.b;
                        W5.p.f("The request ID is empty in request JSON.");
                        zzcda zzcdaVar3 = this.c;
                        if (zzcdaVar3 != null) {
                            zzcdaVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfoe zzfoeVar3 = this.d;
                        zzfoeVar3.zzk("Request ID empty");
                        zzfoeVar3.zzd(false);
                        if (!((Boolean) zzbix.zze.zze()).booleanValue() || d2 == null) {
                            return;
                        }
                        d2.zza(zzfoeVar3);
                        d2.zzh();
                        return;
                    }
                    Bundle bundle = m.f;
                    w wVar = this.e;
                    if (wVar.v1() && bundle != null && bundle.getInt(wVar.x1(), -1) == -1) {
                        bundle.putInt(wVar.x1(), wVar.y1().get());
                    }
                    if (wVar.u1() && bundle != null && TextUtils.isEmpty(bundle.getString(wVar.w1()))) {
                        if (TextUtils.isEmpty(wVar.A1())) {
                            wVar.B1(R5.t.g().R(wVar.e2(), wVar.z1().a));
                        }
                        bundle.putString(wVar.w1(), wVar.A1());
                    }
                    zzcda zzcdaVar4 = this.c;
                    if (zzcdaVar4 != null) {
                        if (TextUtils.isEmpty(m.c)) {
                            zzcdaVar4.zzc(m.a, m.b, bundle);
                        } else {
                            zzcdaVar4.zzc(m.a, m.c, bundle);
                        }
                    }
                    this.d.zzd(true);
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || d2 == null) {
                        return;
                    }
                    d2.zza(this.d);
                    d2.zzh();
                } catch (JSONException e2) {
                    int i3 = V5.o0.b;
                    W5.p.f("Failed to create JSON object from the request string.");
                    zzcda zzcdaVar5 = this.c;
                    if (zzcdaVar5 != null) {
                        String obj2 = e2.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        zzcdaVar5.zzb(sb.toString());
                    }
                    zzfoe zzfoeVar4 = this.d;
                    zzfoeVar4.zzj(e2);
                    zzfoeVar4.zzd(false);
                    R5.t.l().zzg(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || d2 == null) {
                        return;
                    }
                    d2.zza(zzfoeVar4);
                    d2.zzh();
                }
            } catch (RemoteException e3) {
                zzfoe zzfoeVar5 = this.d;
                zzfoeVar5.zzj(e3);
                zzfoeVar5.zzd(false);
                int i4 = V5.o0.b;
                W5.p.d("", e3);
                R5.t.l().zzg(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbix.zze.zze()).booleanValue() || d2 == null) {
                    return;
                }
                d2.zza(this.d);
                d2.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbix.zze.zze()).booleanValue() && d2 != null) {
                d2.zza(this.d);
                d2.zzh();
            }
            throw th;
        }
    }
}
