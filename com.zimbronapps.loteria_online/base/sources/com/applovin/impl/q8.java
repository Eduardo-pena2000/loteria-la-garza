package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q8 {
    private final com.applovin.impl.sdk.o a;
    private Stack b;
    private StringBuilder c;
    private long d;
    private b e;

    public class a implements ContentHandler {
        public a() {
        }

        public void characters(char[] cArr, int i, int i2) {
            String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
            if (StringUtils.isValidString(trim)) {
                q8.e(q8.this).append(trim);
            }
        }

        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - q8.b(q8.this);
            q8.a(q8.this);
            if (com.applovin.impl.sdk.o.a()) {
                q8.a(q8.this).a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        public void endElement(String str, String str2, String str3) {
            q8 q8Var = q8.this;
            q8.a(q8Var, (b) q8.c(q8Var).pop());
            q8.d(q8.this).d(q8.e(q8.this).toString().trim());
            q8.e(q8.this).setLength(0);
        }

        public void endPrefixMapping(String str) {
        }

        public void ignorableWhitespace(char[] cArr, int i, int i2) {
        }

        public void processingInstruction(String str, String str2) {
        }

        public void setDocumentLocator(Locator locator) {
        }

        public void skippedEntity(String str) {
        }

        public void startDocument() {
            q8.a(q8.this);
            if (com.applovin.impl.sdk.o.a()) {
                q8.a(q8.this).a("XmlParser", "Begin parsing...");
            }
            q8.a(q8.this, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            try {
                b bVar = !q8.c(q8.this).isEmpty() ? (b) q8.c(q8.this).peek() : null;
                b bVar2 = new b(str2, q8.a(q8.this, attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                q8.c(q8.this).push(bVar2);
            } catch (Exception e) {
                q8.a(q8.this);
                if (com.applovin.impl.sdk.o.a()) {
                    q8.a(q8.this).a("XmlParser", "Unable to process element <" + str2 + ">", e);
                }
                throw new SAXException("Failed to start element", e);
            }
        }

        public void startPrefixMapping(String str, String str2) {
        }
    }

    public static class b extends p8 {
        public b(String str, Map map, p8 p8Var) {
            super(str, map, p8Var);
        }

        public void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.e.add(p8Var);
        }

        public void d(String str) {
            this.d = str;
        }
    }

    public q8(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.a = kVar.O();
    }

    public static /* synthetic */ com.applovin.impl.sdk.o a(q8 q8Var) {
        return q8Var.a;
    }

    public static /* synthetic */ long b(q8 q8Var) {
        return q8Var.d;
    }

    public static /* synthetic */ Stack c(q8 q8Var) {
        return q8Var.b;
    }

    public static /* synthetic */ b d(q8 q8Var) {
        return q8Var.e;
    }

    public static /* synthetic */ StringBuilder e(q8 q8Var) {
        return q8Var.c;
    }

    public static /* synthetic */ long a(q8 q8Var, long j) {
        q8Var.d = j;
        return j;
    }

    public static /* synthetic */ Map a(q8 q8Var, Attributes attributes) {
        return q8Var.a(attributes);
    }

    public static /* synthetic */ b a(q8 q8Var, b bVar) {
        q8Var.e = bVar;
        return bVar;
    }

    public static p8 a(String str, com.applovin.impl.sdk.k kVar) {
        return new q8(kVar).a(str);
    }

    public p8 a(String str) {
        if (str != null) {
            this.c = new StringBuilder();
            this.b = new Stack();
            this.e = null;
            Xml.parse(str, new a());
            b bVar = this.e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    private Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i = 0; i < length; i++) {
                hashMap.put(attributes.getQName(i), attributes.getValue(i));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
