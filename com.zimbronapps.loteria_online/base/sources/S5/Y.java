package S5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcdd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y {
    public final j2 a;
    public final h2 b;
    public final J1 c;
    public final zzbmo d;
    public final zzbxp e;
    public final zzbmp f;
    public zzbyr g;
    public final k2 h;

    public y(j2 j2Var, h2 h2Var, J1 j1, zzbmo zzbmoVar, zzcbl zzcblVar, zzbxp zzbxpVar, zzbmp zzbmpVar, k2 k2Var) {
        this.a = j2Var;
        this.b = h2Var;
        this.c = j1;
        this.d = zzbmoVar;
        this.e = zzbxpVar;
        this.f = zzbmpVar;
        this.h = k2Var;
    }

    public static /* synthetic */ void l(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        B.a().q(context, B.g().a, "gmob-apps", bundle, true);
    }

    public final Y a(Context context, q2 q2Var, String str, zzbtt zzbttVar) {
        return (Y) new n(this, context, q2Var, str, zzbttVar).d(context, false);
    }

    public final Y b(Context context, q2 q2Var, String str, zzbtt zzbttVar) {
        return (Y) new p(this, context, q2Var, str, zzbttVar).d(context, false);
    }

    public final U c(Context context, String str, zzbtt zzbttVar) {
        return (U) new r(this, context, str, zzbttVar).d(context, false);
    }

    public final l0 d(Context context, zzbtt zzbttVar) {
        return (l0) new t(this, context, zzbttVar).d(context, false);
    }

    public final zzbkw e(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbkw) new x(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final zzcaz f(Context context, String str, zzbtt zzbttVar) {
        return (zzcaz) new b(this, context, str, zzbttVar).d(context, false);
    }

    public final zzbxs g(Activity activity) {
        d dVar = new d(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            W5.p.c("useClientJar flag not found in activity intent extras.");
        }
        return (zzbxs) dVar.d(activity, z);
    }

    public final Y0 h(Context context, zzbtt zzbttVar) {
        return (Y0) new f(this, context, zzbttVar).d(context, false);
    }

    public final zzcdd i(Context context, zzbtt zzbttVar) {
        return (zzcdd) new h(this, context, zzbttVar).d(context, false);
    }

    public final zzbxl j(Context context, zzbtt zzbttVar) {
        return (zzbxl) new j(this, context, zzbttVar).d(context, false);
    }

    public final zzbpk k(Context context, zzbtt zzbttVar, P5.b bVar) {
        return (zzbpk) new l(this, context, zzbttVar, bVar).d(context, false);
    }

    public final /* synthetic */ j2 m() {
        return this.a;
    }

    public final /* synthetic */ h2 n() {
        return this.b;
    }

    public final /* synthetic */ J1 o() {
        return this.c;
    }

    public final /* synthetic */ zzbmo p() {
        return this.d;
    }

    public final /* synthetic */ zzbxp q() {
        return this.e;
    }

    public final /* synthetic */ zzbyr r() {
        return this.g;
    }

    public final /* synthetic */ void s(zzbyr zzbyrVar) {
        this.g = zzbyrVar;
    }

    public final /* synthetic */ k2 t() {
        return this.h;
    }
}
