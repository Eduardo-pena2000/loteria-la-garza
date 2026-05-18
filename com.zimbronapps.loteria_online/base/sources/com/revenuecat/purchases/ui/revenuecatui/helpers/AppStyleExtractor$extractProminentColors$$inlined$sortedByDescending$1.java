package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Fa.b;
import java.util.Comparator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AppStyleExtractor$extractProminentColors$$inlined$sortedByDescending$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return b.d((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
    }
}
