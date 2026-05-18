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
public final class ThemeImageUrls {
    public static final Companion Companion = new Companion(null);
    private final ImageUrls dark;
    private final ImageUrls light;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ThemeImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ ThemeImageUrls(int i, ImageUrls imageUrls, ImageUrls imageUrls2, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, ThemeImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.light = imageUrls;
        if ((i & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = imageUrls2;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ThemeImageUrls themeImageUrls, d dVar, qb.e eVar) {
        ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
        dVar.k(eVar, 0, imageUrls$$serializer, themeImageUrls.light);
        if (!dVar.e(eVar, 1) && themeImageUrls.dark == null) {
            return;
        }
        dVar.j(eVar, 1, imageUrls$$serializer, themeImageUrls.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeImageUrls)) {
            return false;
        }
        ThemeImageUrls themeImageUrls = (ThemeImageUrls) obj;
        return t.c(this.light, themeImageUrls.light) && t.c(this.dark, themeImageUrls.dark);
    }

    public final /* synthetic */ ImageUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ ImageUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        ImageUrls imageUrls = this.dark;
        return hashCode + (imageUrls == null ? 0 : imageUrls.hashCode());
    }

    public String toString() {
        return "ThemeImageUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2) {
        t.g(imageUrls, "light");
        this.light = imageUrls;
        this.dark = imageUrls2;
    }

    public /* synthetic */ ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2, int i, k kVar) {
        this(imageUrls, (i & 2) != 0 ? null : imageUrls2);
    }
}
