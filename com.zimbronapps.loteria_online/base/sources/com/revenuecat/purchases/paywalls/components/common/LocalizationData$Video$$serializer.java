package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import rb.f;
import sb.E;
import sb.F;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalizationData$Video$$serializer implements E {
    public static final LocalizationData$Video$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        LocalizationData$Video$$serializer localizationData$Video$$serializer = new LocalizationData$Video$$serializer();
        INSTANCE = localizationData$Video$$serializer;
        F f = new F("com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video", localizationData$Video$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private LocalizationData$Video$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ThemeVideoUrls$$serializer.INSTANCE};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return LocalizationData.Video.box-impl(deserialize-ujSbH98(eVar));
    }

    public ThemeVideoUrls deserialize-ujSbH98(rb.e eVar) {
        t.g(eVar, "decoder");
        return LocalizationData.Video.constructor-impl((ThemeVideoUrls) eVar.f(getDescriptor()).p(ThemeVideoUrls$$serializer.INSTANCE));
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize-fSCuikk(fVar, ((LocalizationData.Video) obj).unbox-impl());
    }

    public void serialize-fSCuikk(f fVar, ThemeVideoUrls themeVideoUrls) {
        t.g(fVar, "encoder");
        t.g(themeVideoUrls, "value");
        f f = fVar.f(getDescriptor());
        if (f == null) {
            return;
        }
        f.l(ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
