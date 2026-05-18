package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.tika.parser.ParseContext;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BasicContentHandlerFactory implements ContentHandlerFactory, WriteLimiter {
    private final ParseContext parseContext;
    private final boolean throwOnWriteLimitReached;
    private final HANDLER_TYPE type;
    private final int writeLimit;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE;

        static {
            int[] iArr = new int[HANDLER_TYPE.values().length];
            $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE = iArr;
            try {
                iArr[HANDLER_TYPE.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[HANDLER_TYPE.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[HANDLER_TYPE.XML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[HANDLER_TYPE.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum HANDLER_TYPE {
        BODY,
        IGNORE,
        TEXT,
        HTML,
        XML
    }

    public BasicContentHandlerFactory(HANDLER_TYPE handler_type, int i) {
        this(handler_type, i, true, null);
    }

    private ContentHandler getFormatHandler() {
        int i = 1.$SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[this.type.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new ToTextContentHandler() : new ToXMLContentHandler() : new ToHTMLContentHandler() : new ToTextContentHandler();
    }

    public static HANDLER_TYPE parseHandlerType(String str, HANDLER_TYPE handler_type) {
        if (str == null) {
            return handler_type;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return handler_type;
    }

    public ContentHandler getNewContentHandler() {
        HANDLER_TYPE handler_type = this.type;
        if (handler_type == HANDLER_TYPE.BODY) {
            return new BodyContentHandler((ContentHandler) new WriteOutContentHandler(new ToTextContentHandler(), this.writeLimit, this.throwOnWriteLimitReached, this.parseContext));
        }
        if (handler_type == HANDLER_TYPE.IGNORE) {
            return new DefaultHandler();
        }
        ContentHandler formatHandler = getFormatHandler();
        return this.writeLimit < 0 ? formatHandler : new WriteOutContentHandler(formatHandler, this.writeLimit, this.throwOnWriteLimitReached, this.parseContext);
    }

    public HANDLER_TYPE getType() {
        return this.type;
    }

    public int getWriteLimit() {
        return this.writeLimit;
    }

    public boolean isThrowOnWriteLimitReached() {
        return this.throwOnWriteLimitReached;
    }

    public BasicContentHandlerFactory(HANDLER_TYPE handler_type, int i, boolean z, ParseContext parseContext) {
        this.type = handler_type;
        this.writeLimit = i;
        this.throwOnWriteLimitReached = z;
        this.parseContext = parseContext;
        if (!z && parseContext == null) {
            throw new IllegalArgumentException("parse context must not be null if throwOnWriteLimitReached is false");
        }
    }

    public ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset) {
        HANDLER_TYPE handler_type = this.type;
        if (handler_type == HANDLER_TYPE.IGNORE) {
            return new DefaultHandler();
        }
        try {
            if (this.writeLimit > -1) {
                int i = 1.$SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[handler_type.ordinal()];
                if (i == 1) {
                    return new WriteOutContentHandler((ContentHandler) new ToTextContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i == 2) {
                    return new WriteOutContentHandler((ContentHandler) new ToHTMLContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i == 3) {
                    return new WriteOutContentHandler((ContentHandler) new ToXMLContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i != 4) {
                    return new WriteOutContentHandler((ContentHandler) new ToTextContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                return new WriteOutContentHandler((ContentHandler) new BodyContentHandler((Writer) new OutputStreamWriter(outputStream, charset)), this.writeLimit);
            }
            int i2 = 1.$SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[handler_type.ordinal()];
            if (i2 == 1) {
                return new ToTextContentHandler(outputStream, charset.name());
            }
            if (i2 == 2) {
                return new ToHTMLContentHandler(outputStream, charset.name());
            }
            if (i2 == 3) {
                return new ToXMLContentHandler(outputStream, charset.name());
            }
            if (i2 != 4) {
                return new ToTextContentHandler(outputStream, charset.name());
            }
            return new BodyContentHandler((Writer) new OutputStreamWriter(outputStream, charset));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("couldn't find charset for name: " + String.valueOf(charset));
        }
    }
}
