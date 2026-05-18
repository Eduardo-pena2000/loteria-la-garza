package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e extends com.applovin.impl.sdk.network.a {
    private String s;
    private boolean t;

    public static class a extends a.a {
        private String r;
        private boolean s;

        public a(k kVar) {
            super(kVar);
            this.h = ((Integer) kVar.a(x4.H2)).intValue();
            this.i = ((Integer) kVar.a(x4.G2)).intValue();
            this.j = ((Integer) kVar.a(x4.S2)).intValue();
        }

        public static /* synthetic */ String a(a aVar) {
            return aVar.r;
        }

        public static /* synthetic */ boolean b(a aVar) {
            return aVar.s;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.c = str;
            return this;
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i) {
            this.j = i;
            return this;
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.b = str;
            return this;
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.a = str;
            return this;
        }

        public a h(boolean z) {
            this.s = z;
            return this;
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z) {
            this.p = z;
            return this;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.d = map;
            return this;
        }

        public a e(String str) {
            this.r = str;
            return this;
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i) {
            this.i = i;
            return this;
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z) {
            this.n = z;
            return this;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.e = map;
            return this;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.h = i;
            return this;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.g = obj;
            return this;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(u4.a aVar) {
            this.q = aVar;
            return this;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.s = a.a(aVar);
        this.t = a.b(aVar);
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.s;
    }

    public boolean t() {
        return this.s != null;
    }

    public boolean u() {
        return this.t;
    }
}
