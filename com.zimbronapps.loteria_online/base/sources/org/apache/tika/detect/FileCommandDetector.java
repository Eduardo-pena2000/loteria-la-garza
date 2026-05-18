package org.apache.tika.detect;

import com.applovin.shadow.okio.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import org.apache.tika.config.Field;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.ExternalProcess;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.FileProcessResult;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FileCommandDetector implements Detector {
    private static final String DEFAULT_FILE_COMMAND_PATH = "file";
    private static final long DEFAULT_TIMEOUT_MS = 6000;
    public static Property FILE_MIME = Property.externalText("file:mime");
    private static final Wb.c LOGGER = Wb.e.l(FileCommandDetector.class);
    private static boolean HAS_WARNED = false;
    private Boolean hasFileCommand = null;
    private String fileCommandPath = "file";
    private int maxBytes = 1000000;
    private long timeoutMs = 6000;
    private boolean useMime = false;

    public static boolean checkHasFile() {
        return checkHasFile("file");
    }

    private MediaType detectOnPath(Path path, Metadata metadata) throws IOException {
        FileProcessResult execute = ProcessUtils.execute(new ProcessBuilder(new String[]{ProcessUtils.escapeCommandLine(this.fileCommandPath), "-b", "--mime-type", ProcessUtils.escapeCommandLine(b.a(a.a(path)))}), this.timeoutMs, 10000, 10000);
        if (execute.isTimeout()) {
            metadata.set(ExternalProcess.IS_TIMEOUT, true);
            return MediaType.OCTET_STREAM;
        }
        if (execute.getExitValue() != 0) {
            metadata.set(ExternalProcess.EXIT_VALUE, execute.getExitValue());
            return MediaType.OCTET_STREAM;
        }
        String stdout = execute.getStdout();
        if (StringUtils.isBlank(stdout)) {
            return MediaType.OCTET_STREAM;
        }
        metadata.set(FILE_MIME, stdout);
        if (!this.useMime) {
            return MediaType.OCTET_STREAM;
        }
        MediaType parse = MediaType.parse(stdout);
        return parse == null ? MediaType.OCTET_STREAM : parse;
    }

    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (this.hasFileCommand == null) {
            this.hasFileCommand = Boolean.valueOf(checkHasFile(this.fileCommandPath));
        }
        if (!this.hasFileCommand.booleanValue()) {
            if (!HAS_WARNED) {
                LOGGER.w("'file' command isn't working: '" + this.fileCommandPath + "'");
                HAS_WARNED = true;
            }
            return MediaType.OCTET_STREAM;
        }
        TikaInputStream cast = TikaInputStream.cast(inputStream);
        if (cast != null) {
            return detectOnPath(cast.getPath(), metadata);
        }
        inputStream.mark(this.maxBytes);
        try {
            TemporaryResources temporaryResources = new TemporaryResources();
            try {
                Path createTempFile = temporaryResources.createTempFile(metadata);
                c.a(new BoundedInputStream(this.maxBytes, inputStream), createTempFile, new CopyOption[]{s.a()});
                MediaType detectOnPath = detectOnPath(createTempFile, metadata);
                temporaryResources.close();
                return detectOnPath;
            } finally {
            }
        } finally {
            inputStream.reset();
        }
    }

    public boolean isUseMime() {
        return this.useMime;
    }

    @Field
    public void setFilePath(String str) {
        this.fileCommandPath = str;
        checkHasFile(str);
    }

    @Field
    public void setMaxBytes(int i) {
        this.maxBytes = i;
    }

    @Field
    public void setTimeoutMs(long j) {
        this.timeoutMs = j;
    }

    @Field
    public void setUseMime(boolean z) {
        this.useMime = z;
    }

    public static boolean checkHasFile(String str) {
        return ExternalParser.check(new String[]{str, "-v"}, new int[0]);
    }
}
