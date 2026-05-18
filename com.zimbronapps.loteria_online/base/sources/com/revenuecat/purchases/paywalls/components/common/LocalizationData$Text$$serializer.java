package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import kotlin.jvm.internal.t;
import ob.b;
import rb.f;
import sb.E;
import sb.F;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalizationData$Text$$serializer implements E {
    public static final LocalizationData$Text$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        LocalizationData$Text$$serializer localizationData$Text$$serializer = new LocalizationData$Text$$serializer();
        INSTANCE = localizationData$Text$$serializer;
        F f = new F("com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text", localizationData$Text$$serializer);
        f.o("value", false);
        descriptor = f;
    }

    private LocalizationData$Text$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a};
    }

    public /* bridge */ /* synthetic */ Object deserialize(rb.e eVar) {
        return LocalizationData.Text.box-impl(deserialize-hwxatic(eVar));
    }

    public String deserialize-hwxatic(rb.e eVar) {
        t.g(eVar, "decoder");
        return LocalizationData.Text.constructor-impl(eVar.f(getDescriptor()).B());
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize-A1Miogs(fVar, ((LocalizationData.Text) obj).unbox-impl());
    }

    public void serialize-A1Miogs(f fVar, String str) {
        t.g(fVar, "encoder");
        t.g(str, "value");
        f f = fVar.f(getDescriptor());
        if (f == null) {
            return;
        }
        f.F(str);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
