package org.apache.tika.pipes.pipesiterator.fs;

import com.applovin.shadow.okio.F;
import com.applovin.shadow.okio.h;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.fetcher.FetchKey;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FileSystemPipesIterator extends PipesIterator implements TotalCounter, Initializable, Closeable {
    private static final Wb.c LOG = Wb.e.l(AsyncProcessor.class);
    private Path basePath;
    private boolean countTotal = false;
    private FileCountWorker fileCountWorker;

    public class FSFileVisitor implements FileVisitor {
        private final String emitterName;
        private final String fetcherName;

        public /* synthetic */ FSFileVisitor(FileSystemPipesIterator fileSystemPipesIterator, String str, String str2, f fVar) {
            this(str, str2);
        }

        public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
            return postVisitDirectory(h.a(obj), iOException);
        }

        public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
            return preVisitDirectory(h.a(obj), basicFileAttributes);
        }

        public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
            return visitFile(h.a(obj), basicFileAttributes);
        }

        public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) throws IOException {
            return visitFileFailed(h.a(obj), iOException);
        }

        private FSFileVisitor(String str, String str2) {
            this.fetcherName = str;
            this.emitterName = str2;
        }

        public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
            return d.a();
        }

        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            return d.a();
        }

        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            String a = org.apache.tika.detect.b.a(b.a(FileSystemPipesIterator.g(FileSystemPipesIterator.this), path));
            try {
                ParseContext parseContext = new ParseContext();
                parseContext.set(HandlerConfig.class, FileSystemPipesIterator.access$000(FileSystemPipesIterator.this));
                FileSystemPipesIterator.access$100(FileSystemPipesIterator.this, new FetchEmitTuple(a, new FetchKey(this.fetcherName, a), new EmitKey(this.emitterName, a), new Metadata(), parseContext, FileSystemPipesIterator.this.getOnParseException()));
                return d.a();
            } catch (TimeoutException e) {
                throw new IOException(e);
            } catch (InterruptedException unused) {
                return c.a();
            }
        }

        public FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
            return d.a();
        }
    }

    public static class FileCountWorker implements TotalCounter, Closeable {
        private final Path basePath;
        private TotalCountResult finalResult;
        private Thread totalCounterThread;
        private final AtomicLong totalCount = new AtomicLong(0);
        private TotalCountResult.STATUS status = TotalCountResult.STATUS.NOT_COMPLETED;

        public static class FSFileCounter implements FileVisitor {
            private final AtomicLong count;

            public /* synthetic */ FSFileCounter(AtomicLong atomicLong, f fVar) {
                this(atomicLong);
            }

            public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
                return postVisitDirectory(h.a(obj), iOException);
            }

            public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
                return preVisitDirectory(h.a(obj), basicFileAttributes);
            }

            public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
                return visitFile(h.a(obj), basicFileAttributes);
            }

            public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) throws IOException {
                return visitFileFailed(h.a(obj), iOException);
            }

            private FSFileCounter(AtomicLong atomicLong) {
                this.count = atomicLong;
            }

            public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
                return d.a();
            }

            public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
                return d.a();
            }

            public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
                this.count.incrementAndGet();
                return d.a();
            }

            public FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
                return d.a();
            }
        }

        public FileCountWorker(Path path) {
            this.basePath = path;
        }

        public static /* synthetic */ void a(FileCountWorker fileCountWorker) {
            fileCountWorker.lambda$startTotalCount$0();
        }

        private /* synthetic */ void lambda$startTotalCount$0() {
            try {
                a.a(this.basePath, new FSFileCounter(this.totalCount, null));
                this.status = TotalCountResult.STATUS.COMPLETED;
                this.finalResult = new TotalCountResult(this.totalCount.get(), this.status);
            } catch (IOException e) {
                FileSystemPipesIterator.h().k("problem counting files", e);
                this.status = TotalCountResult.STATUS.EXCEPTION;
                this.finalResult = new TotalCountResult(this.totalCount.get(), this.status);
            }
        }

        public void close() throws IOException {
            this.totalCounterThread.interrupt();
        }

        public TotalCountResult getTotalCount() {
            TotalCountResult totalCountResult = this.finalResult;
            return totalCountResult != null ? totalCountResult : new TotalCountResult(this.totalCount.get(), this.status);
        }

        public void startTotalCount() {
            Thread thread = new Thread(new e(this));
            this.totalCounterThread = thread;
            thread.setDaemon(true);
            this.totalCounterThread.start();
        }
    }

    public FileSystemPipesIterator() {
    }

    public static /* synthetic */ HandlerConfig access$000(FileSystemPipesIterator fileSystemPipesIterator) {
        return fileSystemPipesIterator.getHandlerConfig();
    }

    public static /* synthetic */ void access$100(FileSystemPipesIterator fileSystemPipesIterator, FetchEmitTuple fetchEmitTuple) throws InterruptedException, TimeoutException {
        fileSystemPipesIterator.tryToAdd(fetchEmitTuple);
    }

    public static /* bridge */ /* synthetic */ Path g(FileSystemPipesIterator fileSystemPipesIterator) {
        return fileSystemPipesIterator.basePath;
    }

    public static /* bridge */ /* synthetic */ Wb.c h() {
        return LOG;
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        TikaConfig.mustNotBeEmpty("basePath", this.basePath);
        TikaConfig.mustNotBeEmpty("fetcherName", getFetcherName());
        TikaConfig.mustNotBeEmpty("emitterName", getFetcherName());
    }

    public void close() throws IOException {
        FileCountWorker fileCountWorker = this.fileCountWorker;
        if (fileCountWorker != null) {
            fileCountWorker.close();
        }
    }

    public void enqueue() throws InterruptedException, IOException, TimeoutException {
        if (!Jb.c.a(this.basePath, new LinkOption[0])) {
            throw new IllegalArgumentException("\"basePath\" directory does not exist: " + String.valueOf(org.apache.tika.detect.a.a(this.basePath)));
        }
        try {
            a.a(this.basePath, new FSFileVisitor(this, getFetcherName(), getEmitterName(), null));
        } catch (IOException e) {
            TimeoutException cause = e.getCause();
            if (cause != null && (cause instanceof TimeoutException)) {
                throw cause;
            }
            throw e;
        }
    }

    public TotalCountResult getTotalCount() {
        return !this.countTotal ? TotalCountResult.UNSUPPORTED : this.fileCountWorker.getTotalCount();
    }

    public void initialize(Map map) throws TikaConfigException {
        if (this.countTotal) {
            this.fileCountWorker = new FileCountWorker(this.basePath);
        }
    }

    @Field
    public void setBasePath(String str) {
        this.basePath = F.a(str, new String[0]);
    }

    @Field
    public void setCountTotal(boolean z) {
        this.countTotal = z;
    }

    public void startTotalCount() {
        if (this.countTotal) {
            this.fileCountWorker.startTotalCount();
        }
    }

    public FileSystemPipesIterator(Path path) {
        this.basePath = path;
    }
}
