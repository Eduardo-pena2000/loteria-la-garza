package org.apache.tika.mime;

import Db.h;
import Wb.c;
import Wb.e;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import org.apache.tika.exception.TikaException;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MimeTypesReader extends DefaultHandler implements MimeTypesReaderMetKeys {
    protected int priority;
    protected final MimeTypes types;
    private static final ReentrantReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();
    private static int POOL_SIZE = 10;
    private static ArrayBlockingQueue SAX_PARSERS = new ArrayBlockingQueue(POOL_SIZE);
    static c LOG = e.l(MimeTypesReader.class);
    protected MimeType type = null;
    protected StringBuilder characters = null;
    private ClauseRecord current = new ClauseRecord(null);

    public class ClauseRecord {
        private Clause clause;
        private final ClauseRecord parent;
        private List subclauses = null;

        public ClauseRecord(Clause clause) {
            this.parent = MimeTypesReader.a(MimeTypesReader.this);
            this.clause = clause;
        }

        public List getClauses() {
            return this.subclauses;
        }

        public void stop() {
            Clause clause = this.clause;
            if (clause instanceof MinShouldMatchVal) {
                this.clause = new MinShouldMatchClause(((MinShouldMatchVal) clause).getVal(), this.subclauses);
            } else {
                List list = this.subclauses;
                if (list != null) {
                    this.clause = new AndClause(this.clause, list.size() == 1 ? (Clause) this.subclauses.get(0) : new OrClause(this.subclauses));
                }
            }
            ClauseRecord clauseRecord = this.parent;
            List list2 = clauseRecord.subclauses;
            if (list2 == null) {
                clauseRecord.subclauses = Collections.singletonList(this.clause);
            } else {
                if (list2.size() == 1) {
                    this.parent.subclauses = new ArrayList(this.parent.subclauses);
                }
                this.parent.subclauses.add(this.clause);
            }
            MimeTypesReader mimeTypesReader = MimeTypesReader.this;
            MimeTypesReader.b(mimeTypesReader, MimeTypesReader.a(mimeTypesReader).parent);
        }
    }

    public static class MinShouldMatchVal implements Clause {
        private final int val;

        public MinShouldMatchVal(int i) {
            this.val = i;
        }

        public boolean eval(byte[] bArr) {
            throw new IllegalStateException("This should never be used on this placeholder class");
        }

        public int getVal() {
            return this.val;
        }

        public int size() {
            return 0;
        }
    }

    static {
        try {
            setPoolSize(POOL_SIZE);
        } catch (TikaException e) {
            throw new RuntimeException("problem initializing SAXParser pool", e);
        }
    }

    public MimeTypesReader(MimeTypes mimeTypes) {
        this.types = mimeTypes;
    }

    public static /* bridge */ /* synthetic */ ClauseRecord a(MimeTypesReader mimeTypesReader) {
        return mimeTypesReader.current;
    }

    private static SAXParser acquireSAXParser() throws TikaException {
        SAXParser sAXParser;
        do {
            try {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock = READ_WRITE_LOCK;
                    reentrantReadWriteLock.readLock().lock();
                    sAXParser = (SAXParser) SAX_PARSERS.poll(10L, TimeUnit.MILLISECONDS);
                    reentrantReadWriteLock.readLock().unlock();
                } catch (InterruptedException e) {
                    throw new TikaException("interrupted while waiting for SAXParser", e);
                }
            } catch (Throwable th) {
                READ_WRITE_LOCK.readLock().unlock();
                throw th;
            }
        } while (sAXParser == null);
        return sAXParser;
    }

    public static /* bridge */ /* synthetic */ void b(MimeTypesReader mimeTypesReader, ClauseRecord clauseRecord) {
        mimeTypesReader.current = clauseRecord;
    }

    private static SAXParser newSAXParser() throws TikaException {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (ParserConfigurationException | SAXException unused) {
            LOG.w("can't set secure processing feature on: " + String.valueOf(newInstance.getClass()) + ". User assumes responsibility for consequences.");
        }
        try {
            return newInstance.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            throw new TikaException("Can't create new sax parser", e);
        }
    }

    private static void releaseParser(SAXParser sAXParser) {
        try {
            sAXParser.reset();
        } catch (UnsupportedOperationException unused) {
        }
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = READ_WRITE_LOCK;
            reentrantReadWriteLock.readLock().lock();
            SAX_PARSERS.offer(sAXParser);
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            READ_WRITE_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static void setPoolSize(int i) throws TikaException {
        try {
            READ_WRITE_LOCK.writeLock().lock();
            SAX_PARSERS = new ArrayBlockingQueue(i);
            for (int i2 = 0; i2 < i; i2++) {
                SAX_PARSERS.offer(newSAXParser());
            }
            POOL_SIZE = i;
            READ_WRITE_LOCK.writeLock().unlock();
        } catch (Throwable th) {
            READ_WRITE_LOCK.writeLock().unlock();
            throw th;
        }
    }

    public void characters(char[] cArr, int i, int i2) {
        StringBuilder sb = this.characters;
        if (sb != null) {
            sb.append(cArr, i, i2);
        }
    }

    public void endElement(String str, String str2, String str3) {
        if (this.type != null) {
            if ("mime-type".equals(str3)) {
                this.type = null;
                return;
            }
            if ("_comment".equals(str3)) {
                this.type.setDescription(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if ("acronym".equals(str3)) {
                this.type.setAcronym(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if ("tika:uti".equals(str3)) {
                this.type.setUniformTypeIdentifier(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if ("tika:link".equals(str3)) {
                try {
                    this.type.addLink(new URI(this.characters.toString().trim()));
                    this.characters = null;
                    return;
                } catch (URISyntaxException e) {
                    throw new IllegalArgumentException("unable to parse link: " + String.valueOf(this.characters), e);
                }
            }
            if ("match".equals(str3)) {
                this.current.stop();
                return;
            }
            if ("magic".equals(str3)) {
                for (Clause clause : this.current.getClauses()) {
                    MimeType mimeType = this.type;
                    mimeType.addMagic(new Magic(mimeType, this.priority, clause));
                }
                this.current = null;
            }
        }
    }

    public void handleGlobError(MimeType mimeType, String str, MimeTypeException mimeTypeException, String str2, Attributes attributes) throws SAXException {
        throw new SAXException(mimeTypeException);
    }

    public void handleMimeError(String str, MimeTypeException mimeTypeException, String str2, Attributes attributes) throws SAXException {
        throw new SAXException(mimeTypeException);
    }

    public void read(InputStream inputStream) throws IOException, MimeTypeException {
        SAXParser sAXParser = null;
        try {
            try {
                sAXParser = acquireSAXParser();
                sAXParser.parse(inputStream, this);
                releaseParser(sAXParser);
            } catch (TikaException e) {
                throw new MimeTypeException("Unable to create an XML parser", e);
            } catch (SAXException e2) {
                throw new MimeTypeException("Invalid type configuration", e2);
            }
        } catch (Throwable th) {
            if (sAXParser != null) {
                releaseParser(sAXParser);
            }
            throw th;
        }
    }

    public InputSource resolveEntity(String str, String str2) {
        return new InputSource(new h(new byte[0]));
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (this.type == null) {
            if ("mime-type".equals(str3)) {
                String value = attributes.getValue("type");
                boolean equals = "true".equals(attributes.getValue("interpreted"));
                try {
                    MimeType forName = this.types.forName(value);
                    this.type = forName;
                    forName.setInterpreted(equals);
                    return;
                } catch (MimeTypeException e) {
                    handleMimeError(value, e, str3, attributes);
                    return;
                }
            }
            return;
        }
        if ("alias".equals(str3)) {
            this.types.addAlias(this.type, MediaType.parse(attributes.getValue("type")));
            return;
        }
        if ("sub-class-of".equals(str3)) {
            this.types.setSuperType(this.type, MediaType.parse(attributes.getValue("type")));
            return;
        }
        if ("acronym".equals(str3) || "_comment".equals(str3) || "tika:link".equals(str3) || "tika:uti".equals(str3)) {
            this.characters = new StringBuilder();
            return;
        }
        if ("glob".equals(str3)) {
            String value2 = attributes.getValue("pattern");
            String value3 = attributes.getValue("isregex");
            if (value2 != null) {
                try {
                    this.types.addPattern(this.type, value2, Boolean.parseBoolean(value3));
                    return;
                } catch (MimeTypeException e2) {
                    handleGlobError(this.type, value2, e2, str3, attributes);
                    return;
                }
            }
            return;
        }
        if ("root-XML".equals(str3)) {
            this.type.addRootXML(attributes.getValue("namespaceURI"), attributes.getValue("localName"));
            return;
        }
        if (!"match".equals(str3)) {
            if ("magic".equals(str3)) {
                String value4 = attributes.getValue("priority");
                if (value4 == null || value4.length() <= 0) {
                    this.priority = 50;
                } else {
                    this.priority = Integer.parseInt(value4);
                }
                this.current = new ClauseRecord(null);
                return;
            }
            return;
        }
        if (attributes.getValue("minShouldMatch") != null) {
            this.current = new ClauseRecord(new MinShouldMatchVal(Integer.parseInt(attributes.getValue("minShouldMatch"))));
            return;
        }
        String value5 = attributes.getValue("type");
        String value6 = attributes.getValue("offset");
        String value7 = attributes.getValue("value");
        String value8 = attributes.getValue("mask");
        if (value5 == null) {
            value5 = "string";
        }
        this.current = new ClauseRecord(new MagicMatch(this.type.getType(), value5, value6, value7, value8));
    }

    public void read(Document document) throws MimeTypeException {
        try {
            XMLReaderUtils.getTransformer().transform(new DOMSource(document), new SAXResult(this));
        } catch (TikaException | TransformerException e) {
            throw new MimeTypeException("Failed to parse type registry", e);
        }
    }
}
