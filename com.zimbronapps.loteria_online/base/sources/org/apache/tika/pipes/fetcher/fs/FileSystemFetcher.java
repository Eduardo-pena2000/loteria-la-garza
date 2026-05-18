package org.apache.tika.pipes.fetcher.fs;

import Jb.b;
import Jb.d;
import Wb.c;
import Wb.e;
import com.applovin.shadow.okio.E;
import com.applovin.shadow.okio.F;
import com.applovin.shadow.okio.i;
import com.applovin.shadow.okio.t;
import com.applovin.shadow.okio.u;
import com.applovin.shadow.okio.v;
import com.applovin.shadow.okio.w;
import com.applovin.shadow.okio.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.detect.a;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.FileSystem;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.fetcher.AbstractFetcher;
import org.apache.tika.pipes.fetcher.fs.config.FileSystemFetcherConfig;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FileSystemFetcher extends AbstractFetcher implements Initializable {
    private static final c LOG = e.l(FileSystemFetcher.class);
    private Path basePath = null;
    private boolean extractFileSystemMetadata = false;

    public FileSystemFetcher() {
    }

    public static boolean isDescendant(Path path, Path path2) {
        return b.a(d.a(a.a(path2)), d.a(a.a(path)));
    }

    private void updateFileSystemMetadata(Path path, Metadata metadata) throws IOException {
        if (this.extractFileSystemMetadata) {
            BasicFileAttributes a = y.a(path, t.a(), new LinkOption[0]);
            updateFileTime(FileSystem.CREATED, E.a(a), metadata);
            updateFileTime(FileSystem.MODIFIED, u.a(a), metadata);
            updateFileTime(FileSystem.ACCESSED, w.a(a), metadata);
        }
    }

    private void updateFileTime(Property property, FileTime fileTime, Metadata metadata) {
        if (fileTime == null) {
            return;
        }
        metadata.set(property, new Date(v.a(fileTime)));
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        Path path = this.basePath;
        if (path == null || org.apache.tika.config.b.a(org.apache.tika.detect.b.a(path))) {
            LOG.w("'basePath' has not been set. This means that client code or clients can read from any file that this process has permissions to read. If you are running tika-server, make absolutely certain that you've locked down access to tika-server and file-permissions for the tika-server process.");
            return;
        }
        if (org.apache.tika.detect.b.a(this.basePath).startsWith("http://")) {
            throw new TikaConfigException("FileSystemFetcher only works with local file systems.  Please use the tika-fetcher-http module for http calls");
        }
        if (org.apache.tika.detect.b.a(this.basePath).startsWith("ftp://")) {
            throw new TikaConfigException("FileSystemFetcher only works with local file systems.  Please consider contributing an ftp fetcher module");
        }
        if (org.apache.tika.detect.b.a(this.basePath).startsWith("s3://")) {
            throw new TikaConfigException("FileSystemFetcher only works with local file systems.  Please use the tika-fetcher-s3 module");
        }
        if (org.apache.tika.detect.b.a(a.a(this.basePath)).contains("\u0000")) {
            throw new TikaConfigException("base path must not contain \u0000. Seriously, what were you thinking?");
        }
    }

    public InputStream fetch(String str, Metadata metadata, ParseContext parseContext) throws IOException, TikaException {
        Path a;
        if (str.contains("\u0000")) {
            throw new IllegalArgumentException("Path must not contain 'u0000'. Please review the life decisions that led you to requesting a file name with this character in it.");
        }
        Path path = this.basePath;
        if (path != null) {
            a = Jb.a.a(path, str);
            if (!b.a(i.a(a, new LinkOption[0]), i.a(this.basePath, new LinkOption[0]))) {
                throw new IllegalArgumentException("fetchKey must resolve to be a descendant of the 'basePath'");
            }
        } else {
            a = F.a(str, new String[0]);
        }
        metadata.set(TikaCoreProperties.SOURCE_PATH, str);
        updateFileSystemMetadata(a, metadata);
        if (org.apache.tika.config.a.a(a, new LinkOption[0])) {
            return TikaInputStream.get(a, metadata);
        }
        Path path2 = this.basePath;
        if (path2 == null || Jb.c.a(path2, new LinkOption[0])) {
            throw new FileNotFoundException(org.apache.tika.detect.b.a(a.a(a)));
        }
        throw new IOException("BasePath is not a directory: " + String.valueOf(this.basePath));
    }

    public Path getBasePath() {
        return this.basePath;
    }

    public void initialize(Map map) throws TikaConfigException {
    }

    @Field
    public void setBasePath(String str) {
        this.basePath = F.a(str, new String[0]);
    }

    @Field
    public void setExtractFileSystemMetadata(boolean z) {
        this.extractFileSystemMetadata = z;
    }

    public FileSystemFetcher(FileSystemFetcherConfig fileSystemFetcherConfig) {
        setBasePath(fileSystemFetcherConfig.getBasePath());
        setExtractFileSystemMetadata(fileSystemFetcherConfig.isExtractFileSystemMetadata());
    }
}
