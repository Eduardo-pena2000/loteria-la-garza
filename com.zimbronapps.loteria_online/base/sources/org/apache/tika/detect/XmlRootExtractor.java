package org.apache.tika.detect;

import Db.h;
import java.io.CharConversionException;
import java.io.InputStream;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.XMLReaderUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class XmlRootExtractor {
    private static final ParseContext EMPTY_CONTEXT = new ParseContext();

    public static class ExtractorHandler extends DefaultHandler {
        private QName rootElement;

        public /* synthetic */ ExtractorHandler(e eVar) {
            this();
        }

        public static /* bridge */ /* synthetic */ QName a(ExtractorHandler extractorHandler) {
            return extractorHandler.rootElement;
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.rootElement = new QName(str, str2);
            throw new SAXException("Aborting: root element received");
        }

        private ExtractorHandler() {
            this.rootElement = null;
        }
    }

    public static class MalformedCharException extends RuntimeException {
        public MalformedCharException(Exception exc) {
            super(exc);
        }
    }

    public QName extractRootElement(byte[] bArr) {
        while (true) {
            try {
                return extractRootElement(new h(bArr), true);
            } catch (MalformedCharException unused) {
                int length = bArr.length / 2;
                if (length % 2 == 1) {
                    length--;
                }
                if (length <= 0) {
                    return null;
                }
                bArr = Arrays.copyOf(bArr, length);
            }
        }
    }

    public QName extractRootElement(InputStream inputStream) {
        return extractRootElement(inputStream, false);
    }

    private QName extractRootElement(InputStream inputStream, boolean z) {
        ExtractorHandler extractorHandler = new ExtractorHandler(null);
        try {
            XMLReaderUtils.parseSAX((InputStream) Db.a.a(inputStream), (ContentHandler) extractorHandler, EMPTY_CONTEXT);
        } catch (Exception e) {
            if (z && ((e instanceof CharConversionException) || (e.getCause() instanceof CharConversionException))) {
                throw new MalformedCharException(e);
            }
        } catch (SecurityException e2) {
            throw e2;
        }
        return ExtractorHandler.a(extractorHandler);
    }
}
