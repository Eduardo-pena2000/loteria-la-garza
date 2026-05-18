package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzcjl extends S5.a, zzdjm, zzcjc, zzbrd, zzcks, zzckx, zzbrp, zzbde, zzclb, R5.n, zzcle, zzclf, zzcge, zzclg {
    boolean canGoBack();

    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    zzfir zzC();

    WebView zzD();

    View zzE();

    List zzF();

    void zzG();

    void zzH(int i);

    void zzI();

    void zzJ();

    Context zzK();

    U5.z zzL();

    U5.z zzM();

    zzclv zzN();

    String zzO();

    zzclj zzP();

    WebViewClient zzQ();

    boolean zzR();

    zzazh zzS();

    zzfjo zzT();

    zzekb zzU();

    zzejz zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    zzfiu zzaC();

    void zzaD(zzfir zzfirVar, zzfiu zzfiuVar);

    void zzaE(boolean z);

    x7.e zzaF();

    void zzaG(boolean z);

    boolean zzaa();

    void zzab(String str, zzboh zzbohVar);

    void zzac(String str, zzboh zzbohVar);

    void zzad(String str, E6.r rVar);

    void zzae(U5.z zVar);

    void zzaf(zzclv zzclvVar);

    void zzag(boolean z);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z);

    void zzak(zzekb zzekbVar);

    void zzal(zzejz zzejzVar);

    void zzam(int i);

    void zzan(U5.z zVar);

    void zzao(boolean z);

    void zzap();

    void zzaq(zzbkf zzbkfVar);

    zzbkf zzar();

    void zzas(boolean z);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z);

    void zzax(zzbkc zzbkcVar);

    void zzay(zzber zzberVar);

    zzber zzaz();

    /* synthetic */ void zzdk();

    /* synthetic */ void zzdl();

    zzckr zzh();

    Activity zzj();

    R5.a zzk();

    zzbhr zzq();

    W5.a zzs();

    void zzt(String str, zzchr zzchrVar);

    void zzw(zzckr zzckrVar);
}
