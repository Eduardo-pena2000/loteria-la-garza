package com.amazon.a.a.o.c.a;

import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class e implements a {
    private final Pattern a;

    public e(String str) {
        this(Pattern.compile(str));
    }

    public boolean a(String str) {
        return this.a.matcher(str).matches();
    }

    public e(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Null pattern");
        }
        this.a = pattern;
    }
}
