package org.apache.tika.sax.xpath;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NamedElementMatcher extends ChildMatcher {
    private final String name;
    private final String namespace;

    public NamedElementMatcher(String str, String str2, Matcher matcher) {
        super(matcher);
        this.namespace = str;
        this.name = str2;
    }

    public Matcher descend(String str, String str2) {
        return (Objects.equals(str, this.namespace) && str2.equals(this.name)) ? super.descend(str, str2) : Matcher.FAIL;
    }
}
