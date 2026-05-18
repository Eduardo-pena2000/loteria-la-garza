package org.apache.tika.sax.xpath;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeMatcher extends Matcher {
    private final Matcher a;
    private final Matcher b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.a = matcher;
        this.b = matcher2;
    }

    public Matcher descend(String str, String str2) {
        Matcher descend = this.a.descend(str, str2);
        Matcher descend2 = this.b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        return descend == matcher ? descend2 : descend2 == matcher ? descend : (this.a == descend && this.b == descend2) ? this : new CompositeMatcher(descend, descend2);
    }

    public boolean matchesAttribute(String str, String str2) {
        return this.a.matchesAttribute(str, str2) || this.b.matchesAttribute(str, str2);
    }

    public boolean matchesElement() {
        return this.a.matchesElement() || this.b.matchesElement();
    }

    public boolean matchesText() {
        return this.a.matchesText() || this.b.matchesText();
    }
}
