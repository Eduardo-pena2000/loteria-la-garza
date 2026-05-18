package com.google.android.gms.internal.ads;

import S5.H0;
import S5.L0;
import V5.V;
import V5.o0;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdnb implements zzdop {
    private H0 zzC;
    private final zzddu zzD;
    private final zzdpi zzE;
    private final R5.b zzF;
    private final zzczz zzG;
    private final Context zza;
    private final zzdor zzb;
    private final JSONObject zzc;
    private final zzdtk zzd;
    private final zzdoh zze;
    private final zzazh zzf;
    private final zzdbx zzg;
    private final zzdbd zzh;
    private final zzdjk zzi;
    private final zzfir zzj;
    private final W5.a zzk;
    private final zzfjk zzl;
    private final zzcss zzm;
    private final zzdpm zzn;
    private final E6.f zzo;
    private final zzdjg zzp;
    private final zzfqk zzq;
    private final zzdva zzr;
    private final zzfoo zzs;
    private final zzejf zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdnb(Context context, zzdor zzdorVar, JSONObject jSONObject, zzdtk zzdtkVar, zzdoh zzdohVar, zzazh zzazhVar, zzdbx zzdbxVar, zzdbd zzdbdVar, zzdjk zzdjkVar, zzfir zzfirVar, W5.a aVar, zzfjk zzfjkVar, zzcss zzcssVar, zzdpm zzdpmVar, E6.f fVar, zzdjg zzdjgVar, zzfqk zzfqkVar, zzfoo zzfooVar, zzejf zzejfVar, zzdva zzdvaVar, zzdpi zzdpiVar, zzddu zzdduVar, R5.b bVar, zzcce zzcceVar, zzczz zzczzVar) {
        this.zza = context;
        this.zzb = zzdorVar;
        this.zzc = jSONObject;
        this.zzd = zzdtkVar;
        this.zze = zzdohVar;
        this.zzf = zzazhVar;
        this.zzg = zzdbxVar;
        this.zzh = zzdbdVar;
        this.zzi = zzdjkVar;
        this.zzj = zzfirVar;
        this.zzk = aVar;
        this.zzl = zzfjkVar;
        this.zzm = zzcssVar;
        this.zzn = zzdpmVar;
        this.zzo = fVar;
        this.zzp = zzdjgVar;
        this.zzq = zzfqkVar;
        this.zzs = zzfooVar;
        this.zzt = zzejfVar;
        this.zzr = zzdvaVar;
        this.zzE = zzdpiVar;
        this.zzD = zzdduVar;
        this.zzF = bVar;
        this.zzG = zzczzVar;
    }

    private final boolean zzG(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzx = this.zze.zzx();
        if (zzx == 1) {
            return "1099";
        }
        if (zzx == 2) {
            return "2099";
        }
        if (zzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        R5.b bVar;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzpf)).booleanValue() || (bVar = this.zzF) == null) {
            return;
        }
        bVar.a();
    }

    private final boolean zzK(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        zzczz zzczzVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzes)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", V.j(this.zza));
            if (((Boolean) S5.D.c().zzd(zzbhe.zzph)).booleanValue() && (zzczzVar = this.zzG) != null && zzczzVar.zza() > 0) {
                jSONObject6.put("placement_id", zzczzVar.zza());
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzjU)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdmy(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdmx(this, null));
            }
            zzdtk zzdtkVar = this.zzd;
            zzdtkVar.zzd("/nativeImpression", new zzdmz(this, view, null));
            zzdtkVar.zzd("/nativeImpressionFlowControl", new zzdna(this, this.zzq, this.zzj.zzax, this.zzs, null));
            zzcel.zza(zzdtkVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            this.zzu = R5.t.s().g(this.zza, this.zzk.a, this.zzj.zzC.toString(), this.zzl.zzg);
            return true;
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final String zzL(View view) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzes)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i = o0.b;
            W5.p.c("Exception getting data.");
            return null;
        }
    }

    public final void zzA() {
        this.zzd.zzb();
    }

    public final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    public final /* synthetic */ zzdbx zzC() {
        return this.zzg;
    }

    public final /* synthetic */ zzdbd zzD() {
        return this.zzh;
    }

    public final /* synthetic */ zzdjk zzE() {
        return this.zzi;
    }

    public final /* synthetic */ zzddu zzF() {
        return this.zzD;
    }

    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean a = V.a(this.zzk.c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (a) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (a) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzb(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject e = V.e(context, map, map2, view2, scaleType);
        JSONObject b = V.b(context, view2);
        JSONObject c = V.c(view2);
        JSONObject d = V.d(context, view2);
        String zzH = zzH(view, map);
        zzi(true == ((Boolean) S5.D.c().zzd(zzbhe.zzez)).booleanValue() ? view2 : view, b, e, c, d, zzH, V.f(zzH, context, this.zzz, this.zzy), null, z, false);
    }

    public final void zzd(String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            int i = o0.b;
            W5.p.a("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, S5.B.a().u(bundle, null), false, false);
        } else {
            int i2 = o0.b;
            W5.p.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z2 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmX)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                int i2 = o0.b;
                W5.p.a("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i3 = o0.b;
                W5.p.a("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject e = V.e(context, map, map2, view2, scaleType);
        JSONObject b = V.b(context, view2);
        JSONObject c = V.c(view2);
        JSONObject d = V.d(context, view2);
        String zzH = zzH(view, map);
        JSONObject f = V.f(zzH, context, this.zzz, this.zzy);
        if (z2) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e2) {
                        e = e2;
                        int i4 = o0.b;
                        W5.p.d("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzi(view2, b, e, c, d, zzH, f, null, z, true);
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e4) {
                int i5 = o0.b;
                W5.p.d("Error occurred while adding CustomClickGestureSignals to adJson.", e4);
                R5.t.l().zzg(e4, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, b, e, c, d, zzH, f, null, z, true);
    }

    public final void zzg() {
        this.zzx = true;
    }

    public final boolean zzh() {
        return zzI();
    }

    public final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdor zzdorVar = this.zzb;
            zzdoh zzdohVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdorVar.zzg(zzdohVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdohVar.zzx());
            jSONObject9.put("view_aware_api_used", z);
            zzbkh zzbkhVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbkhVar != null && zzbkhVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdohVar.zzE().isEmpty() || zzdohVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.a());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdorVar.zzg(zzdohVar.zzS()) != null);
            try {
                JSONObject optJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzb().zzg(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i = o0.b;
                W5.p.d("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzjY)).booleanValue() && E6.q.j()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzjZ)).booleanValue() && E6.q.j()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long a = this.zzo.a();
            jSONObject10.put("time_from_last_touch_down", a - this.zzA);
            jSONObject10.put("time_from_last_touch", a - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            zzcel.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            int i2 = o0.b;
            W5.p.d("Unable to create click JSON.", e2);
        }
    }

    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        this.zzy = V.h(motionEvent, view2);
        long a = this.zzo.a();
        this.zzB = a;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = a;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzc(obtain);
        obtain.recycle();
        zzJ();
    }

    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            int i = o0.b;
            W5.p.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i2 = o0.b;
                W5.p.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject e = V.e(context, map, map2, view, scaleType);
        JSONObject b = V.b(context, view);
        JSONObject c = V.c(view);
        JSONObject d = V.d(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", e);
            jSONObject.put("ad_view_signal", b);
            jSONObject.put("scroll_view_signal", c);
            jSONObject.put("lock_screen_signal", d);
            return jSONObject;
        } catch (JSONException e2) {
            int i = o0.b;
            W5.p.d("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zzl != null) {
                jSONObject.put("nas", zzl);
            }
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    public final void zzn() {
        zzK(null, null, null, null, null, null, false, null);
    }

    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = o0.b;
            W5.p.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdpm zzdpmVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdpmVar);
        view.setClickable(true);
        zzdpmVar.zzc = new WeakReference(view);
    }

    public final void zzp(zzbmj zzbmjVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbmjVar);
        } else {
            int i = o0.b;
            W5.p.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    public final void zzr(L0 l0) {
        try {
            if (this.zzw) {
                return;
            }
            if (l0 == null) {
                zzdoh zzdohVar = this.zze;
                if (zzdohVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdohVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(l0.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zzs(H0 h0) {
        this.zzC = h0;
    }

    public final void zzt() {
        try {
            H0 h0 = this.zzC;
            if (h0 != null) {
                h0.zze();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final int zzu() {
        zzbkh zzbkhVar = this.zzl.zzj;
        if (zzbkhVar == null) {
            return 0;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmX)).booleanValue()) {
            return zzbkhVar.zzi;
        }
        return 0;
    }

    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmX)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzK(V.b(context, view), V.e(context, map, map2, view, scaleType), V.c(view), V.d(context, view), zzL(view), null, V.i(context, this.zzj), view);
    }

    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject e = V.e(context, map, map2, view, scaleType);
        JSONObject b = V.b(context, view);
        JSONObject c = V.c(view);
        JSONObject d = V.d(context, view);
        boolean i = V.i(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", e);
            jSONObject.put("ad_view_signal", b);
            jSONObject.put("scroll_view_signal", c);
            jSONObject.put("lock_screen_signal", d);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzes)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", i);
            jSONObject.put("screen", V.j(context));
            zzcel.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e2) {
            int i2 = o0.b;
            W5.p.d("Unable to create native ad signals logging JSON.", e2);
        }
    }

    public final void zzy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcel.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("", e);
        }
    }

    public final boolean zzz(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((Boolean) S5.D.c().zzd(zzbhe.zzmT)).booleanValue() ? zzL(null) : null, S5.B.a().u(bundle, null), false, null);
        }
        int i = o0.b;
        W5.p.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }
}
