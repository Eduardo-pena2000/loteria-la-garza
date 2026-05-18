package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ActionSerializer implements b {
    public static final ActionSerializer INSTANCE = new ActionSerializer();
    private static final e descriptor = ActionSurrogate.Companion.serializer().getDescriptor();

    private ActionSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public ButtonComponent.Action deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        return ((ActionSurrogate) eVar.p(ActionSurrogate.Companion.serializer())).toAction();
    }

    public void serialize(f fVar, ButtonComponent.Action action) {
        t.g(fVar, "encoder");
        t.g(action, "value");
        fVar.l(ActionSurrogate.Companion.serializer(), new ActionSurrogate(action));
    }
}
