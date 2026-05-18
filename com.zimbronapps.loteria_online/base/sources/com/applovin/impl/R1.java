package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class r1 extends e2 {
    private JSONObject i;

    public r1(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.ERROR);
    }

    public static /* synthetic */ void e(r1 r1Var, String str, String str2, Throwable th) {
        r1Var.a(str, str2, th);
    }

    public void a(String str, Throwable th) {
        a(str, th, (Map) new HashMap());
    }

    public void b() {
        this.i = JsonUtils.deserialize((String) this.a.a(x4.K));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, (Map) new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void b(String str, String str2, Throwable th) {
        this.a.q0().a((i5) new r6(this.a, "reportCaughtException", new I4(this, str, str2, th)), d6.b.OTHER);
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("source", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), hashMap);
            arrayList.add(hashMap);
        }
        a(d2.N0, (List) arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("error_message", str2);
        if (bVar != null) {
            hashMap.putAll(f2.a((AppLovinAdImpl) bVar));
            hashMap.putAll(f2.a(bVar));
            boolean C0 = bVar.C0();
            hashMap.put("is_video_stream", String.valueOf(C0));
            if (C0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).i1(), hashMap);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.I(), hashMap);
            }
        }
        d(d2.T0, (Map) hashMap);
    }

    public void a(String str, String str2, int i, String str3) {
        List a = a(str2);
        boolean z = a != null;
        if (z && a.contains(Integer.valueOf(i))) {
            return;
        }
        if (z || i >= 400) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("source", str);
            hashMap.put("url", StringUtils.emptyIfNull(str2));
            hashMap.put("code", String.valueOf(i));
            hashMap.put("error_message", f2.a(str3));
            d(d2.W0, (Map) hashMap);
        }
    }

    private List a(String str) {
        List integerList = JsonUtils.getIntegerList(this.i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.i, "default", null) : integerList;
    }
}
