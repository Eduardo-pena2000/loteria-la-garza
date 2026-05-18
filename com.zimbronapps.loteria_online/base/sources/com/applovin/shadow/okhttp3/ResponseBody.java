package com.applovin.shadow.okhttp3;

import Ca.I;
import Ca.e;
import Qa.l;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            t.g(bufferedSource, "source");
            t.g(charset, "charset");
            this.source = bufferedSource;
            this.charset = charset;
        }

        public void close() throws IOException {
            I i;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                i = I.a;
            } else {
                i = null;
            }
            if (i == null) {
                this.source.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            t.g(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            t.g(str, "<this>");
            Charset charset = Za.c.b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            Buffer writeString = new Buffer().writeString(str, charset);
            return create(writeString, mediaType, writeString.size());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(bufferedSource, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            t.g(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            t.g(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
            t.g(bufferedSource, "<this>");
            return new ResponseBody$Companion$asResponseBody$1(mediaType, j, bufferedSource);
        }

        @e
        public final ResponseBody create(MediaType mediaType, String str) {
            t.g(str, "content");
            return create(str, mediaType);
        }

        @e
        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            t.g(bArr, "content");
            return create(bArr, mediaType);
        }

        @e
        public final ResponseBody create(MediaType mediaType, ByteString byteString) {
            t.g(byteString, "content");
            return create(byteString, mediaType);
        }

        @e
        public final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
            t.g(bufferedSource, "content");
            return create(bufferedSource, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        return (contentType == null || (charset = contentType.charset(Za.c.b)) == null) ? Za.c.b : charset;
    }

    private final Object consumeSource(l lVar, l lVar2) {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        BufferedSource source = source();
        try {
            Object invoke = lVar.invoke(source);
            r.b(1);
            Na.c.a(source, (Throwable) null);
            r.a(1);
            int intValue = ((Number) lVar2.invoke(invoke)).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return invoke;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    @e
    public static final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j, bufferedSource);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        BufferedSource source = source();
        try {
            ByteString readByteString = source.readByteString();
            Na.c.a(source, (Throwable) null);
            int size = readByteString.size();
            if (contentLength == -1 || contentLength == size) {
                return readByteString;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        BufferedSource source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            Na.c.a(source, (Throwable) null);
            int length = readByteArray.length;
            if (contentLength == -1 || contentLength == length) {
                return readByteArray;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            String readString = source.readString(Util.readBomAsCharset(source, charset()));
            Na.c.a(source, (Throwable) null);
            return readString;
        } finally {
        }
    }

    @e
    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @e
    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @e
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
        return Companion.create(bufferedSource, mediaType, j);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
