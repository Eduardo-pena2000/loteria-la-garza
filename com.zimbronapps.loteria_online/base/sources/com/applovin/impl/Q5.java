package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q5 extends i5 {
    private final com.applovin.impl.sdk.network.e g;
    private final AppLovinPostbackListener h;
    private final d6.b i;

    public class a implements AppLovinPostbackListener {
        public a() {
        }

        public void onPostbackFailure(String str, int i) {
            q5.c(q5.this);
        }

        public void onPostbackSuccess(String str) {
            if (q5.a(q5.this) != null) {
                q5.a(q5.this).onPostbackSuccess(q5.b(q5.this).f());
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.g = eVar;
        this.h = appLovinPostbackListener;
        this.i = bVar;
    }

    public static /* synthetic */ AppLovinPostbackListener a(q5 q5Var) {
        return q5Var.h;
    }

    public static /* synthetic */ com.applovin.impl.sdk.network.e b(q5 q5Var) {
        return q5Var.g;
    }

    public static /* synthetic */ void c(q5 q5Var) {
        q5Var.e();
    }

    private void e() {
        b bVar = new b(this.g, b());
        bVar.a(this.i);
        b().q0().a(bVar);
    }

    public void run() {
        if (StringUtils.isValidString(this.g.f())) {
            if (this.g.u()) {
                b().x0().a(this.g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.g.f(), -900);
        }
    }

    public class b extends l6 {
        final String m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.m = q5.b(q5.this).f();
        }

        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.a.c(x4.i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.a);
                                r0.b(jSONObject, this.a);
                                r0.a(jSONObject, this.a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.a(q5.this) != null) {
                q5.a(q5.this).onPostbackSuccess(this.m);
            }
            if (q5.b(q5.this).t()) {
                this.a.t().a(q5.b(q5.this).s(), this.m, i, obj, null, true);
            }
        }

        public void a(String str, int i, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.m);
            }
            if (q5.a(q5.this) != null) {
                q5.a(q5.this).onPostbackFailure(this.m, i);
            }
            if (q5.b(q5.this).t()) {
                this.a.t().a(q5.b(q5.this).s(), this.m, i, obj, str2, false);
            }
        }
    }
}
