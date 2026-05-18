package org.apache.tika.sax.xpath;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ChildMatcher extends Matcher {
    private final Matcher then;

    public ChildMatcher(Matcher matcher) {
        this.then = matcher;
    }

    public Matcher descend(String str, String str2) {
        return this.then;
    }
}
