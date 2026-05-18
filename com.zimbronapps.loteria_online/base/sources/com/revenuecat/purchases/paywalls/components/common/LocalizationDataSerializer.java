package com.revenuecat.purchases.paywalls.components.common;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import kotlin.jvm.internal.t;
import ob.b;
import ob.j;
import qb.c;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class LocalizationDataSerializer implements b {
    public static final LocalizationDataSerializer INSTANCE = new LocalizationDataSerializer();
    private static final e descriptor = k.e("LocalizationData", c.a.a, new e[0], (l) null, 8, (Object) null);

    private LocalizationDataSerializer() {
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public LocalizationData deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        try {
            return (LocalizationData) eVar.p(LocalizationData.Text.Companion.serializer());
        } catch (j unused) {
            return (LocalizationData) eVar.p(LocalizationData.Image.Companion.serializer());
        }
    }

    public void serialize(f fVar, LocalizationData localizationData) {
        t.g(fVar, "encoder");
        t.g(localizationData, "value");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
