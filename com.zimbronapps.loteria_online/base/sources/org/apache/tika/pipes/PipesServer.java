package org.apache.tika.pipes;

import Db.h;
import Wb.e;
import com.applovin.shadow.okio.F;
import com.applovin.shadow.okio.q;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.BasicEmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.DocumentSelector;
import org.apache.tika.extractor.EmbeddedDocumentByteStoreExtractorFactory;
import org.apache.tika.extractor.EmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.extractor.RUnpackExtractor;
import org.apache.tika.extractor.RUnpackExtractorFactory;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.extractor.EmittingEmbeddedDocumentBytesHandler;
import org.apache.tika.pipes.fetcher.Fetcher;
import org.apache.tika.pipes.fetcher.FetcherManager;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.SAXException;
import zb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PipesServer implements Runnable {
    private static final Wb.c LOG = e.l(PipesServer.class);
    public static final int TIMEOUT_EXIT_CODE = 17;
    private Parser autoDetectParser;
    private Detector detector;
    private DigestingParser.Digester digester;
    private EmitterManager emitterManager;
    private FetcherManager fetcherManager;
    private final DataInputStream input;
    private final long maxForEmitBatchBytes;
    private final DataOutputStream output;
    private Parser rMetaParser;
    private final long serverParseTimeoutMillis;
    private final long serverWaitTimeoutMillis;
    private TikaConfig tikaConfig;
    private final Path tikaConfigPath;
    private final Object[] lock = new Object[0];
    private long checkForTimeoutMs = 1000;
    private volatile boolean parsing = false;
    private volatile long since = System.currentTimeMillis();

    public class 1 implements DocumentSelector {
        int embedded = 0;
        final int maxEmbedded;
        final /* synthetic */ HandlerConfig val$handlerConfig;

        public 1(HandlerConfig handlerConfig) {
            this.val$handlerConfig = handlerConfig;
            this.maxEmbedded = handlerConfig.maxEmbeddedResources;
        }

        public boolean select(Metadata metadata) {
            int i = this.maxEmbedded;
            if (i < 0) {
                return true;
            }
            int i2 = this.embedded;
            this.embedded = i2 + 1;
            return i2 < i;
        }
    }

    public static class MetadataListAndEmbeddedBytes {
        final Optional embeddedDocumentBytesHandler;
        List metadataList;

        public MetadataListAndEmbeddedBytes(List list, EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler) {
            this.metadataList = list;
            this.embeddedDocumentBytesHandler = Optional.ofNullable(embeddedDocumentBytesHandler);
        }

        public void filter(MetadataListFilter metadataListFilter) throws TikaException {
            this.metadataList = metadataListFilter.filter(this.metadataList);
        }

        public EmbeddedDocumentBytesHandler getEmbeddedDocumentBytesHandler() {
            return (EmbeddedDocumentBytesHandler) this.embeddedDocumentBytesHandler.get();
        }

        public List getMetadataList() {
            return this.metadataList;
        }

        public boolean hasEmbeddedDocumentByteStore() {
            return this.embeddedDocumentBytesHandler.isPresent();
        }

        public boolean toBePackagedForStreamEmitter() {
            return !(this.embeddedDocumentBytesHandler.get() instanceof EmittingEmbeddedDocumentBytesHandler);
        }
    }

    public enum STATUS {
        READY,
        CALL,
        PING,
        FAILED_TO_START,
        FETCHER_NOT_FOUND,
        EMITTER_NOT_FOUND,
        FETCHER_INITIALIZATION_EXCEPTION,
        FETCH_EXCEPTION,
        PARSE_SUCCESS,
        PARSE_EXCEPTION_NO_EMIT,
        EMIT_SUCCESS,
        EMIT_SUCCESS_PARSE_EXCEPTION,
        EMIT_EXCEPTION,
        OOM,
        TIMEOUT,
        EMPTY_OUTPUT,
        INTERMEDIATE_RESULT;

        public static STATUS lookup(int i) {
            int i2 = i - 1;
            if (i2 < 0) {
                throw new IllegalArgumentException("byte must be > 0");
            }
            STATUS[] values = values();
            if (i2 < values.length) {
                return values[i2];
            }
            throw new IllegalArgumentException("byte with index " + i2 + " must be < " + values.length);
        }

        public byte getByte() {
            return (byte) (ordinal() + 1);
        }
    }

    public PipesServer(Path path, InputStream inputStream, PrintStream printStream, long j, long j2, long j3) throws IOException, TikaException, SAXException {
        this.tikaConfigPath = path;
        this.input = new DataInputStream(inputStream);
        this.output = new DataOutputStream(printStream);
        this.maxForEmitBatchBytes = j;
        this.serverParseTimeoutMillis = j2;
        this.serverWaitTimeoutMillis = j3;
    }

    private void _preParse(FetchEmitTuple fetchEmitTuple, TikaInputStream tikaInputStream, Metadata metadata, ParseContext parseContext) {
        DigestingParser.Digester digester = this.digester;
        if (digester != null) {
            try {
                digester.digest(tikaInputStream, metadata, parseContext);
            } catch (IOException e) {
                LOG.k("problem digesting: " + fetchEmitTuple.getId(), e);
            }
        }
        try {
            MediaType detect = this.detector.detect(tikaInputStream, metadata);
            metadata.set("Content-Type", detect.toString());
            metadata.set(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE, detect.toString());
        } catch (IOException e2) {
            LOG.k("problem detecting: " + fetchEmitTuple.getId(), e2);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null || !embeddedDocumentBytesConfig.isIncludeOriginal()) {
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class);
        try {
            InputStream a = q.a(tikaInputStream.getPath(), new OpenOption[0]);
            try {
                embeddedDocumentBytesHandler.add(0, metadata, a);
                if (a != null) {
                    a.close();
                }
            } finally {
            }
        } catch (IOException e3) {
            LOG.k("problem reading source file into embedded document byte store", e3);
        }
    }

    private void actuallyParse(FetchEmitTuple fetchEmitTuple) {
        MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes;
        long currentTimeMillis = System.currentTimeMillis();
        Fetcher fetcher = getFetcher(fetchEmitTuple);
        if (fetcher == null) {
            return;
        }
        Wb.c cVar = LOG;
        if (cVar.h()) {
            cVar.q("timer -- got fetcher: {}ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            metadataListAndEmbeddedBytes = parseFromTuple(fetchEmitTuple, fetcher);
            try {
                if (cVar.h()) {
                    cVar.q("timer -- to parse: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                }
                if (metadataListAndEmbeddedBytes != null && !metadataIsEmpty(metadataListAndEmbeddedBytes.getMetadataList())) {
                    emitParseData(fetchEmitTuple, metadataListAndEmbeddedBytes);
                    if (!metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() || metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() == null) {
                        return;
                    }
                    try {
                        metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                        return;
                    } catch (IOException e) {
                        LOG.k("problem closing embedded document byte store", e);
                        return;
                    }
                }
                write(STATUS.EMPTY_OUTPUT);
                if (metadataListAndEmbeddedBytes == null || !metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() || metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() == null) {
                    return;
                }
                try {
                    metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                } catch (IOException e2) {
                    LOG.k("problem closing embedded document byte store", e2);
                }
            } catch (Throwable th) {
                th = th;
                if (metadataListAndEmbeddedBytes != null && metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() && metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() != null) {
                    try {
                        metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                    } catch (IOException e3) {
                        LOG.k("problem closing embedded document byte store", e3);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            metadataListAndEmbeddedBytes = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001a A[Catch: TikaEmitterException -> 0x0016, IOException -> 0x0018, TRY_LEAVE, TryCatch #3 {IOException -> 0x0018, TikaEmitterException -> 0x0016, blocks: (B:20:0x000c, B:22:0x0012, B:4:0x001a), top: B:19:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emit(java.lang.String r3, org.apache.tika.pipes.emitter.EmitKey r4, boolean r5, org.apache.tika.pipes.PipesServer.MetadataListAndEmbeddedBytes r6, java.lang.String r7, org.apache.tika.parser.ParseContext r8) {
        /*
            r2 = this;
            org.apache.tika.pipes.emitter.EmitterManager r0 = r2.emitterManager     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.String r1 = r4.getEmitterName()     // Catch: java.lang.IllegalArgumentException -> L54
            org.apache.tika.pipes.emitter.Emitter r3 = r0.getEmitter(r1)     // Catch: java.lang.IllegalArgumentException -> L54
            if (r5 == 0) goto L1a
            boolean r5 = r6.toBePackagedForStreamEmitter()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            if (r5 == 0) goto L1a
            r2.emitContentsAndBytes(r3, r4, r6)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            goto L25
        L16:
            r3 = move-exception
            goto L3d
        L18:
            r3 = move-exception
            goto L3d
        L1a:
            java.lang.String r4 = r4.getEmitKey()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            java.util.List r5 = r6.getMetadataList()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            r3.emit(r4, r5, r8)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
        L25:
            boolean r3 = org.apache.tika.utils.StringUtils.isBlank(r7)
            if (r3 == 0) goto L31
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS
            r2.write(r3)
            goto L3c
        L31:
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r7.getBytes(r4)
            r2.write(r3, r4)
        L3c:
            return
        L3d:
            Wb.c r4 = org.apache.tika.pipes.PipesServer.LOG
            java.lang.String r5 = "emit exception"
            r4.k(r5, r3)
            java.lang.String r3 = org.apache.tika.utils.ExceptionUtils.getStackTrace(r3)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_EXCEPTION
            r2.write(r4, r3)
            return
        L54:
            java.lang.String r3 = r2.getNoEmitterMsg(r3)
            Wb.c r4 = org.apache.tika.pipes.PipesServer.LOG
            r4.w(r3)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMITTER_NOT_FOUND
            r2.write(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.emit(java.lang.String, org.apache.tika.pipes.emitter.EmitKey, boolean, org.apache.tika.pipes.PipesServer$MetadataListAndEmbeddedBytes, java.lang.String, org.apache.tika.parser.ParseContext):void");
    }

    private void emitContentsAndBytes(Emitter emitter, EmitKey emitKey, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        if (emitter instanceof StreamEmitter) {
            throw new UnsupportedOperationException("this is not yet implemented");
        }
        throw new IllegalArgumentException("The emitter for embedded document byte store must be a StreamEmitter. I see: " + String.valueOf(emitter.getClass()));
    }

    private void emitParseData(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        EmitKey emitKey;
        long currentTimeMillis = System.currentTimeMillis();
        String containerStacktrace = getContainerStacktrace(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadata(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadataList(fetchEmitTuple, metadataListAndEmbeddedBytes);
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = fetchEmitTuple.getOnParseException();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (!StringUtils.isBlank(containerStacktrace) && onParseException != FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT) {
            write(STATUS.PARSE_EXCEPTION_NO_EMIT, containerStacktrace);
            return;
        }
        injectUserMetadata(fetchEmitTuple.getMetadata(), metadataListAndEmbeddedBytes.getMetadataList());
        EmitKey emitKey2 = fetchEmitTuple.getEmitKey();
        if (StringUtils.isBlank(emitKey2.getEmitKey())) {
            EmitKey emitKey3 = new EmitKey(emitKey2.getEmitterName(), fetchEmitTuple.getFetchKey().getFetchKey());
            fetchEmitTuple.setEmitKey(emitKey3);
            emitKey = emitKey3;
        } else {
            emitKey = emitKey2;
        }
        EmitData emitData = new EmitData(fetchEmitTuple.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), containerStacktrace);
        if (embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes() && metadataListAndEmbeddedBytes.toBePackagedForStreamEmitter()) {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        } else if (this.maxForEmitBatchBytes < 0 || emitData.getEstimatedSizeBytes() < this.maxForEmitBatchBytes) {
            write(emitData);
        } else {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        }
        Wb.c cVar = LOG;
        if (cVar.h()) {
            cVar.q("timer -- emitted: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private void exit(int i) {
        if (i != 0) {
            LOG.u("exiting: {}", Integer.valueOf(i));
        } else {
            LOG.o("exiting: {}", Integer.valueOf(i));
        }
        System.exit(i);
    }

    private void filterMetadata(FetchEmitTuple fetchEmitTuple, List list) {
        MetadataFilter metadataFilter = (MetadataFilter) fetchEmitTuple.getParseContext().get(MetadataFilter.class);
        if (metadataFilter == null) {
            metadataFilter = this.tikaConfig.getMetadataFilter();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                metadataFilter.filter((Metadata) it.next());
            } catch (TikaException e) {
                LOG.k("failed to filter metadata", e);
            }
        }
    }

    private void filterMetadataList(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        MetadataListFilter metadataListFilter = (MetadataListFilter) fetchEmitTuple.getParseContext().get(MetadataListFilter.class);
        if (metadataListFilter == null) {
            metadataListFilter = this.tikaConfig.getMetadataListFilter();
        }
        if (metadataListFilter instanceof NoOpListFilter) {
            return;
        }
        try {
            metadataListAndEmbeddedBytes.filter(metadataListFilter);
        } catch (TikaException e) {
            LOG.k("failed to filter metadata list", e);
        }
    }

    private String getContainerStacktrace(FetchEmitTuple fetchEmitTuple, List list) {
        String str;
        return (metadataIsEmpty(list) || (str = ((Metadata) list.get(0)).get(TikaCoreProperties.CONTAINER_EXCEPTION)) == null) ? "" : str;
    }

    private Fetcher getFetcher(FetchEmitTuple fetchEmitTuple) {
        try {
            return this.fetcherManager.getFetcher(fetchEmitTuple.getFetchKey().getFetcherName());
        } catch (IllegalArgumentException unused) {
            String noFetcherMsg = getNoFetcherMsg(fetchEmitTuple.getFetchKey().getFetcherName());
            LOG.w(noFetcherMsg);
            write(STATUS.FETCHER_NOT_FOUND, noFetcherMsg);
            return null;
        } catch (TikaException e) {
            e = e;
            LOG.k("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (IOException e2) {
            e = e2;
            LOG.k("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    private String getNoEmitterMsg(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Emitter '");
        sb.append(str);
        sb.append("'");
        sb.append(" not found.");
        sb.append("\nThe configured emitterManager supports:");
        int i = 0;
        for (String str2 : this.emitterManager.getSupported()) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str2);
            i = i2;
        }
        return sb.toString();
    }

    private String getNoFetcherMsg(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fetcher '");
        sb.append(str);
        sb.append("'");
        sb.append(" not found.");
        sb.append("\nThe configured FetcherManager supports:");
        int i = 0;
        for (String str2 : this.fetcherManager.getSupported()) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str2);
            i = i2;
        }
        return sb.toString();
    }

    private void handleOOM(String str, OutOfMemoryError outOfMemoryError) {
        write(STATUS.OOM);
        LOG.error("oom: " + str, outOfMemoryError);
        exit(1);
    }

    private void injectUserMetadata(Metadata metadata, List list) {
        for (String str : metadata.names()) {
            ((Metadata) list.get(0)).set(str, (String) null);
            for (String str2 : metadata.getValues(str)) {
                ((Metadata) list.get(0)).add(str, str2);
            }
        }
    }

    public static void main(String[] strArr) throws Exception {
        try {
            PipesServer pipesServer = new PipesServer(F.a(strArr[0], new String[0]), System.in, System.out, Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), Long.parseLong(strArr[3]));
            System.setIn(h.a().q(new byte[0]).p());
            System.setOut(System.err);
            Thread thread = new Thread(pipesServer, "Tika Watchdog");
            thread.setDaemon(true);
            thread.start();
            pipesServer.processRequests();
        } finally {
            LOG.info("server shutting down");
        }
    }

    private boolean metadataIsEmpty(List list) {
        return list == null || list.size() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[PHI: r11
      0x008d: PHI (r11v4 Wb.c) = (r11v1 Wb.c), (r11v2 Wb.c), (r11v5 Wb.c) binds: [B:43:0x00e8, B:36:0x011d, B:25:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List parseConcatenated(org.apache.tika.pipes.FetchEmitTuple r7, org.apache.tika.pipes.HandlerConfig r8, java.io.InputStream r9, org.apache.tika.metadata.Metadata r10, org.apache.tika.parser.ParseContext r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseConcatenated(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private void parseOne() {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        FetchEmitTuple fetchEmitTuple = null;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                fetchEmitTuple = readFetchEmitTuple();
                Wb.c cVar = LOG;
                if (cVar.h()) {
                    cVar.q("timer -- read fetchEmitTuple: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                actuallyParse(fetchEmitTuple);
                if (cVar.h()) {
                    cVar.q("timer -- actually parsed: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                }
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            } catch (OutOfMemoryError e) {
                handleOOM(fetchEmitTuple.getId(), e);
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[PHI: r9
      0x0069: PHI (r9v3 Wb.c) = (r9v1 Wb.c), (r9v2 Wb.c), (r9v4 Wb.c) binds: [B:31:0x0067, B:27:0x00af, B:22:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List parseRecursive(org.apache.tika.pipes.FetchEmitTuple r7, org.apache.tika.pipes.HandlerConfig r8, java.io.InputStream r9, org.apache.tika.metadata.Metadata r10, org.apache.tika.parser.ParseContext r11) {
        /*
            r6 = this;
            java.lang.String r0 = "timer -- parse only time: {} ms"
            org.apache.tika.sax.RecursiveParserWrapperHandler r1 = new org.apache.tika.sax.RecursiveParserWrapperHandler
            org.apache.tika.sax.BasicContentHandlerFactory r2 = new org.apache.tika.sax.BasicContentHandlerFactory
            org.apache.tika.sax.BasicContentHandlerFactory$HANDLER_TYPE r3 = r8.getType()
            int r4 = r8.getWriteLimit()
            boolean r5 = r8.isThrowOnWriteLimitReached()
            r2.<init>(r3, r4, r5, r11)
            int r8 = r8.getMaxEmbeddedResources()
            r1.<init>(r2, r8)
            long r2 = java.lang.System.currentTimeMillis()
            r6.preParse(r7, r9, r10, r11)
            org.apache.tika.parser.Parser r8 = r6.rMetaParser     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41 java.lang.SecurityException -> L43 org.apache.tika.exception.EncryptedDocumentException -> L45 org.xml.sax.SAXException -> L47
            r8.parse(r9, r1, r10, r11)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41 java.lang.SecurityException -> L43 org.apache.tika.exception.EncryptedDocumentException -> L45 org.xml.sax.SAXException -> L47
            Wb.c r7 = org.apache.tika.pipes.PipesServer.LOG
            boolean r8 = r7.h()
            if (r8 == 0) goto Ld3
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r2
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.q(r0, r8)
            goto Ld3
        L3e:
            r7 = move-exception
            goto Ld8
        L41:
            r8 = move-exception
            goto L49
        L43:
            r8 = move-exception
            goto L76
        L45:
            r8 = move-exception
            goto L91
        L47:
            r8 = move-exception
            goto Lb2
        L49:
            Wb.c r9 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.getId()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r10.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "parse exception: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L3e
            r10.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L3e
            r9.k(r7, r8)     // Catch: java.lang.Throwable -> L3e
            boolean r7 = r9.h()
            if (r7 == 0) goto Ld3
        L69:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r9.q(r0, r7)
            goto Ld3
        L76:
            Wb.c r9 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.getId()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r10.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "security exception:"
            r10.append(r11)     // Catch: java.lang.Throwable -> L3e
            r10.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L3e
            r9.k(r7, r8)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L91:
            Wb.c r9 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.getId()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r10.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "encrypted document:"
            r10.append(r11)     // Catch: java.lang.Throwable -> L3e
            r10.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L3e
            r9.k(r7, r8)     // Catch: java.lang.Throwable -> L3e
            boolean r7 = r9.h()
            if (r7 == 0) goto Ld3
            goto L69
        Lb2:
            Wb.c r9 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.getId()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r10.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "sax problem:"
            r10.append(r11)     // Catch: java.lang.Throwable -> L3e
            r10.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L3e
            r9.k(r7, r8)     // Catch: java.lang.Throwable -> L3e
            boolean r7 = r9.h()
            if (r7 == 0) goto Ld3
            goto L69
        Ld3:
            java.util.List r7 = r1.getMetadataList()
            return r7
        Ld8:
            Wb.c r8 = org.apache.tika.pipes.PipesServer.LOG
            boolean r9 = r8.h()
            if (r9 == 0) goto Lec
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r2
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8.q(r0, r9)
        Lec:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseRecursive(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private MetadataListAndEmbeddedBytes parseWithStream(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata) throws TikaConfigException {
        ParseContext parseContext = setupParseContext(fetchEmitTuple);
        HandlerConfig handlerConfig = (HandlerConfig) parseContext.get(HandlerConfig.class);
        return new MetadataListAndEmbeddedBytes(handlerConfig.getParseMode() == HandlerConfig.PARSE_MODE.RMETA ? parseRecursive(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext) : parseConcatenated(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext), (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class));
    }

    private void preParse(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        try {
            TikaInputStream cast = TikaInputStream.cast(inputStream);
            if (cast == null) {
                cast = TikaInputStream.get(inputStream, (TemporaryResources) null, metadata);
            }
            _preParse(fetchEmitTuple, cast, metadata, parseContext);
            g.i(null);
            writeIntermediate(fetchEmitTuple.getEmitKey(), metadata);
        } catch (Throwable th) {
            g.i(null);
            throw th;
        }
    }

    private FetchEmitTuple readFetchEmitTuple() {
        try {
            byte[] bArr = new byte[this.input.readInt()];
            this.input.readFully(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(h.a().q(bArr).p());
            try {
                FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) objectInputStream.readObject();
                objectInputStream.close();
                return fetchEmitTuple;
            } finally {
            }
        } catch (ClassNotFoundException e) {
            LOG.error("can't find class?!", e);
            exit(1);
            return null;
        } catch (IOException e2) {
            LOG.error("problem reading tuple", e2);
            exit(1);
            return null;
        }
    }

    private ParseContext setupParseContext(FetchEmitTuple fetchEmitTuple) throws TikaConfigException {
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        if (parseContext.get(HandlerConfig.class) == null) {
            parseContext.set(HandlerConfig.class, HandlerConfig.DEFAULT_HANDLER_CONFIG);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null) {
            parseContext.set(EmbeddedDocumentBytesConfig.class, EmbeddedDocumentBytesConfig.SKIP);
            return parseContext;
        }
        EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory();
        if (embeddedDocumentExtractorFactory == null) {
            parseContext.set(EmbeddedDocumentExtractor.class, new RUnpackExtractor(parseContext, RUnpackExtractorFactory.DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION));
        } else if (!(embeddedDocumentExtractorFactory instanceof EmbeddedDocumentByteStoreExtractorFactory)) {
            throw new TikaConfigException("EmbeddedDocumentExtractorFactory must be an instance of EmbeddedDocumentByteStoreExtractorFactory if you wantto extract embedded bytes! I see this embedded doc factory: " + String.valueOf(embeddedDocumentExtractorFactory.getClass()) + "and a request: " + String.valueOf(embeddedDocumentBytesConfig));
        }
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitter())) {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new BasicEmbeddedDocumentBytesHandler(embeddedDocumentBytesConfig));
        } else {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new EmittingEmbeddedDocumentBytesHandler(fetchEmitTuple, this.emitterManager));
        }
        return parseContext;
    }

    private void write(EmitData emitData) {
        try {
            Eb.e l = Eb.e.k().l();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(l);
            try {
                objectOutputStream.writeObject(emitData);
                objectOutputStream.close();
                write(STATUS.PARSE_SUCCESS, l.b());
            } finally {
            }
        } catch (IOException e) {
            LOG.error("problem writing emit data (forking process shutdown?)", e);
            exit(1);
        }
    }

    private void writeIntermediate(EmitKey emitKey, Metadata metadata) {
        try {
            Eb.e l = Eb.e.k().l();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(l);
            try {
                objectOutputStream.writeObject(metadata);
                objectOutputStream.close();
                write(STATUS.INTERMEDIATE_RESULT, l.b());
            } finally {
            }
        } catch (IOException e) {
            LOG.error("problem writing intermediate data (forking process shutdown?)", e);
            exit(1);
        }
    }

    public void initializeResources() throws TikaException, IOException, SAXException {
        this.tikaConfig = new TikaConfig(this.tikaConfigPath);
        this.fetcherManager = FetcherManager.load(this.tikaConfigPath);
        if (this.maxForEmitBatchBytes > -1) {
            this.emitterManager = EmitterManager.load(this.tikaConfigPath);
        } else {
            LOG.debug("'maxForEmitBatchBytes' < 0. Not initializing emitters in PipesServer");
            this.emitterManager = null;
        }
        AutoDetectParser autoDetectParser = new AutoDetectParser(this.tikaConfig);
        this.autoDetectParser = autoDetectParser;
        if (autoDetectParser.getAutoDetectParserConfig().getDigesterFactory() != null) {
            this.digester = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().build();
            ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().setSkipContainerDocument(true);
            if (((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory() == null) {
                ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().setEmbeddedDocumentExtractorFactory(new RUnpackExtractorFactory());
            }
        }
        this.detector = ((AutoDetectParser) this.autoDetectParser).getDetector();
        this.rMetaParser = new RecursiveParserWrapper(this.autoDetectParser);
    }

    public MetadataListAndEmbeddedBytes parseFromTuple(FetchEmitTuple fetchEmitTuple, Fetcher fetcher) {
        Metadata metadata = new Metadata();
        try {
            InputStream fetch = fetcher.fetch(fetchEmitTuple.getFetchKey().getFetchKey(), metadata, fetchEmitTuple.getParseContext());
            try {
                MetadataListAndEmbeddedBytes parseWithStream = parseWithStream(fetchEmitTuple, fetch, metadata);
                if (fetch != null) {
                    fetch.close();
                }
                return parseWithStream;
            } catch (Throwable th) {
                if (fetch != null) {
                    try {
                        fetch.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            LOG.k("fetch exception " + fetchEmitTuple.getId(), e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (SecurityException e2) {
            LOG.error("security exception " + fetchEmitTuple.getId(), e2);
            throw e2;
        } catch (TikaException e3) {
            e = e3;
            LOG.k("fetch exception " + fetchEmitTuple.getId(), e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    public void processRequests() {
        Wb.c cVar = LOG;
        cVar.debug("processing requests");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            initializeResources();
            if (cVar.h()) {
                cVar.q("timer -- initialize parser and other resources: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            cVar.debug("pipes server initialized");
            try {
                write(STATUS.READY);
                long currentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    int read = this.input.read();
                    if (read != -1) {
                        STATUS status = STATUS.PING;
                        if (read != status.getByte()) {
                            if (read != STATUS.CALL.getByte()) {
                                break;
                            }
                            parseOne();
                            Wb.c cVar2 = LOG;
                            if (cVar2.h()) {
                                cVar2.q("timer -- parse one: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                            }
                            currentTimeMillis2 = System.currentTimeMillis();
                        } else {
                            Wb.c cVar3 = LOG;
                            if (cVar3.h()) {
                                cVar3.q("timer -- ping: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                            }
                            write(status);
                            currentTimeMillis2 = System.currentTimeMillis();
                        }
                    } else {
                        LOG.w("received -1 from client; shutting down");
                        exit(1);
                    }
                    this.output.flush();
                }
                throw new IllegalStateException("Unexpected request");
            } catch (Throwable th) {
                LOG.error("main loop error (did the forking process shut down?)", th);
                exit(1);
                System.err.flush();
            }
        } catch (Throwable th2) {
            LOG.error("couldn't initialize parser", th2);
            try {
                this.output.writeByte(STATUS.FAILED_TO_START.getByte());
                this.output.flush();
            } catch (IOException e) {
                LOG.k("couldn't notify of failure to start", e);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                synchronized (this.lock) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() - this.since;
                        if (this.parsing && currentTimeMillis > this.serverParseTimeoutMillis) {
                            LOG.g("timeout server; elapsed {}  with {}", Long.valueOf(currentTimeMillis), Long.valueOf(this.serverParseTimeoutMillis));
                            exit(17);
                        } else if (!this.parsing) {
                            long j = this.serverWaitTimeoutMillis;
                            if (j > 0 && currentTimeMillis > j) {
                                LOG.info("closing down from inactivity");
                                exit(0);
                            }
                        }
                    } finally {
                    }
                }
                Thread.sleep(this.checkForTimeoutMs);
            } catch (InterruptedException unused) {
                LOG.debug("interrupted");
                return;
            }
        }
    }

    private void write(STATUS status, String str) {
        write(status, str.getBytes(StandardCharsets.UTF_8));
    }

    private void write(STATUS status, byte[] bArr) {
        try {
            int length = bArr.length;
            this.output.write(status.getByte());
            this.output.writeInt(length);
            this.output.write(bArr);
            this.output.flush();
        } catch (IOException e) {
            LOG.error("problem writing data (forking process shutdown?)", e);
            exit(1);
        }
    }

    private void write(STATUS status) {
        try {
            this.output.write(status.getByte());
            this.output.flush();
        } catch (IOException e) {
            LOG.error("problem writing data (forking process shutdown?)", e);
            exit(1);
        }
    }
}
