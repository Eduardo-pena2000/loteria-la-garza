package org.apache.tika.utils;

import com.applovin.shadow.okio.q;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXTransformerFactory;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.OfflineContentHandler;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class XMLReaderUtils implements Serializable {
    public static final int DEFAULT_MAX_ENTITY_EXPANSIONS = 20;
    public static final int DEFAULT_NUM_REUSES = 100;
    public static final int DEFAULT_POOL_SIZE = 10;
    private static final String JAXP_ENTITY_EXPANSION_LIMIT_KEY = "jdk.xml.entityExpansionLimit";
    private static final String XERCES_SECURITY_MANAGER = "org.apache.xerces.util.SecurityManager";
    private static final String XERCES_SECURITY_MANAGER_PROPERTY = "http://apache.org/xml/properties/security-manager";
    private static final long serialVersionUID = 6110455808615143122L;
    private static final Wb.c LOG = Wb.e.l(XMLReaderUtils.class);
    private static final AtomicBoolean HAS_WARNED_STAX = new AtomicBoolean(false);
    private static final ContentHandler IGNORING_CONTENT_HANDLER = new DefaultHandler();
    private static final DTDHandler IGNORING_DTD_HANDLER = new 1();
    private static final ErrorHandler IGNORING_ERROR_HANDLER = new 2();
    private static final ReentrantReadWriteLock SAX_POOL_LOCK = new ReentrantReadWriteLock();
    private static final ReentrantReadWriteLock DOM_POOL_LOCK = new ReentrantReadWriteLock();
    private static final AtomicInteger POOL_GENERATION = new AtomicInteger();
    private static final EntityResolver IGNORING_SAX_ENTITY_RESOLVER = new l();
    private static final XMLResolver IGNORING_STAX_ENTITY_RESOLVER = new m();
    private static int POOL_SIZE = 10;
    private static int MAX_NUM_REUSES = 100;
    private static long LAST_LOG = -1;
    private static volatile int MAX_ENTITY_EXPANSIONS = determineMaxEntityExpansions();
    private static ArrayBlockingQueue SAX_PARSERS = new ArrayBlockingQueue(POOL_SIZE);
    private static ArrayBlockingQueue DOM_BUILDERS = new ArrayBlockingQueue(POOL_SIZE);

    public class 1 implements DTDHandler {
        public void notationDecl(String str, String str2, String str3) throws SAXException {
        }

        public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
        }
    }

    public class 2 implements ErrorHandler {
        public void error(SAXParseException sAXParseException) throws SAXException {
        }

        public void fatalError(SAXParseException sAXParseException) throws SAXException {
        }

        public void warning(SAXParseException sAXParseException) throws SAXException {
        }
    }

    public static class BuiltInPoolSAXParser extends PoolSAXParser {
        public BuiltInPoolSAXParser(int i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        public void reset() {
            this.saxParser.reset();
            try {
                XMLReaderUtils.d(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    public static class PoolDOMBuilder {
        private final DocumentBuilder documentBuilder;
        int numUses = 0;
        private final int poolGeneration;

        public PoolDOMBuilder(int i, DocumentBuilder documentBuilder) {
            this.poolGeneration = i;
            this.documentBuilder = documentBuilder;
        }

        public DocumentBuilder getDocumentBuilder() {
            return this.documentBuilder;
        }

        public int getPoolGeneration() {
            return this.poolGeneration;
        }

        public void incrementUses() {
            this.numUses = 0;
        }

        public void reset() {
            this.documentBuilder.reset();
            this.documentBuilder.setEntityResolver(XMLReaderUtils.b());
            this.documentBuilder.setErrorHandler((ErrorHandler) null);
        }
    }

    public static abstract class PoolSAXParser {
        int numUses = 0;
        final int poolGeneration;
        final SAXParser saxParser;

        public PoolSAXParser(int i, SAXParser sAXParser) {
            this.poolGeneration = i;
            this.saxParser = sAXParser;
        }

        public int getGeneration() {
            return this.poolGeneration;
        }

        public SAXParser getSAXParser() {
            return this.saxParser;
        }

        public void incrementUses() {
            this.numUses++;
        }

        public abstract void reset();
    }

    public static class UnrecognizedPoolSAXParser extends PoolSAXParser {
        public UnrecognizedPoolSAXParser(int i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        public void reset() {
            try {
                this.saxParser.reset();
            } catch (UnsupportedOperationException unused) {
            }
            try {
                XMLReaderUtils.d(this.saxParser.getXMLReader());
            } catch (SAXException unused2) {
            }
            XMLReaderUtils.e(this.saxParser);
        }
    }

    public static class Xerces2PoolSAXParser extends PoolSAXParser {
        public Xerces2PoolSAXParser(int i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        public void reset() {
            try {
                Object property = this.saxParser.getProperty("http://apache.org/xml/properties/security-manager");
                this.saxParser.reset();
                this.saxParser.setProperty("http://apache.org/xml/properties/security-manager", property);
            } catch (SAXException e) {
                XMLReaderUtils.c().k("problem resetting sax parser", e);
            }
            try {
                XMLReaderUtils.d(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    public static class XercesPoolSAXParser extends PoolSAXParser {
        public XercesPoolSAXParser(int i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        public void reset() {
            try {
                XMLReaderUtils.d(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    static {
        try {
            setPoolSize(POOL_SIZE);
        } catch (TikaException e) {
            throw new RuntimeException("problem initializing SAXParser and DOMBuilder pools", e);
        }
    }

    public static /* synthetic */ InputSource a(String str, String str2) {
        return lambda$static$0(str, str2);
    }

    private static PoolDOMBuilder acquireDOMBuilder() throws TikaException {
        ReentrantReadWriteLock reentrantReadWriteLock = DOM_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            PoolDOMBuilder poolDOMBuilder = (PoolDOMBuilder) DOM_BUILDERS.poll();
            reentrantReadWriteLock.readLock().unlock();
            if (poolDOMBuilder == null) {
                LOG.w("Contention waiting for a DOMBuilder. Consider increasing the XMLReaderUtils.POOL_SIZE");
            }
            return poolDOMBuilder;
        } catch (Throwable th) {
            DOM_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    private static PoolSAXParser acquireSAXParser() throws TikaException {
        ReentrantReadWriteLock reentrantReadWriteLock = SAX_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            PoolSAXParser poolSAXParser = (PoolSAXParser) SAX_PARSERS.poll();
            reentrantReadWriteLock.readLock().unlock();
            if (poolSAXParser == null) {
                LOG.w("Contention waiting for a SAXParser. Consider increasing the XMLReaderUtils.POOL_SIZE");
            }
            return poolSAXParser;
        } catch (Throwable th) {
            SAX_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ EntityResolver b() {
        return IGNORING_SAX_ENTITY_RESOLVER;
    }

    public static Document buildDOM(InputStream inputStream, ParseContext parseContext) throws TikaException, IOException, SAXException {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        PoolDOMBuilder poolDOMBuilder = null;
        if (documentBuilder == null) {
            if (POOL_SIZE == 0) {
                documentBuilder = getDocumentBuilder();
            } else {
                poolDOMBuilder = acquireDOMBuilder();
                documentBuilder = poolDOMBuilder != null ? poolDOMBuilder.getDocumentBuilder() : getDocumentBuilder();
            }
        }
        try {
            return documentBuilder.parse(inputStream);
        } finally {
            releaseDOMBuilder(poolDOMBuilder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.apache.tika.utils.XMLReaderUtils.PoolSAXParser buildPoolParser(int r13, javax.xml.parsers.SAXParser r14) {
        /*
            java.lang.String r0 = "SAX Security Manager could not be setup [log suppressed for 5 minutes]"
            r1 = 0
            r2 = 1
            r14.reset()     // Catch: java.lang.UnsupportedOperationException -> L9
            r3 = r2
            goto La
        L9:
            r3 = r1
        La:
            r4 = 5
            java.lang.String r6 = "org.apache.xerces.util.SecurityManager"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            r7 = 0
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.String r8 = "setEntityExpansionLimit"
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            int r8 = org.apache.tika.utils.XMLReaderUtils.MAX_ENTITY_EXPANSIONS     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            r7.invoke(r6, r8)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            java.lang.String r7 = "http://apache.org/xml/properties/security-manager"
            r14.setProperty(r7, r6)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41 java.lang.ClassNotFoundException -> L60
            r6 = r2
            goto L61
        L3f:
            r6 = move-exception
            goto L44
        L41:
            r13 = move-exception
            goto Lb3
        L44:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = org.apache.tika.utils.XMLReaderUtils.LAST_LOG
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r11 = r11.toMillis(r4)
            long r9 = r9 + r11
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L60
            Wb.c r7 = org.apache.tika.utils.XMLReaderUtils.LOG
            r7.k(r0, r6)
            long r6 = java.lang.System.currentTimeMillis()
            org.apache.tika.utils.XMLReaderUtils.LAST_LOG = r6
        L60:
            r6 = r1
        L61:
            if (r6 != 0) goto L8d
            java.lang.String r7 = "http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit"
            int r8 = org.apache.tika.utils.XMLReaderUtils.MAX_ENTITY_EXPANSIONS     // Catch: org.xml.sax.SAXException -> L70
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: org.xml.sax.SAXException -> L70
            r14.setProperty(r7, r8)     // Catch: org.xml.sax.SAXException -> L70
            r1 = r2
            goto L8d
        L70:
            r2 = move-exception
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = org.apache.tika.utils.XMLReaderUtils.LAST_LOG
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r4 = r11.toMillis(r4)
            long r9 = r9 + r4
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L8d
            Wb.c r4 = org.apache.tika.utils.XMLReaderUtils.LOG
            r4.k(r0, r2)
            long r4 = java.lang.System.currentTimeMillis()
            org.apache.tika.utils.XMLReaderUtils.LAST_LOG = r4
        L8d:
            if (r3 != 0) goto L97
            if (r6 == 0) goto L97
            org.apache.tika.utils.XMLReaderUtils$XercesPoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$XercesPoolSAXParser
            r0.<init>(r13, r14)
            return r0
        L97:
            if (r3 == 0) goto La1
            if (r6 == 0) goto La1
            org.apache.tika.utils.XMLReaderUtils$Xerces2PoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$Xerces2PoolSAXParser
            r0.<init>(r13, r14)
            return r0
        La1:
            if (r3 == 0) goto Lad
            if (r6 != 0) goto Lad
            if (r1 == 0) goto Lad
            org.apache.tika.utils.XMLReaderUtils$BuiltInPoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$BuiltInPoolSAXParser
            r0.<init>(r13, r14)
            return r0
        Lad:
            org.apache.tika.utils.XMLReaderUtils$UnrecognizedPoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$UnrecognizedPoolSAXParser
            r0.<init>(r13, r14)
            return r0
        Lb3:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.utils.XMLReaderUtils.buildPoolParser(int, javax.xml.parsers.SAXParser):org.apache.tika.utils.XMLReaderUtils$PoolSAXParser");
    }

    public static /* bridge */ /* synthetic */ Wb.c c() {
        return LOG;
    }

    private static void clearReader(XMLReader xMLReader) {
        if (xMLReader == null) {
            return;
        }
        xMLReader.setContentHandler(IGNORING_CONTENT_HANDLER);
        xMLReader.setDTDHandler(IGNORING_DTD_HANDLER);
        xMLReader.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
        xMLReader.setErrorHandler(IGNORING_ERROR_HANDLER);
    }

    public static /* bridge */ /* synthetic */ void d(XMLReader xMLReader) {
        clearReader(xMLReader);
    }

    private static int determineMaxEntityExpansions() {
        String property = System.getProperty("jdk.xml.entityExpansionLimit");
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                LOG.g("Couldn't parse an integer for the entity expansion limit: {}; backing off to default: {}", property, 20);
            }
        }
        return 20;
    }

    public static /* bridge */ /* synthetic */ void e(SAXParser sAXParser) {
        trySetXercesSecurityManager(sAXParser);
    }

    public static String getAttrValue(String str, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (str.equals(attributes.getLocalName(i))) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static DocumentBuilder getDocumentBuilder() throws TikaException {
        try {
            DocumentBuilder newDocumentBuilder = getDocumentBuilderFactory().newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
            newDocumentBuilder.setErrorHandler((ErrorHandler) null);
            return newDocumentBuilder;
        } catch (ParserConfigurationException e) {
            throw new TikaException("XML parser not available", e);
        }
    }

    public static DocumentBuilderFactory getDocumentBuilderFactory() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        Wb.c cVar = LOG;
        if (cVar.c()) {
            cVar.t("DocumentBuilderFactory class {}", newInstance.getClass());
        }
        newInstance.setExpandEntityReferences(false);
        newInstance.setNamespaceAware(true);
        newInstance.setValidating(false);
        trySetSAXFeature(newInstance, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        trySetSAXFeature(newInstance, "http://xml.org/sax/features/external-general-entities", false);
        trySetSAXFeature(newInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        trySetSAXFeature(newInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        trySetSAXFeature(newInstance, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        trySetXercesSecurityManager(newInstance);
        return newInstance;
    }

    public static int getMaxEntityExpansions() {
        return MAX_ENTITY_EXPANSIONS;
    }

    public static int getMaxNumReuses() {
        return MAX_NUM_REUSES;
    }

    public static int getPoolSize() {
        return POOL_SIZE;
    }

    public static SAXParser getSAXParser() throws TikaException {
        try {
            SAXParser newSAXParser = getSAXParserFactory().newSAXParser();
            trySetXercesSecurityManager(newSAXParser);
            return newSAXParser;
        } catch (ParserConfigurationException e) {
            throw new TikaException("Unable to configure a SAX parser", e);
        } catch (SAXException e2) {
            throw new TikaException("Unable to create a SAX parser", e2);
        }
    }

    public static SAXParserFactory getSAXParserFactory() {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        Wb.c cVar = LOG;
        if (cVar.c()) {
            cVar.t("SAXParserFactory class {}", newInstance.getClass());
        }
        newInstance.setNamespaceAware(true);
        newInstance.setValidating(false);
        trySetSAXFeature(newInstance, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        trySetSAXFeature(newInstance, "http://xml.org/sax/features/external-general-entities", false);
        trySetSAXFeature(newInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        trySetSAXFeature(newInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        trySetSAXFeature(newInstance, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        return newInstance;
    }

    public static SAXTransformerFactory getSAXTransformerFactory() throws TikaException {
        try {
            SAXTransformerFactory newInstance = TransformerFactory.newInstance();
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            trySetTransformerAttribute(newInstance, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
            trySetTransformerAttribute(newInstance, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
            return newInstance;
        } catch (TransformerFactoryConfigurationError | TransformerConfigurationException e) {
            throw new TikaException("Transformer not available", e);
        }
    }

    public static Transformer getTransformer() throws TikaException {
        try {
            return getTransformerFactory().newTransformer();
        } catch (TransformerConfigurationException e) {
            throw new TikaException("Transformer not available", e);
        }
    }

    public static TransformerFactory getTransformerFactory() throws TikaException {
        try {
            TransformerFactory newInstance = TransformerFactory.newInstance();
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            trySetTransformerAttribute(newInstance, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
            trySetTransformerAttribute(newInstance, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
            return newInstance;
        } catch (TransformerFactoryConfigurationError | TransformerConfigurationException e) {
            throw new TikaException("Transformer not available", e);
        }
    }

    public static XMLInputFactory getXMLInputFactory() {
        XMLInputFactory newFactory = XMLInputFactory.newFactory();
        Wb.c cVar = LOG;
        if (cVar.c()) {
            cVar.t("XMLInputFactory class {}", newFactory.getClass());
        }
        tryToSetStaxProperty(newFactory, "javax.xml.stream.isNamespaceAware", true);
        tryToSetStaxProperty(newFactory, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
        tryToSetStaxProperty(newFactory, "javax.xml.stream.isValidating", false);
        tryToSetStaxProperty(newFactory, "javax.xml.stream.supportDTD", false);
        tryToSetStaxProperty(newFactory, "javax.xml.stream.isSupportingExternalEntities", false);
        newFactory.setXMLResolver(IGNORING_STAX_ENTITY_RESOLVER);
        trySetStaxSecurityManager(newFactory);
        return newFactory;
    }

    public static XMLReader getXMLReader() throws TikaException {
        try {
            XMLReader xMLReader = getSAXParser().getXMLReader();
            xMLReader.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
            return xMLReader;
        } catch (SAXException e) {
            throw new TikaException("Unable to create an XMLReader", e);
        }
    }

    private static /* synthetic */ InputSource lambda$static$0(String str, String str2) throws SAXException, IOException {
        return new InputSource(new StringReader(""));
    }

    private static /* synthetic */ Object lambda$static$1(String str, String str2, String str3, String str4) throws XMLStreamException {
        return k.a();
    }

    public static void parseSAX(InputStream inputStream, ContentHandler contentHandler, ParseContext parseContext) throws TikaException, IOException, SAXException {
        SAXParser sAXParser = (SAXParser) parseContext.get(SAXParser.class);
        PoolSAXParser poolSAXParser = null;
        if (sAXParser == null) {
            if (POOL_SIZE == 0) {
                sAXParser = getSAXParser();
            } else {
                poolSAXParser = acquireSAXParser();
                sAXParser = poolSAXParser != null ? poolSAXParser.getSAXParser() : getSAXParser();
            }
        }
        try {
            sAXParser.parse(inputStream, new OfflineContentHandler(contentHandler));
        } finally {
            releaseParser(poolSAXParser);
        }
    }

    private static void releaseDOMBuilder(PoolDOMBuilder poolDOMBuilder) {
        if (poolDOMBuilder != null && poolDOMBuilder.getPoolGeneration() == POOL_GENERATION.get()) {
            try {
                poolDOMBuilder.reset();
            } catch (UnsupportedOperationException unused) {
            }
            ReentrantReadWriteLock reentrantReadWriteLock = DOM_POOL_LOCK;
            reentrantReadWriteLock.readLock().lock();
            poolDOMBuilder.incrementUses();
            if (poolDOMBuilder.numUses >= MAX_NUM_REUSES) {
                try {
                    poolDOMBuilder = new PoolDOMBuilder(poolDOMBuilder.getPoolGeneration(), getDocumentBuilderFactory().newDocumentBuilder());
                } catch (ParserConfigurationException e) {
                    LOG.k("Exception trying to configure a new dom builder?!", e);
                    return;
                }
            }
            try {
                if (!DOM_BUILDERS.offer(poolDOMBuilder)) {
                    LOG.w("DocumentBuilder not taken back into pool.  If you haven't resized the pool, this could be a sign that there are more calls to 'acquire' than to 'release'");
                }
                reentrantReadWriteLock.readLock().unlock();
            } catch (Throwable th) {
                DOM_POOL_LOCK.readLock().unlock();
                throw th;
            }
        }
    }

    private static void releaseParser(PoolSAXParser poolSAXParser) {
        if (poolSAXParser == null) {
            return;
        }
        try {
            poolSAXParser.reset();
        } catch (UnsupportedOperationException unused) {
        }
        if (poolSAXParser.getGeneration() != POOL_GENERATION.get()) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = SAX_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            poolSAXParser.incrementUses();
            if (poolSAXParser.numUses >= MAX_NUM_REUSES) {
                try {
                    poolSAXParser = buildPoolParser(poolSAXParser.getGeneration(), getSAXParserFactory().newSAXParser());
                } catch (ParserConfigurationException | SAXException e) {
                    LOG.k("Couldn't build new SAXParser after hitting max reuses", e);
                    return;
                }
            }
            if (!SAX_PARSERS.offer(poolSAXParser)) {
                LOG.w("SAXParser not taken back into pool.  If you haven't resized the pool this could be a sign that there are more calls to 'acquire' than to 'release'");
            }
            reentrantReadWriteLock.readLock().unlock();
        } finally {
            SAX_POOL_LOCK.readLock().unlock();
        }
    }

    public static void setMaxEntityExpansions(int i) {
        MAX_ENTITY_EXPANSIONS = i;
    }

    public static void setMaxNumReuses(int i) {
        MAX_NUM_REUSES = i;
    }

    public static void setPoolSize(int i) throws TikaException {
        if (i < 0) {
            throw new IllegalArgumentException("PoolSize must be >= 0");
        }
        SAX_POOL_LOCK.writeLock().lock();
        try {
            Iterator it = SAX_PARSERS.iterator();
            while (it.hasNext()) {
                ((PoolSAXParser) it.next()).reset();
            }
            SAX_PARSERS.clear();
            if (i > 0) {
                SAX_PARSERS = new ArrayBlockingQueue(i);
                int incrementAndGet = POOL_GENERATION.incrementAndGet();
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        SAX_PARSERS.offer(buildPoolParser(incrementAndGet, getSAXParserFactory().newSAXParser()));
                    } catch (SAXException | ParserConfigurationException e) {
                        throw new TikaException("problem creating sax parser", e);
                    }
                }
            }
            SAX_POOL_LOCK.writeLock().unlock();
            DOM_POOL_LOCK.writeLock().lock();
            try {
                DOM_BUILDERS.clear();
                if (i > 0) {
                    DOM_BUILDERS = new ArrayBlockingQueue(i);
                    for (int i3 = 0; i3 < i; i3++) {
                        DOM_BUILDERS.offer(new PoolDOMBuilder(POOL_GENERATION.get(), getDocumentBuilder()));
                    }
                }
                DOM_POOL_LOCK.writeLock().unlock();
                POOL_SIZE = i;
            } catch (Throwable th) {
                DOM_POOL_LOCK.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            SAX_POOL_LOCK.writeLock().unlock();
            throw th2;
        }
    }

    private static void trySetSAXFeature(SAXParserFactory sAXParserFactory, String str, boolean z) {
        try {
            sAXParserFactory.setFeature(str, z);
        } catch (AbstractMethodError e) {
            LOG.g("Cannot set SAX feature because outdated XML parser in classpath: {}", str, e);
        } catch (Exception e2) {
            LOG.g("SAX Feature unsupported: {}", str, e2);
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    private static void trySetStaxSecurityManager(XMLInputFactory xMLInputFactory) {
        try {
            try {
                xMLInputFactory.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (IllegalArgumentException unused) {
                xMLInputFactory.setProperty("com.ctc.wstx.maxEntityCount", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            }
        } catch (IllegalArgumentException unused2) {
            if (HAS_WARNED_STAX.getAndSet(true)) {
                return;
            }
            LOG.w("Could not set limit on maximum entity expansions for: " + String.valueOf(xMLInputFactory.getClass()));
        }
    }

    private static void trySetTransformerAttribute(TransformerFactory transformerFactory, String str, String str2) {
        try {
            transformerFactory.setAttribute(str, str2);
        } catch (AbstractMethodError e) {
            LOG.g("Cannot set Transformer attribute because outdated XML parser in classpath: {}", str, e);
        } catch (Exception e2) {
            LOG.g("Transformer Attribute unsupported: {}", str, e2);
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    private static void trySetXercesSecurityManager(DocumentBuilderFactory documentBuilderFactory) {
        try {
            Object newInstance = Class.forName(new String[]{"org.apache.xerces.util.SecurityManager"}[0]).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            newInstance.getClass().getMethod("setEntityExpansionLimit", new Class[]{Integer.TYPE}).invoke(newInstance, new Object[]{Integer.valueOf(MAX_ENTITY_EXPANSIONS)});
            documentBuilderFactory.setAttribute("http://apache.org/xml/properties/security-manager", newInstance);
        } catch (ClassNotFoundException unused) {
            try {
                documentBuilderFactory.setAttribute("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (IllegalArgumentException e) {
                if (System.currentTimeMillis() > LAST_LOG + TimeUnit.MINUTES.toMillis(5L)) {
                    LOG.k("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            if (System.currentTimeMillis() > LAST_LOG + TimeUnit.MINUTES.toMillis(5L)) {
                LOG.k("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            documentBuilderFactory.setAttribute("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
        }
    }

    private static void tryToSetStaxProperty(XMLInputFactory xMLInputFactory, String str, boolean z) {
        try {
            xMLInputFactory.setProperty(str, Boolean.valueOf(z));
        } catch (IllegalArgumentException e) {
            LOG.g("StAX Feature unsupported: {}", str, e);
        }
    }

    private static void tryToSetStaxProperty(XMLInputFactory xMLInputFactory, String str, String str2) {
        try {
            xMLInputFactory.setProperty(str, str2);
        } catch (IllegalArgumentException e) {
            LOG.g("StAX Feature unsupported: {}", str, e);
        }
    }

    public static Transformer getTransformer(ParseContext parseContext) throws TikaException {
        Transformer transformer = (Transformer) parseContext.get(Transformer.class);
        return transformer != null ? transformer : getTransformer();
    }

    private static void trySetSAXFeature(DocumentBuilderFactory documentBuilderFactory, String str, boolean z) {
        try {
            documentBuilderFactory.setFeature(str, z);
        } catch (Exception e) {
            LOG.g("SAX Feature unsupported: {}", str, e);
        } catch (AbstractMethodError e2) {
            LOG.g("Cannot set SAX feature because outdated XML parser in classpath: {}", str, e2);
        }
    }

    public static DocumentBuilder getDocumentBuilder(ParseContext parseContext) throws TikaException {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        return documentBuilder != null ? documentBuilder : getDocumentBuilder();
    }

    public static Document buildDOM(Reader reader, ParseContext parseContext) throws TikaException, IOException, SAXException {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        PoolDOMBuilder poolDOMBuilder = null;
        if (documentBuilder == null) {
            if (POOL_SIZE == 0) {
                documentBuilder = getDocumentBuilder();
            } else {
                poolDOMBuilder = acquireDOMBuilder();
                if (poolDOMBuilder != null) {
                    documentBuilder = poolDOMBuilder.getDocumentBuilder();
                } else {
                    documentBuilder = getDocumentBuilder();
                }
            }
        }
        try {
            return documentBuilder.parse(new InputSource(reader));
        } finally {
            releaseDOMBuilder(poolDOMBuilder);
        }
    }

    public static void parseSAX(Reader reader, ContentHandler contentHandler, ParseContext parseContext) throws TikaException, IOException, SAXException {
        SAXParser sAXParser = (SAXParser) parseContext.get(SAXParser.class);
        PoolSAXParser poolSAXParser = null;
        if (sAXParser == null) {
            if (POOL_SIZE == 0) {
                sAXParser = getSAXParser();
            } else {
                poolSAXParser = acquireSAXParser();
                if (poolSAXParser != null) {
                    sAXParser = poolSAXParser.getSAXParser();
                } else {
                    sAXParser = getSAXParser();
                }
            }
        }
        try {
            sAXParser.parse(new InputSource(reader), new OfflineContentHandler(contentHandler));
        } finally {
            releaseParser(poolSAXParser);
        }
    }

    public static XMLInputFactory getXMLInputFactory(ParseContext parseContext) {
        XMLInputFactory xMLInputFactory = (XMLInputFactory) parseContext.get(XMLInputFactory.class);
        return xMLInputFactory != null ? xMLInputFactory : getXMLInputFactory();
    }

    private static void trySetXercesSecurityManager(SAXParser sAXParser) {
        try {
            Object newInstance = Class.forName(new String[]{"org.apache.xerces.util.SecurityManager"}[0]).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            newInstance.getClass().getMethod("setEntityExpansionLimit", new Class[]{Integer.TYPE}).invoke(newInstance, new Object[]{Integer.valueOf(MAX_ENTITY_EXPANSIONS)});
            sAXParser.setProperty("http://apache.org/xml/properties/security-manager", newInstance);
        } catch (ClassNotFoundException unused) {
            try {
                sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (SAXException e) {
                if (System.currentTimeMillis() > LAST_LOG + TimeUnit.MINUTES.toMillis(5L)) {
                    LOG.k("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            if (System.currentTimeMillis() > LAST_LOG + TimeUnit.MINUTES.toMillis(5L)) {
                LOG.k("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
        }
    }

    public static Document buildDOM(Path path) throws TikaException, IOException, SAXException {
        InputStream a = q.a(path, new OpenOption[0]);
        try {
            Document buildDOM = buildDOM(a);
            if (a != null) {
                a.close();
            }
            return buildDOM;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Document buildDOM(String str) throws TikaException, IOException, SAXException {
        PoolDOMBuilder acquireDOMBuilder;
        DocumentBuilder documentBuilder;
        if (POOL_SIZE == 0) {
            documentBuilder = getDocumentBuilder();
            acquireDOMBuilder = null;
        } else {
            acquireDOMBuilder = acquireDOMBuilder();
            if (acquireDOMBuilder != null) {
                documentBuilder = acquireDOMBuilder.getDocumentBuilder();
            } else {
                documentBuilder = getDocumentBuilder();
            }
        }
        try {
            return documentBuilder.parse(str);
        } finally {
            releaseDOMBuilder(acquireDOMBuilder);
        }
    }

    public static Document buildDOM(InputStream inputStream) throws TikaException, IOException, SAXException {
        PoolDOMBuilder acquireDOMBuilder;
        DocumentBuilder documentBuilder;
        if (POOL_SIZE == 0) {
            documentBuilder = getDocumentBuilder();
            acquireDOMBuilder = null;
        } else {
            acquireDOMBuilder = acquireDOMBuilder();
            if (acquireDOMBuilder != null) {
                documentBuilder = acquireDOMBuilder.getDocumentBuilder();
            } else {
                documentBuilder = getDocumentBuilder();
            }
        }
        try {
            return documentBuilder.parse(inputStream);
        } finally {
            releaseDOMBuilder(acquireDOMBuilder);
        }
    }
}
