package com.revenuecat.purchases.ui.revenuecatui;

import Za.G;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomVariableKeyValidator {
    public static final int $stable = 0;
    public static final CustomVariableKeyValidator INSTANCE = new CustomVariableKeyValidator();

    private CustomVariableKeyValidator() {
    }

    private final boolean isValidKey(String str) {
        if (str.length() <= 0 || !Character.isLetter(G.n1(str))) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '_') {
                return false;
            }
        }
        return true;
    }

    public final Map validateAndFilter(Map variables) {
        t.g(variables, "variables");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : variables.entrySet()) {
            String str = (String) entry.getKey();
            CustomVariableValue customVariableValue = (CustomVariableValue) entry.getValue();
            if (isValidKey(str)) {
                linkedHashMap.put(str, customVariableValue);
            } else {
                Logger.INSTANCE.w("Custom variable key '" + str + "' is invalid and will be ignored. Keys must start with a letter and contain only letters, numbers, and underscores.");
            }
        }
        return linkedHashMap;
    }
}
