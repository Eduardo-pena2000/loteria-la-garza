package org.apache.tika.detect;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Objects;
import org.apache.tika.mime.MediaType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NNExampleModelDetector extends TrainedModelDetector {
    private static final String EXAMPLE_NNMODEL_FILE = "tika-example.nnmodel";
    private static final Wb.c LOG = Wb.e.l(NNExampleModelDetector.class);
    private static final long serialVersionUID = 1;

    public NNExampleModelDetector() {
    }

    private void readDescription(NNTrainedModelBuilder nNTrainedModelBuilder, String str) {
        String[] split = str.split("\t");
        try {
            MediaType parse = MediaType.parse(split[1]);
            int parseInt = Integer.parseInt(split[2]);
            int parseInt2 = Integer.parseInt(split[3]);
            int parseInt3 = Integer.parseInt(split[4]);
            nNTrainedModelBuilder.setNumOfInputs(parseInt);
            nNTrainedModelBuilder.setNumOfHidden(parseInt2);
            nNTrainedModelBuilder.setNumOfOutputs(parseInt3);
            nNTrainedModelBuilder.setType(parse);
        } catch (Exception e) {
            LOG.k("Unable to parse the model configuration", e);
            throw new RuntimeException("Unable to parse the model configuration", e);
        }
    }

    private void readNNParams(NNTrainedModelBuilder nNTrainedModelBuilder, String str) {
        String[] split = str.split("\t");
        float[] fArr = new float[split.length];
        try {
            int i = 0;
            for (String str2 : split) {
                fArr[i] = Float.parseFloat(str2);
                i++;
            }
            nNTrainedModelBuilder.setParams(fArr);
        } catch (Exception e) {
            LOG.k("Unable to parse the model configuration", e);
            throw new RuntimeException("Unable to parse the model configuration", e);
        }
    }

    public void loadDefaultModels(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        NNTrainedModelBuilder nNTrainedModelBuilder = new NNTrainedModelBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                String trim = readLine.trim();
                if (trim.startsWith("#")) {
                    readDescription(nNTrainedModelBuilder, trim);
                } else {
                    readNNParams(nNTrainedModelBuilder, trim);
                    super.registerModels(nNTrainedModelBuilder.getType(), nNTrainedModelBuilder.build());
                }
            } catch (IOException e) {
                throw new RuntimeException("Unable to read the default media type registry", e);
            }
        }
    }

    public NNExampleModelDetector(Path path) {
        loadDefaultModels(path);
    }

    public NNExampleModelDetector(File file) {
        loadDefaultModels(file);
    }

    public void loadDefaultModels(ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = TrainedModelDetector.class.getClassLoader();
        }
        String str = TrainedModelDetector.class.getPackage().getName().replace('.', '/') + "/";
        URL resource = classLoader.getResource(str + "tika-example.nnmodel");
        Objects.requireNonNull(resource, "required resource " + str + "tika-example.nnmodel not found");
        try {
            InputStream openStream = resource.openStream();
            try {
                loadDefaultModels(openStream);
                if (openStream != null) {
                    openStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to read the default media type registry", e);
        }
    }
}
