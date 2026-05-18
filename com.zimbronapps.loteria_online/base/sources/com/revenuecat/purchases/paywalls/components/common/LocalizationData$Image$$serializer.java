package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import rb.f;
import sb.E;
import sb.F;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalizationData$Image$$serializer implements E {
    public static final LocalizationData$Image$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        LocalizationData$Image$$serializer localizationData$Image$$serializer = new LocalizationData$Image$$serializer();
        INSTANCE = localizationData$Image$$serializer;
        F f = new F("com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image", localizationData$Image$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private LocalizationData$Image$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ThemeImageUrls$$serializer.INSTANCE};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return LocalizationData.Image.box-impl(deserialize-xI4gazs(eVar));
    }

    public ThemeImageUrls deserialize-xI4gazs(rb.e eVar) {
        t.g(eVar, "decoder");
        return LocalizationData.Image.constructor-impl((ThemeImageUrls) eVar.f(getDescriptor()).p(ThemeImageUrls$$serializer.INSTANCE));
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize-qu_9WGk(fVar, ((LocalizationData.Image) obj).unbox-impl());
    }

    public void serialize-qu_9WGk(f fVar, ThemeImageUrls themeImageUrls) {
        t.g(fVar, "encoder");
        t.g(themeImageUrls, "value");
        f f = fVar.f(getDescriptor());
        if (f == null) {
            return;
        }
        f.l(ThemeImageUrls$$serializer.INSTANCE, themeImageUrls);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
