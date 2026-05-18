package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ThemeVideoUrls {
    public static final Companion Companion = new Companion(null);
    private final VideoUrls dark;
    private final VideoUrls light;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ThemeVideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ ThemeVideoUrls(int i, VideoUrls videoUrls, VideoUrls videoUrls2, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, ThemeVideoUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.light = videoUrls;
        this.dark = videoUrls2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ThemeVideoUrls themeVideoUrls, d dVar, qb.e eVar) {
        VideoUrls$$serializer videoUrls$$serializer = VideoUrls$$serializer.INSTANCE;
        dVar.k(eVar, 0, videoUrls$$serializer, themeVideoUrls.light);
        dVar.j(eVar, 1, videoUrls$$serializer, themeVideoUrls.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeVideoUrls)) {
            return false;
        }
        ThemeVideoUrls themeVideoUrls = (ThemeVideoUrls) obj;
        return t.c(this.light, themeVideoUrls.light) && t.c(this.dark, themeVideoUrls.dark);
    }

    public final /* synthetic */ VideoUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ VideoUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        VideoUrls videoUrls = this.dark;
        return hashCode + (videoUrls == null ? 0 : videoUrls.hashCode());
    }

    public String toString() {
        return "ThemeVideoUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeVideoUrls(VideoUrls videoUrls, VideoUrls videoUrls2) {
        t.g(videoUrls, "light");
        this.light = videoUrls;
        this.dark = videoUrls2;
    }
}
