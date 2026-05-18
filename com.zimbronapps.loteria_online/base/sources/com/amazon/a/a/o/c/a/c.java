package com.amazon.a.a.o.c.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class c implements a {
    private final Set a;

    public c(String... strArr) {
        this.a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    public boolean a(String str) {
        return this.a.contains(str);
    }
}
