package com.sparg.java.file.utils;

import java.io.IOException;
import java.util.Map;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * @author: vimal.sengoden
 * Date: 2/9/15
 * Time: 1:34 PM
 */
public class ExportToExcel {

    public static void writeToExcel(String fileTargetLocation, String excelTemplateLocation, Map<String, Object> beans) throws IOException, InvalidFormatException {
        JexlEngine jexlEngine = new JexlEngine();
        jexlEngine.setSilent(true);
        jexlEngine.setLenient(true);
        XLSTransformer transformer = new XLSTransformer();
        transformer.transformXLS(excelTemplateLocation, beans, fileTargetLocation);
    }
}
