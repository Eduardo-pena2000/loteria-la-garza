package org.apache.tika.sax.xpath;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NodeMatcher extends Matcher {
    public static final Matcher INSTANCE = new NodeMatcher();

    public boolean matchesAttribute(String str, String str2) {
        return true;
    }

    public boolean matchesElement() {
        return true;
    }

    public boolean matchesText() {
        return true;
    }
}
