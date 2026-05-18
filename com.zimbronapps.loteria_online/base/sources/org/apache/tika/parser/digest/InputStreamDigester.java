package org.apache.tika.parser.digest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InputStreamDigester implements DigestingParser.Digester {
    private final String algorithm;
    private final String algorithmKeyName;
    private final DigestingParser.Encoder encoder;
    private final int markLimit;

    public InputStreamDigester(int i, String str, DigestingParser.Encoder encoder) {
        this(i, str, str, encoder);
    }

    private void digestFile(File file, long j, Metadata metadata) throws IOException {
        if (StringUtils.isBlank(metadata.get("Content-Length"))) {
            if (j < 0) {
                j = file.length();
            }
            setContentLength(j, metadata);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            digestStream(fileInputStream, metadata);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private boolean digestStream(InputStream inputStream, Metadata metadata) throws IOException {
        MessageDigest newMessageDigest = newMessageDigest();
        updateDigest(newMessageDigest, inputStream, metadata);
        byte[] digest = newMessageDigest.digest();
        if ((inputStream instanceof BoundedInputStream) && ((BoundedInputStream) inputStream).hasHitBound()) {
            return false;
        }
        metadata.set(getMetadataKey(), this.encoder.encode(digest));
        return true;
    }

    private String getMetadataKey() {
        return "X-TIKA:digest:" + this.algorithmKeyName;
    }

    private MessageDigest newMessageDigest() {
        try {
            Provider provider = getProvider();
            return provider == null ? MessageDigest.getInstance(this.algorithm) : MessageDigest.getInstance(this.algorithm, provider);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void setContentLength(long j, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get("Content-Length"))) {
            metadata.set("Content-Length", Long.toString(j));
        }
    }

    private static MessageDigest updateDigest(MessageDigest messageDigest, InputStream inputStream, Metadata metadata) throws IOException {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        long j = 0;
        while (read > -1) {
            messageDigest.update(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr, 0, 1024);
        }
        setContentLength(j, metadata);
        return messageDigest;
    }

    public void digest(InputStream inputStream, Metadata metadata, ParseContext parseContext) throws IOException {
        TikaInputStream cast = TikaInputStream.cast(inputStream);
        if (cast != null && cast.hasFile()) {
            long length = cast.hasFile() ? cast.getLength() : -1L;
            if (length > this.markLimit) {
                digestFile(cast.getFile(), length, metadata);
                return;
            }
        }
        BoundedInputStream boundedInputStream = new BoundedInputStream(this.markLimit, inputStream);
        boundedInputStream.mark(this.markLimit + 1);
        boolean digestStream = digestStream(boundedInputStream, metadata);
        boundedInputStream.reset();
        if (digestStream) {
            return;
        }
        if (cast != null) {
            digestFile(cast.getFile(), -1L, metadata);
            return;
        }
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            digestFile(TikaInputStream.get(inputStream, temporaryResources, metadata).getFile(), -1L, metadata);
            try {
                temporaryResources.dispose();
            } catch (TikaException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            try {
                temporaryResources.dispose();
                throw th;
            } catch (TikaException e2) {
                throw new IOException(e2);
            }
        }
    }

    public Provider getProvider() {
        return null;
    }

    public InputStreamDigester(int i, String str, String str2, DigestingParser.Encoder encoder) {
        this.algorithm = str;
        this.algorithmKeyName = str2;
        this.encoder = encoder;
        this.markLimit = i;
        if (i < 0) {
            throw new IllegalArgumentException("markLimit must be >= 0");
        }
    }
}
