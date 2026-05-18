package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v2 {
    private final StringBuilder a = new StringBuilder();

    public v2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public v2 b(String str) {
        this.a.append(str);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public v2 a(String str, Object obj, String str2) {
        StringBuilder sb = this.a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public v2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.W()).a("close_style", bVar.p()).a("close_delay_graphic", Long.valueOf(bVar.r()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.g1().substring(0, Math.min(aVar.g1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.d0()), "s").a("skip_style", bVar.U()).a("Streaming", Boolean.valueOf(bVar.C0())).a("Video Location", bVar.I()).a("video_button_properties", bVar.b0());
        }
        return this;
    }

    public v2 a(String str) {
        StringBuilder sb = this.a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public v2 a() {
        this.a.append("\n========================================");
        return this;
    }

    public v2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z = bVar instanceof o7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((o7) bVar).n1());
        }
        return this;
    }

    public v2 a(y2 y2Var) {
        return a("Network", y2Var.c()).a("Adapter Version", y2Var.z()).a("Format", y2Var.getFormat().getLabel()).a("Ad Unit ID", y2Var.getAdUnitId()).a("Placement", y2Var.getPlacement()).a("Network Placement", y2Var.R()).a("Serve ID", y2Var.Q()).a("Creative ID", StringUtils.isValidString(y2Var.getCreativeId()) ? y2Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(y2Var.v()) ? y2Var.v() : "None").a("DSP Name", StringUtils.isValidString(y2Var.getDspName()) ? y2Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(y2Var.getDspId()) ? y2Var.getDspId() : "None").a("Server Parameters", y2Var.l());
    }

    public v2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", e8.a(appLovinAdView.getVisibility()));
    }

    public v2 a(com.applovin.impl.sdk.k kVar) {
        return a("Muted", Boolean.valueOf(kVar.n0().isMuted()));
    }

    public v2 a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }
}
