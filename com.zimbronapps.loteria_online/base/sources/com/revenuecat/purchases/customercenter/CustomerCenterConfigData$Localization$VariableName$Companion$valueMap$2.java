package com.revenuecat.purchases.customercenter;

import Da.Q;
import Qa.a;
import Wa.n;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 extends u implements a {
    public static final CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 INSTANCE = new CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2();

    public CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2() {
        super(0);
    }

    public final Map invoke() {
        CustomerCenterConfigData.Localization.VariableName[] values = CustomerCenterConfigData.Localization.VariableName.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(values.length), 16));
        for (CustomerCenterConfigData.Localization.VariableName variableName : values) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
