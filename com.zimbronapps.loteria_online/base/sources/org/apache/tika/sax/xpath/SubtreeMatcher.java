package org.apache.tika.sax.xpath;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class SubtreeMatcher extends Matcher {
    private final Matcher then;

    public SubtreeMatcher(Matcher matcher) {
        this.then = matcher;
    }

    public Matcher descend(String str, String str2) {
        Matcher descend = this.then.descend(str, str2);
        return (descend == Matcher.FAIL || descend == this.then) ? this : new CompositeMatcher(descend, this);
    }

    public boolean matchesAttribute(String str, String str2) {
        return this.then.matchesAttribute(str, str2);
    }

    public boolean matchesElement() {
        return this.then.matchesElement();
    }

    public boolean matchesText() {
        return this.then.matchesText();
    }
}
