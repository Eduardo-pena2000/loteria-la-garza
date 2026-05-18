package org.apache.tika.sax;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class LinkBuilder {
    private final String type;
    private final StringBuilder text = new StringBuilder();
    private String uri = "";
    private String title = "";
    private String rel = "";

    public LinkBuilder(String str) {
        this.type = str;
    }

    public void characters(char[] cArr, int i, int i2) {
        this.text.append(cArr, i, i2);
    }

    public Link getLink() {
        return getLink(false);
    }

    public String getType() {
        return this.type;
    }

    public void setRel(String str) {
        if (str != null) {
            this.rel = str;
        } else {
            this.rel = "";
        }
    }

    public void setTitle(String str) {
        if (str != null) {
            this.title = str;
        } else {
            this.title = "";
        }
    }

    public void setURI(String str) {
        if (str != null) {
            this.uri = str;
        } else {
            this.uri = "";
        }
    }

    public Link getLink(boolean z) {
        String sb = this.text.toString();
        if (z) {
            sb = sb.replaceAll("\\s+", " ").trim();
        }
        return new Link(this.type, this.uri, this.title, sb, this.rel);
    }
}
