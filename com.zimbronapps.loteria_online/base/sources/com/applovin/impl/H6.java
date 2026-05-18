package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class h6 extends i5 {
    private final AppLovinAdLoadListener g;
    private final a h;

    public static final class a extends s7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.b.add(p8Var);
        }
    }

    public static final class b extends h6 {
        private final String i;

        public b(String str, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.i = str;
        }

        public void run() {
            p8 b = b(this.i);
            if (b != null) {
                a(b);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to process XML: " + this.i);
            }
            c(this.i);
            a(t7.f);
        }
    }

    public static final class c extends h6 {
        private final JSONObject i;

        public c(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.i = s7Var.b();
        }

        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "No VAST response received.");
                }
                a(t7.j);
                return;
            }
            if (string.length() >= ((Integer) this.a.a(x4.P4)).intValue()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "VAST response is over max length");
                }
                a(t7.f);
                return;
            }
            p8 b = b(string);
            if (b != null) {
                a(b);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to process XML: " + string);
            }
            c(string);
            a(t7.f);
        }
    }

    public static final class d extends h6 {
        private final p8 i;

        public d(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            if (p8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (s7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.i = p8Var;
        }

        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processing VAST Wrapper response...");
            }
            a(this.i);
        }
    }

    public h6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.g = appLovinAdLoadListener;
        this.h = (a) s7Var;
    }

    public static h6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public p8 b(String str) {
        try {
            return q8.a(str, this.a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to process VAST response", th);
            }
            a(t7.f);
            this.a.D().a(this.b, th);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.a.a(x4.i5)), 1).iterator();
        while (it.hasNext()) {
            p8 b2 = b("<VAST>" + ((String) it.next()) + "</VAST>");
            if (b2 != null) {
                this.h.a(b2);
            }
        }
    }

    public static h6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static h6 a(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(p8Var, s7Var, appLovinAdLoadListener, kVar);
    }

    public void a(p8 p8Var) {
        int d2 = this.h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finished parsing XML at depth " + d2);
        }
        this.h.a(p8Var);
        if (a8.b(p8Var)) {
            int intValue = ((Integer) this.a.a(x4.Q4)).intValue();
            if (d2 < intValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "VAST response is wrapper. Resolving...");
                }
                this.a.q0().a(new p6(this.h, this.g, this.a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Reached beyond max wrapper depth of " + intValue);
            }
            a(t7.i);
            return;
        }
        if (a8.a(p8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "VAST response is inline. Rendering ad...");
            }
            this.a.q0().a(new k6(this.h, this.g, this.a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "VAST response is an error");
        }
        a(t7.j);
    }

    public void a(t7 t7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Failed to process VAST response due to VAST error code " + t7Var);
        }
        a8.a(this.h, this.g, t7Var, -6, this.a);
    }
}
