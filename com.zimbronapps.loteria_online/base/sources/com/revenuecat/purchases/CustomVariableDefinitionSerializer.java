package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomVariableDefinitionSerializer implements ob.b {
    public static final CustomVariableDefinitionSerializer INSTANCE = new CustomVariableDefinitionSerializer();
    private static final qb.e descriptor = qb.k.c("CustomVariableDefinition", new qb.e[0], CustomVariableDefinitionSerializer$descriptor$1.INSTANCE);

    private CustomVariableDefinitionSerializer() {
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.revenuecat.purchases.UiConfig.CustomVariableDefinition deserialize(rb.e r5) {
        /*
            r4 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.t.g(r5, r0)
            boolean r0 = r5 instanceof tb.h
            if (r0 == 0) goto La8
            tb.h r5 = (tb.h) r5
            tb.i r5 = r5.i()
            tb.C r5 = tb.j.n(r5)
            java.lang.String r0 = "type"
            java.lang.Object r0 = r5.get(r0)
            tb.i r0 = (tb.i) r0
            java.lang.String r1 = "string"
            if (r0 == 0) goto L2b
            tb.E r0 = tb.j.o(r0)
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L2c
        L2b:
            r0 = r1
        L2c:
            java.lang.String r2 = "default_value"
            java.lang.Object r5 = r5.get(r2)
            boolean r2 = r5 instanceof tb.E
            if (r2 == 0) goto L39
            tb.E r5 = (tb.E) r5
            goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 != 0) goto L44
            com.revenuecat.purchases.UiConfig$CustomVariableDefinition r5 = new com.revenuecat.purchases.UiConfig$CustomVariableDefinition
            java.lang.String r1 = ""
            r5.<init>(r0, r1)
            return r5
        L44:
            int r2 = r0.hashCode()
            r3 = -1034364087(0xffffffffc258db49, float:-54.214146)
            if (r2 == r3) goto L81
            r3 = -891985903(0xffffffffcad56011, float:-6991880.5)
            if (r2 == r3) goto L76
            r1 = 64711720(0x3db6c28, float:1.2896495E-36)
            if (r2 == r1) goto L58
            goto L89
        L58:
            java.lang.String r1 = "boolean"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L61
            goto L89
        L61:
            java.lang.Boolean r1 = tb.j.e(r5)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.a()
            java.lang.Boolean r1 = Za.E.i1(r1)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.a()
            goto La2
        L76:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L89
            java.lang.String r1 = r5.a()
            goto La2
        L81:
            java.lang.String r1 = "number"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8e
        L89:
            java.lang.String r1 = r5.a()
            goto La2
        L8e:
            java.lang.Double r1 = tb.j.h(r5)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.a()
            java.lang.Double r1 = Za.z.m(r1)
            if (r1 != 0) goto La2
            java.lang.String r1 = r5.a()
        La2:
            com.revenuecat.purchases.UiConfig$CustomVariableDefinition r5 = new com.revenuecat.purchases.UiConfig$CustomVariableDefinition
            r5.<init>(r0, r1)
            return r5
        La8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CustomVariableDefinition can only be deserialized from JSON"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CustomVariableDefinitionSerializer.deserialize(rb.e):com.revenuecat.purchases.UiConfig$CustomVariableDefinition");
    }

    public void serialize(rb.f fVar, UiConfig.CustomVariableDefinition customVariableDefinition) {
        t.g(fVar, "encoder");
        t.g(customVariableDefinition, "value");
        throw new IllegalStateException("Serialization of CustomVariableDefinition is not implemented as it is not needed.");
    }
}
