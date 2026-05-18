package com.revenuecat.purchases;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ReplacementModeSerializer implements ob.b {
    public static final ReplacementModeSerializer INSTANCE = new ReplacementModeSerializer();
    private static final qb.e descriptor = qb.k.c("ReplacementMode", new qb.e[0], ReplacementModeSerializer$descriptor$1.INSTANCE);

    private ReplacementModeSerializer() {
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public ReplacementMode deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        String str = "";
        String str2 = "";
        while (true) {
            ReplacementModeSerializer replacementModeSerializer = INSTANCE;
            int v = b.v(replacementModeSerializer.getDescriptor());
            if (v == -1) {
                if (!t.c(str, "GoogleReplacementMode")) {
                    throw new ob.j("Unknown ReplacementMode type: " + str);
                }
                try {
                    GoogleReplacementMode valueOf = GoogleReplacementMode.valueOf(str2);
                    b.c(descriptor2);
                    return valueOf;
                } catch (IllegalArgumentException e) {
                    throw new ob.j("Invalid GoogleReplacementMode name: " + str2, e);
                }
            }
            if (v == 0) {
                str = b.o(replacementModeSerializer.getDescriptor(), 0);
            } else {
                if (v != 1) {
                    throw new ob.j("Unexpected index: " + v);
                }
                str2 = b.o(replacementModeSerializer.getDescriptor(), 1);
            }
        }
    }

    public void serialize(rb.f fVar, ReplacementMode replacementMode) {
        t.g(fVar, "encoder");
        t.g(replacementMode, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        if (!(replacementMode instanceof GoogleReplacementMode)) {
            throw new ob.j("Unknown ReplacementMode type: " + P.b(replacementMode.getClass()).e());
        }
        ReplacementModeSerializer replacementModeSerializer = INSTANCE;
        b.v(replacementModeSerializer.getDescriptor(), 0, "GoogleReplacementMode");
        b.v(replacementModeSerializer.getDescriptor(), 1, replacementMode.getName());
        b.c(descriptor2);
    }
}
