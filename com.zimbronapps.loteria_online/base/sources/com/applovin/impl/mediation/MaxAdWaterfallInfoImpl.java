package com.applovin.impl.mediation;

import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final y2 a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final a3 f;
    private final List g;
    private final String h;
    private final String i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j, List list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.i;
    }

    public long getLatencyMillis() {
        return this.e;
    }

    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.h;
    }

    public String getName() {
        return this.b;
    }

    public List getNetworkResponses() {
        return this.d;
    }

    public List getPostbackUrls() {
        return this.g;
    }

    public a3 getRequestParameters() {
        return this.f;
    }

    public String getTestName() {
        return this.c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }

    public MaxAdWaterfallInfoImpl(y2 y2Var, String str, String str2, long j, List list, a3 a3Var, List list2, String str3, String str4) {
        this.a = y2Var;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.d = list;
        this.f = a3Var;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }
}
