package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Da.Q;
import Qa.a;
import Wa.n;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableProcessor$VariableName$Companion$valueMap$2 extends u implements a {
    public static final VariableProcessor$VariableName$Companion$valueMap$2 INSTANCE = new VariableProcessor$VariableName$Companion$valueMap$2();

    public VariableProcessor$VariableName$Companion$valueMap$2() {
        super(0);
    }

    public final Map invoke() {
        VariableProcessor.VariableName[] values = VariableProcessor.VariableName.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(values.length), 16));
        for (VariableProcessor.VariableName variableName : values) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
