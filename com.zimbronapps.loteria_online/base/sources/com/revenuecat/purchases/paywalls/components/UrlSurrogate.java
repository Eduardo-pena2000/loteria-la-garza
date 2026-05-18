package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class UrlSurrogate {
    public static final Companion Companion = new Companion(null);
    private final ButtonComponent.UrlMethod method;
    private final String url_lid;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return UrlSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ UrlSurrogate(int i, String str, ButtonComponent.UrlMethod urlMethod, t0 t0Var, k kVar) {
        this(i, str, urlMethod, t0Var);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(UrlSurrogate urlSurrogate, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.box-impl(urlSurrogate.url_lid));
        dVar.k(eVar, 1, UrlMethodDeserializer.INSTANCE, urlSurrogate.method);
    }

    public final ButtonComponent.UrlMethod getMethod() {
        return this.method;
    }

    public final String getUrl_lid-z7Tp-4o() {
        return this.url_lid;
    }

    public /* synthetic */ UrlSurrogate(String str, ButtonComponent.UrlMethod urlMethod, k kVar) {
        this(str, urlMethod);
    }

    private UrlSurrogate(int i, String str, ButtonComponent.UrlMethod urlMethod, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, UrlSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.url_lid = str;
        this.method = urlMethod;
    }

    private UrlSurrogate(String str, ButtonComponent.UrlMethod urlMethod) {
        t.g(str, "url_lid");
        t.g(urlMethod, "method");
        this.url_lid = str;
        this.method = urlMethod;
    }
}
