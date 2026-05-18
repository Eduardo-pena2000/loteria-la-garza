package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Da.Q;
import Qa.a;
import Wa.n;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableProcessorV2$Variable$Companion$valuesByIdentifier$2 extends u implements a {
    public static final VariableProcessorV2$Variable$Companion$valuesByIdentifier$2 INSTANCE = new VariableProcessorV2$Variable$Companion$valuesByIdentifier$2();

    public VariableProcessorV2$Variable$Companion$valuesByIdentifier$2() {
        super(0);
    }

    public final Map invoke() {
        VariableProcessorV2.Variable[] values = VariableProcessorV2.Variable.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(values.length), 16));
        for (VariableProcessorV2.Variable variable : values) {
            linkedHashMap.put(variable.getIdentifier(), variable);
        }
        return linkedHashMap;
    }
}
