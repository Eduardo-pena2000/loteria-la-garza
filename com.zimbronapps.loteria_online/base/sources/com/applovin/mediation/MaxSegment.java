package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxSegment {
    private final int a;
    private final List b;

    public MaxSegment(int i, List list) {
        this.a = i;
        this.b = list;
        a(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(((Integer) it.next()).intValue());
        }
    }

    private void a(int i) {
        if (i >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.a;
    }

    public List getValues() {
        return this.b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.a + ", values=" + this.b + '}';
    }
}
