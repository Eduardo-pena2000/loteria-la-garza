package org.apache.tika.sax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LinkContentHandler extends DefaultHandler {
    private final LinkedList builderStack;
    private final boolean collapseWhitespaceInAnchor;
    private final List links;

    public LinkContentHandler() {
        this(false);
    }

    public void characters(char[] cArr, int i, int i2) {
        Iterator it = this.builderStack.iterator();
        while (it.hasNext()) {
            ((LinkBuilder) it.next()).characters(cArr, i, i2);
        }
    }

    public void endElement(String str, String str2, String str3) {
        if (this.builderStack.isEmpty() || !"http://www.w3.org/1999/xhtml".equals(str)) {
            return;
        }
        if (("a".equals(str2) || "img".equals(str2) || "link".equals(str2) || "script".equals(str2) || "iframe".equals(str2)) && ((LinkBuilder) this.builderStack.getFirst()).getType().equals(str2)) {
            this.links.add(((LinkBuilder) this.builderStack.removeFirst()).getLink(this.collapseWhitespaceInAnchor));
        }
    }

    public List getLinks() {
        return this.links;
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) {
        characters(cArr, i, i2);
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if ("http://www.w3.org/1999/xhtml".equals(str)) {
            if ("a".equals(str2)) {
                LinkBuilder linkBuilder = new LinkBuilder("a");
                linkBuilder.setURI(attributes.getValue("", "href"));
                linkBuilder.setTitle(attributes.getValue("", "title"));
                linkBuilder.setRel(attributes.getValue("", "rel"));
                this.builderStack.addFirst(linkBuilder);
                return;
            }
            if ("link".equals(str2)) {
                LinkBuilder linkBuilder2 = new LinkBuilder("link");
                linkBuilder2.setURI(attributes.getValue("", "href"));
                linkBuilder2.setRel(attributes.getValue("", "rel"));
                this.builderStack.addFirst(linkBuilder2);
                return;
            }
            if ("script".equals(str2)) {
                if (attributes.getValue("", "src") != null) {
                    LinkBuilder linkBuilder3 = new LinkBuilder("script");
                    linkBuilder3.setURI(attributes.getValue("", "src"));
                    this.builderStack.addFirst(linkBuilder3);
                    return;
                }
                return;
            }
            if ("iframe".equals(str2)) {
                LinkBuilder linkBuilder4 = new LinkBuilder("iframe");
                linkBuilder4.setURI(attributes.getValue("", "src"));
                this.builderStack.addFirst(linkBuilder4);
            } else if ("img".equals(str2)) {
                LinkBuilder linkBuilder5 = new LinkBuilder("img");
                linkBuilder5.setURI(attributes.getValue("", "src"));
                linkBuilder5.setTitle(attributes.getValue("", "title"));
                linkBuilder5.setRel(attributes.getValue("", "rel"));
                this.builderStack.addFirst(linkBuilder5);
                String value = attributes.getValue("", "alt");
                if (value != null) {
                    char[] charArray = value.toCharArray();
                    characters(charArray, 0, charArray.length);
                }
            }
        }
    }

    public LinkContentHandler(boolean z) {
        this.builderStack = new LinkedList();
        this.links = new ArrayList();
        this.collapseWhitespaceInAnchor = z;
    }
}
