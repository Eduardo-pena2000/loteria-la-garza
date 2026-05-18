package org.apache.tika.io;

import B8.m;
import Db.h;
import com.applovin.shadow.okio.q;
import com.applovin.shadow.okio.s;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.sql.Blob;
import java.sql.SQLException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TikaInputStream extends Db.f {
    private static final int BLOB_SIZE_THRESHOLD = 1048576;
    private static final int MAX_CONSECUTIVE_EOFS = 1000;
    private int consecutiveEOFs;
    private long length;
    private long mark;
    private Object openContainer;
    private Path path;
    private long position;
    private byte[] skipBuffer;
    private InputStreamFactory streamFactory;
    private String suffix;
    private final TemporaryResources tmp;

    public class 1 extends BufferedInputStream {
        final /* synthetic */ InputStream val$oldStream;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(InputStream inputStream, InputStream inputStream2) {
            super(inputStream);
            this.val$oldStream = inputStream2;
        }

        public void close() throws IOException {
            this.val$oldStream.close();
        }
    }

    private TikaInputStream(Path path) throws IOException {
        super(new BufferedInputStream(q.a(path, new OpenOption[0])));
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.suffix = null;
        this.path = path;
        this.tmp = new TemporaryResources();
        this.length = e.a(path);
        this.suffix = FilenameUtils.getSuffixFromPath(org.apache.tika.detect.b.a(f.a(path)));
    }

    public static TikaInputStream cast(InputStream inputStream) {
        if (inputStream instanceof TikaInputStream) {
            return (TikaInputStream) inputStream;
        }
        return null;
    }

    public static TikaInputStream get(InputStream inputStream, TemporaryResources temporaryResources, Metadata metadata) {
        if (inputStream == null) {
            throw new NullPointerException("The Stream must not be null");
        }
        if (inputStream instanceof TikaInputStream) {
            return (TikaInputStream) inputStream;
        }
        return new TikaInputStream(!inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream, temporaryResources, -1L, getExtension(metadata));
    }

    private static String getExtension(Metadata metadata) {
        return metadata == null ? "" : FilenameUtils.getSuffixFromPath(metadata.get("resourceName"));
    }

    public static boolean isTikaInputStream(InputStream inputStream) {
        return inputStream instanceof TikaInputStream;
    }

    public void addCloseableResource(Closeable closeable) {
        this.tmp.addResource(closeable);
    }

    public void afterRead(int i) throws IOException {
        if (i != -1) {
            this.position += i;
            return;
        }
        int i2 = this.consecutiveEOFs + 1;
        this.consecutiveEOFs = i2;
        if (i2 > 1000) {
            throw new IOException("Read too many -1 (EOFs); there could be an infinite loop.If you think your file is not corrupt, please open an issue on Tika's JIRA");
        }
    }

    public void close() throws IOException {
        this.path = null;
        this.mark = -1L;
        this.tmp.addResource(((FilterInputStream) this).in);
        this.tmp.close();
    }

    public File getFile() throws IOException {
        return org.apache.tika.fork.b.a(getPath());
    }

    public FileChannel getFileChannel() throws IOException {
        Closeable a = com.applovin.shadow.okio.e.a(getPath(), new OpenOption[0]);
        this.tmp.addResource(a);
        return a;
    }

    public InputStreamFactory getInputStreamFactory() {
        return this.streamFactory;
    }

    public long getLength() throws IOException {
        if (this.length == -1) {
            getPath();
        }
        return this.length;
    }

    public Object getOpenContainer() {
        return this.openContainer;
    }

    public Path getPath() throws IOException {
        return getPath(-1);
    }

    public long getPosition() {
        return this.position;
    }

    public boolean hasFile() {
        return this.path != null;
    }

    public boolean hasInputStreamFactory() {
        return this.streamFactory != null;
    }

    public boolean hasLength() {
        return this.length != -1;
    }

    public void mark(int i) {
        super.mark(i);
        this.mark = this.position;
    }

    public boolean markSupported() {
        return true;
    }

    public int peek(byte[] bArr) throws IOException {
        mark(bArr.length);
        int read = read(bArr);
        int i = 0;
        while (read != -1) {
            i += read;
            read = i < bArr.length ? read(bArr, i, bArr.length - i) : -1;
        }
        reset();
        return i;
    }

    public void reset() throws IOException {
        super.reset();
        this.position = this.mark;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
    }

    public void setOpenContainer(Object obj) {
        this.openContainer = obj;
        if (obj instanceof Closeable) {
            this.tmp.addResource((Closeable) obj);
        }
    }

    public long skip(long j) throws IOException {
        if (this.skipBuffer == null) {
            this.skipBuffer = new byte[4096];
        }
        long skip = IOUtils.skip(((FilterInputStream) this).in, j, this.skipBuffer);
        this.position += skip;
        return skip;
    }

    public String toString() {
        String str;
        if (hasFile()) {
            str = "TikaInputStream of " + org.apache.tika.detect.b.a(this.path);
        } else {
            str = "TikaInputStream of " + ((FilterInputStream) this).in.toString();
        }
        Object obj = this.openContainer;
        if (obj == null) {
            return str;
        }
        return str + " (in " + String.valueOf(obj) + ")";
    }

    public Path getPath(int i) throws IOException {
        Path path = this.path;
        if (path != null) {
            return path;
        }
        if (this.position > 0) {
            throw new IOException("Stream is already being read");
        }
        Path createTempFile = this.tmp.createTempFile(this.suffix);
        if (i > -1) {
            BoundedInputStream boundedInputStream = new BoundedInputStream(i, this);
            try {
                boundedInputStream.mark(i);
                try {
                    org.apache.tika.detect.c.a(boundedInputStream, createTempFile, new CopyOption[]{s.a()});
                    if (boundedInputStream.hasHitBound()) {
                        boundedInputStream.close();
                        return null;
                    }
                    boundedInputStream.close();
                } finally {
                    boundedInputStream.reset();
                }
            } catch (Throwable th) {
                try {
                    boundedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            org.apache.tika.detect.c.a(this, createTempFile, new CopyOption[]{s.a()});
        }
        this.path = createTempFile;
        Closeable a = q.a(createTempFile, new OpenOption[0]);
        this.tmp.addResource(a);
        ((FilterInputStream) this).in = new 1(a, ((FilterInputStream) this).in);
        this.length = e.a(this.path);
        this.position = 0L;
        this.mark = -1L;
        return this.path;
    }

    public static TikaInputStream get(InputStream inputStream) {
        return get(inputStream, new TemporaryResources(), (Metadata) null);
    }

    public static TikaInputStream get(byte[] bArr) {
        return get(bArr, new Metadata());
    }

    public static TikaInputStream get(byte[] bArr, Metadata metadata) {
        metadata.set("Content-Length", Integer.toString(bArr.length));
        return new TikaInputStream(new h(bArr), new TemporaryResources(), bArr.length, getExtension(metadata));
    }

    private TikaInputStream(Path path, TemporaryResources temporaryResources, long j) throws IOException {
        super(new BufferedInputStream(q.a(path, new OpenOption[0])));
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.suffix = null;
        this.path = path;
        this.tmp = temporaryResources;
        this.length = j;
        this.suffix = FilenameUtils.getSuffixFromPath(org.apache.tika.detect.b.a(f.a(path)));
    }

    public static TikaInputStream get(Path path) throws IOException {
        return get(path, new Metadata());
    }

    public static TikaInputStream get(Path path, Metadata metadata) throws IOException {
        if (StringUtils.isBlank(metadata.get("resourceName"))) {
            metadata.set("resourceName", org.apache.tika.detect.b.a(f.a(path)));
        }
        metadata.set("Content-Length", Long.toString(e.a(path)));
        return new TikaInputStream(path);
    }

    public static TikaInputStream get(Path path, Metadata metadata, TemporaryResources temporaryResources) throws IOException {
        long a = e.a(path);
        if (StringUtils.isBlank(metadata.get("resourceName"))) {
            metadata.set("resourceName", org.apache.tika.detect.b.a(f.a(path)));
        }
        metadata.set("Content-Length", Long.toString(a));
        return new TikaInputStream(path, temporaryResources, a);
    }

    @Deprecated
    private TikaInputStream(File file) throws FileNotFoundException {
        super(new BufferedInputStream(new FileInputStream(file)));
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.suffix = null;
        this.path = m.a(file);
        this.tmp = new TemporaryResources();
        this.length = file.length();
        this.suffix = FilenameUtils.getSuffixFromPath(org.apache.tika.detect.b.a(f.a(this.path)));
    }

    @Deprecated
    public static TikaInputStream get(File file) throws FileNotFoundException {
        return get(file, new Metadata());
    }

    @Deprecated
    public static TikaInputStream get(File file, Metadata metadata) throws FileNotFoundException {
        if (StringUtils.isBlank(metadata.get("resourceName"))) {
            metadata.set("resourceName", file.getName());
        }
        metadata.set("Content-Length", Long.toString(file.length()));
        return new TikaInputStream(file);
    }

    public static TikaInputStream get(InputStreamFactory inputStreamFactory) throws IOException {
        return get(inputStreamFactory, new TemporaryResources());
    }

    private TikaInputStream(InputStream inputStream, TemporaryResources temporaryResources, long j, String str) {
        super(inputStream);
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.path = null;
        this.tmp = temporaryResources;
        this.length = j;
        this.suffix = str;
    }

    public static TikaInputStream get(InputStreamFactory inputStreamFactory, TemporaryResources temporaryResources) throws IOException {
        TikaInputStream tikaInputStream = get(inputStreamFactory.getInputStream(), temporaryResources, (Metadata) null);
        tikaInputStream.streamFactory = inputStreamFactory;
        return tikaInputStream;
    }

    public static TikaInputStream get(Blob blob) throws SQLException {
        return get(blob, new Metadata());
    }

    public static TikaInputStream get(Blob blob, Metadata metadata) throws SQLException {
        long j;
        try {
            j = blob.length();
            try {
                metadata.set("Content-Length", Long.toString(j));
            } catch (SQLException unused) {
            }
        } catch (SQLException unused2) {
            j = -1;
        }
        long j2 = j;
        if (0 <= j2 && j2 <= 1048576) {
            return get(blob.getBytes(1L, (int) j2), metadata);
        }
        return new TikaInputStream(new BufferedInputStream(blob.getBinaryStream()), new TemporaryResources(), j2, getExtension(metadata));
    }

    public static TikaInputStream get(URI uri) throws IOException {
        return get(uri, new Metadata());
    }

    public static TikaInputStream get(URI uri, Metadata metadata) throws IOException {
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            Path a = g.a(uri);
            if (org.apache.tika.config.a.a(a, new LinkOption[0])) {
                return get(a, metadata);
            }
        }
        return get(uri.toURL(), metadata);
    }

    public static TikaInputStream get(URL url) throws IOException {
        return get(url, new Metadata());
    }

    public static TikaInputStream get(URL url, Metadata metadata) throws IOException {
        if ("file".equalsIgnoreCase(url.getProtocol())) {
            try {
                Path a = g.a(url.toURI());
                if (org.apache.tika.config.a.a(a, new LinkOption[0])) {
                    return get(a, metadata);
                }
            } catch (URISyntaxException unused) {
            }
        }
        URLConnection openConnection = url.openConnection();
        String path = url.getPath();
        int lastIndexOf = path.lastIndexOf(47) + 1;
        if (lastIndexOf < path.length()) {
            metadata.set("resourceName", path.substring(lastIndexOf));
        }
        String contentType = openConnection.getContentType();
        if (contentType != null) {
            metadata.set("Content-Type", contentType);
        }
        String contentEncoding = openConnection.getContentEncoding();
        if (contentEncoding != null) {
            metadata.set("Content-Encoding", contentEncoding);
        }
        int contentLength = openConnection.getContentLength();
        if (contentLength >= 0) {
            metadata.set("Content-Length", Integer.toString(contentLength));
        }
        return new TikaInputStream(new BufferedInputStream(openConnection.getInputStream()), new TemporaryResources(), contentLength, getExtension(metadata));
    }
}
