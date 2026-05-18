package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b6 extends i5 {
    private final String g;
    private final List h;
    private final k3 i;
    private final Map j;
    private final Map k;
    private final Map l;
    private final MaxError m;

    public b6(String str, List list, Map map, Map map2, MaxError maxError, k3 k3Var, com.applovin.impl.sdk.k kVar, boolean z) {
        super("TaskFireMediationPostbacks", kVar);
        this.g = str + "_urls";
        this.h = list;
        this.j = n7.a(map, kVar);
        this.k = map2 == null ? new HashMap() : map2;
        this.m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.i = k3Var;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z && k3Var != null) {
            hashMap.put("AppLovin-Ad-Network-Name", k3Var.c());
        }
        if (k3Var instanceof y2) {
            y2 y2Var = (y2) k3Var;
            hashMap.put("AppLovin-Ad-Unit-Id", y2Var.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", y2Var.getFormat().getLabel());
            if (z) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", y2Var.R());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.l = hashMap;
    }

    private void a(String str, Map map) {
        b().f0().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.l).a(false).c(map).c(((Boolean) this.a.a(r3.z8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.a.a(r3.v7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        k3 k3Var = this.i;
        if (k3Var != null) {
            return k3Var.b(this.g);
        }
        return null;
    }

    private h g() {
        k3 k3Var = this.i;
        if (k3Var instanceof y2) {
            return ((y2) k3Var).N().f();
        }
        if (k3Var instanceof d5) {
            return ((d5) k3Var).u().f();
        }
        return null;
    }

    public void run() {
        h g;
        List f = f();
        if (CollectionUtils.isEmpty((Collection) f)) {
            return;
        }
        Map e = e();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse(a(b((String) it.next(), this.j), this.m));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(this.k);
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str);
                if (e.containsKey(queryParameter)) {
                    k3 k3Var = this.i;
                    if (k3Var != null) {
                        hashMap.put(str, k3Var.a((String) e.get(queryParameter)));
                    }
                } else {
                    clearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            hashMap.putAll(this.a.A().e());
            if (((Boolean) this.a.a(r3.s8)).booleanValue() && (g = g()) != null) {
                hashMap.put("arn_info", g.e());
            }
            a(clearQuery.build().toString(), (Map) hashMap);
        }
    }

    private String a(String str, MaxError maxError) {
        int i;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
