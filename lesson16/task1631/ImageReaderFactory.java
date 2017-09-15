package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Vladimir on 17.08.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        ImageReader reader;
        if (imageType == ImageTypes.JPG)
            reader = new JpgReader();
        else if (imageType == ImageTypes.BMP)
            reader = new BmpReader();
        else if (imageType == ImageTypes.PNG)
            reader = new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
        return reader;
    }
}
