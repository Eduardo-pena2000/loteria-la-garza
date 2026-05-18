package org.apache.tika.sax.xpath;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class XPathParser {
    private final Map prefixes = new HashMap();

    public XPathParser() {
    }

    public void addPrefix(String str, String str2) {
        this.prefixes.put(str, str2);
    }

    public Matcher parse(String str) {
        if (str.equals("/text()")) {
            return TextMatcher.INSTANCE;
        }
        if (str.equals("/node()")) {
            return NodeMatcher.INSTANCE;
        }
        if (str.equals("/descendant::node()") || str.equals("/descendant:node()")) {
            return new CompositeMatcher(TextMatcher.INSTANCE, new ChildMatcher(new SubtreeMatcher(NodeMatcher.INSTANCE)));
        }
        if (str.equals("/@*")) {
            return AttributeMatcher.INSTANCE;
        }
        if (str.isEmpty()) {
            return ElementMatcher.INSTANCE;
        }
        String str2 = null;
        if (str.startsWith("/@")) {
            String substring = str.substring(2);
            int indexOf = substring.indexOf(58);
            if (indexOf != -1) {
                str2 = substring.substring(0, indexOf);
                substring = substring.substring(indexOf + 1);
            }
            return this.prefixes.containsKey(str2) ? new NamedAttributeMatcher((String) this.prefixes.get(str2), substring) : Matcher.FAIL;
        }
        if (str.startsWith("/*")) {
            return new ChildMatcher(parse(str.substring(2)));
        }
        if (str.startsWith("///")) {
            return Matcher.FAIL;
        }
        if (str.startsWith("//")) {
            return new SubtreeMatcher(parse(str.substring(1)));
        }
        if (!str.startsWith("/")) {
            return Matcher.FAIL;
        }
        int indexOf2 = str.indexOf(47, 1);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        String substring2 = str.substring(1, indexOf2);
        int indexOf3 = substring2.indexOf(58);
        if (indexOf3 != -1) {
            str2 = substring2.substring(0, indexOf3);
            substring2 = substring2.substring(indexOf3 + 1);
        }
        return this.prefixes.containsKey(str2) ? new NamedElementMatcher((String) this.prefixes.get(str2), substring2, parse(str.substring(indexOf2))) : Matcher.FAIL;
    }

    public XPathParser(String str, String str2) {
        addPrefix(str, str2);
    }
}
