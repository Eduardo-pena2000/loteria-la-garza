package com.google.android.gms.internal.ads;

import V5.F0;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzckh extends FrameLayout implements zzcjl {
    private final zzcjl zza;
    private final zzcft zzb;
    private final AtomicBoolean zzc;

    public zzckh(zzcjl zzcjlVar, zzdxz zzdxzVar) {
        super(zzcjlVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcjlVar;
        this.zzb = new zzcft(zzcjlVar.zzK(), this, this, zzdxzVar);
        addView((View) zzcjlVar);
    }

    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    public final void destroy() {
        zzejz zzV;
        zzekb zzU = zzU();
        if (zzU != null) {
            zzfyn zzfynVar = F0.l;
            zzfynVar.post(new zzckg(zzU));
            zzcjl zzcjlVar = this.zza;
            Objects.requireNonNull(zzcjlVar);
            zzfynVar.postDelayed(new zzckd(zzcjlVar), ((Integer) S5.D.c().zzd(zzbhe.zzgk)).intValue());
            return;
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() || (zzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            F0.l.post(new zzcke(this, zzV));
        }
    }

    public final void goBack() {
        this.zza.goBack();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    public final void onAdClicked() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onAdClicked();
        }
    }

    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    public final void onResume() {
        this.zza.onResume();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    public final void zzA(int i) {
    }

    public final void zzB(int i) {
    }

    public final zzfir zzC() {
        return this.zza.zzC();
    }

    public final WebView zzD() {
        return this.zza;
    }

    public final View zzE() {
        return this;
    }

    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            zzcjl childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final void zzG() {
        this.zza.zzG();
    }

    public final void zzH(int i) {
        this.zza.zzH(i);
    }

    public final void zzI() {
        this.zza.zzI();
    }

    public final void zzJ() {
        this.zza.zzJ();
    }

    public final Context zzK() {
        return this.zza.zzK();
    }

    public final U5.z zzL() {
        return this.zza.zzL();
    }

    public final U5.z zzM() {
        return this.zza.zzM();
    }

    public final zzclv zzN() {
        return this.zza.zzN();
    }

    public final String zzO() {
        return this.zza.zzO();
    }

    public final zzclj zzP() {
        return ((zzcko) this.zza).zzaS();
    }

    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    public final boolean zzR() {
        return this.zza.zzR();
    }

    public final zzazh zzS() {
        return this.zza.zzS();
    }

    public final zzfjo zzT() {
        return this.zza.zzT();
    }

    public final zzekb zzU() {
        return this.zza.zzU();
    }

    public final zzejz zzV() {
        return this.zza.zzV();
    }

    public final boolean zzW() {
        return this.zza.zzW();
    }

    public final boolean zzX() {
        return this.zza.zzX();
    }

    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    public final void zza(String str) {
        ((zzcko) this.zza).zzaP(str);
    }

    public final boolean zzaA(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzbs)).booleanValue()) {
            return false;
        }
        View view = this.zza;
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        view.zzaA(z, i);
        return true;
    }

    public final boolean zzaB() {
        return this.zzc.get();
    }

    public final zzfiu zzaC() {
        return this.zza.zzaC();
    }

    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zza.zzaD(zzfirVar, zzfiuVar);
    }

    public final void zzaE(boolean z) {
        this.zza.zzaE(z);
    }

    public final x7.e zzaF() {
        return this.zza.zzaF();
    }

    public final void zzaG(boolean z) {
        this.zza.zzaG(true);
    }

    public final void zzaH(U5.m mVar, boolean z, boolean z2, String str) {
        this.zza.zzaH(mVar, z, z2, str);
    }

    public final void zzaI(boolean z, int i, boolean z2) {
        this.zza.zzaI(z, i, z2);
    }

    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaJ(z, i, str, z2, z3);
    }

    public final void zzaK(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaK(z, i, str, str2, z2);
    }

    public final void zzaL(String str, String str2, int i) {
        this.zza.zzaL(str, str2, 14);
    }

    public final /* synthetic */ void zzaM(boolean z) {
        zzcjl zzcjlVar = this.zza;
        zzfyn zzfynVar = F0.l;
        Objects.requireNonNull(zzcjlVar);
        zzfynVar.post(new zzckc(zzcjlVar));
    }

    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    public final void zzab(String str, zzboh zzbohVar) {
        this.zza.zzab(str, zzbohVar);
    }

    public final void zzac(String str, zzboh zzbohVar) {
        this.zza.zzac(str, zzbohVar);
    }

    public final void zzad(String str, E6.r rVar) {
        this.zza.zzad(str, rVar);
    }

    public final void zzae(U5.z zVar) {
        this.zza.zzae(zVar);
    }

    public final void zzaf(zzclv zzclvVar) {
        this.zza.zzaf(zzclvVar);
    }

    public final void zzag(boolean z) {
        this.zza.zzag(z);
    }

    public final void zzah() {
        this.zza.zzah();
    }

    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    public final void zzaj(boolean z) {
        this.zza.zzaj(z);
    }

    public final void zzak(zzekb zzekbVar) {
        this.zza.zzak(zzekbVar);
    }

    public final void zzal(zzejz zzejzVar) {
        this.zza.zzal(zzejzVar);
    }

    public final void zzam(int i) {
        this.zza.zzam(i);
    }

    public final void zzan(U5.z zVar) {
        this.zza.zzan(zVar);
    }

    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    public final void zzap() {
        this.zza.zzap();
    }

    public final void zzaq(zzbkf zzbkfVar) {
        this.zza.zzaq(zzbkfVar);
    }

    public final zzbkf zzar() {
        return this.zza.zzar();
    }

    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    public final void zzau(String str, String str2, String str3) {
        this.zza.zzau(str, str2, null);
    }

    public final void zzav() {
        zzekb zzU;
        zzejz zzV;
        View textView = new TextView(getContext());
        R5.t.g();
        textView.setText(F0.d());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && (zzV = zzV()) != null) {
            zzV.zzf(textView);
        } else if (((Boolean) S5.D.c().zzd(zzbhe.zzgl)).booleanValue() && (zzU = zzU()) != null && zzU.zzb()) {
            R5.t.y().zzg(zzU.zza(), textView);
        }
    }

    public final void zzaw(boolean z) {
        this.zza.zzaw(z);
    }

    public final void zzax(zzbkc zzbkcVar) {
        this.zza.zzax(zzbkcVar);
    }

    public final void zzay(zzber zzberVar) {
        this.zza.zzay(zzberVar);
    }

    public final zzber zzaz() {
        return this.zza.zzaz();
    }

    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcko) this.zza).zzc(str, jSONObject.toString());
    }

    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    public final void zzdQ() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzdQ();
        }
    }

    public final void zzdj(zzbdd zzbddVar) {
        this.zza.zzdj(zzbddVar);
    }

    public final void zzdk() {
        this.zza.zzdk();
    }

    public final void zzdl() {
        this.zza.zzdl();
    }

    public final zzcft zzdm() {
        return this.zzb;
    }

    public final void zzdn(boolean z) {
        this.zza.zzdn(false);
    }

    public final void zzdu() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzdu();
        }
    }

    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    public final zzckr zzh() {
        return this.zza.zzh();
    }

    public final zzbhq zzi() {
        return this.zza.zzi();
    }

    public final Activity zzj() {
        return this.zza.zzj();
    }

    public final R5.a zzk() {
        return this.zza.zzk();
    }

    public final void zzl() {
        this.zza.zzl();
    }

    public final String zzm() {
        return this.zza.zzm();
    }

    public final String zzn() {
        return this.zza.zzn();
    }

    public final void zzo(int i) {
        this.zza.zzo(i);
    }

    public final int zzp() {
        return this.zza.zzp();
    }

    public final zzbhr zzq() {
        return this.zza.zzq();
    }

    public final zzchr zzr(String str) {
        return this.zza.zzr(str);
    }

    public final W5.a zzs() {
        return this.zza.zzs();
    }

    public final void zzt(String str, zzchr zzchrVar) {
        this.zza.zzt(str, zzchrVar);
    }

    public final void zzu(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    public final void zzv(int i) {
        this.zzb.zzg(i);
    }

    public final void zzw(zzckr zzckrVar) {
        this.zza.zzw(zzckrVar);
    }

    public final int zzx() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzeK)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    public final int zzy() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzeK)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    public final void zzz() {
        this.zza.zzz();
    }
}
