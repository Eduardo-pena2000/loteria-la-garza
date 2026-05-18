package org.apache.tika.detect;

import B8.m;
import com.applovin.shadow.okio.q;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class TrainedModelDetector implements Detector {
    private static final long serialVersionUID = 1;
    private final Map MODEL_MAP = new HashMap();

    public TrainedModelDetector() {
        loadDefaultModels(getClass().getClassLoader());
    }

    private void writeHisto(float[] fArr) throws IOException {
        BufferedWriter a = d.a(new TemporaryResources().createTempFile(), StandardCharsets.UTF_8, new OpenOption[0]);
        try {
            for (float f : fArr) {
                a.write(f + "\t");
            }
            a.write("\r\n");
            a.close();
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

    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return null;
        }
        inputStream.mark(getMinLength());
        float[] readByteFrequencies = readByteFrequencies(inputStream);
        MediaType mediaType = MediaType.OCTET_STREAM;
        float f = 0.5f;
        for (Map.Entry entry : this.MODEL_MAP.entrySet()) {
            MediaType mediaType2 = (MediaType) entry.getKey();
            float predict = ((TrainedModel) entry.getValue()).predict(readByteFrequencies);
            if (f < predict) {
                f = predict;
                mediaType = mediaType2;
            }
        }
        inputStream.reset();
        return mediaType;
    }

    public int getMinLength() {
        return Integer.MAX_VALUE;
    }

    public abstract void loadDefaultModels(InputStream inputStream);

    public abstract void loadDefaultModels(ClassLoader classLoader);

    public void loadDefaultModels(Path path) {
        try {
            InputStream a = q.a(path, new OpenOption[0]);
            try {
                loadDefaultModels(a);
                if (a != null) {
                    a.close();
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to read the default media type registry", e);
        }
    }

    public float[] readByteFrequencies(InputStream inputStream) throws IOException {
        ReadableByteChannel newChannel = Channels.newChannel(inputStream);
        float[] fArr = new float[257];
        fArr[0] = 1.0f;
        ByteBuffer allocate = ByteBuffer.allocate(5120);
        float f = -1.0f;
        for (int read = newChannel.read(allocate); read != -1; read = newChannel.read(allocate)) {
            allocate.flip();
            while (allocate.hasRemaining()) {
                byte b = allocate.get();
                int i = b + 1;
                if (b < 0) {
                    i = b + 257;
                    fArr[i] = fArr[i] + 1.0f;
                } else {
                    fArr[i] = fArr[i] + 1.0f;
                }
                f = Math.max(f, fArr[i]);
            }
            allocate.clear();
        }
        for (int i2 = 1; i2 < 257; i2++) {
            float f2 = fArr[i2] / f;
            fArr[i2] = f2;
            fArr[i2] = (float) Math.sqrt(f2);
        }
        return fArr;
    }

    public void registerModels(MediaType mediaType, TrainedModel trainedModel) {
        this.MODEL_MAP.put(mediaType, trainedModel);
    }

    public void loadDefaultModels(File file) {
        loadDefaultModels(m.a(file));
    }
}
